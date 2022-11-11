package listaPalavras;


import java.util.HashMap;
import java.util.Scanner;

import view.PalavrasView;


public class Palavra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<>();
		Integer menuOpcaoPrincipal;
		Integer id = 1;
		String palavra;
		Integer keyGet;
		PalavrasView pView = new PalavrasView();

		do {
			pView.menuPalavra();
			menuOpcaoPrincipal = sc.nextInt();

			if(menuOpcaoPrincipal == 1) {
				Integer adcOutra;
				do {
					pView.menuPalavraOpcao1AdicionarPalavra();
					palavra = sc.next();

					pView.mensagemDeSucesso();
					id++;
					map.put(id, palavra);

					pView.opcaoRepetirAcao();
					adcOutra = sc.nextInt();

				} while(adcOutra != 2);
			}

			else if(menuOpcaoPrincipal == 2) {
				pView.menuPalavraOpcao2Listar();
			}

			else if(menuOpcaoPrincipal == 3) {
				pView.menuPalavraOpcao3Alterar();
				keyGet = sc.nextInt();

				pView.mostraPalavraSelecionada();

				pView.mensagemCertezaAlterar();
				Integer alterar = sc.nextInt();

				if(alterar == 1) {
					pView.menuOpcao3AlterarPalavraDigitarNovaPalavra();
					String palavraNova = sc.next();

					pView.mensagemDeSucesso();
					map.replace(keyGet, map.get(keyGet), palavraNova);
				}
			}

			else if(menuOpcaoPrincipal == 4) {
				pView.menuPalavraOpcao4Remover();
				keyGet = sc.nextInt();

				pView.mostraPalavraSelecionada();

				pView.mensagemCertezaAlterar();
				Integer remover = sc.nextInt();

				if(remover == 1) {
					pView.palavraRemovida();
					map.remove(keyGet);
				}
			}

		} while(menuOpcaoPrincipal != 5);
	}
}
