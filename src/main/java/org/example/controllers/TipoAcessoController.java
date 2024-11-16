package org.example.controllers;

import org.example.models.TipoAcesso;
import org.example.services.TipoAcessoSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TipoAcessoController {

    @Autowired
    public TipoAcessoSerivce service;

    @GetMapping("/tipo-acesso")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView("/Acessos");
        mv.addObject("Acessos", service.findAll());

        return mv;
    }

    @GetMapping("/add/tipo-acesso")
    public ModelAndView add(TipoAcesso acesso){
        ModelAndView mv = new ModelAndView("/acesso");
        mv.addObject("acesso", acesso);

        return mv;
    }

    @GetMapping("/delete/tipo-acesso/{id}")
    public ModelAndView delete(@PathVariable("id") long id) {

        service.delete(id);

        return findAll();
    }

    @PostMapping("/save/tipo-acesso")
    public ModelAndView save(TipoAcesso acesso, BindingResult result) {

        if(result.hasErrors()) {
            return add(acesso);
        }

        service.save(acesso);

        return findAll();
    }
}
