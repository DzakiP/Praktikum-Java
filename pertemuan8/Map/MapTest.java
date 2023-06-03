package pertemuan8.Map;

/*
    Nama File       : MapTest.java
    Pembuat         : Muhammad Dzaki Prasetyo
    NIM             : 24060121140127
    Tanggal         : Rabu, 31 Mei 2023
    Deskripsi       : implementasi lingkarang sebagai BangunDatar
*/ 

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        //kunci -> integer, nilai -> string
        Map<Integer,String> map = new HashMap<Integer,String>();
        //menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        //mengambil elemen pertama
        System.out.println(map.get(1));
        //mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> keys = map.keySet();
        //iterasi untuk mengambil keseluruhan nilai dari kunci
        for(Integer key: keys){
            System.out.println(key + " : " + map.get(key));
        }
    }
    
}
