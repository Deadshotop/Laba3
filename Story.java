public class Story {
    public static void main(String[] args) {
        People child = new People("Malysh");
        Paper paper = new Paper(child, "News");
        child.add(paper);
        People karlson = new People("Karlson");
        karlson.add(new Food(TypeFood.BUN, 3, karlson));
        Plate plate = new Plate(karlson);
        plate.add(new Food(TypeFood.PORRIDGE, 1, plate));
        karlson.add(plate);
        karlson.eat(TypeFood.PORRIDGE);
        child.give(paper, karlson);

        System.out.println(karlson);
    }
}
