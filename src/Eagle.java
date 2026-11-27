public class Eagle extends Bird implements Hunter {

    public Eagle(String name, int age, String specialFeature, int heightOfFly) {
        super(name, age, specialFeature, heightOfFly);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(getName() + " hunted " + prey.getName());
    }
}