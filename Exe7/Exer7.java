package Exe7;

import Exe6.ExceptionA;

import java.io.IOException;

public class Exer7 {
    public static void main(String[] args) {
        try {

        }catch (ExceptionA e) {
            System.out.println(e.toString());
        }
        try {

        }catch (ExceptionB e) {
            System.out.println(e.toString());
        }
        try {

        }catch (NullPointerException e) {
            System.out.println(e.toString());
        }
        try {

        }catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
