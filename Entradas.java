package model.imd.corp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
import model.imd.corp.enuns.*;

public class Entradas 
{
    //coloquei isso aqui pra poder pegar a data no formado que o LocalDate aceitasse, se fosse do dipo LocalDate o scanner.nextLine() não aceitaria

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static Scanner scaner = new Scanner(System.in);
 
    public static  String entradaNome()
    {
        System.out.println("Insira o nome do professor: ");
        String nome = scaner.nextLine();
        return nome;
    }
    public static String entradaCPF()
    {
        System.out.println("Insira o CPF do professor: ");
        String cpf = scaner.nextLine();
        return cpf;
    }

    public static LocalDate entradaDataNascimento()
    {
        System.out.println("Insira a data de nascimento do professor (dd/MM/yyyy): ");
        String dataNascimento = scaner.nextLine();

        while(dataNascimento.length() != 10)
        {
            System.out.println("Data inválida. Esse dado dever ser inserido no formato:(dd/MM/yyyy).");
            System.out.println("Insira a data de nascimento do professor (dd/MM/yyyy): ");
            dataNascimento = scaner.nextLine();
        }

        return LocalDate.parse(dataNascimento, formatter);
    }

    public static Genero entradaGenero()
    {
        System.out.println("Insira o gênero do professor: ");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        System.out.println("3 - Outro");
        int genero = scaner.nextInt();
        scaner.nextLine();

        switch (genero)
        {
            case 1:
                return Genero.MASCULINO;
            case 2:
                return Genero.FEMININO;
            case 3:
                return Genero.OUTRO;
            default:
                return Genero.OUTRO;
        }
        //eu poderia também ter feito um casting de string para o tipo do enum (com o valueof) e depois o UpperCase pra deixar tudo maisusculo
        //professor.setGenero(Genero.valueOf(genero.toUpperCase()));
    }

    public static Endereco entradaEndereco()
    {
        System.out.println("Insira o endereço do professor: ");
        Endereco endereco = new Endereco(null, 0, null, null, null);
        endereco = endereco.criarEndereco(endereco);

        return endereco;
    }

    public static Long entradaMatricula()
    {
        System.out.println("Insira a matrícula do professor: ");
        Long matricula = scaner.nextLong();
        scaner.nextLine();
        return matricula;
    }

    public static double entradaSalario()
    {
        System.out.println("Insira o salário do professor: ");
        double salario = scaner.nextDouble();
        scaner.nextLine();

        return salario;
    }

    public static String entradaDepartamento()
    {
        System.out.println("Insira o departamento do professor: ");
        String departamento = scaner.nextLine();
        return departamento;
    }

    public static int entradaCargaHoraria()
    {   
        System.out.println("Insira a carga horária do professor: ");
        int cargaHoraria = scaner.nextInt();
        scaner.nextLine();

        return cargaHoraria;
    }

    public static LocalDate entradaDataIngresso()
    {
        System.out.println("Insira a data de ingresso do professor (dd/MM/yyyy): ");
        String dataIngresso = scaner.nextLine();

        while(dataIngresso.length() != 10)
        {
            System.out.println("Data inválida. Esse dado dever ser inserido no formato:(dd/MM/yyyy).");
            System.out.println("Insira a data de ingresso do professor (dd/MM/yyyy): ");
            dataIngresso = scaner.nextLine();
        }

        return LocalDate.parse(dataIngresso, formatter);
    }

    public static Nivel entradaNivel()
    {
        System.out.println("Insira o nível do professor: ");
        System.out.println("1 - I");
        System.out.println("2 - II");
        System.out.println("3 - III");
        System.out.println("4 - IV");
        System.out.println("5 - V");
        int nivel = scaner.nextInt();
        scaner.nextLine();

        switch (nivel)
        {
            case 1:
                return Nivel.I;
            case 2:
                return Nivel.II;
            case 3:
                return Nivel.III;
            case 4:
                return Nivel.IV;
            case 5:
                return Nivel.V;
            default:
                return Nivel.I;
        }
    }

    public static Formacao entradaFormacao()
    {
        System.out.println("Insira a formação do professor: ");
        System.out.println("1 - Especialização");
        System.out.println("2 - Mestrado");
        System.out.println("3 - Doutorado");
        int formacao = scaner.nextInt();

        scaner.nextLine();

        switch (formacao)
        {
            case 1:
                return Formacao.ESPECIALISTA;
            case 3:
                return Formacao.MESTRE;
            case 4:
                return Formacao.DOUTOR;
            default:
                return Formacao.ESPECIALISTA;
        }
    }

    public static ArrayList<String> entradaDisciplinas()
    {
        ArrayList<String> disciplinas = new ArrayList<>();
    
        
        System.out.println("Quantas disciplinas o professor leciona? ");
        int qtdeDisciplinas = scaner.nextInt();
        scaner.nextLine();
    
        for(int i = 0; i < qtdeDisciplinas; i++)
        {
            System.out.println("Insira a " + (i+1) + "ª disciplina: ");
            String disciplina = scaner.nextLine();
            disciplinas.add(disciplina);
            
        }

        /*System.out.println("Digite 0 para parar de inserir disciplinas");

        String disciplina = scaner.nextLine();

        while(!disciplina.equals("0"))
        {
            disciplinas.add(disciplina);
            disciplina = scaner.nextLine();
        } */

        return disciplinas;
    }

    public static Boolean entradaInsalubridade()
    {
        System.out.println("O técnico está exposto a situação insalubre? (SIM, NÃO): ");
        String insalubre = scaner.nextLine();
        if(insalubre.equalsIgnoreCase("Sim"))
        {
            return true;
        }
        else
        {
            return false;
        }	
    }

    public static Boolean entradaGratificada()
    {
        System.out.println("A função que o técnico exerce é gratificada? (SIM, NÃO): ");
        String gratificada = scaner.nextLine();
        if(gratificada.equalsIgnoreCase("Sim"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
