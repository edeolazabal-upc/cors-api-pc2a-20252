package com.upc.corsapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Insumo {
    /*
    Id int
Nombre string
Tipo string
cantidad_kg float
costo_soles float
fecha_ingreso Date
proveedor_email string

     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;
    String tipo;
    float cantidad_kg;
    float costo_soles;
    LocalDate fecha_ingreso;
    String proveedor_email;

}
