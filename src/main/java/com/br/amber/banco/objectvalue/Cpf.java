package com.br.amber.banco.objectvalue;

import java.security.InvalidParameterException;

public class Cpf {

    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String numeroFormatado = numero.replaceAll("\\D","");
        if(numeroFormatado == null || numeroFormatado.isEmpty()){
            throw new InvalidParameterException("Número do CPF não pode ser vazio e conter somente números!");
        }else if(numeroFormatado.length() < 11){
            throw new InvalidParameterException("Número DO CPF deve ter exatamente 11 dígitos!");
        }else{
            this.numero = numeroFormatado;
        }
    }

    public Cpf(String numero) {
        setNumero(numero);
    }

    @Override
    public String toString() {
        return this.numero;
    }
}
