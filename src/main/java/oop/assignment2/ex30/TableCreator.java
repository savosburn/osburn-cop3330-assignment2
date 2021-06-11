package oop.assignment2.ex30;

public class TableCreator {
    public static int MAX = 12;

    public String createTable() {

        int i, j;
        StringBuilder outputString = null;

        for (i = 1; i <= MAX; i++){
            for (j = 1; j <= MAX; j++) {
                String num = Integer.toString(i * j);

                if (outputString == null) {
                    outputString = new StringBuilder(String.format("%5s", num));
                }
                else {
                    outputString.append(String.format("%5s", num));
                }
            }

            outputString.append("\n");
        }

        assert outputString != null;
        return outputString.toString();
    }
}
