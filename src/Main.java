public class Main {
    public static void main(String[] args) {
        System.out.println("Hello main!");
        Car c1 = new Car("Nissan", 1600, "Yokohama", "16/50", "19/10/2023");
        c1.printBrand();
        c1.printcc();
        c1.printSize();
        c1.printTyresBrand();
        c1.printLastChange();
    }
}
