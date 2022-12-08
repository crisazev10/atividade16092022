package atividade3.aplicacao;

import atividade3.entities.Carro;
import atividade3.entities.Pessoa;
import atividade3.entities.Proprietario;

public class Programa {
public static void main(String[] args) {
		Pessoa paiProprietario1 = new Pessoa("Ricardo", "Nunes", "123456789-00");
		Pessoa maeProprietario1 = new Pessoa("Maria", "Nunes", "987654321-99");
		
		Pessoa paiProprietario2 = new Pessoa("Rodrigo", "Mendonca", "111222333-00");
		Pessoa maeProprietario2 = new Pessoa("Sonia", "Pereira", "112233445-01");
		
		Proprietario proprietario1 = new Proprietario("Joao", "Teixeira", "098712345-02", paiProprietario1, maeProprietario1);
		Proprietario proprietario2 = new Proprietario("Maria", "Neves", "192837465-00", paiProprietario2, maeProprietario2);
		
		Carro carro1 = new Carro("VW", "Gol", "ABC-1234", "2010");
		Carro carro2 = new Carro("Chevrolet", "Corsa", "AAB-4321", "2005");
		Carro carro3 = new Carro("Toyota", "Yaris", "CBA-1423", "2019");
		Carro carro4 = new Carro("Fiat", "Argo", "CCB-4132", "2018");
		
		System.out.println("---------------------------Etapa 0------------------------");
		System.out.println("Informacoes sobre os proprietarios: ");
		System.out.println(proprietario1);
		System.out.println(proprietario2);
		
		//Etapa 1 - Ambos compram um carro
		System.out.println();
		System.out.println("---------------------------Etapa 1------------------------");
		System.out.println();
		proprietario1.comprarCarro(carro1);
		proprietario1.comprarCarro(carro2);
		proprietario2.comprarCarro(carro3);
		proprietario2.comprarCarro(carro4);
		
		proprietario1.dirigiuOCarro(carro1);
		proprietario1.dirigiuOCarro(carro2);
		proprietario2.dirigiuOCarro(carro3);
		
		proprietario1.exibeListaDeCarros();
		proprietario2.exibeListaDeCarros();
		
		//Etapa 2 - Joao vende um Corsa para Maria
		System.out.println();
		System.out.println("---------------------------Etapa 2------------------------");
		proprietario1.transfereCarroNovoProprietario(carro2, proprietario2);
		
		proprietario2.dirigiuOCarro(carro2);
		
		proprietario1.exibeListaDeCarros();
		proprietario2.exibeListaDeCarros();
		
		//Etapa 3 - Maria vende um Argo para Joao
		System.out.println();
		System.out.println("---------------------------Etapa 3------------------------");
		proprietario2.transfereCarroNovoProprietario(carro3, proprietario1);
		
		proprietario1.dirigiuOCarro(carro3);
		
		proprietario1.exibeListaDeCarros();
		proprietario2.exibeListaDeCarros();
		
		
		//Exibe lista dos veiculos
		carro1.listaQuemJaDirigiuOCarro();
		carro2.listaQuemJaDirigiuOCarro();
		carro3.listaQuemJaDirigiuOCarro();
		carro4.listaQuemJaDirigiuOCarro();
	}
}