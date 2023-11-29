import java.util.*;
public class coffeeMachine{
  private HashMap<String, Integer> order;
  private HashMap<String, Integer> extras;
  private HashMap<String, Items> link;
  private double total;

  public coffeeMachine(){
    this.order = new HashMap<String, Integer>();
    this.extras = new HashMap<String, Integer>();
  }

  Items item1 = new Items("Macchiato", 10, 2.50, "macchiato.jpg");
  Items item2 = new Items("Espresso", 10, 2.50, "espresso.jpg");
  Items item3 = new Items("Latte", 10, 2.50, "latte.jpg");
  Items item4 = new Items("Mocha", 10, 2.50, "mocha.jpg");
  Items item5 = new Items("Cappuccino", 10, 2.50, "cappuccino.jpg");

  public void linkItems(){
    link.put(item1.getName(), item1);
    link.put(item2.getName(), item2);
    link.put(item3.getName(), item3);
    link.put(item4.getName(), item4);
    link.put(item5.getName(), item5);
  }

  public double computeTotalPrice(){
    double total = 0;
    linkItems();
    // main
    for (String key : order.keySet()) 
      total += link.get(key).getPrice() * order.get(key);
    
    // extra
    for (String key : extras.keySet()) {
      if (key.equals("Extra Shot")) {
        total += 3 * extras.get(key);
      }
      else if (key.equals("Extra Syrup")) {
        total += 5 * extras.get(key);
      }
      else if (key.equals("Whipped Cream")) {
        total += 6 * extras.get(key);
      }
    }
    total += total * 0.12;
    return total;
  }

}
