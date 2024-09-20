package br.edu.unisep.gestaoEventos.model;

public class Sessao {
    private int id;
    private String titulo;
    private String horario;
    private Palestrante palestrante;

    public Sessao() {
    }

    public Sessao(int id, String titulo, String horario, Palestrante palestrante) {
        this.id = id;
        this.titulo = titulo;
        this.horario = horario;
        this.palestrante = palestrante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    @Override
    public String toString() {
        return "Sessao\n" +
                "ID: " + id + "\n" +
                "Título: " + titulo + "\n" +
                "Horário: " + horario + "\n" +
                "Palestrante: " + palestrante.getNome();
    }
}