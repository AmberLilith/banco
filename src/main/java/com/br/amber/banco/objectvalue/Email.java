package com.br.amber.banco.objectvalue;

import java.security.InvalidParameterException;

public class Email {

    private String endereco;

    public Email(String endereco) {
        setEndereco(endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String[] dadosSeparados = endereco.split("@");
        System.out.println(dadosSeparados.length);
        if(endereco == null || endereco.isEmpty()){
            throw new InvalidParameterException("Um email deve ser informado!");
        }else if(dadosSeparados[0].isEmpty() || //Não tem nome do email
                dadosSeparados.length == 1 || //Não tem domínio
                (!endereco.contains("@"))){ //Não tem arroba
            throw new InvalidParameterException("Email informado é inválido!");
        }else{
            this.endereco = endereco;
        }


    }


}
