package com.commerce.visualizer.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "business_statistics")
public class BusinessStatistic {

        private String nomBarri;
        private int negociosPorBarrio;
        private int diversidadNegociosPorBarrio;
        private double proporcionNegociosDestacados;
        private double antiguedadPromedioNegocios;
        private double ultimaModificacionPromedio;
        private double valorPromedioNegocios;
        private int densidadGeograficaNegocios;
        private double distanciaPromedioEntreNegocios;
        private String categoriaPredominante;
        private double ratioCategoriaPredominante;
        private Integer negociosMasDe10Anios;
        private int negociosCreadosUltimos5Anios;
        private int pequeño;
        private int mediano;
        private int grande;
        private double promedioModificacionAnios;
        private int negociosAltoValor;
}

