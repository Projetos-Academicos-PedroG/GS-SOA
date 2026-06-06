package com.astrohabit.dto;

public class RegistroSonoDTO {
    public String dataHoraDormir;  // Recebe como String do console para depois converter
    public String dataHoraAcordar;
    public boolean usouFiltro;

    public RegistroSonoDTO(String dataHoraDormir, String dataHoraAcordar, boolean usouFiltro) {
        this.dataHoraDormir = dataHoraDormir;
        this.dataHoraAcordar = dataHoraAcordar;
        this.usouFiltro = usouFiltro;
    }
}