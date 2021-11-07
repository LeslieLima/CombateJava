package JogoBatalhaFinal;

import java.util.Scanner;

public class BatalhaFinal {

	public static void main(String[] args) {

		System.out.println("Seja bem vindo(a) � BATALHA FINAL!");
		System.out.println();

		System.out.println("Escolha do n�vel de dificuldade: (Facil/Normal/Dif�cil)");
		String nivelDeDificuldade = new Scanner(System.in).nextLine();
		Jogo jogo = new Jogo(nivelDeDificuldade);

		System.out.println("Escolha o nome");
		String nome = new Scanner(System.in).nextLine();

		System.out.println("Escolha o sexo");
		String sexo = new Scanner(System.in).nextLine();

		System.out.println("Qual personagem deseja escolher?");
		for (Classe c : Classe.values()) {
			System.out.println(c);
		}

		String classe = new Scanner(System.in).nextLine();
		Personagem heroi = new Personagem(nome, sexo, classe, 10);
		heroi.setArma(classe);
		heroi.setEnergia(300);

		System.out.println(jogo.getIntroducao());

		System.out.println("Escolha sua motiva��o para invadir a caverna do inimigo e derrot�-lo: VINGAN�A, GL�RIA");
		String motivacao = new Scanner(System.in).nextLine();
		jogo.setMotivacao(motivacao);

		System.out.println(jogo.getTexto1Motivacao());

		System.out.println(jogo.getTextoSeguirDesistir());
		String seguirDesistir = new Scanner(System.in).nextLine();
		System.out.println(seguirDesistir.toUpperCase());
		System.out.println(jogo.setSeguirDesistir(seguirDesistir));

		String saltandoAndandoCorrendo = new Scanner(System.in).nextLine();

		System.out.println(jogo.setSaltandoAndandoCorrendo(saltandoAndandoCorrendo));
		System.out.println(jogo.getTextoPortaDireita());

		Personagem vilao = new Personagem("Armeiro", "Espada", 140, 5);
		jogo.Combate(heroi, vilao);

		System.out.println(jogo.getTextoPegarOuNaoArmadura());
		String pegarOuNaoPegar = new Scanner(System.in).nextLine();
		System.out.println(jogo.setPegarOuNaoPegar(pegarOuNaoPegar));
		System.out.println(jogo.getTextoPortaEsquerda());

		Personagem vilao2 = new Personagem("Alquimista", "Cajado", 160, 5);
		jogo.Combate(heroi, vilao2);

		System.out.println(jogo.getTextoDaPocao());
		String beberOuNaoBeber = new Scanner(System.in).nextLine();
		System.out.println(jogo.setBeberOuNaoBeber(beberOuNaoBeber));

		System.out.println(jogo.getTextoDaPortaFinal());
		
		String atacaOuEspera = new Scanner(System.in).nextLine();
		System.out.println(jogo.setAtacaOuEspera(atacaOuEspera));

		Personagem vilao3 = new Personagem("Lider", "Martelo", 200, 5);
		jogo.Combate(heroi, vilao3);

		System.out.println(jogo.getMensagemVitoria());
		System.out.println(jogo.getMensagemTextoFinal());
		
	}
	
}
