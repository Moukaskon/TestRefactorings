class Car {
    private String brand;
    private int cc;
    private String tyresBrand;
    private String size;
    private String lastChange;

    public Car(String brand, int cc, String tyresBrand, String size, String lastChange){
        this.brand = brand;
        this.cc = cc;
        this.tyresBrand = tyresBrand;
        this.size = size;
        this.lastChange = lastChange;
    }

    public void printBrand(){
        System.out.println("Brand: " + brand);
    }

    public void printcc(){
        System.out.println("CC: " + cc);
    }

    public void printTyresBrand(){
        System.out.println("Tyres Brand: " + tyresBrand);
    }

    public void printSize(){
        System.out.println("Tyres size: " + size);
    }

    public void printLastChange(){
        System.out.println("Tyres last changed at: " + lastChange);
    }

}
