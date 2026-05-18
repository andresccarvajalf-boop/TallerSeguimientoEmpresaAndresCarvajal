package co.edu.uniquindio.mantenimiento;

public class Fontaneria extends Servicio {

    private TipoMaterialTuberia tipoMaterialTuberia;
    private boolean requiereCambioTuberia;

    public Fontaneria(String id,
                      String descripcion,
                      double duracionEstimada,
                      TipoMaterialTuberia tipoMaterialTuberia,
                      boolean requiereCambioTuberia) {

        super(id, descripcion, duracionEstimada);
        this.tipoMaterialTuberia = tipoMaterialTuberia;
        this.requiereCambioTuberia = requiereCambioTuberia;
    }

    public TipoMaterialTuberia getTipoMaterialTuberia() {
        return tipoMaterialTuberia;
    }

    public void setTipoMaterialTuberia(TipoMaterialTuberia tipoMaterialTuberia) {
        this.tipoMaterialTuberia = tipoMaterialTuberia;
    }

    public boolean isRequiereCambioTuberia() {
        return requiereCambioTuberia;
    }

    public void setRequiereCambioTuberia(boolean requiereCambioTuberia) {
        this.requiereCambioTuberia = requiereCambioTuberia;
    }

    @Override
    public String toString() {
        return "Fontaneria{" +
                "tipoMaterialTuberia=" + tipoMaterialTuberia +
                ", requiereCambioTuberia=" + requiereCambioTuberia +
                ", id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", duracionEstimada=" + duracionEstimada +
                '}';
    }
}