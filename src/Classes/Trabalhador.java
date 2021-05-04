package Classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador extends Departamento {

	private static String departamento2;
	private String nome;
	private NivelTrabalhador nivel;
	private Double salario;

	private List<Contrato> contrato = new ArrayList<>();

	public Trabalhador(String nome, NivelTrabalhador nivel, Double salario, String departamento) {
		super(departamento);

		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
		this.departamento = departamento;

	}

	public Trabalhador() {
		super(departamento2);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}
	
	

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void SetDepartamento(String departamento) {

	}

	public void addcontrotato(Contrato contr) {

		contrato.add(contr);

	}

	public void removecontrato(Contrato contr) {
		contrato.remove(contr);
	}

	public double incomum(int ano, int mes) {
		double soma = this.salario;
		Calendar cal = Calendar.getInstance();
		for (Contrato c : contrato) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.valor();

			}

		}
		return soma;
	}

	@Override
	public String toString() {
		return "Trabalhador [nivel=" + nivel + "]";
	}
	
	

}
