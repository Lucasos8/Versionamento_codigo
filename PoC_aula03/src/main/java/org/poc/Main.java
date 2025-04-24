package PoC_aula03.src.main.java.org.poc;

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente1 = new Cliente(1, "Maria", 10, "f");
        System.out.println(cliente1);

        // Criando uma fatura para o cliente
        FaturaCliente fatura1 = new FaturaCliente(101, cliente1, 500.0);
        System.out.println(fatura1);
        System.out.printf("Valor com desconto: R$%.2f%n", fatura1.getValorComDesconto());

        // Criando uma conta para o cliente
        ContaCliente conta1 = new ContaCliente(201, cliente1);
        System.out.println(conta1);

        // Adicionando depósito
        conta1.addDeposito(1000.0);
        System.out.printf("Saldo após depósito: R$%.2f%n", conta1.getSaldo());

        // Tentando retirar um valor
        double saldoAtual = conta1.subSaldo(200.0);
        System.out.printf("Saldo após retirada: R$%.2f%n", saldoAtual);

        // Tentando retirar um valor maior que o saldo disponível
        conta1.subSaldo(900.0);
    }
}