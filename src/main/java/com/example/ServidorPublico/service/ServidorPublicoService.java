package com.example.ServidorPublico.service;

import com.example.ServidorPublico.model.ServidorPublico;

import java.util.List;
import java.util.Optional;

public interface ServidorPublicoService {

    List<ServidorPublico> listAll();

    Optional<ServidorPublico> listByMatricula(Long matricula);



}
