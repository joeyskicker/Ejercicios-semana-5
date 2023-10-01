package semana_05;

public class Arreglo {

	//  Atributo privado
	private int[] n = { 25, 27, 22, 24, 29, 20, 23 };
	//  Constructor
	public Arreglo() {
	}
	//  Operaciones públicas básicas
	public int tamanio() {
		return n.length;
	}
	public int obtener(int i) {
		return n[i];
	}	
	//  Operaciones públicas complementarias
	public int sumaNumeros() {
		int suma = 0;
		for (int i=0; i<tamanio(); i++)
			suma += n[i];
		return suma;
	}
	public int posPrimerNumeroMenorA25() {
		for (int i=0; i<tamanio(); i++)
			if (n[i] < 25)
				return i;
		return -1;
	}
	public void generar() {
		for (int i=0; i<tamanio(); i++)
			n[i] = aleatorio(100, 999);
	}
	//  Método privado
	private int aleatorio(int min, int max) {
	    return (int)((max - min + 1) * Math.random()) + min;
  	}

}