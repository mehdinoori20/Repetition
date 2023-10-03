package com.Mehdi.Repetition;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        /*

        Student benny = new Student(ag:15, name"Benny", isTired:true);
        Student frida = new Student(age:22, name"frida", isTired:false);

        System.out.println(benny.name);
        System.out.println(benny.age);
        System.out.println(benny.istired);

        System.out.println(frida.name);
        System.out.println(frida.age);
        System.out.println(frida);

         */

        int[] scores = {0, 150, 500, 5000};
        printScores(scores);
        checkScoreIfZero(scores);
    }
    public static void printScores(int[] scores) {
        for (int index = 0; index < scores.length; index++ ) {
            System.out.println(scores[index]);
        }
    }
        public static void checkScoreIfZero(int[] scores) {
        if (scores [0] == 0) {
            System.out.println("The score was indeed 0");
        }

        // keywords
            // what is a keyword
            // primitive Data-types
            // for, if, switch, new
            // this

            // Methods
            // v-modifiers
            // static
            // void
           // class


        }
}
