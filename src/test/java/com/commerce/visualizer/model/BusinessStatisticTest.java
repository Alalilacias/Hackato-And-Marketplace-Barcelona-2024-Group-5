package com.commerce.visualizer.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessStatisticTest {

    private BusinessStatistic businessStatistic;

    @BeforeEach
    void setUp() {
        // Initialize a BusinessStatistic instance before each test
        businessStatistic = new BusinessStatistic(
                "1", // id
                "Gracia", // nomBarri
                100, // negociosPorBarrio
                50, // diversidadNegociosPorBarrio
                0.7, // proporcionNegociosDestacados
                5.5, // antiguedadPromedioNegocios
                3.2, // ultimaModificacionPromedio
                20000, // valorPromedioNegocios
                150, // densidadGeograficaNegocios
                1.5, // distanciaPromedioEntreNegocios
                "Comercio", // categoriaPredominante
                0.6, // ratioCategoriaPredominante
                20, // negociosMasDe10Anios
                10, // negociosCreadosUltimos5Anios
                30, // pequenio
                50, // mediano
                20, // grande
                4.5, // promedioModificacionAnios
                5 // negociosAltoValor
        );
    }

    @AfterEach
    void tearDown() {
        businessStatistic = null; // Clean up after each test
    }

    @Test
    void getId() {
        assertEquals("1", businessStatistic.getId());
    }

    @Test
    void getNomBarri() {
        assertEquals("Gracia", businessStatistic.getNomBarri());
    }

    @Test
    void getNegociosPorBarrio() {
        assertEquals(100, businessStatistic.getNegociosPorBarrio());
    }

    @Test
    void getDiversidadNegociosPorBarrio() {
        assertEquals(50, businessStatistic.getDiversidadNegociosPorBarrio());
    }

    @Test
    void getProporcionNegociosDestacados() {
        assertEquals(0.7, businessStatistic.getProporcionNegociosDestacados());
    }

    @Test
    void getAntiguedadPromedioNegocios() {
        assertEquals(5.5, businessStatistic.getAntiguedadPromedioNegocios());
    }

    @Test
    void getUltimaModificacionPromedio() {
        assertEquals(3.2, businessStatistic.getUltimaModificacionPromedio());
    }

    @Test
    void getValorPromedioNegocios() {
        assertEquals(20000, businessStatistic.getValorPromedioNegocios());
    }

    @Test
    void getDensidadGeograficaNegocios() {
        assertEquals(150, businessStatistic.getDensidadGeograficaNegocios());
    }

    @Test
    void getDistanciaPromedioEntreNegocios() {
        assertEquals(1.5, businessStatistic.getDistanciaPromedioEntreNegocios());
    }

    @Test
    void getCategoriaPredominante() {
        assertEquals("Comercio", businessStatistic.getCategoriaPredominante());
    }

    @Test
    void getRatioCategoriaPredominante() {
        assertEquals(0.6, businessStatistic.getRatioCategoriaPredominante());
    }

    @Test
    void getNegociosMasDe10Anios() {
        assertEquals(20, businessStatistic.getNegociosMasDe10Anios());
    }

    @Test
    void getNegociosCreadosUltimos5Anios() {
        assertEquals(10, businessStatistic.getNegociosCreadosUltimos5Anios());
    }

    @Test
    void getPequenio() {
        assertEquals(30, businessStatistic.getPequenio());
    }

    @Test
    void getMediano() {
        assertEquals(50, businessStatistic.getMediano());
    }

    @Test
    void getGrande() {
        assertEquals(20, businessStatistic.getGrande());
    }

    @Test
    void getPromedioModificacionAnios() {
        assertEquals(4.5, businessStatistic.getPromedioModificacionAnios());
    }

    @Test
    void getNegociosAltoValor() {
        assertEquals(5, businessStatistic.getNegociosAltoValor());
    }

    @Test
    void setId() {
        businessStatistic.setId("2");
        assertEquals("2", businessStatistic.getId());
    }

    @Test
    void setNomBarri() {
        businessStatistic.setNomBarri("Eixample");
        assertEquals("Eixample", businessStatistic.getNomBarri());
    }

    @Test
    void setNegociosPorBarrio() {
        businessStatistic.setNegociosPorBarrio(120);
        assertEquals(120, businessStatistic.getNegociosPorBarrio());
    }

    @Test
    void setDiversidadNegociosPorBarrio() {
        businessStatistic.setDiversidadNegociosPorBarrio(60);
        assertEquals(60, businessStatistic.getDiversidadNegociosPorBarrio());
    }

    @Test
    void setProporcionNegociosDestacados() {
        businessStatistic.setProporcionNegociosDestacados(0.8);
        assertEquals(0.8, businessStatistic.getProporcionNegociosDestacados());
    }

    @Test
    void setAntiguedadPromedioNegocios() {
        businessStatistic.setAntiguedadPromedioNegocios(6.0);
        assertEquals(6.0, businessStatistic.getAntiguedadPromedioNegocios());
    }

    @Test
    void setUltimaModificacionPromedio() {
        businessStatistic.setUltimaModificacionPromedio(4.0);
        assertEquals(4.0, businessStatistic.getUltimaModificacionPromedio());
    }

    @Test
    void setValorPromedioNegocios() {
        businessStatistic.setValorPromedioNegocios(25000);
        assertEquals(25000, businessStatistic.getValorPromedioNegocios());
    }

    @Test
    void setDensidadGeograficaNegocios() {
        businessStatistic.setDensidadGeograficaNegocios(160);
        assertEquals(160, businessStatistic.getDensidadGeograficaNegocios());
    }

    @Test
    void setDistanciaPromedioEntreNegocios() {
        businessStatistic.setDistanciaPromedioEntreNegocios(2.0);
        assertEquals(2.0, businessStatistic.getDistanciaPromedioEntreNegocios());
    }

    @Test
    void setCategoriaPredominante() {
        businessStatistic.setCategoriaPredominante("Retail");
        assertEquals("Retail", businessStatistic.getCategoriaPredominante());
    }

    @Test
    void setRatioCategoriaPredominante() {
        businessStatistic.setRatioCategoriaPredominante(0.7);
        assertEquals(0.7, businessStatistic.getRatioCategoriaPredominante());
    }

    @Test
    void setNegociosMasDe10Anios() {
        businessStatistic.setNegociosMasDe10Anios(25);
        assertEquals(25, businessStatistic.getNegociosMasDe10Anios());
    }

    @Test
    void setNegociosCreadosUltimos5Anios() {
        businessStatistic.setNegociosCreadosUltimos5Anios(15);
        assertEquals(15, businessStatistic.getNegociosCreadosUltimos5Anios());
    }

    @Test
    void setPequenio() {
        businessStatistic.setPequenio(35);
        assertEquals(35, businessStatistic.getPequenio());
    }

    @Test
    void setMediano() {
        businessStatistic.setMediano(55);
        assertEquals(55, businessStatistic.getMediano());
    }

    @Test
    void setGrande() {
        businessStatistic.setGrande(30);
        assertEquals(30, businessStatistic.getGrande());
    }

    @Test
    void setPromedioModificacionAnios() {
        businessStatistic.setPromedioModificacionAnios(5.0);
        assertEquals(5.0, businessStatistic.getPromedioModificacionAnios());
    }

    @Test
    void setNegociosAltoValor() {
        businessStatistic.setNegociosAltoValor(10);
        assertEquals(10, businessStatistic.getNegociosAltoValor());
    }
}