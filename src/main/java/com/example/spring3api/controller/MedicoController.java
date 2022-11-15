package com.example.spring3api.controller;

import com.example.spring3api.medico.DadosCadastroMedico;
import com.example.spring3api.medico.Medico;
import com.example.spring3api.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
    @Transactional
    public void cadastra(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

}
