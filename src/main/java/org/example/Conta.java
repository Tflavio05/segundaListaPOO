package org.example;

public class Conta {

    String nomeTitular;
    int numeroConta;
    int agencia;
    double saldo;
    Data dataAbertura = new Data();





    void sacar(double e) {
        double y =  this.saldo - e;
        this.saldo = y;
    }

    void depositar(double e) {
        this.saldo += e;
    }

    double calculaRendimento() {
        double resultt = saldo * 0.1;
        return resultt;

    }

    void recuperaDadosParaImpressao() {
        System.out.println("Nome do titular da conta = "+ nomeTitular);
        System.out.println("Numero da conta = "+ numeroConta);
        System.out.println("Numero da agencia = "+ agencia);
        System.out.println("Saldo altual da conta = "+ saldo);
        System.out.println("Data de abertura da conta = "+ dataAbertura);

    }
    void daata() {
        dataAbertura.dia = 01;
        dataAbertura.mes = 05;
        dataAbertura.ano = 2004;

        System.out.println(this.dataAbertura.dia + "/" + this.dataAbertura.mes + "/" + this.dataAbertura.ano);
    }
}