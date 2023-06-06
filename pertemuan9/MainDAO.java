package pertemuan9;

/*
	Nama  File	: MainDAO.java
	Pembuat		: Muhammad Dzaki Prasetyo
	NIM			: 24060121140127
	Tanggal		: Rabu, 31 Mei 2023
	Deskripsi	: Main program untuk akses DAO
*/

public class MainDAO {
    public static void main(String[] args){
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
