package controller;


import java.util.HashMap;
import java.util.Scanner;

import view.PalavraView;


public class PalavraController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<>();
		Integer menuOpcaoPrincipal;
		Integer id = 0;
		String palavra;
		Integer keyGet;
		PalavraView palavraView = new PalavraView();

		do {
			palavraView.menuPalavra();
			menuOpcaoPrincipal = sc.nextInt();

			if(menuOpcaoPrincipal == 1) {
				Integer adcOutra;
				do {
					palavraView.menuOpcao1AdicionarPalavra();
					palavra = sc.next();

					palavraView.mensagemDeSucesso();
					id++;
					map.put(id, palavra);

					palavraView.opcaoRepetirAcao();
					adcOutra = sc.nextInt();

				} while(adcOutra != 2);
			}

			else if(menuOpcaoPrincipal == 2) {
				palavraView.menuOpcao2ListarPalavra(map);
			}

			else if(menuOpcaoPrincipal == 3) {
				palavraView.menuOpcao2ListarPalavra(map);
				palavraView.menuOpcao3AlterarPalavra();
				keyGet = sc.nextInt();

				palavraView.mensagemCerteza();
				Integer alterar = sc.nextInt();

				if(alterar == 1) {
					palavraView.menuOpcao3AlterarPalavraDigitarNovaPalavra();
					String palavraNova = sc.next();

					palavraView.mensagemDeSucesso();
					map.replace(keyGet, map.get(keyGet), palavraNova);
				}
			}

			else if(menuOpcaoPrincipal == 4) {
				palavraView.menuOpcao4RemoverPalavra();
				keyGet = sc.nextInt();

				palavraView.mensagemCerteza();
				Integer remover = sc.nextInt();

				if(remover == 1) {
					palavraView.palavraRemovida(map);
					map.remove(keyGet);
				}
			}

			else {
				palavraView.escolhaOpcaoValida();
			}
		} while(menuOpcaoPrincipal != 6);
	}
}
