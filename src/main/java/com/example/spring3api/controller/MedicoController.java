package com.example.spring3api.controller;

import com.example.spring3api.medico.DadosCadastroMedico;
import com.example.spring3api.medico.Medico;
import com.example.spring3api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastra(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

}
