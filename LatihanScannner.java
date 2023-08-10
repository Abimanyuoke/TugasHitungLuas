
package latihanscannner;

import java.util.Scanner;

public class LatihanScannner {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nilai sisi");
        int a = input.nextInt();
        int b = a*a;
        System.out.println(" Luas persegi " +a+ " adalah "+ b );
    }
    
}
