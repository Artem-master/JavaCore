package lessonFour;

import java.util.HashMap;
import java.util.Map;

public class TwoArr {
    HashMap <String, Integer> telephone = new HashMap<>();
    public void find () {
        for (Map.Entry<String, Integer> o : telephone.entrySet()) {
            System.out.println(o.getKey() + " " + o.getValue());
        }
    }


    @Override
    public String toString() {
        return "Содержание справочника " + telephone;
    }
}
