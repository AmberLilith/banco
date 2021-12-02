package com.br.amber.banco.objectvalue;

import java.security.InvalidParameterException;

public  class Telefone {

    private String codigoPais;
    private String codigoArea;
    private String numero;

    public void setCodigoPais(String codigoPais) {
        String codigoPaisFormatado = codigoPais.replaceAll("\\D","");
        if(codigoPaisFormatado == null){
            throw new InvalidParameterException("Código de país é inválido!");
        }else{
            this.codigoPais = codigoPaisFormatado;
        }
    }

    public void setCodigoArea(String codigoArea) {
        String codigoAreaFormatado = codigoArea.replaceAll("\\D","");
        System.out.println(codigoAreaFormatado);
        System.out.println("tamanho é " + codigoAreaFormatado.length());
        if(codigoAreaFormatado == null ||
            codigoAreaFormatado.length() > 3 ||
            codigoAreaFormatado.length() < 2){
            throw new InvalidParameterException("Código de área é inválido!");
        }else{
            this.codigoArea = codigoAreaFormatado;
        }
    }

    public void setNumero(String numero) {
        String numeroFormatado = numero.replaceAll("\\D","");
        if(numeroFormatado == null ||
                numeroFormatado.length() < 8 ||
                numeroFormatado.length() > 9){
            throw new InvalidParameterException("Número é inválido!");
        }else{
            this.numero = numeroFormatado;
        }
    }

    public Telefone(String codigoPais, String codigoArea, String numero) {
       setCodigoPais(codigoPais);
        setCodigoArea(codigoArea);
        setNumero(numero);
    }

    @Override
    public String toString() {
        return "(" + this.codigoPais + ")(" + this.codigoArea + ")" + this.numero ;
    }
}
