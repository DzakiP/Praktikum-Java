package pertemuan8.ArrayList;

import java.util.ArrayList;

/*
    Nama File       : ArrayListTest.java
    Pembuat         : Muhammad Dzaki Prasetyo
    NIM             : 24060121140127
    Tanggal         : Rabu, 31 Mei 2023
    Deskripsi       : Program penggunaan objek ArrayList sebagai collection class
*/ 

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<String> string = new ArrayList<String>();
        // menambah elemen
        string.add("praktikum");
        string.add("collection");
        string.add("dan generics");
        // menghapus elemen
        string.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for(String s : string){
            System.out.print(s+" ");
        }

    }
}
