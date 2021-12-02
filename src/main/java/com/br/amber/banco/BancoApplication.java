package com.br.amber.banco;

import com.br.amber.banco.model.Agencia;
import com.br.amber.banco.model.Cliente;
import com.br.amber.banco.model.contas.Conta;
import com.br.amber.banco.model.contas.ContaCorrente;
import com.br.amber.banco.model.contas.ContaMista;
import com.br.amber.banco.model.contas.ContaPoupanca;
import com.br.amber.banco.objectvalue.Cpf;

//@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BancoApplication.class, args);
		Cliente amber = new Cliente("Amber Silva", new Cpf("12345678914"));
		Cliente lilith = new Cliente("Lilith Ordone", new Cpf("78945612374"));
		Agencia agencia1 = new Agencia("78945");
		Agencia agencia2 = new Agencia("78945");
		ContaCorrente ccAmber = new ContaCorrente("1234", agencia1,amber);
		ContaCorrente ccLilith = new ContaCorrente("1234", agencia2,lilith);
		ccAmber.depositar(3500.00);
		ccLilith.depositar(83000.00);
		ccAmber.transferir(50.00,ccLilith);
		ccAmber.sacar(70.00);
		ContaPoupanca cpAmber = new ContaPoupanca("1234", agencia1,amber);
		ContaMista contaMista = new ContaMista(ccAmber,cpAmber);
		contaMista.getContaPoupanca().depositar(200.00);
		contaMista.getContaPoupanca().getSaldo();
		contaMista.resgatar(80.00,cpAmber,ccAmber);
		contaMista.getContaPoupanca().getSaldo();
	}


}
