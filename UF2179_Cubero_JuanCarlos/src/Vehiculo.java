import java.util.Objects;

/**
 * 
 */

/**
 * @author juanc
 *
 */
public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private int kilómetros;
	private int numPlazas;


	public Vehiculo() {


	}




	public String getMatrícula() {
	return matricula;
	}




	public void setMatrícula(String matrícula) {
	this.matricula = matrícula;
	}




	public String getMarca() {
	return marca;
	}




	public void setMarca(String marca) {
	this.marca = marca;
	}




	public String getModelo() {
	return modelo;
	}




	public void setModelo(String modelo) {
	this.modelo = modelo;
	}




	public int getKilómetros() {
	return kilómetros;
	}




	public void setKilómetros(int kilómetros) {
	this.kilómetros = kilómetros;
	}




	public int getNumPlazas() {
	return numPlazas;
	}




	public void setNumPlazas(int numPlazas) {
	this.numPlazas = numPlazas;
	}




	@Override
	public int hashCode() {
	return Objects.hash(matricula);
	}




	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Vehiculo other = (Vehiculo) obj;
	return Objects.equals(matricula, other.matricula);
	}




	@Override
	public String toString() {
	return "Vehiculo [Matrícula=" + matricula + ", Marca=" + marca + ", Modelo=" + modelo + ", Kilómetros="
	+ kilómetros + ", Numero de plazas=" + numPlazas + "]";
	}




	
}
