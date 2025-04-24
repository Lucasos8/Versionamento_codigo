package PoC_aula03.src.main.java.org.poc;

public class FaturaCliente {
    private int id;
    private Cliente cliente;
    private double valor;

    public FaturaCliente(int id, Cliente cliente, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
    }

    // Métodos getters
    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public double getValorComDesconto() {
        return valor - ((valor * cliente.getDesconto()) / 100);
    }

    @Override
    public String toString() {
        return String.format("Fatura {id=%d, cliente=%s, valor=%.2f}", id, cliente, valor);
    }
}