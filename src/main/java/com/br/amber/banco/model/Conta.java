package com.br.amber.banco.model;

import com.br.amber.banco.exceptions.SaldoInsuficienteException;
import com.br.amber.banco.objectvalue.Endereco;
import com.br.amber.banco.objectvalue.Telefone;

import java.util.List;

public abstract class Conta {

    private String numero;
    private Agencia agencia;
    private Cliente titular;
    private Double saldo;

    public Conta(String numero, Agencia agencia, Cliente titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    private String deposita(Double valor){
        this.saldo += valor;
        return "Saldo atual é de " + this.saldo;
    }

    private String Transfere(double valor, Conta contaDestino){
        if(this.saldo >= valor){
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        }else{
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        return "Transferência realizada com sucesso para conta:\n" +
                contaDestino.getNumero() + "\n" +
                "Titular: " + contaDestino.getTitular().getNome() + "\n" +
                "Valor transferido: " + valor;
    }

    private String getNumero() {

        return this.numero;
    }

    private Cliente getTitular() {
        return this.titular;
    }

}
