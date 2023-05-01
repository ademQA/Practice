package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q04_ArrayList_Compare {
    public static void main(String[] args) {
//Create a java method that finds the same elements in two string arrays
        commenElement();

    }
    public static void commenElement(){
        String[] data1 = {"Java","SQL","HTML","Selenium","API","Python","postman","devops"} ;
        String[] data2 = {"Java","SQL","html","selenium","Api","C#","SoapUI","azure"} ;
        List<String>commenList=new ArrayList<>();
        for (int i = 0; i < data1.length; i++) {
            for (int j = 0; j < data2.length; j++) {
                if (data1[i].equalsIgnoreCase(data2[j]))
                    commenList.add(data1[i]);
            }
        }
        System.out.println(commenList); //[Java, SQL, HTML, Selenium, API]

    }
}
