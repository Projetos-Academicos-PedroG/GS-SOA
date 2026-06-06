package com.astrohabit.domain;

import com.astrohabit.exceptions.CargaMentalExcedidaException;

public class TarefaFoco extends AtividadeEspacial {
    private String nomeTarefa;
    private int pontuacaoNasaTlx;
    private boolean modoOrbitaAtivo;
    private String justificativa; // Novo campo para a explicação do desgaste

    public TarefaFoco(String nomeTarefa, int pontuacaoNasaTlx, boolean modoOrbitaAtivo, String justificativa) throws CargaMentalExcedidaException {
        super();
        this.nomeTarefa = nomeTarefa;
        this.pontuacaoNasaTlx = pontuacaoNasaTlx;
        this.modoOrbitaAtivo = modoOrbitaAtivo;
        this.justificativa = justificativa;

        if (pontuacaoNasaTlx > 8) {
            throw new CargaMentalExcedidaException("Carga mental crítica (" + pontuacaoNasaTlx + "/10) detectada na tarefa: " + nomeTarefa + "\nMotivo relatado: " + justificativa);
        }
    }

    @Override
    public void exibirResumo() {
        System.out.println("=== RELATÓRIO DA TAREFA ===");
        System.out.println("Tarefa: " + nomeTarefa);
        System.out.println("Carga Mental (NASA TLX): " + pontuacaoNasaTlx + "/10");
        System.out.println("Feedback do Usuário: " + justificativa);
        System.out.println("===========================");
    }
}