package algumaaula;

public class Exercicios {

	public static void main(String[] args) {
		//Exercicio 1
		double raio = 12;
		float pi = (float) 3.1415;
		double area = 0;
		area = (raio*raio)*pi;
		//a parte acima serve apenas para deixar o numero inteiro
		int r = (int) area;
		System.out.println(r);
		
		//Exercicio 2
		System.out.println(99%4);
		//Exercicio 3
		System.out.println(2*0.5);
		int h = 0;
		int nm = 10;
		//Exercicio 4		
		h = nm;
		nm = 0;
		for(int i=1; i<=8;i++)
			nm = nm + h;
		
		System.out.println(nm);
		
	}

}