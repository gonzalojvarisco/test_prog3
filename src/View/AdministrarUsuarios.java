package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AdministrarUsuarios extends JFrame {

    private static final long serialVersionUID = 1L;

	public AdministrarUsuarios() {
        setTitle("Administrar Usuarios");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btnAltaAlumno = new JButton("Dar de alta Alumno");
        JButton btnAltaProfesor = new JButton("Dar de alta Profesor");
        JButton btnVolver = new JButton("Volver al Menú Principal");

        add(btnAltaAlumno);
        add(btnAltaProfesor);
        add(btnVolver);

        btnVolver.addActionListener(e -> {
            new PantallaPrincipal().setVisible(true);
            dispose();
        });

        // Implementar lógica para alta de alumnos y profesores
    }
}
