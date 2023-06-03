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
