package com.br.amber.banco.model.contas;

import com.br.amber.banco.exceptions.SaldoInsuficienteException;
import com.br.amber.banco.model.Agencia;
import com.br.amber.banco.model.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(String numero, Agencia agencia, Cliente titular) {
        super(numero, agencia, titular);
    }

    public void sacar(Double valor) {
        Double saldoAnterior = this.getSaldo();
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        System.out.println("Saque liberado no valor de " + valor + "\n" +
                "Número: " + this.getSaldo() + "\n" +
                "Titular: " + this.getTitular().getNome() + "\n" +
                "Saldo anterior: " + saldoAnterior + "\n" +
                "Saldo restante: " + this.getSaldo() + "\n" +
                "______________________________________________");
    }

}
