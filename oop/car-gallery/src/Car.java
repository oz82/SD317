import java.time.LocalDate;

public class Car extends Vehicle {
    private String gear;
    private String fuel;
    public Car(String brand, String model, String gear, String fuel, int km, int year, int maxSpeed, MyColor color, int price) {
        super(brand, model, km, year, maxSpeed, color, price);
        this.gear = gear;
        this.fuel = fuel;
    }
    @Override
    public double calculateTax() {
        return super.getPrice() * 0.05;
    }
}