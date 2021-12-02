package com.br.amber.banco;

import com.br.amber.banco.model.Cliente;
import com.br.amber.banco.objectvalue.Cpf;
import com.br.amber.banco.objectvalue.Email;
import com.br.amber.banco.objectvalue.Telefone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BancoApplication.class, args);
		Cliente cliente = new Cliente("Amber Silva", new Cpf("12345678914"));
		System.out.println();
	}


}
