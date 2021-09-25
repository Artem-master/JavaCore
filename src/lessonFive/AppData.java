package lessonFive;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class AppData implements Serializable {
    private int [][] dataInt;
    HashMap <String, Integer> myHashMap = new HashMap<>();
    public void find () {
        for (Map.Entry<String, Integer> o : myHashMap.entrySet()) {
            System.out.print(o.getKey() + " " + o.getValue());
        }
        System.out.println();
    }


    @Override
    public String toString() {
        return "AppData{" +
                "dataInt=" + Arrays.toString(dataInt) +
                ", myHashMap=" + myHashMap +
                '}';
    }
}