package oop.assignment2.ex30;

public class TableCreator {
    public static int MAX = 12;

    public String createTable() {

        int i, j;
        String outputString = null;

        for (i = 1; i <= MAX; i++){
            for (j = 1; j <= MAX; j++) {
                String num = Integer.toString(i * j);

                if (outputString == null) {
                    outputString = String.format("%5s", num);
                }
                else {
                    outputString += String.format("%5s", num);
                }
            }

            outputString += "\n";
        }

        return outputString;
    }
}
