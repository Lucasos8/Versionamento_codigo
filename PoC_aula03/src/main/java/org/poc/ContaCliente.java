package PoC_aula03.src.main.java.org.poc;

public class ContaCliente {
    private int id;
    private Cliente cliente;
    private double saldo;

    public ContaCliente(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = 0.0; // saldo inicial
    }

    // Métodos getters
    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double addDeposito(double valor) {
        saldo += valor;
        return saldo;
    }

    public double subSaldo(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para a retirada.");
            return saldo; // Retorna o saldo atual sem alterações
        }
        saldo -= valor;
        return saldo;
    }

    @Override
    public String toString() {
        return String.format("%s(id=%d, saldo=R$%.2f)", cliente.getNome(), id, saldo);
    }
}