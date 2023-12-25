public class Main {
  public static void main(String[] args) {
    Car ford = new Car("1991 Ford fusion");
    ford.startEngine();
    ford.drive();
    ford.getObjectInstance();

    System.out.println("------------------------");

    GasPoweredCar chevy = new GasPoweredCar("2021 Chevy Camaro", 12, 8);
    chevy.startEngine();
    chevy.drive();
    chevy.getObjectInstance();

    System.out.println("------------------------");

    var tesla = new ElectricCar(550, 2000);
    tesla.startEngine();
    tesla.drive();
    tesla.getObjectInstance();

    System.out.println("------------------------");

    var hyundai = new HybridCar(18, 1000, 6);
    hyundai.startEngine();
    hyundai.drive();
    hyundai.getObjectInstance();
  }
}
