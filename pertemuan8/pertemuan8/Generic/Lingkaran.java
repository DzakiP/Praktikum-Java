package pertemuan8.Generic;

/*
    Nama File       : Lingkaran.java
    Pembuat         : Muhammad Dzaki Prasetyo
    NIM             : 24060121140127
    Tanggal         : Rabu, 31 Mei 2023
    Deskripsi       : implementasi lingkarang sebagai BangunDatar
*/ 

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
