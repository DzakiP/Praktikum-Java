package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		SegitigaSamaKaki segitiga = new SegitigaSamaKaki(5,10,3);
		segitiga.printInfo();
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
		System.out.println("Luas Segitiga Sama Kaki : "+segitiga.hitungLuas());
	}
}
