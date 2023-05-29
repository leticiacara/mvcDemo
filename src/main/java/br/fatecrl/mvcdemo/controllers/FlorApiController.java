package br.fatecrl.mvcdemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fatecrl.mvcdemo.models.Flor;

@RestController
@RequestMapping("/api/flores")
public class FlorApiController {

    private static final List<Flor> flores = new ArrayList<Flor>();

    public FlorApiController() {
        flores.add(new Flor(1, "Tulipa", 5));
        flores.add(new Flor(2, "Rosa", 1));
        flores.add(new Flor(3, "Orquídea", 10));
    }

    @GetMapping
    public List<Flor> getFlores() {
        return flores;
    }
}
