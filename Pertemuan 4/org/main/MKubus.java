/*
	Nama  File	: MKubus.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 15 Maret 2023
	Deskripsi	: Main untuk kubus
*/
package org.main;

import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar persegi = new BujurSangkar(4);
		Kubus kubus = new Kubus(persegi);
		System.out.println("Luas Alas Kubus : "+kubus.hitungLuasAlas());
		System.out.println("Volume Kubuus : "+kubus.hitungVolume());
	}
}
