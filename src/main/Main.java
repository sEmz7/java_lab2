package main;

public class Main {
    public static void main(String[] args) {
        WashingMachine wm1 = new WashingMachine(60, 50);
        WashingMachine wm2 = new WashingMachine(60, 20);
        WashingMachine wm3 = new WashingMachine(60, 33);
        WashingMachine wm4 = new WashingMachine(633, 333);

        System.out.println(wm3.Load("светлое", 20));
        System.out.println(wm3.Load("светлое", 14));


        System.out.println(wm3);


    }
}