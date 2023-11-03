import java.time.LocalDate;

public abstract class Vehicle implements Taxable {
    private String brand;
    private String model;
    private int km;
    private int year;
    private int maxSpeed;
    private MyColor color;
    private int price;

    public Vehicle(String brand, String model, int km, int year, int maxSpeed, MyColor color, int price) {
        this.brand = brand;
        this.model = model;
        this.km = km;
        if (!checkKm()) {
            System.out.println("Kilometer value is not valid!");
            System.exit(-1);
        }
        this.year = year;
        if (!checkYear()) {
            System.out.println("Year value is not valid!");
            System.exit(-1);
        }
        this.maxSpeed = maxSpeed;
        if (!checkMaxSpeed()) {
            System.out.println("Maximum speed value is not valid!");
            System.exit(-1);
        }
        this.color = color;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    private boolean checkKm() {
        if (this.km >= 0 && this.km <= Limits.upperKm) {
            return true;
        }
        return false;
    }
    private boolean checkYear() {
        if (this.year >= Limits.lowerYear && this.year <= LocalDate.now().getYear()) {
            return true;
        }
        return false;
    }
    private boolean checkMaxSpeed() {
        if (this.maxSpeed >= Limits.lowerSpeed && this.maxSpeed <= Limits.upperSpeed) {
            return true;
        }
        return false;
    }
}