package com.commerce.visualizer.utils;

import com.commerce.visualizer.dto.BusinessStatisticDTO;
import com.commerce.visualizer.dto.InitialFormDTO;
import com.commerce.visualizer.model.BusinessStatistic;

import java.util.Arrays;
import java.util.List;

public class BusinessStatisticMapper {
    public BusinessStatisticDTO toDTO(BusinessStatistic businessStatistic) {
        return new BusinessStatisticDTO(
                businessStatistic.getId(),
                businessStatistic.getNomBarri(),
                businessStatistic.getNegociosPorBarrio(),
                businessStatistic.getDiversidadNegociosPorBarrio(),
                businessStatistic.getProporcionNegociosDestacados(),
                businessStatistic.getAntiguedadPromedioNegocios(),
                businessStatistic.getUltimaModificacionPromedio(),
                businessStatistic.getValorPromedioNegocios(),
                businessStatistic.getDensidadGeograficaNegocios(),
                businessStatistic.getDistanciaPromedioEntreNegocios(),
                businessStatistic.getCategoriaPredominante(),
                businessStatistic.getRatioCategoriaPredominante(),
                businessStatistic.getNegociosMasDe10Anios(),
                businessStatistic.getNegociosCreadosUltimos5Anios(),
                businessStatistic.getPequenio(),
                businessStatistic.getMediano(),
                businessStatistic.getGrande(),
                businessStatistic.getPromedioModificacionAnios(),
                businessStatistic.getNegociosAltoValor()
        );
    }
    public InitialFormDTO toInitialFormDTO(List<BusinessStatistic> businessStatistics){
        List<String> neighborhoodNames = businessStatistics.stream()
                .map(BusinessStatistic::getNomBarri)
                .toList();

        return new InitialFormDTO(neighborhoodNames, Arrays.asList(Constants.ACTIVITY_TYPES));
    }
}
