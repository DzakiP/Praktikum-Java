/*
	Nama  File	: MTugasRefleksiTitik.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 14 Maret 2023
	Deskripsi	: Main dari Refleksi
*/
class MTugasRefleksi{
    public static void main(String[] args){
        Titik m;
        TugasRefleksi ref;
        m = new Titik(4,4);
        ref = new TugasRefleksi();

        System.out.println("Titik ("+m.getAbsis()+", "+m.getOrdinat()+")");
        ref.refleksiX(m);
        System.out.println("Hasil refleksi sumbu X ("+m.getAbsis()+", "+m.getOrdinat()+")");
        ref.refleksiY(m);
        System.out.println("Hasil refleksi Sumbu Y ("+m.getAbsis()+","+m.getOrdinat()+")");
    }
}
