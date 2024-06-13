package iphone.apps.telefone;

public class AppTelefone implements AparelhoTelefonico {

	// Funcionalidades do AparelhoTelefonico
	@Override
	public void ligar(String numero) {
		System.out.println("Discando para o número: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz.");
		
	}

}
