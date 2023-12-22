package model;

public class Clientes {
	
	String nome;
    String endereco;
    String email;
    
     
     
    public Clientes (String nome, String endereco, String email) {
    	this.nome = nome;
    	this.endereco = endereco;
    	this.email = email;
       
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
    	this.endereco = endereco;
    }
    
    public String getemail() {
        return email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public void visualizar() {
    	System.out.println("\n\n***********************************************************");
		System.out.println("                         Dados do cliente: ");
		System.out.println("***********************************************************");
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Email: " + this.email);
		
		
		
	}
  
}



