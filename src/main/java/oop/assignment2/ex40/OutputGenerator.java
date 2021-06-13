package oop.assignment2.ex40;

import java.util.ArrayList;
import java.util.HashMap;

public class OutputGenerator {

    public String generateOutput(ArrayList<HashMap<String, String>> employeeRecords) {
        OutputGenerator generator = new OutputGenerator();

        String heading = generator.tableHeading();
        String output = generator.employeesFiltered(employeeRecords);

        return heading + output;
    }

    public String tableHeading() {
        String str1 = "Name\t\t\t\t| Position\t\t\t  |Separation Date\n";
        String str2 = "--------------------|---------------------|----------------\n";

        return str1 + str2;
    }

    public String employeesFiltered(ArrayList<HashMap<String, String>> employeeRecords) {
        String output = null;

        String[] names = avoidDoublePrinting(employeeRecords);

        for (int i = 0; i < names.length; i++) {
            if (employeeRecords.get(i).get("firstNames").equals(names[i])) {
                String tempString = checkNull(employeeRecords, i, "firstNames") + " " + checkNull(employeeRecords, i, "lastNames")
                        + spaces(employeeRecords, i, "lastNames") + "| " + checkNull(employeeRecords, i, "positions") +
                        spaces(employeeRecords, i, "positions") + "| " + spaces(employeeRecords, i, "lastNames");

                if (output == null) {
                    output = tempString + "\n";
                } else {
                    output += tempString + "\n";
                }
            }
        }

        return output;
    }

    public String[] avoidDoublePrinting(ArrayList<HashMap<String, String>> employeeRecords) {
        String[] names = new String[employeeRecords.size()];
        for (int i = 0; i < employeeRecords.size(); i++) {
            names[i] = employeeRecords.get(i).get("firstNames");

            for (int j = 0; j < names.length; j++) {
                if (j != i && names[i].equals(names[j])) {
                    names[j] = null;
                }
            }
        }

        return names;

    }

    public String checkNull(ArrayList<HashMap<String, String>> list, int k, String key) {
        if (list.get(k).get(key) == null) {
            return " ";
        } else {

            return list.get(k).get(key);
        }
    }

    public String spaces(ArrayList<HashMap<String, String>> list, int k, String key) {
        int count;

        if (key.equals("lastNames")) {
            count = list.get(k).get("firstNames").length() + list.get(k).get(key).length() + 1;
        } else
            count = list.get(k).get(key).length();

        String string = " ";


        while (count < 19) {
            string += " ";
            count++;
        }


        return string;
    }
}
