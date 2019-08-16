import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		Scanner sc = new Scanner(System.in);
		System.out.print("input email: ");
		String email = sc.next();
		if(email.matches(regex)) {
			System.out.print("valid email");
		}
		else {
			System.out.print("invalid email");
		}
	}
}
