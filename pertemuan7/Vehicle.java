/*
	Nama  File	: Vehicle.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: file superclass yang digunakan untuk menampilkan biaya dari jarak kendaraan .
*/

package pertemuan7;

public class Vehicle {
	void calRent(int distance,float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}