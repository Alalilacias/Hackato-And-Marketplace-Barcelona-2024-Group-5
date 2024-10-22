package com.commerce.visualizer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "economic_activity_local")
@NoArgsConstructor
@Data
public class EconomicActivityLocal {

    @Id
    private String idGlobal;
    private String idBcn2016;
    private String codiPrincipalActivitat;
    private String nomPrincipalActivitat;
    private String codiSectorActivitat;
    private String nomSectorActivitat;
    private String codiGrupActivitat;
    private String nomGrupActivitat;
    private String codiActivitat2022;
    private String nomActivitat;
    private String codiActivitat2016;
    private String nomLocal;
    private boolean snOciNocturn;
    private boolean snCoworking;
    private boolean snServeiDegustacio;
    private boolean snObert24h;
    private boolean snMixtura;
    private boolean snCarrer;
    private boolean snMercat;
    private String nomMercat;
    private boolean snGaleria;
    private String nomGaleria;
    private boolean snCComercial;
    private String nomCComercial;
    private boolean snEix;
    private String nomEix;
    private double xUtmEtrs89;
    private double yUtmEtrs89;
    private double latitud;
    private double longitud;
    private String direccioUnica;
    private String codiVia;
    private String nomVia;
    private String planta;
    private String porta;
    private String numPoliciaInicial;
    private String lletraInicial;
    private String numPoliciaFinal;
    private String lletraFinal;
    private boolean solar;
    private String codiParcela;
    private String codiIlla;
    private String seccioCensal;
    private String codiBarri;
    private String nomBarri;
    private String codiDistricte;
    private String nomDistricte;
    private String referenciaCadastral;
    private String dataRevisio;
}
