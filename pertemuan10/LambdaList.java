package pertemuan10;

/*
    Nama File   : LambdaList.java
    Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Selasa, 6 Juni 2023
    Deskripsi   : Implementasi Lambda pada List, digunakan sebagai parameter pada method
*/

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
