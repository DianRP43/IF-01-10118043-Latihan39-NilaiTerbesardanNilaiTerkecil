/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan38.nilaiterbesardannilaiterkecil;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class MaxdanMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nama;
        int lokasii,i, jumlah, lokasi = 1, array[], maksimum,minimum;
        
        
        System.out.println("Program Nilai Terbesar dan Terkecil");
        System.out.println("___________________________________");
        System.out.print("Masukan Nama Petugas\t\t\t= ");
        Scanner scanner = new Scanner(System.in); 
        Nama = scanner.nextLine();
        
        Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan Banyaknya nilai mahasiswa\t= ");
    jumlah = scan.nextInt();
    array = new int[jumlah];
    
    System.out.println("Masukkan "+jumlah+" angka");
    for(i = 0; i < jumlah; i++) {
      System.out.print("Nilai ke"+ (i+1) +": " );
      array[i] = scan.nextInt();
    }
    maksimum = array[0];
    minimum = array[0];
    for(i = 0; i < jumlah; i++) {
      if (array[i] > maksimum){
        maksimum = array[i];
        lokasi = i+1;
      }
    }
    for(i = 0; i < jumlah; i++) {
      if (array[i] < minimum){
        minimum = array[i];
        lokasii = i+1;
      }
    }
    System.out.println("Nilai Terbesar adalah "+maksimum);
   System.out.println("Nilai Terkecil adalah "+minimum);
    }
    
}
