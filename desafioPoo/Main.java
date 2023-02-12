package desafioPoo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(6);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(4);
		
		Mentorias mentoria = new Mentorias();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao mentoria de java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
	    bootcamp.getConteudos().add(curso1);
	    bootcamp.getConteudos().add(curso2);
	    bootcamp.getConteudos().add(mentoria);
	    
	    Dev dev1 = new Dev();
	    dev1.setNome("Pedro");
	    dev1.inscreverBootcamp(bootcamp);
	    System.out.println("Conteudos Inscritos Pedro:" + dev1.getConteudosInscritos());
	    dev1.progredir();
	    System.out.println("Conteudos Concluidos Pedro:" + dev1.getConteudosConcluidos());
	    System.out.println("Conteudos Inscritos Pedro:" + dev1.getConteudosInscritos());
	    System.out.println("XP:" + dev1.calcularTotalXP());
	    
	    System.out.println("----------------------");
	    
	    Dev dev2 = new Dev();
	    dev2.setNome("Luana");
	    dev2.inscreverBootcamp(bootcamp);
	    System.out.println("Conteudos Inscritos Luana:" + dev2.getConteudosInscritos());
	    dev2.progredir();
	    dev2.progredir();
	    dev2.progredir();
	    System.out.println("Conteudos Concluidos Luana:" + dev2.getConteudosConcluidos());
	    System.out.println("Conteudos Inscritos Luana:" + dev2.getConteudosInscritos());
	    System.out.println("XP:" + dev2.calcularTotalXP());
	}
}
