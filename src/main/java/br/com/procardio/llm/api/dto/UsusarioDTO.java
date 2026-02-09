package br.com.procardio.llm.api.dto;

public record UsusarioDTO( 
    Long id,
    String nome,
    String email,
    EnderecoDTO endereco
) {
}
