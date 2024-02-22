import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    void prepare(){
        System.out.println("preparing" + name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce ...");
        System.out.println("Adding toppings: ");
        for(String topping: toppings){
            System.out.println("-------------------------------");
            System.err.println("          " + topping);
        }
    }
    
    void bake(){
        System.out.println("Bake for 15 minutes at 200C' Degreee");
    }

    void cut(){
        System.out.println("Cutting the pizza int diagnoal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
    
}
