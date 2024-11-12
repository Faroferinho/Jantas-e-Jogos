package org.example.controllers;

import org.example.models.Agenda;
import org.example.services.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

public class AgendaController {

    @Autowired
    public AgendaService service;

    @GetMapping("/")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView("/agenda");
        mv.addObject("Agenda", service.findAll());

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(Agenda agenda){
        ModelAndView mv = new ModelAndView("/agenda");
        mv.addObject("agenda", agenda);

        return mv;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") int id) {

        service.delete(id);

        return findAll();
    }

    @PostMapping("/save")
    public ModelAndView save(Agenda agenda, BindingResult result) {

        if(result.hasErrors()) {
            return add(agenda);
        }

        service.save(agenda);

        return findAll();
    }

}
