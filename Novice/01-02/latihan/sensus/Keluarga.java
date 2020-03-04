package com.sensus;
public class Keluarga{
    private int jumlah;
    private String nama;
        public Keluarga(int no, String nama){
            this.jumlah = no;
            this.nama = nama;
        }
        public int getno(){
            return jumlah;    
        }
        public String getnama(){
            return nama;
        }
}