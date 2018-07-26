package com.lucascunha.projetoPedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucascunha.projetoPedidos.services.S3Service;

@SpringBootApplication
public class ProjetoPedidosBackApplication implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPedidosBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\Users\\Lucas\\Pictures\\guitarra.png");
	}
}
