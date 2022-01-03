package org.homework.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args){
        Example1();
        Example2();
        Example3();
        Example4();
        Example5();
        Example6();
        Example7();
        Example8();
        Example9();
        Example10();
        Example11();
        Example12();
    }
    public static void Example1 (){
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1, "Dog");
        hashMap.put(2, "Cat");
        hashMap.put(3, "Donkey");

        for (Map.Entry e:hashMap.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    public static void Example2 (){
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1, "Dog");
        hashMap.put(2, "Cat");
        hashMap.put(3, "Donkey");
        System.out.println("Size mapping in given HashMap is "+hashMap.size());
    }
    public static void Example3 (){
        HashMap<Integer,String> hashMap1 = new HashMap<Integer,String>();
        HashMap<Integer,String> hashMap2 = new HashMap<Integer,String>();
        hashMap1.put(1, "Dog");
        hashMap1.put(2, "Cat");
        hashMap1.put(3, "Donkey");
        System.out.println("First HashMap is "+hashMap1);
        hashMap2.put(4, "Horse");
        hashMap2.put(5, "Monkey");
        hashMap2.put(6, "Elephant");
        System.out.println("Second HashMap is "+hashMap2);

        hashMap2.putAll(hashMap1);

        System.out.println("Copied first HashMap into Second one "+hashMap2);
    }
    public static void Example4 () {
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Dog");
        hashMap1.put(2, "Cat");
        hashMap1.put(3, "Donkey");
        System.out.println("Base HashMap is "+hashMap1);
        hashMap1.clear();
        System.out.println("The new cleared HashMap is "+hashMap1);
    }
    public static void Example5 () {
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Dog");
        hashMap1.put(2, "Cat");
        hashMap1.put(3, "Donkey");
        boolean result = hashMap1.isEmpty();
        System.out.println("Now Hashmap contains values? "+result+" - HashMap is not empty.");
        hashMap1.clear();
        result = hashMap1.isEmpty();
        System.out.println("Now Hashmap does not contains values? "+result+" - HashMap is empty.");
    }
    public static void Example6 () {
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
        hashMap1.put(1, "Dog");
        hashMap1.put(2, "Cat");
        hashMap1.put(3, "Donkey");

        System.out.println("Original map is "+ hashMap1);
        hashMap2 = (HashMap)hashMap1.clone();
        System.out.println("Cloned HashMap is "+hashMap2);
    }
    public static void Example7 () {
        HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
        hashMap1.put("Dog", 1);
        hashMap1.put("Cat", 2);
        hashMap1.put("Donkey", 3);
        System.out.println("Looking for Cat key");
        if (hashMap1.containsKey("Cat")) {
            System.out.println("Cat key is " + hashMap1.get("Cat"));
        }else {
            System.out.println("There is no Cat key");
        }
        System.out.println("Looking for Horse key");
        if (hashMap1.containsKey("Horse")) {
            System.out.println("Horse key is " + hashMap1.get("Horse"));
        }else {
            System.out.println("There is no Horse key");
        }
    }
    public static void Example8 () {
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Dog");
        hashMap1.put(2, "Cat");
        hashMap1.put(3, "Donkey");
        System.out.println("Looking for Dog value");
        if (hashMap1.containsValue("Dog")){
            System.out.println("Yes, there is Dog value");
        }else {
            System.out.println("No value");
        }
        System.out.println("Looking for Horse value");
        if (hashMap1.containsValue("Horse")){
            System.out.println("Yes, there is Horse value");
        }else {
            System.out.println("No value");
        }
    }
    public static void Example9() {
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Dog");
        hashMap1.put(2, "Cat");
        hashMap1.put(3, "Donkey");

        Set set = hashMap1.entrySet();
        System.out.println("Set values: " + set);
    }
    public static void Example10(){
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Dog");
        hashMap1.put(2, "Cat");
        hashMap1.put(3, "Donkey");

        String str = (String) hashMap1.get(2);
        System.out.println("Value for key 2 is: "+str);
    }
    public static void Example11(){
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Dog");
        hashMap1.put(2, "Cat");
        hashMap1.put(3, "Donkey");

        Set set = hashMap1.keySet();
        System.out.println("Key set values are : "+set);
    }
    public static void Example12(){
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Dog");
        hashMap1.put(2, "Cat");
        hashMap1.put(3, "Donkey");

        System.out.println("Values in given HashMap are : "+hashMap1.values());
    }
}
