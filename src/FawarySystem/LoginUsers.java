package FawarySystem;

public class LoginUsers implements ILogin{
	public DataBase db;
	public boolean flag;
	LoginUsers(){
		db = DataBase.Get_Instance();
		flag = false;
	}

	public boolean login(String email, String pass) {
		for(int i = 0;i<db.users.size();i++){
			if(db.users.get(i).email.equals(email)){
				if(db.users.get(i).password.equals(pass)){
					flag = true;
					System.out.println("logged successfully!");
					return flag;
				}
			}
		}
		return flag;
	}

}
