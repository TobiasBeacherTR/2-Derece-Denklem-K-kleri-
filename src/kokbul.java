import java.util.Scanner;
public class kokbul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("2 bilinmeyenli denklem �u �ekildedir : \n"
				+ "Ax^2+Bx+C \n");
		System.out.print("A say�s�n giriniz : ");
		double a=scanner.nextInt();
		System.out.print("B say�s�n� giriniz : ");
		double b=scanner.nextInt();
		System.out.print("C say�s�n� giriniz : ");
		double c=scanner.nextInt();
		
		double delta=(Math.pow(b, 2))-4*a*c;
		
		if(delta>0) {
			double k1=((-b)-Math.sqrt(delta))/2*a;
			double k2=((-b)+Math.sqrt(delta))/2*a;
			System.out.println("Denklemin k�kleri : \n"
					+ "x1= " + k1 + "\nx2= " + k2);
		}
		else if(delta==0) {
			double k=-b/2*a;
			System.out.println("Denklemin k�k� : " + k);
		}
		else {
			System.out.println("Ger�ek say�larla ifade edilebilen k�k yoktur.");
		}

	}

}
