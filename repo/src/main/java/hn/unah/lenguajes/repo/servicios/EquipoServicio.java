package hn.unah.lenguajes.repo.servicios;

import java.util.Optional;

import org.springframework.stereotype.Service;

import hn.unah.lenguajes.repo.modelos.Equipo;
import hn.unah.lenguajes.repo.repositorios.EquipoRepositorio;
import lombok.Data;

@Service
@Data
public class EquipoServicio {

    private EquipoRepositorio equipoRepositorio;

    public Equipo crearEquipo(Equipo equipo){
        return equipoRepositorio.save(equipo);
    }

    public Optional<Equipo> buscarEquipo(int codigoEquipo) {
        return equipoRepositorio.findById(codigoEquipo);
    }

    public boolean eliminarEquipo(int codigoEquipo){
        Optional<Equipo> equipo = equipoRepositorio.findById(codigoEquipo);
        if (equipo.isPresent()){
            equipoRepositorio.deleteById(codigoEquipo);
            return true;
        }
        return false;
    }
    
}
