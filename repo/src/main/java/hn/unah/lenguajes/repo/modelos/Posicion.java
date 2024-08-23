package hn.unah.lenguajes.repo.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "posiciones")
public class Posicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoEquipo;

    private int empates;
    private int ganados;
    private int golesfavor;
    private int golescontra;
    private int puntos;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "codigoEquipo", referencedColumnName="codigoEquipo")
    private Equipo equipo;
    
}
