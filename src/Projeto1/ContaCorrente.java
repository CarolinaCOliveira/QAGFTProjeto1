package Projeto1;

public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento() {
        return (getSaldo() * 0.03) - 4.75;
    }

    @Override
    public String toString() {
        return " ".repeat(40) + "Conta Corrente " +
                "\n Número da Conta = " + getNumero() +
                "\n Nome do Titular = '" + getTitular() + "'" +
                "\n Saldo da Conta = R$ " + String.format("%.2f",getSaldo()) +
                "\n Rendimento Mensal da Conta = R$ " + String.format("%.2f",rendimento());
    }
}
