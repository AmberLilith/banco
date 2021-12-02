package com.br.amber.banco.model;

import com.br.amber.banco.objectvalue.Endereco;
import com.br.amber.banco.objectvalue.Telefone;
import org.w3c.dom.stylesheets.LinkStyle;

import java.security.InvalidParameterException;
import java.util.List;

public class Agencia {

    private String numero;
    private Endereco endereco;
    private List<Telefone> telefones;

    public Agencia(String numero) {
        this.numero = numero;
    }

    public void setNumero(String numero) {
        String numeroFormatado = numero.replaceAll("\\D","");
        if(numeroFormatado == null || numeroFormatado.isEmpty()){
            throw new InvalidParameterException("Um número de agência deve ser informado!");
        }else{
            this.numero = numero;
        }
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
