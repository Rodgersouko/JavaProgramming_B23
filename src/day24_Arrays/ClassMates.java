package day24_Arrays;

import java.util.Arrays;

public class ClassMates {
    public static void main(String[] args) {
        String[] classmates = {"roja","geoge","ivy","ccss"};

        System.out.println(Arrays.toString(classmates));

        for(int i = 0 ; i < classmates.length ;i++)
        System.out.println(classmates[i].substring(0,3));
    }
}
