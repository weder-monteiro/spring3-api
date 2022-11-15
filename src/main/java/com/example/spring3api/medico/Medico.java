package com.example.spring3api.medico;

import com.example.spring3api.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import java.util.Objects;

@Table(name = "medico")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private EspecialidadeEnum especialidade;

    @Embedded
    private Endereco endereco;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Medico medico = (Medico) o;
        return id != null && Objects.equals(id, medico.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
