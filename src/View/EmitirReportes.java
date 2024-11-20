package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EmitirReportes extends JFrame {

    private static final long serialVersionUID = 1L;

	public EmitirReportes() {
        setTitle("Emitir Reportes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btnRecaudacion = new JButton("Reporte de Recaudación");
        JButton btnAprobados = new JButton("Reporte de Aprobados");
        JButton btnVolver = new JButton("Volver al Menú Principal");

        add(btnRecaudacion);
        add(btnAprobados);
        add(btnVolver);

        btnVolver.addActionListener(e -> {
            new PantallaPrincipal().setVisible(true);
            dispose();
        });

        // Implementar lógica para mostrar reportes
    }
}
