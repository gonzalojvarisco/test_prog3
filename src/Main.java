import javax.swing.SwingUtilities;
import Dao.CursoDB;
import Dao.IAbm;
import Entity.Curso;
import View.PantallaPrincipal;

public class Main {

	public static void main(String[] args) {
		
		IAbm<Curso> archivoP = new CursoDB();
		archivoP.leerTodos();
		
		/*SwingUtilities.invokeLater(() -> {
            PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
            pantallaPrincipal.setVisible(true);
        });*/

	}

}
