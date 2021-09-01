package model.entities;

public class Products {
	
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public Products() {
		
	}

	public Products(String nome, Double valor, Integer quantidade) {
		this.nome = nome;
		this.preco = valor;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return preco;
	}

	public void setValor(Double valor) {
		this.preco = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double total() {
		
		return preco * quantidade;
	}
	
	
	
}
