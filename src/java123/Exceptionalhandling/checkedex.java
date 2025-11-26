package java123.Exceptionalhandling;

import java.io.FileReader;

public class checkedex {


        static void main(String[] args) {
            int[] a = {1, 2, 3};
            try {
//int e =90/0;
                FileReader fr = new FileReader("abc.txt");

                System.out.println(a[6]);
            } catch (Exception e) {
                System.out.println("in catch block");
            }finally{
                System.out.println("finally block");
            }
//FileReader fr = new FileReader("abc.txt");


        }
    }
