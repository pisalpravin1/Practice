package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {
       // map{​"A"=12, "B"=15, "C"=10, "D"=13, "E"=11, "F"=9}​
        HashMap<String,Integer> map = new HashMap();
        map.put("A",12);
        map.put("B",null);
        map.put(null,10);
        map.put("D",11);
        map.put("E",11);
        map.put("D",9);

//        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect
//                (Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        List<Integer> list = map.values().stream().collect(Collectors.toList());
        System.out.println(map);


        String input1="My napravinajitasrgergerger";
        input1 = input1.replaceAll(" ","");
        int startIndex = input1.indexOf("a");
        int lastIndex = input1.lastIndexOf("a");
        HashSet uniqueChars = new HashSet();
        int uniqueCharCount = 0;
        for(int i=startIndex;i<lastIndex;i++){
            if(uniqueChars.add(input1.charAt(i))){
                uniqueCharCount++;
            }
        }
        System.out.println("uniqueCharCount="+uniqueCharCount);

    }
}
