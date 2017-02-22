package com.company.classes;

/**
 * Created by jpmc on 2/20/2017.
 */
public class Methodwhile {
    public static void myDo(int arv) {
        int q = 0;
        int w = 0;
        while (q < arv) {
            q++;
             w=w+q;
        }
        System.out.println(w);
    }
}