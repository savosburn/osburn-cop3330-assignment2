package oop.assignment2.ex38;

import java.sql.Array;

public class FilterString {

    public String[] filterEvenNumbers(char[] array) {
        String[] newArray = new String[newArraySize(array)];
        String indexZero = newArray[0];

        int i, j;
        for (i = 0, j = 0; i < array.length; i++) {

            String temp = Character.toString(array[i]);
             //System.out.print(temp);



            if (Character.isWhitespace(array[i])) {

                if (indexZero == null) {
                    continue;
                }


                newArray[j] = " ";
                j++;
                continue;
            }


            int tempInt = Integer.parseInt(temp);

            //  System.out.print(tempInt);

            if (tempInt % 2 == 0) {
                indexZero = "not null";
                newArray[j] = temp;
                j++;
            }


        }

        return newArray;
    }

    public int newArraySize(char[] array) {
        int length = array.length;

        for (char c : array) {
            String temp = Character.toString(c);

            if (temp.equals(" ")) {
                continue;
            }

            int intTemp = Character.getNumericValue(c);

            if (!(intTemp % 2 == 0)) {
                length--;
            }
        }
        return length - 1;
    }

    public char[] convertInputToArray(String input) {
        char[] inputArray = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            inputArray[i] = input.charAt(i);
        }

        return inputArray;
    }
}
