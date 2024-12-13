package model.imd.corp;

import java.time.LocalDate;

import model.imd.corp.enuns.*;


//essa aqui não deve herdar de pessoas porque?

public class TecnicoADM extends Pessoa implements Funcionario 
{
    private Nivel nivelTecnico;
    private Formacao formacaoTecnico;
    private String funcaoTecnico;
    private Boolean insalubridade;
    private Boolean funcaoGratificada;

    public TecnicoADM(String nome, String cpf, LocalDate dataNascimento, Genero genero, Endereco endereco, Long matricula, double salario, String departamento, Integer cargaHoraria, LocalDate dataIngresso, Nivel nivelTecnico, Formacao formacaoTecnico, String funcaoTecnico, Boolean insalubridade, Boolean funcaoGratificada) 
    {
        super(nome, cpf, dataNascimento, genero, endereco, matricula, salario, departamento, cargaHoraria, dataIngresso);
        this.nivelTecnico = nivelTecnico;
        this.formacaoTecnico = formacaoTecnico;
        this.funcaoTecnico = funcaoTecnico;
        this.insalubridade = insalubridade;
        this.funcaoGratificada = funcaoGratificada;
    }

    @Override
    public double calcularSalario()
    {
        double salariobaseTecnico = 2500.00;
        double salarioCalculado = 0.0;

        if(this.getSalario() < salariobaseTecnico)
        {
            salarioCalculado = salariobaseTecnico;
        }
       
        if(this.getNivelTecnico().equals(Nivel.I))
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
        }
        else if(this.getNivelTecnico().equals(Nivel.II))
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
        }
        else if(this.getNivelTecnico().equals(Nivel.III))
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
        }
        else if(this.getNivelTecnico().equals(Nivel.IV))
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
        }
        else if(this.getNivelTecnico().equals(Nivel.V))
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
        }
        else if(this.getNivelTecnico().equals(Nivel.VI))
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
        }
        else if(this.getNivelTecnico().equals(Nivel.VII))
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
        }
        else if( this.getNivelTecnico().equals(Nivel.VIII))
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (3/100));
        }

        if(this.getFormacaoTecnico().equals(Formacao.ESPECIALISTA))
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (25/100));
        }
        else if(this.getFormacaoTecnico().equals(Formacao.MESTRE))
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (50/100));
        }
        else if(this.getFormacaoTecnico().equals(Formacao.DOUTOR))
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (75/100));
        }

        if(this.getInsalubridade() == true)
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (50/100));
        }

        if(this.getFuncaoGratificada() == true)
        {
            salarioCalculado = salarioCalculado + (salariobaseTecnico * (50/100));
        }

        return salarioCalculado;
    }
    
    public Nivel getNivelTecnico() 
    {
        return nivelTecnico;
    }

    public void setNivelTecnico(Nivel nivelTecnico) 
    {
        this.nivelTecnico = nivelTecnico;
    }

    public Formacao getFormacaoTecnico() 
    {
        return formacaoTecnico;
    }

    public void setFormacaoTecnico(Formacao formacaoTecnico) 
    {
        this.formacaoTecnico = formacaoTecnico;
    }

    public String getFuncaoTecnico() 
    {
        return funcaoTecnico;
    }

    public void setFuncaoTecnico(String funcaoTecnico) 
    {
        this.funcaoTecnico = funcaoTecnico;
    }

    public Boolean getInsalubridade() 
    {
        return insalubridade;
    }

    public void setInsalubridade(Boolean insalubridade) 
    {
        this.insalubridade = insalubridade;
    }

    public Boolean getFuncaoGratificada() 
    {
        return funcaoGratificada;
    }

    public void setFuncaoGratificada(Boolean funcaoGratificada) 
    {
        this.funcaoGratificada = funcaoGratificada;
    }
}
