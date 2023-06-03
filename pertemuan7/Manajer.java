/*
	Nama  File	: Manajer.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: Subclass dari Pegawai yang digunakan untuk menampilkan tunjangan
*/

package pertemuan7;

class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        this.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.printf("Tunjangan : %d \n", this.tunjangan);
    }
}
