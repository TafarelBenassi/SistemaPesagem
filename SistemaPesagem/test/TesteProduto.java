import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemadepesagem.GUI.ProdutoJpaController;
import sistemadepesagem.GUI.exceptions.NonexistentEntityException;
import sistemapesagem.Produto;
import sistemapesagem.telas.TelaBuscaProduto;

public class TesteProduto {

    public static void main(String[] args) throws NonexistentEntityException, SQLException {
        ProdutoJpaController pc = new ProdutoJpaController();
        
        Produto p = new Produto("produtcho", "desc", 6);

        
        TelaBuscaProduto tbp = new TelaBuscaProduto();
        tbp.setVisible(true);
            //INSERE
            //pc.create(p);

            //REMOVE
            //passa-se o id do produto que quer se deletar
            //pc.destroy(7);
            
            //ALTERA
            //pc.edit(p);
            
            //BUSCA

        
    
    }
}
