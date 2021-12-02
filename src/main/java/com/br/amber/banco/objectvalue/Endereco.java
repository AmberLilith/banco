package com.br.amber.banco.objectvalue;

import java.security.InvalidParameterException;

public class Endereco {

    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
    private String numero;
    private String cep;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if(logradouro == null || logradouro.isEmpty()){
            throw new InvalidParameterException("Logradouro deve ser informado!");
        }else{
            this.logradouro = logradouro;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if(bairro == null || bairro.isEmpty()){
            throw new InvalidParameterException("Bairro deve ser informado!");
        }else{
            this.bairro = bairro;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if(cidade == null || cidade.isEmpty()){
            throw new InvalidParameterException("Cidade deve ser informada!");
        }else{
            this.cidade = cidade;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(estado == null || estado.isEmpty()){
            throw new InvalidParameterException("Estado deve ser informado!");
        }else{
            this.estado = estado;
        }
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        if(complemento == null || complemento.isEmpty()){
            throw new InvalidParameterException("Complemento deve ser informada!");
        }else{
            this.complemento = complemento;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String numeroFormatado = numero.replaceAll("\\D","");
        if(numeroFormatado == null){
            throw new InvalidParameterException("Número deve ser informado e não vazio!");
        }else{
            this.numero = numeroFormatado;
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String cepFormatado = cep.replaceAll("\\D","");
        if(cepFormatado == null){
            throw new InvalidParameterException("CEP deve ser informado e não pode ser vazio!");
        }else{
            this.cep = cepFormatado;
        }
    }

    public Endereco(String logradouro, String bairro, String cidade
                , String estado, String complemento, String numero
                , String cep) {
        setLogradouro(logradouro);
        setBairro(bairro);
        setCidade(cidade);
        setEstado(estado);
        setComplemento(complemento);
        setNumero(numero);
        setCep(cep);
    }

    public Endereco(String numero, String cep) {
        setNumero(numero);
        setCep(cep);
    }
}
