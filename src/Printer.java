public class Printer implements IPrinter {
    @Override
    public void print(String[][] field) {
        System.out.println(getUsString(field));
    }

    public String getUsString(String[][] field) {
        String str = "";
        for (int colIndex = 0; colIndex < field.length; colIndex++) {
            for (int rowIndex = 0; rowIndex < field[colIndex].length; rowIndex++){
                str += field[colIndex][rowIndex] + " ";
                if (rowIndex == field[colIndex].length-1)
                    str += "\n";
            }
        }
        return str;
    }
}
