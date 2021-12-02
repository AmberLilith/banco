package com.br.amber.banco.model.contas;

import com.br.amber.banco.exceptions.SaldoInsuficienteException;

public class ContaMista {
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    public ContaMista(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;

    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    //Transfere o valor para a conta corrente quando
    public void resgatar(Double valor, ContaPoupanca cp, ContaCorrente cc){
        Double saldoAnterior = cp.getSaldo();
        if (cp.getSaldo() >= valor) {
            cp.setSaldo(cp.getSaldo() - valor);
            cc.depositar(valor);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }

        System.out.println("Resgate efetuado no valor de " + valor + "\n" +
                "Para conta Corrente: " + cc.getNumero() + "\n" +
                "Titular: " + cc.getTitular().getNome() + "\n" +
                "Saldo anterior: " + saldoAnterior + "\n" +
                "Saldo restante: " + cp.getSaldo() + "\n" +
                "______________________________________________");
    }
}
