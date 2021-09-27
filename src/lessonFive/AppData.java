package lessonFive;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class AppData  {

    File file = new File("1.csv");
    OutputStream out;
    BufferedReader bufferedReader;
    Scanner scanner = new Scanner(System.in);

    {
        try {
            String [] header = new String[3];
            for (int i = 0; i < header.length; i++) {
                System.out.println("Введите имя значения");
                header [i] = scanner.next();
            }
            out = new FileOutputStream(file);
            out.write(Arrays.toString(header).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    {
        try {
            bufferedReader = new BufferedReader(new FileReader("1.csv"));
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ничего не понял из урока, к сожалению. " +
                "Но файл создается, информация в него добавляется с консоли. " +
                "Мог добавить блок из интов, но это все не то...");
    }

}