import java.util.Scanner;
import java.util.Locale;

public class Main{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE ");
		System.out.println("---------------------------------- ");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO  ");
		
		double valorCompra,scoreC = 0,volumeCompras = 0;
		int compra, atrasos;
		char modoPag;
		System.out.println();
		System.out.println("Quantas compras o cliente fez no �ltimo ano? ");
		compra = sc.nextInt();
		System.out.println("Qual o ticket m�dio?");
		valorCompra = sc.nextDouble();
		
		System.out.println("Quantas vezes o cliente atrasou o pagamento?");
		atrasos = sc.nextInt();
		System.out.println("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)?");
		modoPag = sc.next().charAt(0);
		
		if(valorCompra== 0) {
			System.out.println("Score de volume de compras = " + scoreC);
					
		}
		else {
			if(valorCompra > 0 && valorCompra < 3000) {
				scoreC = 20;
				System.out.println("Score de volume de compras = " + scoreC);
			}
			else {
				if(valorCompra <= 3000 && compra > 2) {
					scoreC = 40 ;
					System.out.println("Score de volume de compras = " + scoreC);
				}
				else {
					if(valorCompra > 3000) {
						scoreC = 60;
						System.out.println("Score de volume de compras = " + scoreC);
					}
					
				}
			}
		}
		sc.close();
	}
	
}


