/*
	Nama  File	: BujurSangkar.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 15 Maret 2023
	Deskripsi	: Respentasi dari objek bujur sangkar
*/
package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
	}
	
	public double hitungLuas(){
		return  panjangSisi * panjangSisi;
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}
