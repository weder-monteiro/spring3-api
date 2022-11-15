package com.example.spring3api.medico;

import com.example.spring3api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
    @NotNull
    Long id,
    String nome,
    String telefone,
    DadosEndereco endereco
) {}
