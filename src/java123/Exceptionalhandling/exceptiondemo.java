package java123.Exceptionalhandling;

import java.util.Arrays;

public class exceptiondemo {
    static void main(String[] args) {
        int[] a = {1, 2, 3};
        try {
//int e =90/0;

            System.out.println(a[6]);
        } catch (Exception e) {
            System.out.println("in catch block");
        }


    }
}
