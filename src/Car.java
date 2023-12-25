public class Car {
  private String description;

  public Car(String description) {
    this.description = description;
  }

  public void startEngine() {
    System.out.println("Gentlemen start your engine...");
  }

  protected void runEngine() {
    System.out.println("...Engine running");
  }

  public void drive() {
    runEngine();
    System.out.printf("Lets ride!! Driving a %s.%n", description);
  }

  public void getObjectInstance() {
    String objectClass = this.getClass().getSimpleName();
    System.out.printf("This is an instance of %s %n", objectClass);
  }
}
