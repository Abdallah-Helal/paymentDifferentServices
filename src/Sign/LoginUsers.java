package Sign;

import java.util.Scanner;

import FawarySystem.DataBase;
import Person.*;

public class LoginUsers implements ILogin{
	Scanner sc = new Scanner(System.in);

	public DataBase db;
	public LoginUsers(){
		db = DataBase.Get_Instance();
	}
	public Users login() {
		System.out.println("Enter Email:");
		String email = sc.next();
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		for(int i = 0;i<db.users.size();i++){
			if(db.users.get(i).email.equals(email)){
				if(db.users.get(i).password.equals(pass)){
					System.out.println("logged successfully!");
					return db.users.get(i);
				}
			}
		}
		return null;
	}

}
