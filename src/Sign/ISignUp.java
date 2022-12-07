package Sign;

import Person.Person;
import Person.Users;

public interface ISignUp {
	public Users Sign_New();
	public boolean authentication(String email);

}
