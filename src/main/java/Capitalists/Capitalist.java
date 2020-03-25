package Capitalists;

import Vehicles.Vehicle;

import java.util.ArrayList;

public abstract class Capitalist {
    private String name;
    protected double money;
    protected ArrayList<Vehicle> vehicles;

    public Capitalist(String name, double money) {
        this.name = name;
        this.money = money;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void spendMoney(float cost){
        this.money -= cost;
    }

    public void buyVehicle(Vehicle vehicle){
        if(vehicle.getPrice()<=this.money){
            this.addVehicle(vehicle);
            this.spendMoney(vehicle.getPrice());
        }
    }


}
