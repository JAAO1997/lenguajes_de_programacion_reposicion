package hn.unah.lenguajes.repo.modelos;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "posiciones")
public class Posicion {

    @Id
    @Column(name="codigoEquipo")
    private int codigoEquipo;

    private int empates;
    private int ganados;
    private int golesfavor;
    private int golescontra;
    private int puntos;

    @OneToOne(mappedBy = "codigoEquipo", cascade = CascadeType.ALL)
    private Equipo equipo;
    
}
