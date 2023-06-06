package pertemuan10;

/*
    Nama File   : LambdaHashmap.java
    Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Selasa, 6 Juni 2023
    Deskripsi   : Implementasi Lambda pada Hashmap, digunakan sebagai parameter pada method
*/

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args){
        IDiskon diskonMerdeka = new IDiskon(){
            @Override
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(45000));
    }
}
