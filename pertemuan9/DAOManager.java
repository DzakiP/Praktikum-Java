package pertemuan9;

/*
	Nama  File	: DAOManager.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 31 Mei 2023
	Deskripsi	: Pengelola DAO dalam program
*/

public class DAOManager {
    private PersonDAO personDAO;
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}