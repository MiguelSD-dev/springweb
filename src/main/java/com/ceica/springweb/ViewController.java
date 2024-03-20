package com.ceica.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.PublicKey;

@Controller
public class ViewController {
    @GetMapping()
    public String index(Model model) {
        String nombre = "cruel";
        model.addAttribute("nombre", nombre);
        return "index";
    }

    @PostMapping()
    public String login(@RequestParam String name, @RequestParam String password, Model model) {
        if (name.equals("admin") & password.equals("1234")) {
            return "redirect:/admin";
        } else {
            model.addAttribute("msg", "Nombre o contraseña incorrectos");
            return "index";
        }
    }
}
