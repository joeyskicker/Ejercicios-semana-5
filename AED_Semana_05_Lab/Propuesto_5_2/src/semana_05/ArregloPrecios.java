package semana_05;

public class ArregloPrecios {
	private double[] precio = {240.5, 350.2, 80.4, 100.3, 470.1, 60.0, 330.8, 260.6, 510.9, 200.7};
	private double aleatorio(double min, double max) {
	    return (double)((max - min + 1) * Math.random()) + min;
  	}
	
	public int tamanio() {
		return precio.length;
	}
	public double obtener(int ob) {
		return precio[ob];
	}
	
	public double precioPromedio() {
		double prom = 0.0;
		double acumPrecio = 0.0;
		for(int p = 0; p < tamanio(); p++){
			acumPrecio += obtener(p);
		}
		prom = acumPrecio/tamanio();
		return prom;
	}
	public double precioMayor() {
		double mayor = 0;
		for(int p = 0; p < tamanio(); p++){
			if(mayor < obtener(p)){
				mayor = obtener(p);
			}
		}
		return mayor;
	}
	public double precioMenor() {
		double menor = 0;
		for(int p = 0; p < tamanio(); p++){
			if(menor > obtener(p)){
				menor = obtener(p);
			}
		}
		return menor;
	}
	public double cantMayoresPrecioPromedio() {
		double mayorProm = 0;
		for(int p = 0; p < tamanio(); p++){
			if(obtener(p) >= precioPromedio()){
				mayorProm++;
			}
		}
		return mayorProm;
	}
	public double cantMenoresPrecioPromedio() {
		double menorProm = 0;
		for(int p = 0; p < tamanio(); p++){
			if(obtener(p) < precioPromedio()){
				menorProm++;
			}
		}
		return menorProm;
	}
	public double posPrimerPrecioMayorAlSegundo() {
		for(int p = 0; p < tamanio(); p++){
			if(obtener(p) > obtener(1)){
				return p;
			}
		}
		return -1;
	}
	public double posUltimoPrecioMenorAlPenultimo() {
		for(int p = tamanio() - 1; p >= 0; p--){
			if(obtener(p) < obtener(tamanio()-2)){
				return p;
			}
		}
		return -1;
	}
	public void generarPrecios() {
		for (int p = 0; p < tamanio(); p++){
			precio[p] = aleatorio(99.9, 999.9);
		}
	}
}