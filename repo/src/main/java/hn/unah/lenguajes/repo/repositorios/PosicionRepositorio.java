package hn.unah.lenguajes.repo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.repo.modelos.Posicion;

public interface PosicionRepositorio extends JpaRepository<Posicion, Integer>{
 Posicion findByEquipoCodigoEquipo(int codigoEquipo);   
}
