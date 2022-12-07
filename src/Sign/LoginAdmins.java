package Sign;

import java.util.Scanner;

import FawarySystem.DataBase;
import Person.Admins;
import Person.Person;

public class LoginAdmins implements ILogin {
	Scanner sc = new Scanner(System.in);

	public DataBase db;
	public LoginAdmins(){
		db = DataBase.Get_Instance();
	}
	public Admins login() {
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter Email:");
		String email = sc.next();
		System.out.println("Enter Password:");
		String pass = sc.next();
		for(int i = 0;i<db.admins.length;i++){
			if(db.admins[i].email.equals(email)){
				if(db.admins[i].password.equals(pass)){
					System.out.println("logged successfully!");
					return db.admins[i];
				}
			}
		}
			return null;
	}
}
