package br.edu.unisep.Gestao_Eventos.view;

import br.edu.unisep.Gestao_Eventos.Model.*;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        Evento evento = new Evento();
        evento.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do evento:")));
        evento.setNome(JOptionPane.showInputDialog("Digite o nome do evento:"));
        evento.setData(JOptionPane.showInputDialog("Digite a data do evento:"));
        evento.setLocal(JOptionPane.showInputDialog("Digite o local do e~~vento:"));

        Participante participante = new Participante();
        participante.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do participante:")));
        participante.setNome(JOptionPane.showInputDialog("Digite o nome do participante:"));
        participante.setEmail(JOptionPane.showInputDialog("Digite o email do participante:"));

        Palestrante palestrante = new Palestrante();
        palestrante.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do palestrante:")));
        palestrante.setNome(JOptionPane.showInputDialog("Digite o nome do palestrante:"));
        palestrante.setEspecialidade(JOptionPane.showInputDialog("Digite a especialidade do palestrante:"));

        Sessao sessao = new Sessao();
        sessao.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da sessão:")));
        sessao.setTitulo(JOptionPane.showInputDialog("Digite o título da sessão:"));
        sessao.setHorario(JOptionPane.showInputDialog("Digite o horário da sessão:"));
        sessao.setPalestrante(palestrante);

        Inscricao inscricao = new Inscricao();
        inscricao.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da inscrição:")));
        inscricao.setParticipante(participante);
        inscricao.setSessao(sessao);

        System.out.println("Evento:");
        System.out.println("ID: " + evento.getId());
        System.out.println("Nome: " + evento.getNome());
        System.out.println("Data: " + evento.getData());
        System.out.println("Local: " + evento.getLocal());

        System.out.println("\nParticipante:");
        System.out.println("ID: " + participante.getId());
        System.out.println("Nome: " + participante.getNome());
        System.out.println("Email: " + participante.getEmail());

        System.out.println("\nPalestrante:");
        System.out.println("ID: " + palestrante.getId());
        System.out.println("Nome: " + palestrante.getNome());
        System.out.println("Especialidade: " + palestrante.getEspecialidade());

        System.out.println("\nSessão:");
        System.out.println("ID: " + sessao.getId());
        System.out.println("Título: " + sessao.getTitulo());
        System.out.println("Horário: " + sessao.getHorario());
        System.out.println("Palestrante: " + sessao.getPalestrante().getNome());

        System.out.println("\nInscrição:");
        System.out.println("ID: " + inscricao.getId());
        System.out.println("Participante: " + inscricao.getParticipante().getNome());
        System.out.println("Sessão: " + inscricao.getSessao().getTitulo());
    }
}
