package lessonOne;

import java.util.Random;
import java.util.Scanner;

public class Course {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    public int distAi [];
    public int fin [];
    public int randomSize = 100;

    public void finish () {
        String answer;
        int y, n;
        System.out.println("Начинаем забег? Y/N");
        answer = scanner.next();
        if (answer.equals("Y") || answer.equals("y")) {
            int x;
            distAi = new int[Team.sumPlayer];
            for (int i = 0; i < Team.sumPlayer; i++) {
                distAi [i] = random.nextInt(randomSize);
            }
            fin = new int[Team.sumPlayer];
            for (int i = 0; i < Team.sumPlayer; i++) {
                x = Team.distPlayer[i] - distAi[i];
                if (x < 0) {
                    System.out.println("Игрок не добежал " + (x * -1) + " м");
                } else System.out.println("Игрок пробежал дистанцию и может еще пробежать " + x + " м");
            }
        } else System.out.println("Забег не состоялся");
    }
}
