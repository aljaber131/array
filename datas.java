import java.util.Scanner;
public class Datas {
	public static int[] arry = {1,2,3,4,5,6,7,8,9};



	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		System.out.println("give your number");
		int b = t.nextInt();
		searching(b);
	}
	public static void searching (int a) {
		int i;
		for(i=0;i<9;i++ ) {
			if(arry[i]==a) {
		      System.out.println("found");
		      break;
			}
			else {
				continue;
				
			}
			
		}
	}
}
