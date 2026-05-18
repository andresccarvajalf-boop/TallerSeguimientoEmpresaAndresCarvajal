package co.edu.uniquindio.mantenimiento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdenServicio {

    private String idOrden;
    private LocalDate fecha;
    private EstadoServicio estadoServicio;
    private Servicio servicio;
    private Tecnico tecnico;
    private Vivienda vivienda;
    private List<Material> listaMateriales;

    public OrdenServicio(String idOrden,
                         LocalDate fecha,
                         EstadoServicio estadoServicio,
                         Servicio servicio,
                         Tecnico tecnico,
                         Vivienda vivienda) {

        this.idOrden = idOrden;
        this.fecha = fecha;
        this.estadoServicio = estadoServicio;
        this.servicio = servicio;
        this.tecnico = tecnico;
        this.vivienda = vivienda;
        this.listaMateriales = new ArrayList<>();
    }

    public String getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(String idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public EstadoServicio getEstadoServicio() {
        return estadoServicio;
    }

    public void setEstadoServicio(EstadoServicio estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public List<Material> getListaMateriales() {
        return listaMateriales;
    }

    public void agregarMaterial(Material material) {
        listaMateriales.add(material);
    }

    @Override
    public String toString() {
        return "OrdenServicio{" +
                "idOrden='" + idOrden + '\'' +
                ", fecha=" + fecha +
                ", estadoServicio=" + estadoServicio +
                ", servicio=" + servicio +
                ", tecnico=" + tecnico +
                ", vivienda=" + vivienda +
                ", listaMateriales=" + listaMateriales +
                '}';
    }
}