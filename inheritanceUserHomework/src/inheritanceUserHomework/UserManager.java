package inheritanceUserHomework;

public class UserManager {
	
	public void list() {
		System.out.println("Listelendi");
	}
	
	public void add() {
		System.out.println("Eklendi");
	}
	
	public void login(User user) {
		System.out.println(user.id+" idsi olan kullanýcý giriþ yaptý.");
	}

}
