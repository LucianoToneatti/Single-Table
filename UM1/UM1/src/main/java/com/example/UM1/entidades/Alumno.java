package com.example.UM1.entidades;

import com.example.UM1.enumeraciones.Especialidades;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@SuperBuilder
@DiscriminatorValue("A")
public class Alumno extends Persona{

    private int legajo;

    private Especialidades especialidad;


}