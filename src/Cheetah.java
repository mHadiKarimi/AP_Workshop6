public class Cheetah extends Mammal implements Hunter {

    public Cheetah(String name, int age, String specialFeature, int speed) {
        super(name, age, specialFeature, speed);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(getName() + " hunted " + prey.getName());
    }
}