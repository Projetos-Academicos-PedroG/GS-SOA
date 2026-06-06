package com.astrohabit.domain;

import java.time.LocalDateTime;

public abstract class AtividadeEspacial {
    private String id;
    private LocalDateTime dataRegistro;

    public AtividadeEspacial() {
        this.dataRegistro = LocalDateTime.now(); // Manipulação de DateTime
    }

    public abstract void exibirResumo();

    public LocalDateTime getDataRegistro() { return dataRegistro; }
}