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
