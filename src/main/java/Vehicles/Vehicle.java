package Vehicles;

import Components.Component;

import java.util.ArrayList;

public abstract class Vehicle {

    private int price;
    private String colour;
    private ArrayList<Component> components;
    private String make;
    private String model;

    public Vehicle(int price, String colour, String make, String model) {
        this.price = price;
        this.colour = colour;
        this.components = new ArrayList<Component>();
        this.make = make;
        this.model = model;
    }

    public int getPrice() {
        return this.price;
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


}


