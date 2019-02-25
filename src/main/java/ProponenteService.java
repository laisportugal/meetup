public class ProponenteService {

	public ProponenteDigital enviar(ProponenteDigital proponente) throws Exception  {
		if (proponente.getCpf() == null) {
			throw new Exception("CPF obrigatorio");
		
		}
		return proponente;

	}
}
