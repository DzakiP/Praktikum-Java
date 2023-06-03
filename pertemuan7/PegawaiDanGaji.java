/*
	Nama  File	: PegawaiDanGaji.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: File yang berisi superclass Pegawai, dua subclassnya yaitu Manager dan Programmer, sebuah class Payroll, dan file Main-nya.
*/

package pertemuan7;

public class PegawaiDanGaji {
    public static void main(String args[]){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Programmer("Joko");
        Pegawai pegawai3 = new Programmer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
