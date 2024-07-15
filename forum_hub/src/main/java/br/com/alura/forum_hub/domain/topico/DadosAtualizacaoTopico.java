package br.com.alura.forum_hub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(@NotNull String titulo, @NotNull
                                     String mensagem) {
}
