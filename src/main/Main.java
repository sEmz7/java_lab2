package main;

public class Main {
    public static void main(String[] args) {
        Linen linen1 = new Linen("светлое", 30, 20);
        Linen linen2 = new Linen("светлое", 45, 20);


//        AutomaticMachine am1 = new AutomaticMachine(50);
//        System.out.println(am1.load(linen1));
//        System.out.println(am1.load(linen2));
//        System.out.println(am1);

        ManualMachine mm1 = new ManualMachine(50);
        Linen linen3 = new Linen("темное", 60, 15);
        System.out.println(mm1.load(linen3));
        System.out.println(mm1);

    }
}