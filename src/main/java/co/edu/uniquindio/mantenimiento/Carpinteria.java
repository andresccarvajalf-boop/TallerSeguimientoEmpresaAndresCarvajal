package co.edu.uniquindio.mantenimiento;

public class Carpinteria extends Servicio {

    private String tipoMadera;
    private boolean requiereBarnizado;

    public Carpinteria(String id,
                       String descripcion,
                       double duracionEstimada,
                       String tipoMadera,
                       boolean requiereBarnizado) {

        super(id, descripcion, duracionEstimada);
        this.tipoMadera = tipoMadera;
        this.requiereBarnizado = requiereBarnizado;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public boolean isRequiereBarnizado() {
        return requiereBarnizado;
    }

    public void setRequiereBarnizado(boolean requiereBarnizado) {
        this.requiereBarnizado = requiereBarnizado;
    }

    @Override
    public String toString() {
        return "Carpinteria{" +
                "tipoMadera='" + tipoMadera + '\'' +
                ", requiereBarnizado=" + requiereBarnizado +
                ", id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", duracionEstimada=" + duracionEstimada +
                '}';
    }
}