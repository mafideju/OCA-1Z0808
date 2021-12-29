package H_exception.custom;

public class Validar {

	private Validar() {}
	
	public static void aluno(Aluno aluno) throws Throwable {
		if(aluno == null) {
			throw new IllegalArgumentException("Aluno Nulo!!!");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVazia("nome");
		}
		
		if (aluno.nota < 0.0) {
			throw new RuntimeNonCheckedExceptionNegativeNumber("nota");
		}
	}
}
