package FawarySystem;

import java.util.ArrayList;
import java.util.List;

public class DataBase{
	public List <Users> users=new ArrayList<Users>(); 
	public Admins [] admins ={
		new Admins("ibrahim","123456","ibrahim10@gmail.com"),
		new Admins("ballo","0123456","ballo@gmail.com")
	};
	private static DataBase instance = null;
	private DataBase(){}
	public static DataBase Get_Instance(){
		synchronized(DataBase.class){
			if(instance == null){
				instance = new DataBase();
			}
		}
		return instance;
	}
	public void Add_user(Users obj){
		users.add(obj);
	}
}