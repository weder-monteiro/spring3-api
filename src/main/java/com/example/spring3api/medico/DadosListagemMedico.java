package com.example.spring3api.medico;

public record DadosListagemMedico(
    String nome,
    String email,
    String crm,
    EspecialidadeEnum especialidade
) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
