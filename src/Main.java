public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("GLE", "Mercedes", 2020, 350000, "white", 5);

        System.out.println(car1.toString());

        car1.sell();

        System.out.println(car1.getModel());
        System.out.println(car1.getBrand());
        System.out.println(car1.getYear());
        System.out.println(car1.getPrice());
        System.out.println(car1.getColor());
        System.out.println(car1.getQuantity());

        car1.setColor("black");
        car1.setPrice(330000);

        System.out.println(car1.toString());
    }
}