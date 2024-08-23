package hn.unah.lenguajes.repo.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
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
@Table(name = "equipos")

public class Equipo {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="codigoEquipo")
   private int codigoEquipo;

   private String nombre;

   private double ataque;

   private double defensa;

   @OneToOne
   @JsonIgnore
   @JoinColumn(name = "codigoEquipo", referencedColumnName="codigoEquipo")
   private Equipo equipo;
 
}
