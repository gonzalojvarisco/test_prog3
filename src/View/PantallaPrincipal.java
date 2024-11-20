package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;

	public PantallaPrincipal() {
        setTitle("Sistema de Administración de Cursos y Alumnos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btnUsuarios = new JButton("Administrar Usuarios");
        JButton btnCursos = new JButton("Administrar Cursos");
        JButton btnReportes = new JButton("Emitir Reportes");

        add(btnUsuarios);
        add(btnCursos);
        add(btnReportes);

        btnUsuarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdministrarUsuarios().setVisible(true);
                dispose();
            }
        });

        btnCursos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdministrarCursos().setVisible(true);
                dispose();
            }
        });

        btnReportes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EmitirReportes().setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PantallaPrincipal().setVisible(true));
    }
}
