package lessonFour;

import java.util.*;

public class OneArr implements Comparator {
    ArrayList <String> oneArrList = new ArrayList<>(Arrays.asList("asd", "asd","asd","asd","qwe", "qwert", "qweqwe", "qweqwe", "Nine", "END"));
    HashSet <String> oneSetList = new HashSet <> (oneArrList);

    public void sum () {
        for (String key : oneSetList) {
            System.out.println(key + ": " + Collections.frequency(oneArrList, key));
        }
    }

    @Override
    public String toString() {
        return "Массив слов: " + oneArrList;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
