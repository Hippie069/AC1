package com.example.ac1.service;
import com.example.ac1.repository.FuncionarioRepository;

import java.util.List;

import com.example.ac1.entity.Funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository rep;

    public List<Funcionario> getFuncionarios(){
        return rep.findAll();
    }
}
