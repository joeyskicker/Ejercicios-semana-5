package semana_05;

public class ArregloEdades {
	private int[] edad = {27, 22, 13, 12, 25, 11, 29, 70, 15, 21};
	
//  Operaciones públicas básicas
	public int tamanio() {
		return edad.length;
	}
	public int obtener(int i) {
		return edad[i];
	}	
	public double edadPromedio(){
		int suma = 0;
		for(int i=0;i<tamanio();i++){
			suma+=edad[i];
		}
		return suma/tamanio();
	}
	public int edadMayor(){
		int mayor=0;
		for(int i=0;i<tamanio();i++){
			if(mayor<edad[i]){
				mayor = edad[i];
			}
		}
		return mayor;
	}
	public int edadMenor(){
		int menor=edad[0];
		for(int i=1;i<tamanio();i++){
			if(menor>edad[i]){
				menor = edad[i];
			}
		}
		return menor;
	}
	public int cantMayoresEdad(){
		int cont = 0;
		for(int i=1;i<tamanio();i++){
			if(edad[i]>=18){ cont++;}
		}
		return cont;
	}
	public int cantMenoresEdad(){
		int cont = 0;
		for(int i=1;i<tamanio();i++){
			if(edad[i]<18){ cont++;}
		}
		return cont;
	}
	public int posPrimeraEdadAdolescente(){
		for(int i=0;i<tamanio();i++){
			if(edad[i]>=12 && edad[i]<=20){
				return i;
			}
		}
		return -1;
	}
	public int posUltimaEdadAdolescente(){
		for(int i=tamanio()-1;i>=0;i--){
			if(edad[i]>=12 && edad[i]<=20){
				return i;
			}
		}
		return -1;
	}
	public void generarEdades() {
		for (int i=0; i<tamanio(); i++){
			edad[i] = aleatorio(10, 90);
		}
	}
	//  Método privado
	private int aleatorio(int min, int max) {
	    return (int)((max - min + 1) * Math.random()) + min;
  	}
}