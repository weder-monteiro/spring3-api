package com.example.spring3api.controller;

import com.example.spring3api.medico.DadosCadastroMedico;
import com.example.spring3api.medico.DadosListagemMedico;
import com.example.spring3api.medico.Medico;
import com.example.spring3api.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping
    public List<DadosListagemMedico> buscaTudo() {
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }

}
