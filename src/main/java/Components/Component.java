package Components;

public abstract class Component {
    private int price;
    private String make;
    private String model;

    public Component(int price, String make, String model){
        this.price=price;
        this.make=make;
        this.model=model;
    }

    public int getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
