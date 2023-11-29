public class Items {
  private String name;
  private int quantity;
  private double price;
  private String image;

  public Items(String name, int quantity, double price, String image) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    this.image = image;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    if (this.name.equals("Macchiato")) {
      return 2.50;
    }
    else if (this.name.equals("Espresso")) {
      return 2.50;
    }
    else if (this.name.equals("Latte")) {
      return 2.50;
    }
    else if (this.name.equals("Mocha")) {
      return 2.50;
    }
    else if (this.name.equals("Cappuccino")) {
      return 2.50;
    }
    else {
      return 0;
    }
  }
  public void setPrice(double price) {
    this.price = price;
  }

  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  public String readImage(){
    System.out.println("Reading image...");
    return "Reading image...";
  }

}
