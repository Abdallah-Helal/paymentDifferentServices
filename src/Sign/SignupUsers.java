package Sign;

import java.util.Scanner;

import FawarySystem.DataBase;
import Person.*;
import Person.Users;

public class SignupUsers implements ISignUp {
	public DataBase db;
	public SignupUsers(){
		db = DataBase.Get_Instance();
	}
	public Users Sign_New() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName:");
		String name = sc.next();
		System.out.println("Enter Password:");
		String pass = sc.next();
		System.out.println("Enter Email:");
		String email = sc.next();
		while(authentication(email)){
			System.out.println("This Email Is Already Exist:");
			System.out.println("Enter Email:");
		    email = sc.next();
		}
		Users newUser = new Users(name,pass,email);
		db.Add_user(newUser);
		System.out.println("Successfully Added!");
		return newUser;
	}
	public boolean authentication(String email) {
		for(int i = 0;i<db.users.size();i++){
			if(db.users.get(i).email.equals(email)){
				return true;
			}
		}
		return false;
	}


}

