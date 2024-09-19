package br.edu.unisep.Gestao_Eventos.Model;

public class Inscricao {
    private int id;
    private Participante participante;
    private Sessao sessao;

    public Inscricao() {
    }

    public Inscricao(int id, Participante participante, Sessao sessao) {
        this.id = id;
        this.participante = participante;
        this.sessao = sessao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    @Override
    public String toString() {
        return "Inscricao\n" +
                "ID: " + id + "\n" +
                "Participante: " + participante.getNome() + "\n" +
                "Sessao: " + sessao.getTitulo();
    }
}
