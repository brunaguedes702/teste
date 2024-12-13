package model;

import java.time.LocalDate;
import java.util.ArrayList;

import model.imd.corp.enuns.Formacao;
import model.imd.corp.enuns.*;

//ta vermelho pq a interface Funcionario não foi implementada
public class Professor extends Pessoa implements Funcionario
{
    Nivel nivelProfessor;
    Formacao formacaoProfessor;
    ArrayList<String> disciplinas;

    public Professor(String nome, String cpf, LocalDate dataNascimento, Genero genero, Endereco endereco, Long matricula, double salario, String departamento, Integer cargaHoraria, LocalDate dataingresso, Nivel nivelProfessor, Formacao formacaoProfessor, ArrayList<String> disciplinas) 
    {
        super(nome, cpf, dataNascimento, genero, endereco, matricula, salario, departamento, cargaHoraria, dataingresso);
        this.nivelProfessor = nivelProfessor;
        this.formacaoProfessor = formacaoProfessor;
        this.disciplinas = disciplinas;
    }

    public Nivel getNivelProfessor() 
    {
        return nivelProfessor;
    }

    public void setNivelProfessor(Nivel nivelProfessor) 
    {
        this.nivelProfessor = nivelProfessor;
    }

    public Formacao getFormacaoProfessor() 
    {
        return formacaoProfessor;
    }

    public void setFormacaoProfessor(Formacao formacaoProfessor) 
    {
        this.formacaoProfessor = formacaoProfessor;
    }

    public ArrayList<String> getDisciplinas() 
    {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) 
    {
        this.disciplinas = disciplinas;
    }

    @Override
    public double calcularSalario()
    {
        double salariobaseProfessor = 4000.00;                              
        double salarioCalculado = 0.0;
        if(this.getSalario() < salariobaseProfessor)
        {
            salarioCalculado = salariobaseProfessor;
        }

        if(this.getNivelProfessor().equals(Nivel.I))
        {
            salarioCalculado = salarioCalculado + (salariobaseProfessor * (5/100));
        }
        else if(this.getNivelProfessor().equals(Nivel.II))
        {
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
        }
        else if(this.getNivelProfessor().equals(Nivel.III))
        {
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
        }
        else if(this.getNivelProfessor().equals(Nivel.IV))
        {
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
        }
        else if(this.getNivelProfessor().equals(Nivel.V))
        {
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
        }
        else if(this.getNivelProfessor().equals(Nivel.VI))
        {
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
        }
        else if(this.getNivelProfessor().equals(Nivel.VII))
        {
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
        }
        else if(this.getNivelProfessor().equals(Nivel.VIII))
        {
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
            salarioCalculado = salarioCalculado + (salarioCalculado * (5/100));
        }

        if(this.getFormacaoProfessor().equals(Formacao.ESPECIALISTA))
        {
            salarioCalculado = salarioCalculado + (salariobaseProfessor * (25/100));
        }
        if(this.getFormacaoProfessor().equals(Formacao.MESTRE))
        {
            salarioCalculado = salarioCalculado + (salariobaseProfessor * (50/100));
        }
        else if(this.getFormacaoProfessor().equals(Formacao.DOUTOR))
        {
            salarioCalculado = salarioCalculado + (salariobaseProfessor * (75/100));
        }

        return salarioCalculado;
    }
}
