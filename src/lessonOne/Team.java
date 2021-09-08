package lessonOne;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Team extends Object {
    public Scanner scanner = new Scanner(System.in);
    public String nameTeam;
    public String[] namePlayer;
    public static int sumPlayer = 4;
    public static int distPlayer [];

    public void enterPlayers() {
        System.out.println("В игре участвую " + sumPlayer + " игрока");
        System.out.println("Введите назавние команды");
        nameTeam = scanner.next();
        namePlayer = new String[sumPlayer];
        for (int i = 0; i < sumPlayer; i++) {
            System.out.println("Введите имя игрока");
            namePlayer [i] = scanner.next();
        }
        System.out.println("Введите дистанцию забега для каждого игрока");
        distPlayer = new int[sumPlayer];
        for (int i = 0; i < sumPlayer; i++) {
            System.out.println("Введите дистанцию");
            distPlayer [i] = scanner.nextInt();
        }
        System.out.println();
    }

    public void printCommand () {
        System.out.println("Команда мечты " + nameTeam);
        for (int i = 0; i < sumPlayer; i++) {
            System.out.print("Имя игрока " + (i + 1) + "- " + namePlayer [i] + "; Дистанция " + distPlayer [i] + " метров");
            System.out.println();
            }
        System.out.println();
    }

}
