package com.marcus.hello.apps;

/**
 * @author marcus
 */


class MyException extends Exception {

}

class Tire {

    void doStuff()  {

    }
}
public class ExamQuestions extends Tire {

   void doStuff() {


   }

    public static void main(String[] args) throws MyException {
        int[] ia = {1, 3, 5, 7, 9};
        for (int x : ia) {
            for (int j = 0; j < 3; j++) {
                if (x > 4 && x < 8) continue;
                System.out.print(" " + x);
                if (j == 1) break;
                continue;
            }
            continue;
        }
        StringBuffer sb = new StringBuffer("cc");
        switch (sb.toString()) {


        }



    }
}

