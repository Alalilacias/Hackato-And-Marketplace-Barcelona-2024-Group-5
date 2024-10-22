package com.commerce.barrisvius.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "business_statistics")
public class BusinessStatistic {

        @Id
        private String id;
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
        private int pequenio;
        private int mediano;
        private int grande;
        private double promedioModificacionAnios;
        private int negociosAltoValor;
}