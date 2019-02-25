import static org.junit.Assert.assertEquals;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastrarProponenteDigitizacaoSemCpf {
	public String mensagem = "CPF obrigatorio";
	ProponenteService proponenteService;
	private ProponenteDigital proponente;

	@Dado("^que acesso o digitizaco$")
	public void queAcessoODigitizaco() throws Throwable {
		proponenteService = new ProponenteService();
	}

	@Quando("^eu cadastro um proponente$")
	public void euCadastroUmProponente() throws Throwable {
		proponente = new ProponenteDigital();
	}

	@Quando("^nao informo o cpf$")
	public void naoInformoOCpf() throws Throwable {
		proponente.setCpf(null);
	}

	@Entao("^a seguinte mensagem devera ser exibida: \"([^\"]*)\"$")

	public void aSeguinteMensagemDeveraSerExibida(String arg1) throws Throwable {
		try {
			proponenteService.enviar(proponente);

		} catch (Exception e) {
			assertEquals(mensagem, e.getMessage());

		}

	}
}
