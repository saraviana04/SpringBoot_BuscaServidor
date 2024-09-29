package com.example.ServidorPublico;

import com.example.ServidorPublico.model.ServidorPublico;
import com.example.ServidorPublico.service.ServidorPublicoService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

@Configuration
public class ServidorpublicoApplicationRunner implements CommandLineRunner {

    private ServidorPublicoService servidorService;

    @Autowired
    public void setServidorPublicoService(ServidorPublicoService servidorService) {
        this.servidorService = servidorService;
    }

    @PostConstruct
    public void listAll() {
        List<ServidorPublico> servidorespublicos = servidorService.listAll();

        if (servidorespublicos.size() != 0) {
            System.out.println("###########################################");
            servidorespublicos.forEach(
                    servidor -> {
                        System.out.println(servidor.matricula());
                        System.out.println(servidor.nome());
                        System.out.println(servidor.foto());
                        System.out.println(servidor.orgao());
                        System.out.println(servidor.vinculo());
                        System.out.println(servidor.cargo());
                        System.out.println(servidor.lotacao());
                        System.out.println(servidor.exercicio());
                        System.out.println(servidor.email());
                        System.out.println(servidor.telefone());
                        System.out.println(servidor.celular());
                        System.out.println(servidor.cpf());
                        System.out.println(servidor.naturalidade());
                    }
            );

        } else {
            System.out.println("Arquivo vazio");
        }
    }

    @PostConstruct
    public void listByMatricula() {
        // Solicita que o usuário digite a matrícula
        long matricula = Long.parseLong(JOptionPane.showInputDialog("Digite a matrícula procurada"));

        // Busca o servidor pela matrícula
        Optional<ServidorPublico> servidorEncontrado = servidorService.listByMatricula(matricula);

        if (servidorEncontrado.isPresent()) {
            ServidorPublico servidor = servidorEncontrado.get();

            // Formata a string com os detalhes do servidor
            String detalhesServidor = String.format(
                    "Matrícula: %d\nNome: %s\nFoto: %s\nÓrgão: %s\nVínculo: %s\nCargo: %s\nLotação: %s\nExercício: %s\nEmail: %s\nTelefone: %s\nCelular: %s\nCPF: %s\nNaturalidade: %s",
                    servidor.matricula(),
                    servidor.nome(),
                    servidor.foto(),
                    servidor.orgao(),
                    servidor.vinculo(),
                    servidor.cargo(),
                    servidor.lotacao(),
                    servidor.exercicio(),
                    servidor.email(),
                    servidor.telefone(),
                    servidor.celular(),
                    servidor.cpf(),
                    servidor.naturalidade()
            );

            // Exibe os detalhes do servidor em uma caixa de diálogo
            JOptionPane.showMessageDialog(null, detalhesServidor, "Servidor Encontrado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Exibe uma mensagem de erro caso o servidor não seja encontrado
            JOptionPane.showMessageDialog(null, "Não existe o servidor público com a matrícula encontrada", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void run(String... args) throws Exception {
        // Este método pode ser utilizado para inicializar processos na inicialização da aplicação
    }
}
