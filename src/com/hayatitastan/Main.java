package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on 03.10.2022
 **/
public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca(){
        // write your code here
        int[] numbers = new int[]{1,2,5,7,9};
        int aranacak = 6;
        boolean varMi=false;

        for (int number: numbers){
            if (number == aranacak ) {
                varMi = true;
                break;
            }
        }
        String mesaj = "";
        if(varMi){
            mesaj= aranacak + " SAYISI dizi İÇİNDE VARDIR.";
            mesajVer(mesaj);
        }else{
            mesaj= aranacak + " SAYISI dizi İÇİNDE YOKTUR.";
            mesajVer(mesaj);
        }

    }
    public static void mesajVer(String verilecekMesaj){
        System.out.println(verilecekMesaj);
    }
}
