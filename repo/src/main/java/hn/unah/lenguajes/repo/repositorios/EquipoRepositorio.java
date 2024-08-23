package hn.unah.lenguajes.repo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.repo.modelos.Equipo;

public interface EquipoRepositorio extends JpaRepository<Equipo, Integer>{
    
}
