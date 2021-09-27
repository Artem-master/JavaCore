package lessonThree;

public class Box <T extends Orange, S extends Apple, U> {
    private T Orange;
    private S Apple;
    private U newBox;

    public Box(U newBox) {
        this.newBox = newBox;
    }

    public U getNewBox() {
        return newBox;
    }

    public void setNewBox(U newBox) {
        this.newBox = newBox;
    }

    public void threeBox (Box <U> outBox) {

    }

    public Box(T orange, S apple) {
        Orange = orange;
        Apple = apple;
    }

    @Override
    public String toString() {
        return "Ящики: " + Orange + "; " + Apple;
    }

    public T getOrange() {
        return Orange;
    }

    public void setOrange(T orange) {
        Orange = orange;
    }

    public S getApple() {
        return Apple;
    }

    public void setApple(S apple) {
        Apple = apple;
    }

    public void getWeight (Box <T, S> weight) {
        double sumApple = getApple().pcsWeight * weight.getApple().quant;
        double sumOrange = getOrange().pcsWeight * weight.getOrange().quant;
        System.out.println("Общий вес яблок " + sumApple + " Общий вес апельсинов " + sumOrange);
    }

    public boolean compare (Box <T,S> value) {
        if (value.getApple().quant < value.getOrange().quant || value.getApple().quant > value.getOrange().quant) {
            return false;
        } return true;
    }

}
