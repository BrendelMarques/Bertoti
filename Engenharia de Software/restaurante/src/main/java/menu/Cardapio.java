package menu;

import org.cardapio.Hamburguer;
import org.cardapio.Pizza; 
import org.cardapio.Porcao;

import java.util.LinkedList;
import java.util.List;

public class Cardapio {
    private List<Hamburguer> hamburguers = new LinkedList<Hamburguer>();
    private List<Pizza> pizzas = new LinkedList<Pizza>();
    private List<Porcao> porcoes = new LinkedList<Porcao>();

    public void addHamburguer(Hamburguer hamburguer){
        hamburguers.add(hamburguer);
    }

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public void addPorcao(Porcao porcao){
        porcoes.add(porcao);
    }
    
    public List<Hamburguer> buscarHamburguerPorNome(String nome){
        List<Hamburguer> encontrados = new LinkedList<Hamburguer>();
        for (Hamburguer hamburguer:hamburguers){
            if (hamburguer.getNome().equals(nome)) 
                encontrados.add(hamburguer);
        }
        return encontrados;
    }

    public List<Hamburguer> buscarHamburguerPorIngrediente(String ingrediente){
        List<Hamburguer> encontrados = new LinkedList<Hamburguer>();
        for (Hamburguer hamburguer:hamburguers){
            if (hamburguer.getIngrediente().equals(ingrediente)) 
                encontrados.add(hamburguer);
        }
        return encontrados;
    }

    public List<Pizza> buscarPizzaPorNome(String nome){
        List<Pizza> encontrados = new LinkedList<Pizza>();
        for (Pizza pizza:pizzas){
            if (pizza.getNome(). equals(nome))
                encontrados.add(pizza);
        }
        return encontrados;
    }

    public List<Pizza> buscarPizzaPorIngrediente(String ingrediente){
        List<Pizza> encontrados = new LinkedList<Pizza>();
        for (Pizza pizza:pizzas){
            if (pizza.getIngrediente().equals(ingrediente)) 
                encontrados.add(pizza);
        }
        return encontrados;
    }

    public List<Porcao> buscarPorcaoPorNome(String nome){
        List<Porcao> encontrados = new LinkedList<Porcao>();
        for (Porcao porcao:porcoes){
            if (porcao.getNome().equals(nome))
                encontrados.add(porcao);
        }
        return encontrados;
    }

    public List<Porcao> buscarPorcaoPorIngrediente(String ingrediente){
        List<Porcao> encontrados = new LinkedList<Porcao>();
        for (Porcao porcao:porcoes){
            if (porcao.getIngrediente().equals(ingrediente)) 
                encontrados.add(porcao);
        }
        return encontrados;
    }
}
