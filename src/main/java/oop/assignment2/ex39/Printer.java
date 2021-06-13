package oop.assignment2.ex39;

import java.util.ArrayList;
import java.util.HashMap;

public class Printer {

    public String print(String[] sortedList, ArrayList<HashMap<String, String>> employees) {
        Printer printing = new Printer();

        String headings = printing.setUpTable();
        System.out.print(headings);

        String[][] input = printing.fillTable(sortedList, employees);


        String output = printing.createOutput(input);

        return headings + output;
    }

    public String setUpTable() {
        String str1 = "Name\t\t\t\t| Position\t\t\t|Separation Date\n";
        String str2 = "--------------------|-------------------|----------------\n";

        return str1 + str2;
    }

    public String[][] fillTable(String[] sortedList, ArrayList<HashMap<String, String>> employees) {
        HashMap<String, String> employee;
        String[][] values = new String[6][4];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                employee = employees.get(j);

                if (employee.containsKey(sortedList[i])) {
                    //System.out.print(employee.values());
                    values[i] = employee.values().toArray(new String[i]);
                }
            }
        }
        return values;
    }

    public String createOutput(String[][] employees) {
        String newString = null;

        //System.out.print("employee = " + employees[0][0]);

        for (int i = 0; i < 6; i++) {
            //System.out.print("value of i =  " + i);
            String curString = null;
            int count = 0;
            for (int j = 0; j < 4; j++) {
                //System.out.print("value of j = " + j);

                if (j > 1) {
                    curString += "| ";
                    count += curString.length();
                }

                if (curString == null) {
                    curString = employees[i][j] + " ";
                    count += curString.length();
                }

                curString += employees[i][j] + " ";
                count += curString.length();

                //System.out.print("curstring = " + curString);

            }

            while(count < 20) {
                curString += " ";
                count++;
            }

            curString += "\n";

            if (newString == null) {
                newString = curString;
            }

            else {
                newString += curString;
            }
        }

        return newString;
    }
}
