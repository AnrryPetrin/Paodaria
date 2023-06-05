/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author anrry
 */
public class Fornecedor {
    private String nome;
    private String sobrenome;
    private String cnpj;
    private String telefone;
    private String email;

    public Fornecedor(String nome, String sobrenome, String cnpj, String telefone, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
    }   

    public String getCpf() {
        return cnpj;
    }

    public void setCpf(String cpf) {
        this.cnpj = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

