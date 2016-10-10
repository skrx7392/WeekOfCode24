import java.util.*;

public class AppleAndOrange {
	
	public void appleAndOrange() {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = sc.nextInt();
		sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		String[] appleString = sc.nextLine().split(" ");
		String[] orangeString = sc.nextLine().split(" ");
		int appleCount = 0;
		int orangeCount = 0;
		for(String i:appleString) {
			if(Integer.parseInt(i)+a >=s && Integer.parseInt(i)+a <=t)
				appleCount++;
		}
		for(String i:orangeString) {
			if(Integer.parseInt(i)+b >=s && Integer.parseInt(i)+b<=t)
				orangeCount++;
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);
	}
}
