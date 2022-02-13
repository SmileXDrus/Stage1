package com.smilexdrus;

// Add any necessary import statements here
public class Sandbox {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
    String name;
    public String getHello() {
        name = "Hello World!";
        return name;
    }
    public void setName(String newName) { //The void keyword means that no value at all is returned.
        name = newName;
    }
}
