import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class People implements Store<Storable> {
    private final String name;
    private List<Storable> things = new ArrayList<>();

    public People(String name) {
        this.name = name;
    }

    @Override
    public void add(Storable obj) {
        things.add(obj);
    }

    @Override
    public void remove(Storable obj) {
        things.remove(obj);
    }

    public void give(Storable storable, People people) {
        remove(storable);
        people.add(storable);
        storable.setStore(people);
    }

//    public void givePaper(Paper paper, People people) {
//        remove(paper);
//        people.add(paper);
//
//    }

    public void eat(TypeFood typeFood) {
        boolean find = false;
        for (Storable thing: things) {
            if (thing instanceof Food) {
                if (((Food)thing).getTypeFood() == typeFood) {
                    ((Food)thing).eat();
                    if (((Food) thing).getSize() == 0){
                        remove(thing);
                    }
                    break;
                }
            } else {
                if (thing instanceof Plate){
                    List<Food> food = ((Plate)thing).getFood();
                    for (Food f : food) {
                        if (f.getTypeFood() == typeFood) {
                            f.eat();
                            if (f.getSize() == 0){
                                ((Plate)thing).remove(f);
                            }
                            find = true;
                            break;
                        }
                    }
                    if (find) {
                        break;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", things=" + things +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return name.equals(people.name) && things.equals(people.things);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, things);
    }
}
