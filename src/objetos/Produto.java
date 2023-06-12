/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author anrry
 */
public class Produto {

    private String nome;
    private double preco;
    private String descricao;
    private String tipo;




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the dataFabricacao
     */
    public String getdescricao() {
        return descricao;
    }

    /**
     */
    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataValidade
     */
    public String gettipo() {
        return tipo;
    }

   
    public void settipo(String tipo) {
        this.tipo = tipo;
    }

  
}
