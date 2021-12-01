package com.br.amber.banco.objectvalue;

import java.security.InvalidParameterException;

public class Cpf {

    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String numeroFormatado = numero.replaceAll("[^0-9]","");
        if(numeroFormatado == null || numeroFormatado.isEmpty()){
            throw new InvalidParameterException("Número não pode ser vazio!");
        }else if(numeroFormatado.length() < 11){
            throw new InvalidParameterException("Número deve ter exatamente 12 dígitos!");
        }else{
            this.numero = numeroFormatado;
        }
    }

    public Cpf(String numero) {
        setNumero(numero);
    }
}
