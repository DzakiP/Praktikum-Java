/*
	Nama  File	: MBujurSangkar.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Kamis, 27 April 2023
	Deskripsi	: kelas yang mengimplementasikan cara menghitung 
               luas bujur sangkar
*/

import java.util.Scanner;
 
 class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+
					" satuan adalah "+bs.hitungLuas(sisi));
	}
 }
 
