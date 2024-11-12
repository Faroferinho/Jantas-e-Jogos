package org.example.controllers;

import org.example.models.Cliente;
import org.example.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("/")
    public ModelAndView findAll() {

        ModelAndView mv = new ModelAndView("/cliente");
        mv.addObject("clientes", service.findAll());

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(Cliente cliente) {

        ModelAndView mv = new ModelAndView("/postAdd");
        mv.addObject("cliente", cliente);

        return mv;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") int id) {

        return add(service.findOne(id).get());
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") int id) {

        service.delete(id);

        return findAll();
    }

    @PostMapping("/save")
    public ModelAndView save(Cliente cliente, BindingResult result) {

        if(result.hasErrors()) {
            return add(cliente);
        }

        service.save(cliente);

        return findAll();
    }

}
