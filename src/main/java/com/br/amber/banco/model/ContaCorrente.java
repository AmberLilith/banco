package com.br.amber.banco.model;

import com.br.amber.banco.exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta{
    public ContaCorrente(String numero, Agencia agencia, Cliente titular) {
        super(numero, agencia, titular);
    }

    private String saca(Double valor){
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
        }else{
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        return "Saque liberado no valor de " + valor;
    }
}
