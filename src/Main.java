import java.util.Scanner;
import java.util.Locale;

public class Main{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE ");
		System.out.println("---------------------------------- ");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO  ");
		
		double valorCompra;
		int compra, atrasos;
		char modoPag;
		System.out.println();
		System.out.println("Quantas compras o cliente fez no último ano? ");
		compra = sc.nextInt();
		System.out.println("Qual o ticket médio?");
		valorCompra = sc.nextDouble();
		
		System.out.println("Quantas vezes o cliente atrasou o pagamento?");
		atrasos = sc.nextInt();
		System.out.println("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)?");
		modoPag = sc.next().charAt(0);
		
		
		sc.close();
	}
	
}


