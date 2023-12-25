public class HybridCar extends Car {
  private double avgKmPerLitre;
  private int batterySize;
  private int cylinders;


  public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
    super(description);
    this.avgKmPerLitre = avgKmPerLitre;
    this.batterySize = batterySize;
    this.cylinders = cylinders;
  }

  public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
    this("nice reliable car with longest range", avgKmPerLitre, batterySize, cylinders);
  }

  @Override
  public void startEngine() {
    super.startEngine();
    System.out.println("engine starts normally");
  }

  @Override
  protected void runEngine() {
    super.runEngine();
    System.out.printf("running on %d engine with a %dkWh backup battery and a range of %f %n", cylinders, batterySize, avgKmPerLitre);
  }

  @Override
  public void drive() {
    runEngine();
    System.out.println("Driving the furthest");
  }
}
