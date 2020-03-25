package Components;

public class Engine extends Component{
    public Engine(int price, String make, String model) {
        super(price, make, model);
    }

    public String makeSound(){
        return "vrooom!";
    }
}
