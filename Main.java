
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome = "Igor Almeida";
		String endereco = "Salvador BA";
		int idade = 37;
		
		int x =10, y = 20, z = 30;
		
		int h = 2,i = 5,j = 10;
		
		System.out.println(nome);
		
		System.out.println(endereco);
		
		System.out.println(idade);
		
		System.out.println(x + y + z);
		
		System.out.println(h);

		float n = 5.3f;

		System.out.println(n);

		double numeroNovo = 3.5;

		System.out.println(numeroNovo);

		numeroNovo = 5;

		System.out.println(numeroNovo);

		Scanner nomeDoUsuario = new Scanner(System.in);

		System.out.println("Entre com o nome");

		String nomePessoa = nomeDoUsuario.nextLine();

		System.out.println("O nome do usuário é: " + nomePessoa);
	}

}
