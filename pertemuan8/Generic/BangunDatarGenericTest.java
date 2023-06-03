package pertemuan8.Generic;

/*
    Nama File       : BangunDatarGenericTest.java
    Pembuat         : Muhammad Dzaki Prasetyo
    NIM             : 24060121140127
    Tanggal         : Rabu, 31 Mei 2023
    Deskripsi       : Main class untuk generic bangun datar
*/ 

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkarang : " +bdg.hitungKeliling());
        System.out.println("tipe generic : " +bdg.get().getClass().getName());

    }    
}
