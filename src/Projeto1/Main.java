package Projeto1;

//Autor: Carolina Oliveira

//Imprimir dados da Conta Corrente e Conta Poupança de um determinado cliente
//Exibindo Conta, Nome, Saldo e Rendimento


public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1234, "Carolina Oliveira", 15000.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(12345, "Carolina Oliveira", 20000.00);


        System.out.printf("%s\n","-".repeat(100));
        System.out.println(" ".repeat(40) + "Extrato de Contas");
        System.out.printf("%s\n","-".repeat(100));
        System.out.println(contaCorrente);
        System.out.printf("%s\n","-".repeat(100));
        System.out.println(contaPoupanca);
    }
}

