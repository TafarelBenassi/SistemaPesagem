
package sistemapesagem;

import sistemapesagem.telas.TelaProduto;
import java.sql.SQLException;
import java.util.List;

public class SistemaPesagem {


    public static void main(String[] args) throws SQLException, Exception {
        //TelaProduto tp = new TelaProduto(null, false, 0, "", "", 0);
        TelaProduto tp = TelaProduto.getInstancia();
        tp.setVisible(true);
    }
    
}
