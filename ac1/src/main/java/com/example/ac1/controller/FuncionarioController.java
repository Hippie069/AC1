package com.example.ac1.controller;

import com.example.ac1.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {
    @Autowired
    private FuncionarioService serv;

    @GetMapping("/funcinarios")
    public ModelAndView getFuncionarios(){
        ModelAndView mv = new ModelAndView("Funcionarios");
        mv.addObject("Funcionarios", serv.getFuncionarios());

        return mv;
    }
    
}
    
