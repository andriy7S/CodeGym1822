package com.codegym.task.task18.task1822;

/* 
Finding data inside a file
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        int id = Integer.parseInt(args[0]);

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();

        FileInputStream inputStream = new FileInputStream(fileName);
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream));

        String dataLine;
        ArrayList<String> list = new ArrayList<>();
        while ((dataLine = fileReader.readLine()) != null) {
            list.add(dataLine);
        }
        inputStream.close();

        for (String str : list) {
           int productID = Integer.parseInt(str.substring(0, str.indexOf(" ")));
           if (productID == id) {
               System.out.println(str);
           }
        }
    }
}
