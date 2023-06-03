/*
	Nama  File	: PolimorfismeCoercion.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: Contoh kode yang merenapkan polimorfisme coercion.
*/

package pertemuan7;
public class PolimorfismeCoercion{
		
		public static int kuadrat(int bilangan){
			return bilangan * bilangan;
		}
		
		public static void main(String[] args){
			//deklarasi objek integer
			Integer bilangan = 10;
			
			//objek integer 'dipaksa' untuk diubah
			// menjadi primitif
			int hasilKuadrat = kuadrat(bilangan);
			
			System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
		}
}