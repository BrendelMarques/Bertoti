package menu;
import java.util.List;

import org.cardapio.Hamburguer;
import org.cardapio.Pizza;
import org.cardapio.Porcao;

public class teste {
    public static void main(String[] args) {
        Cardapio menu = new Cardapio();

        menu.addHamburguer(new Hamburguer("Cheese Bacon", "Bacon"));
        menu.addPizza(new Pizza("Calabresa", "Calabresa"));
        menu.addPizza(new Pizza("Toscana", "Calabresa com queijo"));
        menu.addPorcao(new Porcao("Torresmo", "Torresmo"));
      
        List<Hamburguer> hamburguersEncontrados = menu.buscarHamburguerPorNome("Cheese Bacon");
        for (Hamburguer hamburguer: hamburguersEncontrados){System.out.println(hamburguer.getNome());
        }
     
        List<Hamburguer> hamburguersEncontrados2 = menu.buscarHamburguerPorIngrediente("Bacon");
        for (Hamburguer hamburguer: hamburguersEncontrados2){System.out.println(hamburguer.getNome());
        }

        List<Pizza> pizzasEncontradas = menu.buscarPizzaPorNome("Calabresa");
        for (Pizza pizza: pizzasEncontradas){System.out.println(pizza.getNome());
        }

        List<Pizza> pizzasEncontradas2 = menu.buscarPizzaPorIngrediente("Calabresa com queijo");
        for (Pizza pizza: pizzasEncontradas2){System.out.println(pizza.getNome());
        }

        List<Porcao> porcoesEncontradas = menu.buscarPorcaoPorNome("Torresmo");
        for (Porcao porcao: porcoesEncontradas){System.out.println(porcao.getNome());
        }
    }   
}
