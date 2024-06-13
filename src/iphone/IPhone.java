package iphone;

import iphone.apps.musica.AppMusica;
import iphone.apps.navegador.AppNavegador;
import iphone.apps.telefone.AppTelefone;

public class IPhone {
	
	public AppMusica abrirAppMusica() {
		AppMusica musica = new AppMusica();
		System.out.println("O aplicativo Musica foi executado.");
		return musica;
	}
	
	public AppTelefone abrirAppTelefone() {
		AppTelefone telefone = new AppTelefone();
		System.out.println("O aplicativo Telefone foi executado.");
		return telefone;
	}
	
	public AppNavegador abrirAppNavegador() {
		AppNavegador navegador = new AppNavegador();
		System.out.println("O aplicativo Navegador foi executado.");
		return navegador;
	}
}