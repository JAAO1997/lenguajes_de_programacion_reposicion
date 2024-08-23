package hn.unah.lenguajes.repo.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "posiciones")
public class Posicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int empates;
    private int ganados;
    private int golesfavor;
    private int golescontra;
    private int puntos;

    @ManyToOne
    @JoinColumn(name = "codigoequipo")
    private Equipo equipo;
    
}
