import java.util.Scanner;
public class prime{
	public static boolean isprime(int n){
		if(n < 2)
			return false;
		if(n == 2)
			return true;
		if(n % 2 == 0)
			return false;
		for(int i =3;i * i <= n;i+=2)
			if(n % i == 0)
				return false;
		return true;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a number, I will tell you if it is a prime number");
			String s = scan.nextLine();
			while(!(s.matches("^\\d+$"))){
				System.err.println("please input a number. Do not input letters");
			s = scan.nextLine();
			}
			int num = Integer.parseInt(s);
			if(isprime(num))
				System.out.println(num+"is a prime");
			else
				System.out.println(num+"is not a prime");
	}
}
