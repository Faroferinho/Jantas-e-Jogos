package org.example.controllers;

import org.example.models.Funcionario;
import org.example.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping("/")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView("/");
        mv.addObject("funcionario", service.findAll());

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(Funcionario funcionario){
        ModelAndView mv = new ModelAndView("/funcionarioAdd");
        mv.addObject("funcionario", funcionario);

        return mv;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") int id){
        return add(service.findOne(id).get());
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") int id) {

        service.delete(id);

        return findAll();
    }

    @PostMapping("/save")
    public ModelAndView save(Funcionario funcionario, BindingResult result) {

        if(result.hasErrors()) {
            return add(funcionario);
        }

        service.save(funcionario);

        return findAll();
    }

}
