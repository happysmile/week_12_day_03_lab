package Capitalists;

import Vehicles.Vehicle;

public class Dealer extends Capitalist {
    public Dealer(String name, double money) {
        super(name, money);
    }


    public boolean canCustomerAffordVehicle(Customer customer, float cost){
        if(customer.getMoney()>=cost){
            return true;
        } else {
            return false;
        }
    }

    public boolean isVehicleInStock(Vehicle vehicle){
        if(this.getVehicles().contains(vehicle)){
            return true;
        } else {
            return false;
        }
    }

    public void removeVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
    }

    public void getMoney(double cost){
        this.money += cost;
    }

    public void sellVehicle(Customer customer,Vehicle vehicle){
        if(this.isVehicleInStock(vehicle) && this.canCustomerAffordVehicle(customer,vehicle.getPrice())){
            customer.buyVehicle(vehicle);
            this.removeVehicle(vehicle);
            this.getMoney(vehicle.getPrice());
        }
    }

    public void repairVehicle(Vehicle vehicle){
        int repairCost = vehicle.getDamageCost();
        if(this.money>repairCost){
            this.money -= repairCost;
            vehicle.setDamageCost(0);
        }
    }

}
