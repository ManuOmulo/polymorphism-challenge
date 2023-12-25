public class Main {
  public static void main(String[] args) {
    Car ford = new Car("1991 Ford fusion");
    runRace(ford);

    Car chevy = new GasPoweredCar("2021 Chevy Camaro", 12, 8);
    runRace(chevy);

    var tesla = new ElectricCar(550, 2000);
    runRace(tesla);

    var hyundai = new HybridCar(18, 1000, 6);
    runRace(hyundai);
  }

  public static void runRace(Car car) {
    car.startEngine();
    car.drive();
    car.getObjectInstance();

    System.out.println("------------------------");
  }
}
