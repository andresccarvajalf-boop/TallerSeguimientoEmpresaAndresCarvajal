package co.edu.uniquindio.mantenimiento;

public class Electricidad extends Servicio {

    private int voltaje;
    private boolean requiereCableadoNuevo;

    public Electricidad(String id,
                        String descripcion,
                        double duracionEstimada,
                        int voltaje,
                        boolean requiereCableadoNuevo) {

        super(id, descripcion, duracionEstimada);
        this.voltaje = voltaje;
        this.requiereCableadoNuevo = requiereCableadoNuevo;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public boolean isRequiereCableadoNuevo() {
        return requiereCableadoNuevo;
    }

    public void setRequiereCableadoNuevo(boolean requiereCableadoNuevo) {
        this.requiereCableadoNuevo = requiereCableadoNuevo;
    }

    @Override
    public String toString() {
        return "Electricidad{" +
                "voltaje=" + voltaje +
                ", requiereCableadoNuevo=" + requiereCableadoNuevo +
                ", id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", duracionEstimada=" + duracionEstimada +
                '}';
    }
}