package ColledtionExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchEleInArrayList {
    public static void main(String[] args) {
        List<String> monthList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        monthList.add("Jan");
        monthList.add("Feb");
        monthList.add("March");
        monthList.add("April");
        System.out.println("Is march present?"+monthList.contains("March"));
        System.out.println("Is may present?"+monthList.contains("May"));
        System.out.println("show march Index?"+monthList.indexOf("March"));
        System.out.println("show may Index?"+monthList.indexOf("may"));
        System.out.println("current size of monthList:"+monthList.size());
        monthList.remove("March");
        System.out.println("after removing march size of monthList:"+monthList.size());
        System.out.println("Is march present?"+monthList.contains("March"));
        System.out.println("show march Index?"+monthList.indexOf("March"));
    }
}
