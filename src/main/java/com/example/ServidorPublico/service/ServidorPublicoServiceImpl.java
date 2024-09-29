package com.example.ServidorPublico.service;

import com.example.ServidorPublico.model.ServidorPublico;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Service
public class ServidorPublicoServiceImpl implements ServidorPublicoService {

    private final String SERVIDOR = "/data/servidorpublico.json";

    @Override
    public List<ServidorPublico> listAll() {

        try {
            // O typeReference me traz as matriculas
            TypeReference<List<ServidorPublico>> typeref = new TypeReference<List<ServidorPublico>>() {};

            // Abrir o arquivo JSON e manipulá-lo
            InputStream inputStream = TypeReference.class.getResourceAsStream(SERVIDOR);

            // Pegar a lista de servidores públicos
            List<ServidorPublico> servidoresPublicos = new ObjectMapper().readValue(inputStream, typeref);
            return servidoresPublicos;


        } catch (Exception e) {
            System.out.println("Exceção" +e.getMessage());; // ver o erro no console, se houver
            return null;

        }

    }

    @Override
    public Optional<ServidorPublico> listByMatricula(Long matricula) {

        try {
            // O typeReference me traz as matriculas
            TypeReference<List<ServidorPublico>> typeref = new TypeReference<List<ServidorPublico>>() {};

            // Abrir o arquivo JSON e manipulá-lo
            InputStream inputStream = TypeReference.class.getResourceAsStream(SERVIDOR);

            // Pegar a lista de servidores públicos
            List<ServidorPublico> servidoresPublicos =
                    new ObjectMapper().readValue(inputStream, typeref);

            //no caso aqui ele nao vai retorna eu quero saber se a matricula existe
            Optional<ServidorPublico> servidorEncontrado = servidoresPublicos.stream().filter(
                    servidor -> servidor.matricula().equals(matricula))
                    .findFirst();
            //tava colocando o findFirst(); ao lado da matricula isso gera erro o findFirst(); tem que esta fora da função

                    return servidorEncontrado;

        } catch (Exception e) {
            System.out.println("Exceção" +e.getMessage());; // ver o erro no console, se houver
            return null;

        }
    }
}
