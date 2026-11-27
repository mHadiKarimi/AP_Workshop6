
public abstract class Animal {

    private String name;
    private int age;
    private String specialFeature;

    public Animal(String name, int age, String specialFeature) {
        this.name = name;
        this.age = age;
        this.specialFeature = specialFeature;
    }

    public abstract void show();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialFeature() {
        return specialFeature;
    }

    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }
}
