package hn.unah.lenguajes.repo.modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "equipos")

public class Equipo {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int codigoEquipo;

   private String nombre;

   private double ataque;

   private double defensa;

   @OneToOne(mappedBy = "codigoEquipo", cascade = CascadeType.ALL)
   private Equipo equipo;
 
}
