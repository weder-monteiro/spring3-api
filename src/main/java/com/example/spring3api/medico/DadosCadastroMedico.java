package com.example.spring3api.medico;

import com.example.spring3api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        EspecialidadeEnum especialidade,
        DadosEndereco endereco
) {}
