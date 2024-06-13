package iphone.apps.musica;

public class AppMusica implements ReprodutorMusical {

	// Funcionalidades do ReprodutorMusical
	@Override
	public void tocar() {
		System.out.println("Tocando música.");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música.");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música " + musica + " para tocar.");	
	}
}
