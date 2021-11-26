package Exe7;

import java.io.IOException;

public class Exer7 {
    public static void main(String[] args) {
       try {
            throw new ExceptionA();
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            throw new ExceptionB();
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            throw new NullPointerException();
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            throw new IOException();
        }catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
