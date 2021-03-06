import java.util.Objects;

public class Food extends Storable {
    private final TypeFood typeFood;
    private int size;

    public Food(TypeFood typeFood, int size, Store store) {
        super(store);
        this.typeFood = typeFood;
        if (size <= 0){
            this.size = 1;
        } else{
            this.size = size;
        }
    }

    public void eat(){
        size--;
    }

    public TypeFood getTypeFood() {
        return typeFood;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Food{" +
                "typeFood=" + typeFood +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return size == food.size && typeFood == food.typeFood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeFood, size);
    }
}
