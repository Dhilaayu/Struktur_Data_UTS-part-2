package com.mycompany.uts2_strukturdata;
import java.util.Scanner;
public class Uts2_StrukturData {
    public static int fibonacci (int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci (n-1) + fibonacci (n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Suku Fibonnaci : ");
        int n = input.nextInt();
        
        System.out.print("Deret Fibonnaci hingga suku ke-"+ n+ ":\n" );
        for (int i = 0; i<=n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }   
}