package com.lucascunha.projetoPedidos.services;

import org.springframework.mail.SimpleMailMessage;

import com.lucascunha.projetoPedidos.domain.Cliente;
import com.lucascunha.projetoPedidos.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}