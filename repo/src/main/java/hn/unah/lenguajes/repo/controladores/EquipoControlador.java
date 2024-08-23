package hn.unah.lenguajes.repo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.repo.modelos.Equipo;
import hn.unah.lenguajes.repo.servicios.EquipoServicio;
import lombok.Data;


@RestController
@RequestMapping("/api/equipos")
@Data
public class EquipoControlador {

    @Autowired
    private EquipoServicio equipoServicio;

    @PostMapping("/crear/nuevo")
    public Equipo crearEquipo(@RequestBody Equipo equipo) {
        return this.equipoServicio.crearEquipo(equipo);
    }
    
    @GetMapping("/buscar/{codigoEquipo}")
    public Equipo buscarEquipo(@PathVariable int codigoEquipo) {
        return equipoServicio.buscarEquipo(codigoEquipo).orElse(null);
    }
    
    @DeleteMapping("/eliminar/{codigoEquipo}")
    public String eliminarEquipo(@PathVariable int codigoEquipo) {
        if (equipoServicio.eliminarEquipo(codigoEquipo)) {
            return "Equipo eliminado";
        }
        return "Equipo no encontrado";
    }
}
