package Payment;

import FawarySystem.*;
import Person.*;

public class WalletPayment implements IPayment {
    public DataBase db = DataBase.Get_Instance();
	public boolean pay(Users user, int amount) {
		for(int i = 0 ; i<db.users.size();i++){
			if(db.users.get(i).email.equals(user.email)){
				db.users.get(i).wallet.delete_amount((double)amount);
				System.out.println(db.users.get(i).wallet.Balance_amount);
				return true; 
			}
		}
		return false;
	}

}
