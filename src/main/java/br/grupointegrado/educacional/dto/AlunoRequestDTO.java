package br.grupointegrado.educacional.dto;

import java.time.LocalDate;

public record AlunoRequestDTO(String nome, String matricula, String email, LocalDate data_nascimento) {
}
