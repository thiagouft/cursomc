package com.thiago.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.thiago.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
