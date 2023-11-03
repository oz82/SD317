public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Renault", "Zoe", "automatic", "electric", 15000, 2022, 170, MyColor.GRAY, 1100000);
        Car c2 = new Car("Renault", "Talisman", "automatic", "diesel", 37000, 2019, 250, MyColor.RED, 1300000);
        Car c3 = new Car("Renault", "Clio", "manuel", "benzin", 7500, 2023, 220, MyColor.WHITE, 950000);
        Car c4 = new Car("Renault", "Clio", "manuel", "benzin", 56000, 2018, 220, MyColor.WHITE, 875000);
        Car c5 = new Car("Renault", "Megane", "automatic", "benzin", 18500, 2020, 240, MyColor.BLACK, 1050000);
        Car c6 = new Car("Renault", "Megane", "manuel", "benzin", 153000, 2016, 250, MyColor.RED, 885000);
        Car c7 = new Car("Renault", "Megane", "automatic", "diesel", 22500, 2022, 240, MyColor.RED, 1150000);
        Car c8 = new Car("Renault", "Megane", "manuel", "diesel", 153000, 2016, 250, MyColor.RED, 905000);
        Car c9 = new Car("Toyota", "Corolla", "automatic", "hybrid", 16000, 2023, 190, MyColor.GRAY, 1075000);
        Car c10 = new Car("Toyota", "Corolla", "manuel", "benzin", 189000, 2011, 190, MyColor.GRAY, 685000);
        Car c11 = new Car("Toyota", "Corolla", "automatic", "benzin", 77500, 2019, 190, MyColor.GRAY, 895000);
        Car c12 = new Car("Toyota", "Corolla", "automatic", "benzin", 8500, 2023, 190, MyColor.WHITE, 1050000);
        Car c13 = new Car("Toyota", "Yaris", "automatic", "benzin", 38500, 2020, 220, MyColor.BLACK, 865000);
        Car c14 = new Car("Toyota", "Yaris", "automatic", "benzin", 6500, 2021, 220, MyColor.RED, 915000);
        Car c15 = new Car("Toyota", "Yaris", "manuel", "benzin", 157500, 2008, 180, MyColor.WHITE, 715000);
        Car c16 = new Car("Toyota", "Yaris", "manuel", "benzin", 265000, 2004, 170, MyColor.WHITE, 625000);

        Motorcycle m1 = new Motorcycle("Honda", "H1", 8500, 2022, 270, MyColor.RED, 475000);
        Motorcycle m2 = new Motorcycle("Honda", "H2", 77500, 2015, 330, MyColor.BLACK, 330000);
        Motorcycle m3 = new Motorcycle("Suzuki", "S1", 16000, 2018, 250, MyColor.BLACK, 585000);
        Motorcycle m4 = new Motorcycle("Suzuki", "S2", 26500, 2020, 300, MyColor.WHITE, 675000);

        Vehicle[] vehicleArray = new Vehicle[4];
        vehicleArray[0] = c1;
        vehicleArray[1] = c9;
        vehicleArray[2] = m1;
        vehicleArray[3] = m4;

        for (Vehicle vehicle : vehicleArray) {
            System.out.println(vehicle.getClass().getSimpleName() + "\tprice: " + vehicle.getPrice() + "\ttax: " + vehicle.calculateTax());
        }
    }
}