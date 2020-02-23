package day64;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class RepresentingTableData {

    public static void main(String[] args) {

        // for single row
        // i want to get the value by it's column name
        // so i choose Map


        Map<String, String> row1 = new LinkedHashMap<>();
        row1.put("first_name", "Regan");
        row1.put("email", "rboichat@1688.com");
        row1.put("gender", "female");

        Map<String, String> row2 = new LinkedHashMap<>();
        row2.put("first_name", "Carleen");
        row2.put("email", "cmorillas1@blog.com");
        row2.put("gender", "Male");

        System.out.println("row1 = " + row1);
        System.out.println("row2 = " + row2);

        // for one row I used one map
        // but I have many rows
        // may of Some type ---> List<SomeType>

        List<Map<String, String>> rowMaps = new ArrayList<>();
        rowMaps.add(row1);
        rowMaps.add(row2);

        System.out.println("rowMaps = " + rowMaps);

        // How do I get 2nd row email column value

        System.out.println(" rowMaps.get(1).get(\"email\") = " + rowMaps.get(1).get("email"));

        // Update the name of 1st row to Hulk

        rowMaps.get(0).replace("first_name", "Hulk");
        System.out.println("rowMaps.get(0) = " + rowMaps.get(0));


    }
}
