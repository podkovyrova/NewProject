package org.podkovyrova;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello from Java!");
        int value = 5;
        double sum = 10.5;
        String text = "Hello Java";


        if(value > 5) {
            System.out.println(">5");
        }

        switch (value) {
            case 1:
            case 10: {
                break;
            }
            case 5: {
                System.out.println("5555");
                break;
            }
            default: {

            }
        }

        int[] arrayInt = new int[3];
        arrayInt[0] = 150;
        arrayInt[1] = 150;
        arrayInt[2] = 150;

        int[] arrayIntSec = {4, 10, 3};

        String[] arrayText = new String[3];
        arrayText[0] = "first";
        arrayText[1] = "second";
        arrayText[2] = "third";

        // i++ = i + 1
        for(int i = 0; i < arrayText.length; i++) {
            System.out.println(i + " item = " + arrayText[i]);
        }

        for(String v : arrayText) {
            System.out.println("item = " + v + "!");
        }
    }

}