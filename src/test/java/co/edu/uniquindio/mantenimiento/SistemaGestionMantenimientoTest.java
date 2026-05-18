package co.edu.uniquindio.mantenimiento;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SistemaGestionMantenimientoTest {

    @Test
    void agregarOrdenServicioTest() {

        SistemaGestionMantenimiento sistema =
                new SistemaGestionMantenimiento("Uniquindio");

        OrdenServicio orden = crearOrden("001");

        sistema.agregarOrdenServicio(orden);

        assertEquals(1, sistema.getListaOrdenes().size());
    }

    @Test
    void buscarOrdenServicioExistenteTest() {

        SistemaGestionMantenimiento sistema =
                new SistemaGestionMantenimiento("Uniquindio");

        OrdenServicio orden = crearOrden("002");

        sistema.agregarOrdenServicio(orden);

        OrdenServicio resultado =
                sistema.buscarOrdenServicio("002");

        assertNotNull(resultado);
    }

    @Test
    void buscarOrdenServicioNoExistenteTest() {

        SistemaGestionMantenimiento sistema =
                new SistemaGestionMantenimiento("Uniquindio");

        OrdenServicio resultado =
                sistema.buscarOrdenServicio("999");

        assertNull(resultado);
    }

    @Test
    void eliminarOrdenServicioExistenteTest() {

        SistemaGestionMantenimiento sistema =
                new SistemaGestionMantenimiento("Uniquindio");

        OrdenServicio orden = crearOrden("003");

        sistema.agregarOrdenServicio(orden);

        boolean eliminado =
                sistema.eliminarOrdenServicio("003");

        assertTrue(eliminado);
        assertEquals(0, sistema.getListaOrdenes().size());
    }

    @Test
    void eliminarOrdenServicioNoExistenteTest() {

        SistemaGestionMantenimiento sistema =
                new SistemaGestionMantenimiento("Uniquindio");

        boolean eliminado =
                sistema.eliminarOrdenServicio("888");

        assertFalse(eliminado);
    }

    @Test
    void agregarMaterialOrdenServicioTest() {

        OrdenServicio orden = crearOrden("004");

        Material material = new Material(
                "Cable",
                25000,
                2
        );

        orden.agregarMaterial(material);

        assertEquals(1, orden.getListaMateriales().size());
    }

    @Test
    void verificarEstadoServicioTest() {

        OrdenServicio orden = crearOrden("005");

        assertEquals(
                EstadoServicio.PENDIENTE,
                orden.getEstadoServicio()
        );
    }

    private OrdenServicio crearOrden(String idOrden) {

        Electricidad servicio = new Electricidad(
                "E01",
                "Reparación eléctrica",
                3.5,
                220,
                true
        );

        Tecnico tecnico = new Tecnico(
                "T01",
                "Carlos",
                "Electricista",
                5
        );

        Vivienda vivienda = new Vivienda(
                "Cra 10",
                "Juan",
                TipoInmueble.CASA
        );

        return new OrdenServicio(
                idOrden,
                LocalDate.now(),
                EstadoServicio.PENDIENTE,
                servicio,
                tecnico,
                vivienda
        );
    }
}