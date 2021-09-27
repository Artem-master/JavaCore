package lessonThree;

public class Main {
    public static void main(String[] args) {
        Orange or = new Orange(10, 2);
        Apple ap = new Apple(10, 5);
        Box box = new Box (or, ap);
        System.out.println(box);
        box.getWeight(box);
        System.out.println(box.compare(box));

    }
}
