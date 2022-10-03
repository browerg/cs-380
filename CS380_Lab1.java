package packagetest;
import java.util.*;

public class CS380_Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Type a string: ");
		String main = s.next();
		String reverse;
		
		StringBuilder str = new StringBuilder();
		
		str.append(main);
		
		str = str.reverse();
		
		System.out.print(str);
		
		
		}
	}


