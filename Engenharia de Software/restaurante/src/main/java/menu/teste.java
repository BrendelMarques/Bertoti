package menu;
import java.util.List;

import org.cardapio.Hamburguer;
import org.cardapio.Pizza;
import org.cardapio.Porcao;
 
public class teste {
    public static void main(String[] args) {
        Cardapio menu = new Cardapio();

        menu.addHamburguer(new Hamburguer("Cheese Bacon","Pão, hamburguer 120g , bacon, queijo"));
        menu.addHamburguer(new Hamburguer("Bauru", "Presunto, queijo e tomate"));

        menu.addPizza(new Pizza("Calabresa", "Calabresa"));
        menu.addPizza(new Pizza("Toscana", "Calabresa com queijo"));
        menu.addPizza(new Pizza("Portuguesa", "Presunto, queijo, ovo, ervilha e cebola"));

        menu.addPorcao(new Porcao("Torresmo", "Torresmo"));


      
        List<Hamburguer> hamburguersEncontrados = menu.buscarHamburguerPorNome("Cheese Bacon");
        for (Hamburguer hamburguer: hamburguersEncontrados){System.out.println(hamburguer.getIngrediente());
        }
     
        List<Hamburguer> hamburguersEncontrados2 = menu.buscarHamburguerPorIngrediente("Pão, hamburguer 120g , bacon, queijo");
        for (Hamburguer hamburguer: hamburguersEncontrados2){System.out.println(hamburguer.getNome());
        }

        List<Hamburguer> hamburguersEncontrados3 = menu.buscarHamburguerPorNome("Bauru");
        for (Hamburguer hamburguer: hamburguersEncontrados3){System.out.println(("Ingredientes: " + hamburguer.getIngrediente()));
        }

        List<Pizza> pizzasEncontradas = menu.buscarPizzaPorNome("Calabresa");
        for (Pizza pizza: pizzasEncontradas){System.out.println(pizza.getNome());
        }

        List<Pizza> pizzasEncontradas2 = menu.buscarPizzaPorIngrediente("Calabresa com queijo");
        for (Pizza pizza: pizzasEncontradas2){System.out.println(pizza.getNome());
        }

        List<Pizza> pizzasEncontradas3 = menu.buscarPizzaPorNome("Portuguesa");
        for (Pizza pizza: pizzasEncontradas3){System.out.println("Ingredientes: " + (pizza.getIngrediente()));
        }

        List<Porcao> porcoesEncontradas = menu.buscarPorcaoPorNome("Torresmo");
        for (Porcao porcao: porcoesEncontradas){System.out.println(porcao.getNome());
        }
        
    }   
}
