package com.example.spring3api.medico;

public record DadosListagemMedico(
    Long id,
    String nome,
    String email,
    String crm,
    EspecialidadeEnum especialidade
) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
