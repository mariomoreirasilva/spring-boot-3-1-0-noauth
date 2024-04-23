package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	public PasswordEncoder passwordEnconder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//teste da codificação hash
		System.out.println("Encode = " + passwordEnconder.encode("123456"));
		
		boolean result = passwordEnconder.matches("123456", "$2a$10$BDQ029bX9xRQ66rphVCf9OdTBDX0zp3kmD13JDZZm9EMl8h5lIuxS");
		
		System.out.println("Resultado da comparação hash = " + result);
		
	}

}
