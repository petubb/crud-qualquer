package HHasH;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	private static	HashMap<Integer, String> map = new HashMap<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palavra;
		Integer id = 0;
		Integer opcPrincipal;
		Integer keyPesquisar = null;

		do {
			System.out.println();
			System.out.println("O QUE DESEJA FAZER");
			System.out.println("1 - Inserir uma nova palavra");
			System.out.println("2 - Listar palavras");
			System.out.println("3 - Procurar por uma palavra");
			System.out.println("4 - Alterar uma palavra");
			System.out.println("5 - Remover uma palavra");
			System.out.println("6 - Encerrar");
			opcPrincipal = sc.nextInt();

			if(opcPrincipal == 1) {
				Integer refaz;

				do {
					System.out.println("digite a palavra que deseja adicionar:");
					palavra = sc.next();
					id = id + 1;
					map.put(id, palavra);

					System.out.println();
					System.out.println("Adicionar outra palavra?");
					System.out.println("1 - Sim");
					System.out.println("2 - Nao");
					refaz = sc.nextInt();
				} while(refaz != 2 && refaz == 1); 
			}

			else if (opcPrincipal == 2) {
				listar();

			}

			else if (opcPrincipal == 3) {
				System.out.println("Digite o id da palavra que deseja procurar");
				keyPesquisar = sc.nextInt();

				if ( map.containsKey( keyPesquisar ) ) {
					System.out.println("Palavra "+keyPesquisar+
							" = "+map.get(keyPesquisar));
				}

				else{
					System.err.println("Chave não existe");
					System.out.println();
				}
			}

			else if (opcPrincipal == 4) {
				listar();
				System.out.println("digite o id da palavra que deseja alterar");
				if ( map.containsKey( keyPesquisar ) ) {

					keyPesquisar = sc.nextInt();

					System.out.println(keyPesquisar+
							": "+map.get(keyPesquisar));
					System.out.println("digite a nova palavra:");
					String novaP = sc.next();

					System.out.println("");
					System.out.println("Certeza que deseja alterar essa palavra?");
					System.out.println("1 - Sim");
					System.out.println("2 - Nao");
					Integer alterar = sc.nextInt();

					if (alterar == 1) {
						System.out.println("Palavra '"+ map.get(keyPesquisar) + "' alterada para '"+ novaP +"'");						
						map.replace(keyPesquisar, novaP);
					}
				}

				else{
					System.err.println("esse Id não existe");
				}
			}

			else if(opcPrincipal == 5) {
				listar();
				System.out.println("digite o id da palavra que deseja remover");
				Integer idRemove = sc.nextInt();

				System.out.println("Deseja realmente REMOVER essa palavra permanentemente?");
				System.out.println("1 - Sim");
				System.out.println("2 - Nao");
				System.out.println();
				Integer certeza = sc.nextInt();
				if (certeza == 1) {
					map.remove(idRemove);
					System.out.println("palavra removida");
				}
				else if(certeza == 2 && certeza < 3) {
				}
			}

			else if (opcPrincipal < 0 || opcPrincipal > 6) {
				System.err.println("selecione uma opcao valida");
			}
		} while(opcPrincipal != 6);
	}

	public static void listar() {
		System.out.println("=============");
		for(Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key +" = "+ value);
		} System.out.println("=============");
	}
}