package com.pbo;

public class Modul_Latihan_Method_Overloading {
    //Latihan

    static int kalkulasi (int x, int y){
        return x + y;
    }
    static double kalkulasi (double x, double y){
        return x - y;
    }
    static String kalkulasi (String x, String y){
        String hasil = x + " " + y; // variabel local
        return hasil;
    }
    static String kalkulasi (String x, int y){
        String hasil = "Nama " + x + ", umur " + y + " tahun";
        return hasil;
    }

    public static void main(String[] args){
        String nilai3 = kalkulasi("Triana", "Micku");
        int nilai1 = kalkulasi(8, 5);
        double nilai2 = kalkulasi(4.3, 6.26);
        String nilai4 =  kalkulasi("Nana", 19);
        System.out.println("Nilai Int : " + nilai1);
        System.out.println("Nilai Double : " + nilai2);
        System.out.println("Nilai String : " + nilai3);
        System.out.println("Keterangan : " + nilai4);
    }
}
