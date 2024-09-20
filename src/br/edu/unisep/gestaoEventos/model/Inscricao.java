package br.edu.unisep.gestaoEventos.model;

import java.util.Date;

public class Inscricao {
    private int id;
    private Participante participante;
    private Sessao sessao;
    private Date dataInscricao;
    private String status;
    private double valorPago;
    private String metodoPagamento;

    public Inscricao() {
    }

    public Inscricao(int id, Participante participante, Sessao sessao, Date dataInscricao, String status, double valorPago, String metodoPagamento) {
        this.id = id;
        this.participante = participante;
        this.sessao = sessao;
        this.dataInscricao = dataInscricao;
        this.status = status;
        this.valorPago = valorPago;
        this.metodoPagamento = metodoPagamento;
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

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    @Override
    public String toString() {
        return "Inscricao\n" +
                "ID: " + id + "\n" +
                "Participante: " + participante.getNome() + "\n" +
                "Sessao: " + sessao.getTitulo() + "\n" +
                "Data de Inscrição: " + dataInscricao + "\n" +
                "Status: " + status + "\n" +
                "Valor Pago: " + valorPago + "\n" +
                "Método de Pagamento: " + metodoPagamento;
    }
}
