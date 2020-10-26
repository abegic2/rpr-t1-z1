package ba.unsa.etf.rpr;
import java.util.Scanner;

// Ovo je inicijalno bilo napisano pomocu txt editora i pokrenuto preko cmd

public class DvaBroja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesi prvi broj: ");
        int brojA= in.nextInt();
        System.out.println("Unesi drugi broj: ");
        int brojB= in.nextInt();
        System.out.println("Brojevi su: "+brojA+" i "+brojB);
    }
}