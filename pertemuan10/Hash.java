package pertemuan10;

/*
    Nama File   : Hash.java
    Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Selasa, 6 Juni 2023
    Deskripsi   : Implementasi Lambda pada Hashmap, digunakan sebagai parameter pada method
*/

import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args){
        Map<Integer, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put(20000,"Adi");
        mahasiswaMap.put(20001,"Bambang");
        mahasiswaMap.put(30000,"Cici");
        mahasiswaMap.put(30002,"Didi");
        mahasiswaMap.put(43213,"Rie");
        mahasiswaMap.put(23232,"Shariyl");
        mahasiswaMap.put(24543,"Yuri");
        mahasiswaMap.put(45672,"Re");

        mahasiswaMap.forEach((nim,nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
