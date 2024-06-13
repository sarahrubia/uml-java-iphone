package iphone.apps.navegador;

public class AppNavegador implements NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("A página " + url + " foi aberta no navegador.");	
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Uma nova aba foi aberta.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página.");
	}
}
