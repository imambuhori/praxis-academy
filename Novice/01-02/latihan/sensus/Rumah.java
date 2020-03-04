package com.sensus;

public class Rumah{
    private int norumah;
    private String alamat;
    private String anggota;
       
        public Rumah (int kode, String nama){
           this.norumah = kode;
           this.alamat = nama;
        }
        public String getKeluarga(){
            return anggota;
        }
        public int getnorum(){
            return norumah;
        }
        public String getalamat(){
            return alamat;
        }
        public void setKel(Keluarga baru){
            this.anggota = baru;
        }
}