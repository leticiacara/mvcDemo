package br.fatecrl.mvcdemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.fatecrl.mvcdemo.models.Flor;

@Controller
@RequestMapping("/flores")
public class FlorController {

    private static final List<Flor> flores = new ArrayList<Flor>();

    public FlorController() {
        flores.add(new Flor(1, "Tulipa", 5));
        flores.add(new Flor(2, "Rosa", 1));
        flores.add(new Flor(3, "Orquídea", 10));
    }

    @GetMapping
    public String getAlunos(Model model) {
        model.addAttribute("flores", flores);

        return "flores";
    }

}
