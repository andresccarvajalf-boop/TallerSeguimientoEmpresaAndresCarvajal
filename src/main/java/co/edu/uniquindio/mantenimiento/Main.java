package co.edu.uniquindio.mantenimiento;

import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String nombreTecnico = JOptionPane.showInputDialog(
                "Ingrese el nombre del técnico:"
        );

        String especialidad = JOptionPane.showInputDialog(
                "Ingrese la especialidad:"
        );

        Tecnico tecnico = new Tecnico(
                "T01",
                nombreTecnico,
                especialidad,
                5
        );

        JOptionPane.showMessageDialog(
                null,
                "Tecnico creado:\n" + tecnico
        );
    }
}