package lessonThree;

public class Orange extends Fruit {
    public Orange(int quant, double pcsWeight) {
        this.quant = quant;
        this.pcsWeight = pcsWeight;
    }

    @Override
    public String toString() {
        return "количество апельсинов = " + quant;
    }
}
