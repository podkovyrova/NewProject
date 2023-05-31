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
            case 1: {
                break;
            }
            case 5: {
                System.out.println("5555");
                break;
            }
            case 10: {
                break;
            }
            default: {

            }
        }
    }

}