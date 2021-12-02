package com.br.amber.banco;

import com.br.amber.banco.objectvalue.Cpf;
import com.br.amber.banco.objectvalue.Email;
import com.br.amber.banco.objectvalue.Telefone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BancoApplication.class, args);
		Telefone telefone = new Telefone("SDF554.678-95","46","sfsdfsd997700606");
		System.out.println(telefone);
	}


}
