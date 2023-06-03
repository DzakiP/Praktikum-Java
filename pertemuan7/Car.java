/*
	Nama  File	: Car.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: Subclass dari Vehicle yang digunakan untuk menghitung biaya sewa mobil
*/

package pertemuan7;

public class Car extends Vehicle{
	void calRent(int jarak, float harga){ 
		float fare=jarak*harga;
		fare=fare-1000.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}
