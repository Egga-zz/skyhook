package skyhook.serialization;

/**
 * @author egga
 */
public class Cheese {

    private int age;

    private String name;

    public static Cheese canIHazCheese() {
        return new Cheese(37, "Swiss");
    }

    public Cheese() {
    }

    public Cheese(final int age, final String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
