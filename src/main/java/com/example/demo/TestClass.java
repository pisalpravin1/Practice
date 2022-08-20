package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
       int arr[] = new int[]{4,5,2,25,22,30,27,25};
       for(int i=1; i<arr.length-1;i++){
           for(int j=i+1;j<arr.length-1;j++) {
               if (arr[i] < arr[j]) {
                   System.out.println(arr[i] + "-" + arr[j]);
                   break;
               } else if(j==arr.length-1){
                   System.out.println(arr[i] + "--1");
               }
           }
       }

       String st="hfytfytgvhhgHello";
       for(int i=0;i<st.length()-1;i++){
           char char1  = st.charAt(i);
            if(st.indexOf(char1) == st.lastIndexOf(char1)){
                System.out.println(""+char1);
                break;
            }
       }

       List<Integer> list = Arrays.asList(10,20,30,50,70);
       System.out.println("MAX="+list.stream().mapToInt(a->a).max());
    }
}
