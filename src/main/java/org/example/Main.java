package org.example;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Conta Conta2 = new Conta();

        minhaConta.saldo = 1000;
        System.out.println("Saldo inicial = " + minhaConta.saldo);

        minhaConta.sacar(300);
        System.out.println("Saldo depois de sacar = " + minhaConta.saldo);

        minhaConta.depositar(400);
        System.out.println("Saldo depois de depositar = " + minhaConta.saldo);

        Conta2.saldo = 1100;
        System.out.println("");
        System.out.println("Minha conta:");
        minhaConta.recuperaDadosParaImpressao();
        System.out.println("");
        System.out.println("Conta2:");
        Conta2.recuperaDadosParaImpressao();

        System.out.println("");
        System.out.println("As duas contas são iguais? :");
        if (minhaConta == Conta2) {
            System.out.println("As contas são iguais");
        } else {
            System.out.println("As contas são diferentes");
        }
        if (minhaConta.saldo == Conta2.saldo) {
            System.out.println("são iguais");
        } else {
            System.out.println("são diferentes");
        }

        System.out.println("\n Data modificado para o formato certo: ");
        minhaConta.daata();

        System.out.println("\n tentar	acessar	um	atributo	diretamente	na	classe: ");

        Conta2.saldo = 1234;
        Conta2.calculaRendimento();

    }
}