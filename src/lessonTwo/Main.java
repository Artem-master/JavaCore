package lessonTwo;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataExeption {
        arrSize = 4; // устанавливаем размер массива
        str = "1"; // число или буква в ячейки
        One();
        Two();


    }
    public static String [][] arrStr;
    public static int [][] numArr;
    public static int arrSize;
    public static String str;

    public static void One () throws MyArraySizeException, MyArrayDataExeption {
        arrStr = new String[arrSize][arrSize];
        numArr = new int [arrStr.length][arrStr.length];
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                arrStr [i][j] = str;
                arrStr [0][0] = "1";
                try {
                    numArr[i][j] = Integer.parseInt(arrStr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption ("В ячейке, с номером строки " + i + " номером столбца "+ j);
                }
            }
        }
        if (arrSize != 4) {
            throw new MyArraySizeException ("Некорректный размер массива. Максимальный - 4");
        }
    }

    public static void Two () {
        int sum = 0;
        numArr = new int [arrStr.length][arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr.length; j++) {
                numArr [i][j] = Integer.parseInt(arrStr[i][j]);
                sum += numArr[i][j];
            }
        }
        System.out.print(sum);
    }

}
