package FawarySystem;

public class WalletPayment implements IPayment {
    public DataBase db = DataBase.Get_Instance();
	public boolean pay(String email, int amount) {
		for(int i = 0 ; i<db.users.size();i++){
			if(db.users.get(i).email.equals(email)){
				db.users.get(i).obj.delete_amount((double)amount);
				System.out.println(db.users.get(i).obj.Balance_amount);
				return true; 
			}
		}
		return false;
	}

}
