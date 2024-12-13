package model.imd.corp;

import java.util.Scanner;

public class Endereco
{
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String cep;

    Scanner scaner = new Scanner(System.in);

    public Endereco(String rua, int numero, String bairro, String cidade, String cep) 
    {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getRua() 
    {
        return rua;
    }

    public void setRua(String rua) 
    {
        this.rua = rua;
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public String getBairro() 
    {
        return bairro;
    }

    public void setBairro(String bairro) 
    {
        this.bairro = bairro;
    }

    public String getCidade() 
    {
        return cidade;
    }

    public void setCidade(String cidade) 
    {
        this.cidade = cidade;
    }

    public String getCep() 
    {
        return cep;
    }

    public void setCep(String cep) 
    {
        this.cep = cep;
    }


    public Endereco criarEndereco(Endereco endereco)
    {

        System.out.println("Insira a rua: ");
        endereco.setRua(scaner.nextLine());

        System.out.println("Insira o numero: ");
        endereco.setNumero(scaner.nextInt());
        scaner.nextLine();

        System.out.println("Insira o bairro: ");
        endereco.setBairro(scaner.nextLine());

        System.out.println("Insira a cidade: ");
        endereco.setCidade(scaner.nextLine());

        System.out.println("Insira o cep: ");
        endereco.setCep(scaner.nextLine());

        return endereco;
    }
}
