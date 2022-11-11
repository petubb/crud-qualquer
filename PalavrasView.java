package view;

import java.util.HashMap;

import controller.PalavraController;

public class PalavraView {

	PalavraController p = new PalavraController();
	HashMap<Integer, String> map = new HashMap<>();
	Integer keyGet;
	Integer menuOpcaoPrincipal;
	Integer id = 1;
	String palavra;

	public void menuPalavra() {
		System.out.println("O QUE DESEJA FAZER");
		System.out.println("1 - Inserir uma nova palavra");
		System.out.println("2 - Listar palavras");
		System.out.println("3 - Alterar uma palavra");
		System.out.println("4 - Remover uma palavra");
		System.out.println("5 - encerrar");
	}

	public void menuOpcao1AdicionarPalavra() {
		System.out.println("digite a palavra que deseja adicionar:");
	}

	public void menuOpcao2ListarPalavra(HashMap<Integer, String> map)  {
		System.out.println("==============");
		for (Integer key : map.keySet()) {

			String value = map.get(key);
			System.out.println(key + " = " + value);	
		}
		System.out.println("==============");

	}

	public void menuOpcao3AlterarPalavra() {
		System.out.println("Digite o Id da palavra que vc quer alterar");	
	}

	public void menuOpcao3AlterarPalavraDigitarNovaPalavra() {
		System.out.println("digite a nova palavra:");
	}

	public void menuOpcao4RemoverPalavra() {
		System.out.println("Digite o Id da palavra que vc quer remover");
	}

	public void mensagemDeSucesso() {
		System.out.println("acao realizada com sucesso!");
		System.out.println("");
	}

	public void mensagemCerteza() {
		System.out.println("certeza que deseja fazer isso?");
		System.out.println("1 - sim");
		System.out.println("2 - não");
	}

	public void opcaoRepetirAcao() {
		System.out.println("adiciona outra?");
		System.out.println("1 - sim");
		System.out.println("2 - nao");
	}

	public void palavraRemovida(HashMap<Integer, String> map) {
		System.out.println("palavra " + map.get(keyGet) + " removida");
	}

	public void escolhaOpcaoValida() {
		System.err.println("escolha uma opcao valida");
	}
}
