package FawarySystem;

import java.util.ArrayList;
import java.util.List;


public class LoginAdmins implements ILogin {
	public DataBase db;
	public boolean flag;
	LoginAdmins(){
		db = DataBase.Get_Instance();
		flag = false;
	}
	public boolean login(String email,String pass) {
		for(int i = 0;i<db.admins.length;i++){
			if(db.admins[i].email.equals(email)){
				if(db.admins[i].password.equals(pass)){
					flag =true;
					System.out.println("logged successfully!");
					return flag;
				}
			}
		}
			return flag;
	}
}
