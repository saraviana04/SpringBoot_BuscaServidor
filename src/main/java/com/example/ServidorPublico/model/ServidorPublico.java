package com.example.ServidorPublico.model;

public record ServidorPublico(
        Long matricula, String nome,
        String foto, String orgao,
        String vinculo, String cargo,
        String lotacao, String exercicio,
        String email, String telefone,
        String celular, String cpf,
        String naturalidade)
       {
}
