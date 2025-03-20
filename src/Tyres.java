/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class Tyres {
    private String tyresBrand;
    private String size;
    private String lastChange;

    public Tyres(String tyresBrand, String size, String lastChange) {
        this.tyresBrand = tyresBrand;
        this.size = size;
        this.lastChange = lastChange;
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
