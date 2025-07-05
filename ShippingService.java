import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ShippingService {

    public double shipWeight(List<Pair<Shipable, Integer>> items) {
        double totalShippingCost = 0;
        for (Pair<Shipable, Integer> item : items) {
            totalShippingCost += item.second * item.first.getWeight();
        }
        return totalShippingCost;
    }

    void shipNotice(List<Pair<Shipable, Integer>> items) {
        System.out.println("- * Shipping notice **\n");
        for (Pair<Shipable, Integer> item : items) {
            System.out.println(item.second + " x " + item.first.getName() + " : " + item.second * item.first.getWeight() + " kg");
        }
    }
}
