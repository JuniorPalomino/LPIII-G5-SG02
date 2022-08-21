import java.util.Scanner;
public class Regalo {
	public static String elegir(int vida){
		String gift="";
		switch (vida) {
		case 1: gift= "Un pasaje al Caribe"; break;
		case 2: gift= "Una visita al museo mas cercano a tu casa"; break;
		case 3: gift= "Una entrada al cine";break;
		}
		return gift;
	}
	public static void main(String[] args) 
	{
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero del 1 al 3 que será su vida ");
		c=sc.nextInt();
		System.out.println("Su premio es: ");
		System.out.println(elegir(c));
		sc.close();
	}
	
}
