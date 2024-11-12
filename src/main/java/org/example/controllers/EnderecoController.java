package org.example.controllers;

import org.example.models.Endereco;
import org.example.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EnderecoController {

    @Autowired
    public EnderecoService service;

    @GetMapping("/")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView("/endereco");
        mv.addObject("Enderecos", service.findAll());

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(Endereco endereco){
        ModelAndView mv = new ModelAndView("/endereco");
        mv.addObject("endereco", endereco);

        return mv;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") int id) {

        service.delete(id);

        return findAll();
    }

    @PostMapping("/save")
    public ModelAndView save(Endereco endereco, BindingResult result) {

        if(result.hasErrors()) {
            return add(endereco);
        }

        service.save(endereco);

        return findAll();
    }

}
