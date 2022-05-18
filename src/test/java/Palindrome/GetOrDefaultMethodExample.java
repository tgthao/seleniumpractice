package Palindrome;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultMethodExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Amod");
        map.put(102,"Swati");
        map.put(103,"Aaditya");
        map.put(104,"Animesh");
        System.out.println(map.get(101));
    }
}
