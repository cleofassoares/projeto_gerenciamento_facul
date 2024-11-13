package br.grupointegrado.educacional.repository;

import br.grupointegrado.educacional.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
