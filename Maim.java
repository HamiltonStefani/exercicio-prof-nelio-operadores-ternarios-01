package exercicioternario;

import java.util.Locale;
import java.util.Scanner;

public class Maim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner hs = new Scanner(System.in);
		
		/*double preco = 10;
		double desconto;
		
		if(preco < 20.0) {
			desconto = preco * 0.1;
		}else {
			desconto = preco * 0.05;
		}
		System.out.println(desconto);*/
		
		double preco;  
		double desconto;
		System.out.println("Digite o preço: ");
		preco = hs.nextDouble();
		desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		hs.close();

	}

}
