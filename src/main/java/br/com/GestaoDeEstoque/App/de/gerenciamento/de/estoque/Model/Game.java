package br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;
	private String descricao;
	private int quantidadeEstoque;
	private double preco;
	
	public Game() {}

	public Game(String titulo, String descricao, int quantidadeEstoque, double preco) {
		
		this.titulo = titulo;
		this.descricao = descricao;
		this.quantidadeEstoque = quantidadeEstoque;
		this.preco = preco;
	
	}

	public Long getId() {
	
		return id;
	
	}
	
	public void setId(Long id) {
	
		this.id = id;
	
	}
	
	public String getTitulo() {
	
		return titulo;
	
	}
	
	public void setTitulo(String titulo) {
	
		this.titulo = titulo;
	
	}
	
	public String getDescricao() {
	
		return descricao;
	
	}
	
	public void setDescricao(String descricao) {
	
		this.descricao = descricao;
	
	}
	

	public int getQuantidadeEstoque() {
	
		return quantidadeEstoque;
	
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
	
		this.quantidadeEstoque = quantidadeEstoque;
	
	}

	public double getPreco() {
	
		return preco;
	
	}
	
	public void setPreco(double preco) {
	
		this.preco = preco;
	
	}
		
}