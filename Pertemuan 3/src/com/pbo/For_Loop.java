package com.pbo;

public class For_Loop {
    public static void main (String[] args){
        /*for (inisialisasi; kondisi; step nilai){
                 aksi;
            }
         */

        System.out.println("Mulai");
        System.out.println("--- Loop Pertama ---");

        for(int nilai = 0; nilai <= 10 ; nilai++){
            System.out.println("For Loop Ke-" + nilai);
        }

        System.out.println("--- Loop Kedua ---");
        for(int nilai = 0; nilai < 10 ; nilai++){
            System.out.println("For Loop Ke-" + nilai);
        }

        System.out.println("--- Loop Ketiga ---");
        for(int nilai = 10; nilai >= 5 ; nilai--){
            System.out.println("For Loop Ke-" + nilai);
        }

        System.out.println("--- Loop Keempat ---");
        int nilai = 0;
        for(; nilai < 10 ;){
            System.out.println("for loop ke-" + nilai);
            nilai++;
        }

        System.out.println("Selesai");
    }
}
