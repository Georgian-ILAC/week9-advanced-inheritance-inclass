package example2;

public class Animal {

  protected boolean vegetarian;

  protected String eats;

  protected int noOfLegs;

  public Animal() {
  }

  public Animal(boolean veg, String food, int legs) {
    this.vegetarian = veg;
    this.eats = food;
    this.noOfLegs = legs;
  }

  public void makeAnimalSound() {
    System.out.println("This method can used to print whatever sound an animal makes");
  }

  public boolean isVegetarian() {
    return vegetarian;
  }

  public void setVegetarian(boolean vegetarian) {
    this.vegetarian = vegetarian;
  }

  public String getEats() {
    return eats;
  }

  public void setEats(String eats) {
    this.eats = eats;
  }

  public int getNoOfLegs() {
    return noOfLegs;
  }

  public void setNoOfLegs(int noOfLegs) {
    this.noOfLegs = noOfLegs;
  }

}