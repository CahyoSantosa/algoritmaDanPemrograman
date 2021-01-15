/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asesmenakhir2;

import java.util.Scanner;

/**
 *
 * @author Cahyo Santosa
 */
public class AsesmenAkhir2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int que, capacity, fee, savings[];
        Scanner scanner = new Scanner(System.in);
        String[] name;

        System.out.print("Masukkan Jumlah Antrian : ");
        que = scanner.nextInt();
        
        name = new String[que];
        savings = new int[que];
        
        System.out.println("Masukkan Nama Calon Haji dan Jumlah Tabungan : ");
        for (int i = 0; i < name.length; i++) {
            name[i] = scanner.next();
            savings[i] = scanner.nextInt();
        } 
        
        System.out.print("Masukkan Jumlah Quota Haji : ");
        capacity = scanner.nextInt();
        
        System.out.print("Masukkan Minimum Fee Haji : ");
        fee = scanner.nextInt();
        
        verification(name, savings, capacity, fee);
    }

    private static void verification(String[] n, int[] s, int c, int f) {
        int i = 0, j = 0;
        
        while(i<c){
            while(j<s.length) {
                if (s[j]<f){
                    j++;
                }else{
                    System.out.println(n[j]);
                    i++; j++;
                }
            }
        }
    }
}

/*Scanner input = new Scanner(System.in);

        //allow user  input;
        System.out.println("How many numbers do you want to enter?");
        int num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = input.nextInt();
        }

        //you notice that now the elements have been stored in the array .. array[]

        System.out.println("These are the numbers you have entered.");
        printArray(array);

        input.close();*/
 /*int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }*/
