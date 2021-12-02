package com.br.amber.banco.model.contas;

import com.br.amber.banco.exceptions.SaldoInsuficienteException;
import com.br.amber.banco.model.Agencia;
import com.br.amber.banco.model.Cliente;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numero, Agencia agencia, Cliente titular) {
        super(numero, agencia, titular);
    }



}
