package pertemuan9;

import java.beans.IndexedPropertyChangeEvent;
import java.util.concurrent.ExecutionException;

/*
	Nama  File	: Person.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 31 Mei 2023
	Deskripsi	: Person database model
*/

public class Person {
    private int id;
    private String name;
    public Person(String n){
        name = n;
    }
    public Person(int i, String n){
        id = i;
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
