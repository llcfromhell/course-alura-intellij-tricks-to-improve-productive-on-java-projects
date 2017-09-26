package br.com.alura.bytebank;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        System.out.println("hello darkness, my old friend, welcome to bytebank");

        Employee ross = new Employee("Ross Geller", 2059687, LocalDate.of(2017, 2, 10 ) );
        Employee chandler = new Employee("Chandler Bing", 3357687, LocalDate.of(2017, 2, 10 ) );

        System.out.println(ross);
        System.out.println(chandler);

    }

}
