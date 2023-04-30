/*
	Nama  File	: Lingkaran.java
	Pembuat		  : Muhammad Dzaki Prasetyo
	NIM			    : 24060121140127
	Tanggal		  : Kamis, 27 April 2023
	Deskripsi	  : kelas implementasi IArea berupa
				    cara menghitung luas lingkaran  
*/

import static java.lang.Math.PI;
 
class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
 }
 
 
