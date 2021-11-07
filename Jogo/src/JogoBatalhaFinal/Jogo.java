package JogoBatalhaFinal;

public class Jogo {
	private String nivelDeDificuldade;
	private String classeDeCombate;
	private String motivacao;
	private Double modificador;
	private String seguirDesistir;
	private String acao; // Andando - Correndo - Saltando
	private String pegarArmadura;
	private String beberOuNaoBeber;
	private String atacaOuEspera;

	public Jogo(String nivelEscolhido) {
		this.nivelDeDificuldade = nivelEscolhido.toUpperCase();
		setModificador(nivelDeDificuldade);
	}

	public void setModificador(String nivelDeDificuldade) {
		if (nivelDeDificuldade.equals("FACIL")) {
			this.modificador = 0.8;
		} else if (nivelDeDificuldade.equals("NORMAL")) {
			this.modificador = 1.0;
		} else if (nivelDeDificuldade.equals("DIFICIL")) {
			this.modificador = 1.2;
		}
	}

	public String getNivelDeDificuldade() {
		return this.nivelDeDificuldade.toUpperCase();
	}

	public String getIntroducao() {
		return ("\r\n"
				+ "A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão. "
				+ "\r\n"
				+ "Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre."
				+ "\r\n"
				+ "Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno. "
				+ "\r\n"
				+ "Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre esse mal."
				+ "\r\n" + "Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui." + "\r\n");
	}

	public void setMotivacao(String motivacao) {
		this.motivacao = motivacao.toUpperCase();
	}

	public String getTexto1Motivacao() {
		if (this.motivacao.equals("VINGANÇA")) {
			return ("\r\n"
					+ "Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar para lembrar, pois essas memórias estão sempre presentes, "
					+ "\r\n"
					+ "mesmo que de pano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível que te fizeram chegar até aqui. "
					+ "\r\n"
					+ "E você sabe que não irá desistir até ter vingado a morte daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. "
					+ "\r\n"
					+ "O maldito líder finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).");
		} else {
			return ("Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos, bardos criando canções sobre seus feitos heróicos, "
					+ "\r\n"
					+ "nobres te presenteando com jóias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde já, você sente "
					+ "\r\n"
					+ "o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir o vilão que tanto assombrou a paz de todos. Porém, você sabe que "
					+ "\r\n"
					+ "ainda falta o último ato dessa história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.");
		}
	}

	public String getTextoSeguirDesistir() {
		return ("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas mãos formigarem em volta da sua arma. "
				+ "\r\n" + "Você a segura com firmeza. Seu foco está renovado. Você avança pelo portal.\r\n" + "\r\n"
				+ "A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua frente, só é possível perceber que "
				+ "\r\n" + "você se encontra em um corredor extenso. Você só pode ir à frente, ou desistir.\r\n" + "");
	}

	public String setSeguirDesistir(String acao) {
		this.seguirDesistir = acao.toUpperCase();
		if (this.seguirDesistir.equals("DESISTIR")) {
			return ("o medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta para a noite lá fora e corre em direção à segurança.");
		} else {
			return ("você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma fonte de luz, que você imagina ser a chama de "
					+ "uma tocha, vindo de dentro de uma porta aberta.\r\n" + "\r\n"
					+ "Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.\r\n"
					+ "\r\n" + "[andando cuidadosamente, correndo, saltando]\r\n" + "");
		}
	}

	public String setSaltandoAndandoCorrendo(String acao) {
		this.acao = acao.toUpperCase();
		if (this.acao.equals("ANDANDO")) {
			return ("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, "
					+ "\r\n"
					+ "como se tivesse pisado em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor. "
					+ "\r\n"
					+ "Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.");
		} else if (this.acao.equals("CORRENDO")) {
			return ("Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas não dá muita importância "
					+ "\r\n"
					+ "e segue para dentro da sala, olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você, "
					+ "\r\n"
					+ "e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha "
					+ "\r\n"
					+ "aberta no teto, mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");
		} else {
			return ("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
		}
	}

	public String getTextoPortaDireita() {
		return ("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela pela qual você entrou, que estava aberta, "
				+ "\r\n"
				+ "e as outras três estão fechadas. A porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler, "
				+ "\r\n"
				+ "mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima da porta e percebe que ela está trancada por duas fechaduras "
				+ "\r\n"
				+ "douradas, e você entende que precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o líder.\r\n"
				+ "\r\n" + "Você se dirige para a porta à direita.\r\n" + "\r\n"
				+ "PORTA DIREITA: Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, "
				+ "\r\n"
				+ "enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha pendurados nas paredes "
				+ "\r\n"
				+ "e dispostos em armários e mesas. Você imagina que este seja o arsenal do inimigo, onde estão guardados os equipamentos que seus soldados utilizam "
				+ "\r\n" + "quando saem para espalhar o terror nas cidades e vilas da região.\r\n" + "\r\n"
				+ "Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás. Ali, de pé entre você e a porta fechada, "
				+ "\r\n"
				+ "bloqueando o caminho do seu destino, está um dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em posição de "
				+ "\r\n" + "combate. Ele avança em sua direção.\r\n" + "");
	}

	public String getTextoPegarOuNaoArmadura() {
		return ("Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha em volta, encarando todas aquelas peças de armaduras "
				+ "\r\n" + "resistentes e em ótimo estado.\r\n" + "você escolhe [pegar ou não] as armaduras novas?\r\n"
				+ "");
	}

	public String setPegarOuNaoPegar(String pegarOuNaoPegar) {
		this.pegarArmadura = pegarOuNaoPegar.toUpperCase();
		if (this.pegarArmadura.equals("PEGAR")) {
			return ("Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de "
					+ "\r\n"
					+ "armaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios à sua frente.");
		} else {
			return ("Você decide que não precisa utilizar nada que venha das mãos do inimigo.");
		}
	}

	public String getTextoPortaEsquerda() {
		return ("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do líder inimigo. Você pega a chave e guarda "
				+ "\r\n" + "numa pequena bolsa que leva presa ao cinto.\r\n" + "\r\n"
				+ "PORTA ESQUERDA: Você retorna à sala anterior e se dirige à porta da esquerda. Você se aproxima, tentando ouvir o que acontece porta adentro, "
				+ "\r\n"
				+ "mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala "
				+ "\r\n"
				+ "parecida com a do arsenal, mas em vez de armaduras, existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas, "
				+ "\r\n"
				+ "e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos soldados "
				+ "\r\n" + "para aterrorizar a região.\r\n" + "\r\n"
				+ "No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque horrendo, de armadura, cajado em punho, em posição de combate."
				+ "Ele avança em sua direção.\r\n" + "");
	}

	public String getTextoDaPocao() {
		return ("Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo. Em uma mesa, você reconhece uma pequena garrafa"
				+ "\r\n"
				+ " de vidro contendo um líquido levemente rosado, pega a garrafa e pondera se deve beber um gole."
				+ "\r\n" + "você escolhe [beber ou não] a poção?\r\n" + "");
	}

	public String setBeberOuNaoBeber(String beberOuNaoBeber) {
		this.beberOuNaoBeber = beberOuNaoBeber.toUpperCase();
		if (this.beberOuNaoBeber.equals("BEBER")) {
			return ("Você se sente revigorado para seguir adiante!");
		} else {
			return ("Você fica receoso de beber algo produzido pelo inimigo");
		}
	}

	public String getTextoDaPortaFinal() {
		return ("Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra fechadura da porta do líder inimigo. "
				+ "\r\n" + "Você pega a chave e guarda na pequena bolsa que leva presa ao cinto.\r\n" + "\r\n"
				+ "De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a porta se abre. Seu coração acelera, memórias "
				+ "\r\n"
				+ "de toda a sua vida passam pela sua mente, e você percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, "
				+ "\r\n" + "foca no combate que você sabe que irá se seguir, e adentra a porta.\r\n" + "\r\n"
				+ "Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados às paredes.\r\n"
				+ "\r\n"
				+ "Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.\r\n"
				+ "\r\n" + "você deseja [ataca ou espera]?\r\n" + "");
	}

	public String setAtacaOuEspera(String atacaOuEspera) {
		this.atacaOuEspera = atacaOuEspera.toUpperCase();
		if (this.atacaOuEspera.equals("ATACA")) {
			return ("Ataca");
		} else {
			return ("Espera");
		}
	}

	public String getMensagemVitoria() {
		if (this.motivacao.equals("VINGANCA")) {
			return ("Você conseguiu!" + "\r\n"
					+ "Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de alívio e felicidade. "
					+ "\r\n" + "Você se vingou, tudo que sempre quis, está feito. Agora você pode seguir sua vida.");
		} else {
			return ("Você conseguiu!" + "\r\n"
					+ "O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. "
					+ "\r\n" + "A glória o aguarda, você a conquistou.");
		}
	}

	public String getMensagemTextoFinal() {
		return ("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em direção à noite, retornando à cidade. "
				+ "\r\n" + "Seu dever está cumprido.\r\n" + "\r\n" + "FIM\r\n" + "");
	}

	public void Combate(Personagem heroi, Personagem vilao) {

		System.out.println("Pontos de Vida do Heroi: " + heroi.getEnergia());
		System.out.println("Pontos de Vida do Vilao: " + vilao.getEnergia());

		if ((vilao.getEnergia() > 0) && (heroi.getEnergia() > 0)) {
			// heroi ataca
			int pontos = heroi.setAtaca(heroi);
			vilao.setAtualizaEnergia(pontos);

			System.out.println("Pontos de Vida do Heroi: " + heroi.getEnergia());
			System.out.println("Pontos de Vida do Vilao: " + vilao.getEnergia());

			if (vilao.getEnergia() > 0) {
				// vilao ataca
				pontos = vilao.setAtaca(vilao);
				heroi.setAtualizaEnergia(pontos);
			} else {
				System.out.println("Inimigo derrotado!");
			}
		}

	}

}