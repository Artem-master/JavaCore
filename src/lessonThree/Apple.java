package lessonThree;

public class Apple extends Fruit {

    public Apple(int quant, double pcsWeight) {
        this.quant = quant;
        this.pcsWeight = pcsWeight;
    }

    @Override
    public String toString() {
        return "количество яблок = " + quant;
    }
}
