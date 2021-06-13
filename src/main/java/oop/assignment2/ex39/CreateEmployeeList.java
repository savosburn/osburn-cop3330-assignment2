package oop.assignment2.ex39;

import java.util.*;

public class CreateEmployeeList {

    // key is last name, values are first name, position, date
   public ArrayList<HashMap<String, String>> unsortedMap(){

       CreateEmployeeList list = new CreateEmployeeList();

       // ArrayList<HashMap<string,string>>
       ArrayList<HashMap<String, String>> empList = new ArrayList<>();

       String[] fNames = {"John", "Tou", "Michaela", "Jake", "Jacquelyn", "Sally"};
       String[] lNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
       String[] positions = {"Manager", "Software Engineer", "District Manager", "Programmer", "DBA", "Web Developer"};
       String[] sepDates = {"2016-12-31", "2016-10-05", "2015-12-19", null, null, "2015-12-18"};

       //A list holding different maps where each map has multiple key,val entries
       // last, first
       // last, position
       // last, sepDate

       for (int i = 0; i < 6; i++) {
           empList.add(list.addMap(i, fNames, lNames, positions, sepDates));
       }



       return empList;
   }


   public HashMap<String, String> addMap(int k, String[] fNames, String[] lNames, String[] positions, String[] sepDates) {
        HashMap<String, String> employee = new HashMap<>();

            employee.put(lNames[k], fNames[k]);
            employee.put(lNames[k], lNames[k]);
            employee.put(lNames[k], positions[k]);
            employee.put(lNames[k], sepDates[k]);

        return employee;
   }

}
