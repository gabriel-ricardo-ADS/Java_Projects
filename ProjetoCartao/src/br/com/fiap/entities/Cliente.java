package br.com.fiap.entities;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome.toUpperCase();
        this.cpf = cpf;
        this.email = email.toLowerCase();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nEmail: " + email;
    }
}