public class Cat {
    private static int count = 0;
    private int id;

    public Cat() {
        this.id = Cat.count++;
    }

    public int getId() {
        return this.id;
    }
}
