package Projeto1;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento() {
        return getSaldo() * 0.008;
    }

    @Override
    public String toString() {
        return " ".repeat(40) + "Conta Poupança " +
                "\n Número da Conta = " + getNumero() +
                "\n Nome do Titular = '" + getTitular() + "'" +
                "\n Saldo da Conta = R$ " + String.format("%.2f",getSaldo()) +
                "\n Rendimento Mensal da Conta = R$ " + String.format("%.2f",rendimento());
    }
}