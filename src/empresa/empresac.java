package empresa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Classes.Contrato;
import Classes.NivelTrabalhador;
import Classes.Trabalhador;

public class empresac {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int resp;

		Trabalhador trabalhador = new Trabalhador();

		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Nome departamento?");
		String departamento = sc.nextLine();
		System.out.println("Dados do trabalhador ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite um nível ex.. JUNIOR, PLENO E SENIOR ");
		String nivel = sc.next();
	
			System.out.println("Salário base: ");
			double salario = sc.nextDouble();

			trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(nivel), salario, departamento);

			System.out.println("Digite o número de contratos");
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				System.out.println("Contrato número: " + i);
				System.out.println("Digite a data (dd/MM/yyyy) ");
				Date Datacontr = sp.parse(sc.next());
				System.out.print("Digite o valor da hora: ");
				double valorHora = sc.nextDouble();
				System.out.print("Digite a duração: ");
				int duracao = sc.nextInt();

				Contrato contrato = new Contrato(Datacontr, valorHora, duracao);

				trabalhador.addcontrotato(contrato);

			}

			System.out.println("Entre com mês e ano para calcular o salario (mm/yyyy)");
			String mesEano = sc.next();
			int mes = Integer.parseInt(mesEano.substring(0, 2));
			int ano = Integer.parseInt(mesEano.substring(3));

			System.out.println("Nome " + trabalhador.getNome());
			System.out.println("Derpatamento " + trabalhador.getDepartamento());
			System.out.println("Nível: " + trabalhador.getNivel());
			System.out.println("Valor para " + mesEano + ": " + String.format("%.2f", trabalhador.incomum(ano, mes)));

			sc.close();

		}

	}

