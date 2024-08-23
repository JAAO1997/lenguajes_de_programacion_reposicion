package hn.unah.lenguajes.repo.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.repo.modelos.Posicion;
import hn.unah.lenguajes.repo.servicios.PosicionServicio;
import lombok.Data;

@RestController
@RequestMapping("/api/posiciones")
@Data
public class PosicionControlador {

    private PosicionServicio posicionServicio;

    @GetMapping("/tabla")
    public List<Posicion> obtenerTablaPosiciones() {
        return posicionServicio.obtenerTablaPosiciones();
    }

    @GetMapping("/{codigoEquipo}")
    public Posicion obtenerPosicionPorEquipo(@PathVariable int codigoEquipo) {
        return posicionServicio.obtenerPosicionPorEquipo(codigoEquipo);
    }
}
