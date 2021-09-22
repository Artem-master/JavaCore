package lessonFour;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        OneArr one = new OneArr();
        TwoArr two = new TwoArr();
        System.out.println(one);
        Collections.sort(one.oneArrList);
        System.out.println(one.oneSetList);
        one.sum();

        two.telephone.put("Petrov", 123456789);
        two.telephone.put("Vasin", 987654321);
        two.telephone.put("Petin", 987651234);
        two.find();
    }
}
