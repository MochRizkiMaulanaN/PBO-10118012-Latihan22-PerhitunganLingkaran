/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitunganlingkaran;

import java.util.Scanner;


/**
 * Nama : Moch Rizki Maulana N
 * Kelas : IF-1/S1/III
 * NIM : 10118012
 * Deskripsi Program: Menghitung jari-jari,luas,dan keliling lingkaran
 *
 * @author LENOVO
 */
public class Perhitunganlingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String Validasi;
        boolean Valid = true;
        do{
            System.out.println("===== Perhitungan Lingkaran =====");
            System.out.print("Masukkan Diameter : ");
            Validasi =input.next();
            if(Validasi.matches("[0-9]*")){
                int Diameter =input.nextInt();
                double phi =3.14;
                int Jari2 = Diameter/2;
                double Luas = phi*(Jari2*Jari2);
                double Keliling= 2*phi*Jari2;
                System.out.println("===== Hasil Perhitungan Lingkaran =====");
                System.out.println("Diameter Lingkaran = "+Diameter);
                System.out.println("Jari-Jari Lingkaran = "+Jari2);
                System.out.println("Luas Lingkaran = "+Luas);
                System.out.println("Keliling Lingkaran = "+Keliling);
                Valid =false;
                break;
            }else{
                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println("");
        }
            
        }while(Valid =true);
        
        
        
        
        
    }
    
}
