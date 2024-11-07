package br.grupointegrado.educacional.repository;

import br.grupointegrado.educacional.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
