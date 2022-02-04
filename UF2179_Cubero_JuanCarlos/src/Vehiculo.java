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
	private int kil�metros;
	private int numPlazas;


	public Vehiculo() {


	}




	public String getMatr�cula() {
	return matricula;
	}




	public void setMatr�cula(String matr�cula) {
	this.matricula = matr�cula;
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




	public int getKil�metros() {
	return kil�metros;
	}




	public void setKil�metros(int kil�metros) {
	this.kil�metros = kil�metros;
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
	return "Vehiculo [Matr�cula=" + matricula + ", Marca=" + marca + ", Modelo=" + modelo + ", Kil�metros="
	+ kil�metros + ", Numero de plazas=" + numPlazas + "]";
	}




	
}
