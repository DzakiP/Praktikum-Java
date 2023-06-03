package pertemuan7;

class Pegawai {
	private String nama;
	private int gajiPokok = 5000000;
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void tampilData() {
		System.out.printf("Nama : %s, Gaji Pokok : %d \n",
				this.nama,this.gajiPokok);
	}
}
