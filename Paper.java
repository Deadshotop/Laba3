public class Paper extends Storable {
    private final String name;

    public Paper(Store store, String name){
        super(store);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "name='" + name + '\'' +
                '}';
    }
}
