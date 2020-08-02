/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Konversi {

    

    
    public static void main(String[] args) {

  
        Scanner Waktu = new Scanner (System.in);
        int jam , jam1 , menit, menit1, detik, totaldetik;
        System.out.print("Masukan Total Detik   :");
        totaldetik = Waktu.nextInt();
        detik=totaldetik%60;
        menit1=totaldetik/60;
        menit=menit1%60;
        jam1=menit1/60;
        jam=jam1%24;
   
        System.out.println(+jam+" Jam : "+menit+" Menit : "+detik+" Detik");
    }
}


