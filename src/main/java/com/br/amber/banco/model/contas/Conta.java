package com.br.amber.banco.model.contas;

import com.br.amber.banco.exceptions.SaldoInsuficienteException;
import com.br.amber.banco.model.Agencia;
import com.br.amber.banco.model.Cliente;

public abstract class Conta {

    private String numero;
    private Agencia agencia;
    private Cliente titular;
    private Double saldo;

    public Conta(String numero, Agencia agencia, Cliente titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = 0.00;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        System.out.println("Saldo atual da " + this.retornarTipoDeConta() + " é de R$ " + this.saldo + "\n" +
                        "Número da conta: " + this.getNumero() + "\n" +
                        "titular: " + this.getTitular().getNome() + "\n" +
                        "______________________________________________");
        return saldo;
    }



    public void depositar(Double valor){
        this.saldo += valor;
        System.out.println("Depósito realizada para conta: \n" +
                "Número: " + this.numero + "\n" +
                "Titular: " + this.getTitular().getNome() + "\n" +
                "Saldo atual é de " + this.saldo +  "\n" +
                "______________________________________________");
    }



    public void transferir(double valor, Conta contaDestino){
        Double saldoAnterior = this.getSaldo();
        if(this.saldo >= valor){
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        }else{
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        System.out.println("Transferência realizada com sucesso para conta:\n" +
                contaDestino.getNumero() + "\n" +
                "Titular: " + this.getTitular().getNome() + "\n" +
                "Valor transferido: " + valor + "\n" +
                "Saldo anterior: " + saldoAnterior + "\n" +
                "Saldo atual: " + this.getSaldo() + "\n" +
                "______________________________________________");
    }

    public String getNumero() {

        return this.numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public String retornarTipoDeConta(){
        String tipo = this.getClass().getSimpleName();
        return tipo.substring(0,5) + " " + tipo.substring(5);
    }

}
