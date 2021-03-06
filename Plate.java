import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Plate extends Storable implements Store<Food> {

    private List<Food> food = new ArrayList<>();

    public Plate(Store store) {
       super(store);
    }

    public List<Food> getFood() {
        return food;
    }

    @Override
    public void add(Food obj) {
        food.add(obj);
    }

    @Override
    public void remove(Food obj) {
        food.remove(obj);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plate plate = (Plate) o;
        return food.equals(plate.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food);
    }
}
