package usuario;

import iphone.IPhone;
import iphone.apps.musica.ReprodutorMusical;
import iphone.apps.navegador.NavegadorInternet;
import iphone.apps.telefone.AppTelefone;

public class Usuario {
	public static void main(String[] args) {
		IPhone iPhone = new IPhone();
		
		ReprodutorMusical appMusica = iPhone.abrirAppMusica();
		appMusica.selecionarMusica("Sunwoojunga - Run With Me");
		appMusica.tocar();
		appMusica.pausar();
		
		NavegadorInternet appNavegador = iPhone.abrirAppNavegador();
		appNavegador.adicionarNovaAba();
		appNavegador.exibirPagina("www.google.com");
		appNavegador.atualizarPagina();
		
		AppTelefone appTelefone = iPhone.abrirAppTelefone();
		appTelefone.ligar("(82)99999-8888");
		appTelefone.iniciarCorreioVoz();
		appTelefone.atender();
		
	}
}
