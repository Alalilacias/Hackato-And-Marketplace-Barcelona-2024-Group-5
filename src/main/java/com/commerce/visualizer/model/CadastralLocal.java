package com.commerce.visualizer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection =  "cadastral_local")
@NoArgsConstructor
@Data
public class CadastralLocal {

    @Id
    private String any;
    private String codiDistricte;
    private String nomDistricte;
    private String codiBarri;
    private String nomBarri;
    private String seccioCensal;
    private String descUsDestiPrincipal;
    private String concepte;
    private int nombre;
}