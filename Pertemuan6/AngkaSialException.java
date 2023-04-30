/*
	Nama  File	: AngkaSialException.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM		: 24060121140127
	Tanggal		: Kamis, 27 April 2023
	Deskripsi	: Eksepsi buatan sendiri, menolak masukan angka 13! 
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
 }
