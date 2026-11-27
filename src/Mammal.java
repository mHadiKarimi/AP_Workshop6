
public abstract class Mammal extends Animal {

    private int speed;

    public Mammal(String name, int age, String specialFeature,
                  int speed) {

        super(name, age, specialFeature);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void show() {

        System.out.println(
                "name: " + getName()
                        + ", age: " + getAge()
                        + ", speed: " + speed
                        + ", \"" + getSpecialFeature() + "\""
        );
    }
}