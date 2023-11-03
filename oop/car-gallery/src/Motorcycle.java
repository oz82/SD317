public class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model, int km, int year, int maxSpeed, MyColor color, int price) {
        super(brand, model, km, year, maxSpeed, color, price);
    }
    @Override
    public double calculateTax() {
        return super.getPrice() * 0.03;
    }
}