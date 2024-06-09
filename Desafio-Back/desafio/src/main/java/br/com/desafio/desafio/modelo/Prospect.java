package br.com.desafio.desafio.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "prospect")
@Getter
@Setter
public class Prospect {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String numeroDocumento;
    private LocalDate dataNascimento;
    private String cidadeResidencia;
    private boolean ativo;
    private String dataHoraConversao;
    private String tipo;


}
