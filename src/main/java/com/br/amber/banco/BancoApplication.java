package com.br.amber.banco;

import com.br.amber.banco.objectvalue.Cpf;
import com.br.amber.banco.objectvalue.Email;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BancoApplication.class, args);
		Email email = new Email("ambergmail.com");
		System.out.println(email.getEndereco());;
	}


}
