/*
	Nama  File	: Sewa.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: Main dari vehicle.
*/

package pertemuan7;

public class Sewa {
	public static void main(String[] args) {
		Vehicle kendaraan = new Vehicle();
		Vehicle mobil = new Car();
		Vehicle bis = new Bus();
		kendaraan.calRent(50, 1000);
		mobil.calRent(50, 1000);
		bis.calRent(50, 1000);
	}
}