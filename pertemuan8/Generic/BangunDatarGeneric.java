package pertemuan8.Generic;

/*
    Nama File       : BangunDatarGeneric.java
    Pembuat         : Muhammad Dzaki Prasetyo
    NIM             : 24060121140127
    Tanggal         : Rabu, 31 Mei 2023
    Deskripsi       : Kelas konstruksi untuk generic BangunDatar
*/ 

public class BangunDatarGeneric<T2 extends BangunDatar> {
    private T2 bangunDatar;

    public void set(T2 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    public T2 get(){
        return bangunDatar;
    }
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
