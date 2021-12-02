package com.br.amber.banco.exceptions;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}
