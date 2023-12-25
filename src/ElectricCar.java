public class ElectricCar extends Car {
  private double avgKmPerCharge;
  private int batterySize;


  public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
    super(description);
    this.avgKmPerCharge = avgKmPerCharge;
    this.batterySize = batterySize;
  }

  public ElectricCar(double avgKmPerCharge, int batterySize) {
    this("new, fast electric car", avgKmPerCharge, batterySize);
  }

  @Override
  public void startEngine() {
    super.startEngine();
    System.out.println("Engine starting quietly");
  }

  @Override
  protected void runEngine() {
    super.runEngine();
    System.out.printf("running on %dkWh engine with a range of %.2f km/c %n", batterySize, avgKmPerCharge);
  }

  @Override
  public void drive() {
    runEngine();
    System.out.println("Zooming off fast..");
  }

  public void getObjectInstance() {
    super.getObjectInstance();
  }
}
