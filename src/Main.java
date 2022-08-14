import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float height,weight;

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu (kg cinsinden) giriniz: ");
        weight = inp.nextFloat();
        System.out.println("Lütfen boyunuzu (m cinsinden) giriniz: ");
        height = inp.nextFloat();

        double bmi = (weight/ Math.pow(height,2));
        System.out.println("Vücut Kitle İndeksiniz: " + bmi);


    }
}
