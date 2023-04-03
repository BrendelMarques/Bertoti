import java.util.List;

import org.cardapio.Hamburguer;
import org.cardapio.Pizza;
import org.cardapio.Porcao;

import menu.Cardapio;

public class test {
    public static void main(String[] args) {
        Cardapio menu = new Cardapio();

        menu.addHamburguer(new Hamburguer("Cheese Bacon", "Bacon"));
        menu.addPizza(new Pizza("Calabresa", "Calabresa"));
        menu.addPorcao(new Porcao("Torresmo", "Torresmo"));
        
        List<Hamburguer> hamburguersEncontrados = menu.buscarHamburguerPorNome("Cheese Bacon");

        for (Hamburguer hamburguer: hamburguersEncontrados){System.out.println(hamburguer.getNome());
        }
        
        List<Hamburguer> hamburguersEncontrados2 = menu.buscarHamburguerPorIngrediente("Bacon");

        for (Hamburguer hamburguer: hamburguersEncontrados2){System.out.println(hamburguer.getIngrediente());
        }
    }   
}
