package H_exception.custom;

public class MainClass {

	public static void main(String[] args) throws Throwable {

		try {
			Aluno aluno = new Aluno(" c", 1);
			Validar.aluno(aluno);
			System.out.println("Aluno validado");
		} catch (StringVazia e) {
			System.out.println(e.getMessage());
		} catch (RuntimeNonCheckedExceptionNegativeNumber e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Operação concluida !!!");
		}
		
	}

}
