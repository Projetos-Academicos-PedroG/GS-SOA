package com.astrohabit.domain;

import java.time.Duration;
import java.time.LocalDateTime;

public class RegistroSono extends AtividadeEspacial {
    private LocalDateTime horaDormir;
    private LocalDateTime horaAcordar;
    private boolean usouFiltroLuzAzul;

    public RegistroSono(LocalDateTime horaDormir, LocalDateTime horaAcordar, boolean usouFiltroLuzAzul) {
        super();
        this.horaDormir = horaDormir;
        this.horaAcordar = horaAcordar;
        this.usouFiltroLuzAzul = usouFiltroLuzAzul;
    }

    public long calcularHorasDormidas() {
        if (horaDormir == null || horaAcordar == null) return 0;
        return Duration.between(horaDormir, horaAcordar).toHours();
    }

    @Override
    public void exibirResumo() {
        long horas = calcularHorasDormidas();
        System.out.println("=== RELATÓRIO DO CICLO CIRCADIANO ===");
        System.out.println("Horas de sono: " + horas + "h");
        System.out.println("Usou filtro de luz azul: " + (usouFiltroLuzAzul ? "Sim" : "Não"));

        if (horas < 6 && !usouFiltroLuzAzul) {
            System.out.println("[ALERTA] Risco de fadiga similar a de um astronauta. Ative o filtro de luz azul.");
        }
    }
}