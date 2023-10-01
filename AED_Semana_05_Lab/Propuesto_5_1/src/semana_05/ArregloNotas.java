package semana_05;

public class ArregloNotas {
	private int[] nota = {11, 10, 16, 18, 15, 13, 20, 12, 19, 17};
	private int aleatorio(int min, int max) {
	    return (int)((max - min + 1) * Math.random()) + min;
  	}
	
	public int tamanio() {
		return nota.length;
	}
	public int obtener(int ob) {
		return nota[ob];
	}
	
	public double notaPromedio() {
		double promedio;
		int suma = 0;
		for(int p = 0; p<tamanio(); p++){
			suma += nota[p];
		}
		promedio = suma/tamanio();
		return promedio;
	}
	public int notaMayor() {
		int mayor = 0;
		for(int p = 0; p < tamanio(); p++){
			if(mayor < obtener(p)){
				mayor = obtener(p);
			}
		}
		return mayor;
	}
	public int notaMenor() {
		int menor = 0;
		for(int p = 0; p < tamanio(); p++){
			if(menor > obtener(p)){
				menor = obtener(p);
			}
		}
		return menor;
	}
	public int cantNotasAprobatorias() {
		int cantNotas = 0;
		for(int p = 0; p < tamanio(); p++){
			if(13 <= obtener(p)){
				cantNotas++;
			}
		}
		return cantNotas;
	}
	public int cantNotasDesaprobatorias() {
		int cantNotas = 0;
		for(int p = 0; p < tamanio(); p++){
			if(13 > obtener(p)){
				cantNotas++;
			}
		}
		return cantNotas;
	}
	public int cantNotasMayoresA15() {
		int cantNotas = 0;
		for(int p = 0; p < tamanio(); p++){
			if(15 < obtener(p)){
				cantNotas++;
			}
		}
		return cantNotas;
	}
	public int posPrimeraNotaAprobatoria() {
		for(int p = 0; p < tamanio(); p++){
			if(13 <= obtener(p)){
				return p;
			}
		}
		return -1;
	}
	public int posPenultimaNotaDesaprobatoria() {
		int cont = 0;
		for(int p = tamanio() - 1; p >= 0; p--){
			if(13 > obtener(p)){
				cont++;
				if(cont == 2){
					return p;
				}
			}
		}
		return -1;
	}
	public void generarNotas() {
		for (int p = 0; p < tamanio(); p++){
			nota[p] = aleatorio(0, 20);
		}
	}
}