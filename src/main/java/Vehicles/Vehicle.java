package Vehicles;

import Components.Component;

import java.util.ArrayList;

public abstract class Vehicle {

    protected int price;
    private String colour;
    private ArrayList<Component> components;
    private String make;
    private String model;
    protected int damageCost;

    public Vehicle(int price, String colour, String make, String model) {
        this.damageCost = 0;
        this.price = price;
        this.colour = colour;
        this.components = new ArrayList<Component>();
        this.make = make;
        this.model = model;
    }

    public int getPrice() {
       return this.price - this.damageCost;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public String getMake() {
        return this.make;
    }

    public ArrayList<Component> getComponents() {
        return this.components;
    }

    public void addComponent(Component component){
        this.components.add(component);
    }

    public int getNumberOfComponents(){
        return this.components.size();
    }

    public void setDamageCost(int damageCost) {
        this.damageCost = damageCost;
    }

    public int getDamageCost() {
        return this.damageCost;
    }
}


