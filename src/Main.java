
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Eagle eagle = new Eagle("Eagle", 8, "Excellent eyesight", 3000);
        Cheetah cheetah = new Cheetah("Cheetah", 12, "The fastest", 120);

        Parrot parrot = new Parrot("Parrot", 4, "Can imitate human speech", 500);
        Giraffe giraffe = new Giraffe("Giraffe", 15, "The longest neck", 60);

        eagle.hunt(parrot);
        cheetah.hunt(giraffe);

        for (int i = 0; i < animals.size(); i++) {

            System.out.print((i + 1) + ". ");
            animals.get(i).show();
        }
    }
}
