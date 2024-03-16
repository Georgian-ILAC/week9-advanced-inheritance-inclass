package example3;

// Derived Class Car
class Car extends Vehicle {

  // Private field
  private String bodyStyle;

  // Parameterized Constructor
  public Car(String make, String color, int year, String model, String bodyStyle) {
    super(make, color, year, model); // calling parent class constructor
    this.bodyStyle = bodyStyle;
  }

  public void carDetails() { // details of car
    printDetails(); // calling method from parent class
    System.out.println("Body Style: " + bodyStyle);
  }

}