
public abstract class Bird extends Animal {

    private int heightOfFly;

    public Bird(String name, int age, String specialFeature,
                int heightOfFly) {

        super(name, age, specialFeature);
        this.heightOfFly = heightOfFly;
    }

    public int getHeightOfFly() {
        return heightOfFly;
    }

    public void setHeightOfFly(int heightOfFly) {
        this.heightOfFly = heightOfFly;
    }

    @Override
    public void show() {

        System.out.println(
                "name: " + getName()
                        + ", age: " + getAge()
                        + ", height of fly: " + heightOfFly
                        + ", \"" + getSpecialFeature() + "\""
        );
    }
}
