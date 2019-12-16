package com.jan.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailTestService {
	public void sayHellow() {
		System.out.println("Hellow");
	}

	@Autowired
	private JavaMailSender javaMailSender;

	@Value("${spring.mail.username}")
	private String from;

	public void sendEmail(String to, String subject, String content) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(content);
		simpleMailMessage.setFrom(from);

		javaMailSender.send(simpleMailMessage);
	}
}
