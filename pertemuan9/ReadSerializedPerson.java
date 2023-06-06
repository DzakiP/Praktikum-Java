package pertemuan9;
import java.io.*;

/*
	Nama  File	: ReadSerializedPerson.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 31 Mei 2023
	Deskripsi	: Program untuk serialisasi objek Person
*/

public class ReadSerializedPerson {
    public static void main(String[] args){
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serial person name = "+person.getName());
        }
        catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}
