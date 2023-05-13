/*
	Nama  File	: MLingkaran.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Kamis, 27 April 2023
	Deskripsi	: implementasi cara menghitung luas lingkaran     
*/

import java.util.Scanner;

 public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan jari-jari : ");
		double jejari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jejari);
		System.out.println("Luas lingkaran dengan jejari " +jejari+ " satuan adalah "+l.hitungLuas());
	}
 }
