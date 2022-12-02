package FawarySystem;

import java.util.Scanner;

public class SignupUsers implements ISignUp {
	public DataBase db;
	SignupUsers(){
		db = DataBase.Get_Instance();
	}
	public void Sign_New() {
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
		Users u = new Users(name,pass,email);
		db.Add_user(u);
		System.out.println("Successfully Added!");
	}
	public boolean authentication(String mail) {
		for(int i = 0;i<db.users.size();i++){
			if(db.users.get(i).email.equals(mail)){
				return true;
				}
			}
		return false;
	}

}

