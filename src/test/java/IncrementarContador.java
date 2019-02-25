import static org.junit.Assert.assertEquals;

import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class IncrementarContador {

	private int contador = 15;

	@Dado("^que o valor do contador e (\\d+)$")
	public void queOValorDoContador(int arg1) throws Throwable {
		contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
		contador = contador + arg1;
	}

	@Entao("^o valor do contador sera (\\d+)$")
	public void oValorDoContadorSer(int arg1) throws Throwable {
		System.out.println(arg1);
		System.out.println(contador);
		assertEquals(arg1, contador);
	}

}
