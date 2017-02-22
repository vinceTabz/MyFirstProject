package com.company;


import com.company.classes.Methodwhile;
import com.company.classes.Mymethod;
import jdk.internal.dynalink.beans.StaticClass;
import jdk.internal.org.objectweb.asm.commons.Method;

public class Main {
    public static void main(String[] args) {

        //2nd activity
        System.out.println("\n1st way");
        Mymethod.myMethod(6);
        System.out.println("\n2nd way");
        Methodwhile.myDo(6);



       //done on while loop
      System.out.println("\ndone on while loop");
        int x = 0;
        while (x <=10) {
            System.out.print("["+x+"]");
            x++;
        }

        //done on Do while
        System.out.println("\ndone on Do while loop");
      int y = 0;
        do {
            System.out.print("[" + y + "]");
            y++;
        }
            while (y <=10) ;

        // done with For loop
        System.out.println("\ndone with For loop");
        for (int z=0; z<=10; z++){
            System.out.print("["+z+"]");

        }





    }
}

