package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @Column(nullable = false)
    @NotBlank(message = "Email é obrigatório.")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Senha é obrigatório.")
    @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres.")
    private String senha;

    @Column(nullable = false)
    @NotBlank(message = "Nome é obrigatório.")
    private String telefone;

    @Column(nullable = false)
    @NotBlank(message = "Nome é obrigatório.")
    private String cpf;

    @Column(nullable = false)
    @NotBlank(message = "Nome é obrigatório.")
    private String cep;


    public Usuario() {
    }

    public Usuario(Long id, String nome, String email, String senha, String telefone, String cpf, String cep) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cep = cep;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Email é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Senha é obrigatório.") @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha é obrigatório.") @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres.") String senha) {
        this.senha = senha;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "Nome é obrigatório.") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "Nome é obrigatório.") String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getCep() {
        return cep;
    }

    public void setCep(@NotBlank(message = "Nome é obrigatório.") String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
