package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tempo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;
	
	private String dia;
	
	private double temperaturamina;
	
	private String temperaturamax;
	
	private String humidade;
	
	private String descricao;
	
	public Tempo() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public double getTemperaturamina() {
		return temperaturamina;
	}

	public void setTemperaturamina(double temperaturamina) {
		this.temperaturamina = temperaturamina;
	}

	public String getTemperaturamax() {
		return temperaturamax;
	}

	public void setTemperaturamax(String temperaturamax) {
		this.temperaturamax = temperaturamax;
	}

	public String getHumidade() {
		return humidade;
	}

	public void setHumidade(String humidade) {
		this.humidade = humidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
