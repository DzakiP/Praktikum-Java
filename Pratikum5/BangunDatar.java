/*
	Nama  File	: BangunDatar.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM		: 24060121140127
	Tanggal		: Kamis, 27 April 2023
	Deskripsi	: kelas abstrak, berisi abstraksi bangun datar
*/

public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
 } 
