package listaPalavras;


import java.util.HashMap;
import java.util.Scanner;

import view.PalavrasView;


public class Palavra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<>();
		Integer menuOpcaoPrincipal;
		Integer id = 0;
		String palavra;
		Integer keyGet;
		PalavrasView pView = new PalavrasView();

		do {
			pView.menuPalavra();
			menuOpcaoPrincipal = sc.nextInt();

			if(menuOpcaoPrincipal == 1) {
				Integer adcOutra;
				do {
					pView.menuPalavraAdicionarPalavraOpcao1();
					palavra = sc.next();

					pView.mensagemDeSucesso();
					id++;
					map.put(id, palavra);

					pView.opcaoRepetirAcao();
					adcOutra = sc.nextInt();

				} while(adcOutra != 2);
			}

			else if(menuOpcaoPrincipal == 2) {
				pView.menuPalavraListarOpcao2(map);
			}

			else if(menuOpcaoPrincipal == 3) {
				pView.menuPalavraAlterarOpcao3();
				keyGet = sc.nextInt();

				pView.mostraPalavraSelecionada(map);

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
				pView.menuPalavraRemoverOpcao4();
				keyGet = sc.nextInt();

				pView.mostraPalavraSelecionada(map);

				pView.mensagemCertezaAlterar();
				Integer remover = sc.nextInt();

				if(remover == 1) {
					pView.palavraRemovida(map);
					map.remove(keyGet);
				}
			}

			else {
				pView.escolhaOpcaoValida();
			}
		} while(menuOpcaoPrincipal != 5);
	}
}
