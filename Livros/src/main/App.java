package main;

import java.time.LocalDate;

public class App {
    private String nome;	
    private String email;
    private int telef;
    private int cpf;
    private LocalDate dataCadastro;

    public App() {
    }

    public App(String nome, String email, int telef, int cpf, LocalDate dataCadastro) {
        this.nome = nome;
        this.email = email;
        this.telef = telef;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelef() {
        return telef;
    }

    public void setTelef(int telef) {
        this.telef = telef;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}