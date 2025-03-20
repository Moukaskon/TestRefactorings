class Car {
    private String brand;
    private int cc;
    private String tyresBrand;
    private String size;
    private String lastChange;
    private Tyres tyres;

    public Car(String brand, int cc, String tyresBrand, String size, String lastChange){
        this.brand = brand;
        this.cc = cc;
        tyres = new Tyres(tyresBrand, size, lastChange);
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
        tyres.printTyresBrand();
    }

    public void printSize(){
        tyres.printSize();
    }

    public void printLastChange(){
        tyres.printLastChange();
    }

}
