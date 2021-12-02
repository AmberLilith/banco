package com.br.amber.banco.model;

import com.br.amber.banco.objectvalue.Cpf;
import com.br.amber.banco.objectvalue.Endereco;
import com.br.amber.banco.objectvalue.Telefone;

import java.security.InvalidParameterException;
import java.util.List;

public abstract class  Pessoa {

    private String nome;
    private Cpf cpf;
    private Endereco endereco;
    private List<Telefone> telefones;

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()){
            throw new InvalidParameterException("Um nome deve ser informado");
        }else{
            this.nome = nome;
        }
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public Pessoa(String nome, Cpf cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "[Nome: " + this.nome + ", CPF: " + this.cpf + "]";
    }
}
