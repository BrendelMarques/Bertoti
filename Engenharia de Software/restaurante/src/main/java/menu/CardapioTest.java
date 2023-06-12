package menu;

import org.cardapio.Hamburguer;
import org.cardapio.Pizza;
import org.cardapio.Porcao;

import java.util.List;

import static org.junit.Assert.*;

public class CardapioTest {

    @org.junit.Before
    public void setUp() throws Exception {
        Cardapio menu = new Cardapio();
    }

    @org.junit.Test
    public void addHamburguer() {
        Cardapio menu = new Cardapio();

        menu.addHamburguer(new Hamburguer("Cheese Bacon","Pão, hamburguer 120g , bacon, queijo"));
        menu.addHamburguer(new Hamburguer("Bauru", "Presunto, queijo e tomate"));

    }

    @org.junit.Test
    public void addPizza() {
        Cardapio menu = new Cardapio();

        menu.addPizza(new Pizza("Calabresa", "Calabresa e cebola"));
        menu.addPizza(new Pizza("Toscana", "Calabresa e queijo"));
        menu.addPizza(new Pizza("Portuguesa", "Presunto, queijo, ovo, ervilha e cebola"));
    }

    @org.junit.Test
    public void addPorcao() {
        Cardapio menu = new Cardapio();

        menu.addPorcao(new Porcao("Torresmo", "Torresmo"));
        menu.addPorcao(new Porcao("Mista","Fritas com bacon e queijo e calabresa com cebola"));
    }

    @org.junit.Test
    public void buscarHamburguerPorNome() {
        Cardapio menu = new Cardapio();

        List<Hamburguer> hamburguersEncontrados = menu.buscarHamburguerPorNome("Cheese Bacon");
        for (Hamburguer hamburguer: hamburguersEncontrados){System.out.println(hamburguer.getIngrediente());
        }

        List<Hamburguer> hamburguersEncontrados3 = menu.buscarHamburguerPorNome("Bauru");
        for (Hamburguer hamburguer: hamburguersEncontrados3){System.out.println(("Ingredientes: " + hamburguer.getIngrediente()));
        }
    }

    @org.junit.Test
    public void buscarHamburguerPorIngrediente() {
        Cardapio menu = new Cardapio();

        List<Hamburguer> hamburguersEncontrados2 = menu.buscarHamburguerPorIngrediente("bacon");
        for (Hamburguer hamburguer: hamburguersEncontrados2){System.out.println(hamburguer.getNome());
        }

    }

    @org.junit.Test
    public void buscarPizzaPorNome() {
        Cardapio menu = new Cardapio();

        List<Pizza> pizzasEncontradas = menu.buscarPizzaPorNome("Calabresa");
        for (Pizza pizza: pizzasEncontradas){System.out.println(pizza.getNome());
        }

        List<Pizza> pizzasEncontradas3 = menu.buscarPizzaPorNome("Portuguesa");
        for (Pizza pizza: pizzasEncontradas3){System.out.println("Ingredientes: " + (pizza.getIngrediente()));
        }

    }

    @org.junit.Test
    public void buscarPizzaPorIngrediente() {
        Cardapio menu = new Cardapio();

        List<Pizza> pizzasEncontradas2 = menu.buscarPizzaPorIngrediente("Calabresa");
        for (Pizza pizza: pizzasEncontradas2){System.out.println(pizza.getNome());
        }
    }

    @org.junit.Test
    public void buscarPorcaoPorNome() {
        Cardapio menu = new Cardapio();

        List<Porcao> porcoesEncontradas = menu.buscarPorcaoPorNome("Torresmo");
        for (Porcao porcao: porcoesEncontradas){System.out.println(porcao.getNome());
        }
    }

    @org.junit.Test
    public void buscarPorcaoPorIngrediente() {
        Cardapio menu = new Cardapio();
        List<Porcao> porcoesEncontradas2 = menu.buscarPorcaoPorIngrediente("bacon");
        for (Porcao porcao: porcoesEncontradas2){System.out.println(porcao.getNome());
        }
    }
}