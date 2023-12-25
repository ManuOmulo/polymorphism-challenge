public class GasPoweredCar extends Car {
  private double avgKmPerLitre;
  private int cylinders;


  public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
    super(description);
    this.avgKmPerLitre = avgKmPerLitre;
    this.cylinders = cylinders;
  }

  public GasPoweredCar(double avgKmPerLitre, int cylinders) {
    this("average gas powered car. Either Diesel or Petrol", avgKmPerLitre, cylinders);
  }

  @Override
  public void startEngine() {
    super.startEngine();
    System.out.println("Engine revs loud...");
  }

  @Override
  protected void runEngine() {
    super.runEngine();
    System.out.printf("running on a %d cylinder engine with a range of %.2f km/l %n", cylinders, avgKmPerLitre);
  }

  @Override
  public void drive() {
    runEngine();
    System.out.println("Driving off loud");
  }

  public void getObjectInstance() {
    super.getObjectInstance();
  }
}
