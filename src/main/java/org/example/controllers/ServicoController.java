package org.example.controllers;

import org.example.models.Servico;
import org.example.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServicoController {

    @Autowired
    public ServicoService service;

    @GetMapping("/")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView("/Servicos");
        mv.addObject("Servicos", service.findAll());

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(Servico servico){
        ModelAndView mv = new ModelAndView("/servico");
        mv.addObject("servico", servico);

        return mv;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") int id) {

        service.delete(id);

        return findAll();
    }

    @PostMapping("/save")
    public ModelAndView save(Servico servico, BindingResult result) {

        if(result.hasErrors()) {
            return add(servico);
        }

        service.save(servico);

        return findAll();
    }
}
