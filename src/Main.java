
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Eagle(
                "Eagle", 8, "Excellent eyesight", 3000));

        animals.add(new Parrot(
                "Parrot", 4, "Can imitate human speech", 500));

        animals.add(new Cheetah(
                "Cheetah", 12, "The fastest", 120));

        animals.add(new Giraffe(
                "Giraffe", 15, "The longest neck", 60));


        for (int i = 0; i < animals.size(); i++) {

            System.out.print((i + 1) + ". ");
            animals.get(i).show();
        }
    }
}
