import java.util.Arrays;

public class Field {
    int length;
    int width;
    String[][] array;

    public Field(String[][] array) {
        this.array = array;
        this.length = array.length;
        this.width = array[length-1].length;
    }

    @Override
    public String toString() {
        return "Field{" +
                "length=" + length +
                ", width=" + width +
                ", array= \n" + new Printer().getUsString(this.array) +
                '}';
    }
}
