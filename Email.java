package emailapp;

import java.util.Scanner;

public class Email {

	private String nome;
	private String sobrenome;
	private String senha;
	private int tamanhoSenha=10;
	private String departamento;
	private String email;
	private int capacidadeEmail=500;
	private String emailAlternativo;
	private String empresa = "empresa.com";

// Construtor para receber nome e sobre nome
	public Email (String nome, String sobrenome) {
		this.nome= nome;
		this.sobrenome=sobrenome;
		
		System.out.println("=============================");
		
		
		
		//chamar metodo perguntando para departamento - retornar departamento
		this.departamento=setDepartamento ();
		
		
		
		
		//chamar metodo que gera senha aleatoria
		this.senha=senhaAleatoria(tamanhoSenha);
		System.out.println("SUA SENHA É: "+this.senha);
		
		
		//combinar elementos para gerar email
		email=nome.toLowerCase() +"."+ sobrenome.toLowerCase()+"@"+ departamento.toLowerCase() +"."+ empresa;
		System.out.println("Seu email é: "+email);
		
	}
	

// perguntar o departamento 
private String setDepartamento () {
	System.out.print("NOVO FUNCIONARIO: "+nome+sobrenome+"\nNUMERO DO DEPARTAMENTO\n=============================\n1 para VENDAS\n2 para DESENVOLLVIMENTO\n3 para CONTABILIDADE\n0 para nenhum\nDIGITE O NUMERO DO DEPARTAMENTO");
	
	Scanner sc = new Scanner(System.in);
	  int escolhaDepartamento=sc.nextInt();
	  if(escolhaDepartamento==1) {
		  return "VENDAS";
	  } else if (escolhaDepartamento==2) {
		  return "DESENVOLVIMENTO";
	  } else if (escolhaDepartamento==3) {
		  return "CONTABILIDADE";
	  } else {
		  return "";
	  }
}
	
// gerar senha aleatoria
private String senhaAleatoria(int length) {
	String geraSenha = "abcdefghjijklmnopqrstuvwxyz1234567890";
	char[] senha = new char[length];
	for(int i=0;i<length;i++) {
	int aleatorio =     (int) (Math.random() * geraSenha.length());
	senha[i] = geraSenha.charAt(aleatorio);
	}
	
	return new String(senha);
}

// set capacidade de email

public void setCapacidadeEmail(int capacidade) {
	this.capacidadeEmail=capacidade;
}

// set email alternativo
public void setEmailAlternativo (String emailAlt) {
	this.emailAlternativo=emailAlt;
}

//mudar senha
	
	public void mudarSenha (String senhaNova) {
		this.senha=senhaNova;
	}
	
	public int getCapacidadeEmail () {
		return capacidadeEmail;
	}
	
	public String getEmailAlternativo() {
		return emailAlternativo;
	}
	
	public String getSenha()
	{
		return senha;
	}
	
	
	public String mostrarInfo () {
		return "NOME: " +nome+ " " +sobrenome+ " "+
				"\nEMAIL DE TRABALHO: "+email+" "+
				"\nCAPACIDADE DE EMAIL: "+capacidadeEmail+ "mb";
	}
}
