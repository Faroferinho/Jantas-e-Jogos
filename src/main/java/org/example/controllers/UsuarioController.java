package org.example.controllers;

import org.example.models.Usuario;
import org.example.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {

    @Autowired
    public UsuarioService service;

    @GetMapping("/")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView("/Usuario");
        mv.addObject("Usuario", service.findAll());

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(Usuario user){
        ModelAndView mv = new ModelAndView("/usuario");
        mv.addObject("usuario", user);

        return mv;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") int id) {

        service.delete(id);

        return findAll();
    }

    @PostMapping("/save")
    public ModelAndView save(Usuario user, BindingResult result) {

        if(result.hasErrors()) {
            return add(user);
        }

        service.save(user);

        return findAll();
    }
}
