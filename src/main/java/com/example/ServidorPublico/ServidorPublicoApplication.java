package com.example.ServidorPublico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServidorPublicoApplication {

	public static void main(String[] args) {
		System.setProperty("java.awt.headless", "false"); //aqui eu digo que eu posso utilizar o JOption
		SpringApplication.run(ServidorPublicoApplication.class, args);
	}

}
