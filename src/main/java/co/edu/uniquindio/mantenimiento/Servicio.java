package co.edu.uniquindio.mantenimiento;

public abstract class Servicio {

    protected String id;
    protected String descripcion;
    protected double duracionEstimada;

    public Servicio(String id, String descripcion, double duracionEstimada) {
        this.id = id;
        this.descripcion = descripcion;
        this.duracionEstimada = duracionEstimada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDuracionEstimada() {
        return duracionEstimada;
    }

    public void setDuracionEstimada(double duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", duracionEstimada=" + duracionEstimada +
                '}';
    }
}