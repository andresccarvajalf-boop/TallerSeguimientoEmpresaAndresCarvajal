package co.edu.uniquindio.mantenimiento;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestionMantenimiento {

    private String nombreEmpresa;
    private List<OrdenServicio> listaOrdenes;

    public SistemaGestionMantenimiento(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaOrdenes = new ArrayList<>();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public List<OrdenServicio> getListaOrdenes() {
        return listaOrdenes;
    }

    public void agregarOrdenServicio(OrdenServicio ordenServicio) {
        listaOrdenes.add(ordenServicio);
    }

    public boolean eliminarOrdenServicio(String idOrden) {

        for (OrdenServicio orden : listaOrdenes) {

            if (orden.getIdOrden().equals(idOrden)) {
                listaOrdenes.remove(orden);
                return true;
            }
        }

        return false;
    }

    public OrdenServicio buscarOrdenServicio(String idOrden) {

        for (OrdenServicio orden : listaOrdenes) {

            if (orden.getIdOrden().equals(idOrden)) {
                return orden;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "SistemaGestionMantenimiento{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", listaOrdenes=" + listaOrdenes +
                '}';
    }
}