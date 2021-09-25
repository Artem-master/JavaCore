package lessonFive;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("file.csv");
        AppData data = new AppData();
        data.find();
        System.out.println(data);

    }
}
