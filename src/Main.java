import java.util.Scanner;
import java.util.Locale;

public class Main{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE ");
		System.out.println("---------------------------------- ");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO  ");
		
		double valorCompra,scoreC = 0,volumeCompras = 0, scoreIna = 0, scorePag = 0 , fim;
		int compra, atrasos ;
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
		System.out.println();
		
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
		
		
		System.out.println();
		System.out.println();
		
		if(compra == 0 || atrasos > 0) {
			scoreIna = 0;
			System.out.println("Score de inadimplência = " + scoreIna ); 			
		}
		else {
			if(compra > 0 && atrasos >= 1 ) {
				scoreIna = 15;
				System.out.println("Score de inadimplência = " + scoreIna);
				
			}
			else {
				if(compra > 0 && atrasos== 0 ) {
					scoreIna = 30;
					System.out.println("Score de inadimplência = " + scoreIna);
				}
			}
		}
		
		
		
		
		if((modoPag == 'D' || modoPag == 'd') && compra > 0 ) {
			scorePag = 5;
			System.out.println("Score de pagamento = " + scorePag);
		}
		else {
			if(compra > 0 && ((modoPag == 'C' || modoPag == 'c')|| (modoPag == 'B' || modoPag == 'b'))) {
				scorePag = 10;
				System.out.println("Score de pagamento = " + scorePag);
			}
		}
		
		System.out.println();
		System.out.println();
		
		fim = scorePag + scoreIna + scoreC;
		
		if(fim == 25 || fim == 0 ) {
			System.out.println("Classificação final = CLIENTE BRONZE ");			
		}
		if(fim > 25 && fim <=75) {
			System.out.println("Classificação final = CLIENTE PRATA ");	
		}
		if(fim > 75) {
			System.out.println("Classificação final = CLIENTE OURO ");	
		}
		
		
		sc.close();
	}
	
}


