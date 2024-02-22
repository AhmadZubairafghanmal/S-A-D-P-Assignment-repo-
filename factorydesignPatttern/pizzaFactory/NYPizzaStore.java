public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if(type.equals("berry")){
            return pizza = new BerryPizza();
        } else if(type.equals("fruit")){
            return pizza = new FruitPizza();
        } else return pizza;
        }
    }
