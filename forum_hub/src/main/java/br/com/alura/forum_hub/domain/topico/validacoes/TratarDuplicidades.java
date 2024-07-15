package br.com.alura.forum_hub.domain.topico.validacoes;

import br.com.alura.forum_hub.domain.ValidacaoException;
import br.com.alura.forum_hub.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TratarDuplicidades {
    private final TopicoRepository topicoRepository;

    @Autowired
    public TratarDuplicidades(TopicoRepository topicoRepository) {
        this.topicoRepository = topicoRepository;
    }

    public void tratarDuplicidade(String titulo, String mensagem) {
        if (topicoRepository.existsByTituloAndMensagem(titulo, mensagem)) {
            throw new ValidacaoException("Já existe um tópico com o mesmo título e mensagem.");
        }
    }
}
