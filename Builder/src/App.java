import Builder.BeefHamburgreBuilder;
import Director.Chef;
import Product.BeefHamburger;

public class App {
    public static void main(String[] args) throws Exception {
        BeefHamburgreBuilder hamburgerBuilder = new BeefHamburgreBuilder();
        Chef chef = new Chef();
        chef.makeBeefHamburger(hamburgerBuilder);
        BeefHamburger beefHamburger = hamburgerBuilder.getResults();

        System.out.println(
                beefHamburger.toString());

    }
}
