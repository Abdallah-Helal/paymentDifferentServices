package FawarySystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Person.Users;
import Providers.*;
import Services.*;

public class Transactions {
	public Map<String,Map<Integer,String>> trans = new HashMap <String,Map<Integer,String>>();
	public Map <Integer,Integer> map= new HashMap<Integer,Integer>();
	public void Add_Transaction(Users u,Service service){
		boolean x = true;
		if(trans.get(u.email) == null){
			x = false;
		}
		if(x == true){
			trans.get(u.email).put(Service.ID,service.provider.getName()+service.getName());
		}
		else{
			trans.put(u.email, new HashMap<Integer,String>());
			trans.get(u.email).put(Service.ID,service.provider.getName()+service.getName());
			
		}
		
        System.out.println("Transaction Added");

		
	}
	public void print(){
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
