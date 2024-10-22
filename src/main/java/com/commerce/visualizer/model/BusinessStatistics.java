package com.commerce.visualizer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Data
@NoArgsConstructor
@Document(collection = "business_statistics")
public class BusinessStatistics {

    @Id
    private String neighborhoodName;  // nombre_barrio
    private int businessesPerNeighborhood;  // negocios_por_barrio
    private int businessDiversityPerNeighborhood;  // diversidad_negocios_por_barrio
    private double proportionOfOutstandingBusinesses;  // proporcion_negocios_destacados
    private double averageBusinessAge;  // antiguedad_promedio_negocios
    private double averageLastModificationYear;  // ultima_modificacion_promedio
    private double averageBusinessValue;  // valor_promedio_negocios
    private int geographicBusinessDensity;  // densidad_geografica_negocios
    private double averageDistanceBetweenBusinesses;  // distancia_promedio_entre_negocios
    private String predominantCategory;  // categoria_predominante
    private double predominantCategoryRatio;  // ratio_categoria_predominante
    private Integer businessesOlderThan10Years;  // negocios_mas_de_10_anios
    private int businessesCreatedLast5Years;  // negocios_creados_ultimos_5_anios
    private int smallBusinesses;  // pequeño
    private int mediumBusinesses;  // mediano
    private int largeBusinesses;  // grande
    private double averageModificationYears;  // promedio_modificacion_anios
    private int highValueBusinesses;  // negocios_alto_valor
}

