package org.example;

import javax.naming.NameNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class example {
    public static void main(String[] args) {

        int[] mass = {1, 2, 3};


        try {
            System.out.println(mass[7]);


        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println("такого элемента нет");

        }


    }

}
