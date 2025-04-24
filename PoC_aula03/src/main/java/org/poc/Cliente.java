package PoC_aula03.src.main.java.org.poc;

public class Cliente {
    private int id;
    private String nome;
    private int desconto; // em percentual
    private String genero; // 'm', 'f', 'nd'

    public Cliente(int id, String nome, int desconto, String genero) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        this.genero = genero;
    }

    // Métodos getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDesconto() {
        return desconto;
    }

    public String getGenero() {
        return genero;
    }

    // Métodos setters
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return String.format("%s(id=%d) (desconto=%d%%)", nome, id, desconto);
    }

}
