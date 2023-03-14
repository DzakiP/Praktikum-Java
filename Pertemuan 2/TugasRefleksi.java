/*
	Nama  File	: TugasRefleksi.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 14 Maret 2023
	Deskripsi	: Tugas Pertemuan 2
*/
class TugasRefleksi{
    public TugasRefleksi(){
    }
    private Titik refleksiSumbuX(Titik a){
        double y;
        y=a.getOrdinat();
        y=(-1)*y;
        a.setOrdinat(y);
        return a;
    }
    private Titik refleksiSumbuY(Titik a){
        double x;
        x=a.getAbsis();
        x=(-1)*x;
        a.setAbsis(x);
        return a;
    }
    public Titik refleksiX(Titik titik){
        return refleksiSumbuX(titik);
    }
    public Titik refleksiY(Titik titik){
        return refleksiSumbuY(titik);
    }
}
