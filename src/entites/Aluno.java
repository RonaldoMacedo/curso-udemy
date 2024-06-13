package entites;

public class Aluno {
	
	public String nome;
	public double n1, n2, n3;
	
	public double notaFinal() {
		return n1 + n2 + n3;
	}
	
	public void teste(double nota) {
		if(notaFinal() >= 60.0) {
			System.out.println("PASS");
		}else {
			nota = 60.0 - nota;
			System.out.println("FAILED");
			System.out.println("Missing " + String.format("%.2f", nota) + " points");
		}
	}
	
	public String toString() {
		return String.format("%.2f", notaFinal());
	}

}
