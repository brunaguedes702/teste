package model.imd.corp;

import java.time.LocalDate;
import model.imd.corp.enuns.Genero;

public abstract class Pessoa
{
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Genero Genero;
    private Endereco endereco;
    private Long matricula;
    private double salario;
    private String departamento;
    private Integer cargaHoraria;
    private LocalDate dataIngresso;

    public Pessoa(String nome, String cpf, LocalDate dataNascimento, model.imd.corp.enuns.Genero genero, Endereco endereco, Long matricula, double salario, String departamento, Integer cargaHoraria, LocalDate dataIngresso) 
    {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        Genero = genero;
        this.endereco = endereco;
        this.matricula = matricula;
        this.salario = salario;
        this.departamento = departamento;
        this.cargaHoraria = cargaHoraria;
        this.dataIngresso = dataIngresso;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() 
    {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) 
    {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() 
    {
        return Genero;
    }

    public void setGenero(Genero genero) 
    {
        Genero = genero;
    }

    public Endereco getEndereco() 
    {
        return endereco;
    }

    public void setEndereco(Endereco endereco) 
    {
        this.endereco = endereco;
    }

    public Long getMatricula() 
    {
        return matricula;
    }

    public void setMatricula(Long matricula) 
    {
        this.matricula = matricula;
    }

    public double getSalario() 
    {
        return salario;
    }

    public void setSalario(double salario) 
    {
        this.salario = salario;
    }

    public String getDepartamento() 
    {
        return departamento;
    }

    public void setDepartamento(String departamento) 
    {
        this.departamento = departamento;
    }

    public Integer getCargaHoraria() 
    {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) 
    {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getDataIngresso() 
    {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) 
    {
        this.dataIngresso = dataIngresso;
    }

}
