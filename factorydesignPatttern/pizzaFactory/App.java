

public class App {
    public static void main(String[] args) {
      PizzaStore differentPizaa = new NYPizzaStore();  

      Pizza pizza1 = differentPizaa.orderPizza("cheese");
      Pizza pizaa2 = differentPizaa.orderPizza(("fruit"));
      Pizza pizza3 = differentPizaa.orderPizza("berry");
      System.out.println("The first pizza is: " + pizza1.getName());
      System.out.println("----------------------");
      System.out.println("The second pizza is: " + pizaa2.getName());
      System.out.println("----------------------");
      System.out.println("The third pizza is: " + pizza3.getName());
    }
}
