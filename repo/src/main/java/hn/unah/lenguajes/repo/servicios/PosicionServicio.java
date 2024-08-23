package hn.unah.lenguajes.repo.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import hn.unah.lenguajes.repo.modelos.Posicion;
import hn.unah.lenguajes.repo.repositorios.PosicionRepositorio;
import lombok.Data;

@Service
@Data
public class PosicionServicio {
    
    private PosicionRepositorio posicionRepositorio;

    public List<Posicion> obtenerTablaPosiciones(){
        return posicionRepositorio.findAll();
    }

    public Posicion actualizarPosicion(Posicion posicion){
        return posicionRepositorio.save(posicion);
    }

    public Posicion obtenerPosicionPorEquipo(int codigoEquipo){
        return posicionRepositorio.findByEquipoCodigoEquipo(codigoEquipo);
    }
}
