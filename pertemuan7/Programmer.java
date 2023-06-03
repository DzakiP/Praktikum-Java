/*
	Nama  File	: Programmer.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: File subclass dari Pegawai untuk menampilkan bonus.
*/

package pertemuan7;

class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama){
        this.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.printf("Bonus : %d \n",this.bonus);
    }
}
