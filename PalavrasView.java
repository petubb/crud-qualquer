package view;

import java.util.HashMap;

import listaPalavras.Palavra;

public class PalavrasView {

	Palavra p = new Palavra();
	HashMap<Integer, String> map = new HashMap<>();
	Integer keyGet;
	Integer menuOpcaoPrincipal;
	Integer id = 1;
	String palavra;


	public void menuPalavra() {
		System.out.println("O QUE DESEJA FAZER");
		System.out.println("1 - Inserir um novo produto");
		System.out.println("2 - Listar produtos");
		System.out.println("3 - Alterar um produto");
		System.out.println("4 - Remover um produto");
		System.out.println("5 - encerrar");
	}

	public void menuPalavraOpcao1AdicionarPalavra() {
		System.out.println("digite a palavra que deseja adicionar:");
	}

	public void menuPalavraOpcao2Listar() {
		System.out.println("==============");
		for (Integer key : map.keySet()) {

			String value = map.get(key);
			System.out.println(key + " = " + value);	
		}
		System.out.println("==============");

	}

	public void menuPalavraOpcao3Alterar() {
		System.out.println("Digite o Id da palavra que vc quer alterar");	
	}

	public void menuOpcao3AlterarPalavraDigitarNovaPalavra() {
		System.out.println("digite a nova palavra:");
	}

	public void mostraPalavraSelecionada() {
		System.out.println(keyGet + " é a palavra: " + map.get(keyGet));
		System.out.println("");
	}

	public void menuPalavraOpcao4Remover() {
		System.out.println("Digite o Id da palavra que vc quer remover");
	}

	public void mensagemDeSucesso() {
		System.out.println("açao realizada com sucesso!");
	}

	public void mensagemCertezaAlterar() {
		System.out.println("certeza que deseja fazer isso?");
		System.out.println("1 - sim");
		System.out.println("2 - não");
	}

	public void opcaoRepetirAcao() {
		System.out.println("");
		System.out.println("adiciona outra?");
		System.out.println("1 - sim");
		System.out.println("2 - nao");
	}

	public void palavraRemovida() {
		System.out.println("palavra " + map.get(keyGet) + " removida");
	}
}
