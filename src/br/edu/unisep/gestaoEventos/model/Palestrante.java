package br.edu.unisep.gestaoEventos.model;

public class Palestrante {
    private int id;
    private String nome;
    private String especialidade;
    private String telefone;
    private String email;
    private String redeSocial;

    public Palestrante() {
    }

    public Palestrante(int id, String nome, String especialidade, String telefone, String email, String redeSocial) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.telefone = telefone;
        this.email = email;
        this.redeSocial = redeSocial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }

    @Override
    public String toString() {
        return "Palestrante\n" +
                "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Especialidade: " + especialidade + "\n" +
                "Telefone: " + telefone + "\n" +
                "Email: " + email + "\n" +
                "Rede Social: " + redeSocial;
    }
}
