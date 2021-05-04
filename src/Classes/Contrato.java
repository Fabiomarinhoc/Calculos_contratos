package Classes;

import java.util.Date;

public class Contrato {

	private Date data;
	private double ValorHora;
	private Integer hora;

	public Contrato(Date data, double valorHora, Integer hora) {
		super();
		this.data = data;
		ValorHora = valorHora;
		this.hora = hora;
	}
	
	public Contrato() {
		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorHora() {
		return ValorHora;
	}

	public void setValorHora(double valorHora) {
		ValorHora = valorHora;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}
	
	
	
	public double valor() {
		double total = 0;
		total = this.ValorHora*this.hora;
		return total;
		
	}
	
	
	

}
