package FawarySystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import Person.*;

@org.springframework.stereotype.Service
@Scope("singleton")
public class DataBase{
	private static DataBase instance = null;
	public List <Users> users=new ArrayList<Users>(); 
	public Admins [] admins ={
		new Admins("ibrahim","123456","ibrahim10@gmail.com"),
		new Admins("ballo","123456","ballo@gmail.com")
	};
	private DataBase(){}
	public static DataBase Get_Instance(){
		synchronized(DataBase.class){
			if(instance == null){
				instance = new DataBase();
			}
		}
		return instance;
	}
	public void addUser(Users obj){
		users.add(obj);
	}

	public Admins loginAdmin(Person admin) {
		
		for(int i = 0;i<admins.length;i++){
			if(admins[i].email.equals(admin.email)){
				if(admins[i].password.equals(admin.password)){
					return admins[i];
				}
			}
		}
		
		return null;
	}

	public Users loginUser(Person user) {
		for(int i = 0;i<users.size();i++){
			if(users.get(i).email.equals(user.email)){
				if(users.get(i).password.equals(user.password)){
					return users.get(i);
				}
			}
		}
		return null;
	}

	public Users signUP(Person p) {
		
		if(authentication(p.email)){
			return null;
		}
		Users newUser = new Users(p.username,p.password,p.email);
		addUser(newUser);
		
		return newUser;
	}
	
	public boolean authentication(String email) {
		for(int i = 0;i<users.size();i++){
			if(users.get(i).email.equals(email)){
				return true;
			}
		}
		return false;
	}
	public Users getUser (String mail){
		for(int i = 0;i<users.size();i++){
			if(users.get(i).email.equals(mail)){
				return users.get(i);

			}
		}
		return null;
	}
}