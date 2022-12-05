package FawarySystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Providers.*;
import Services.*;

public class Transactions {
	public DataBase db = DataBase.Get_Instance();
	public Transactions(){
	}
	public Map<String,Map<Integer,String>> trans = new HashMap <String,Map<Integer,String>>(); 
	public void Add_Transaction(String email,int id,String name){
		boolean x = true;
			if(trans.get(email) == null){
				x = false;
			}
		if(x == true){
//		trans.put(email, new HashMap<Integer,String>());
		trans.get(email).put(id, name);
		}
		else{
			trans.put(email, new HashMap<Integer,String>());
			trans.get(email).put(id, name);
		}
		
        System.out.println("Transaction Added");

		
	}
	public void search(){
		for (Entry<String, Map<Integer, String>> letterEntry : trans.entrySet()) {
		    String letter = letterEntry.getKey();
		    for (Map.Entry<Integer,String> nameEntry : letterEntry.getValue().entrySet()) {
		        int num = nameEntry.getKey();
		        String str = nameEntry.getValue();
		        System.out.println(num+"-"+str);
		    }
		}
	}

}
