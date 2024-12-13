package model.imd.corp;

import java.util.Scanner;

public class Operacoes
{
    public static Scanner scaner = new Scanner(System.in);

    public static Professor cadastrarProfessor()
    {
        Professor professor  = new Professor(null, null, null, null, null, null, 0, null, null, null, null, null, null);

        professor.setNome(Entradas.entradaNome());

        professor.setCpf(Entradas.entradaCPF());

        professor.setDataNascimento(Entradas.entradaDataNascimento());

        professor.setGenero(Entradas.entradaGenero());

        professor.setEndereco(Entradas.entradaEndereco());

        professor.setMatricula(Entradas.entradaMatricula());

        professor.setSalario(Entradas.entradaSalario());

        professor.setDepartamento(Entradas.entradaDepartamento());

        professor.setCargaHoraria(Entradas.entradaCargaHoraria());

        professor.setDataIngresso(Entradas.entradaDataIngresso());

        professor.setNivelProfessor(Entradas.entradaNivel());

        professor.setFormacaoProfessor(Entradas.entradaFormacao());     

        professor.setDisciplinas(Entradas.entradaDisciplinas());
    
        professor.setSalario(professor.calcularSalario());

        return professor;
    }

    public static TecnicoADM cadastrarTecnico()
    {
        TecnicoADM tecnico = new TecnicoADM(null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null);

        tecnico.setNome(Entradas.entradaNome());

        tecnico.setCpf(Entradas.entradaCPF());

        tecnico.setDataNascimento(Entradas.entradaDataNascimento());

        tecnico.setGenero(Entradas.entradaGenero());

        tecnico.setEndereco(Entradas.entradaEndereco());

        tecnico.setMatricula(Entradas.entradaMatricula());

        tecnico.setSalario(Entradas.entradaSalario());

        tecnico.setDepartamento(Entradas.entradaDepartamento());

        tecnico.setCargaHoraria(Entradas.entradaCargaHoraria());

        tecnico.setDataIngresso(Entradas.entradaDataIngresso());

        tecnico.setNivelTecnico(Entradas.entradaNivel());

        tecnico.setFormacaoTecnico(Entradas.entradaFormacao());

        tecnico.setInsalubridade(Entradas.entradaInsalubridade());

        tecnico.setFuncaoGratificada(Entradas.entradaGratificada());

        //fazendo a verificação do salário do técnico pq antes eu n tinha as informações necessárias pra fazer isso
        tecnico.setSalario(tecnico.calcularSalario());

        return tecnico;
    }

    public static void listarProfessores(BancoDAO banco)
    {
        for(Pessoa pessoa : banco.getArrayPessoa())
        {
            if(pessoa instanceof Professor)
            {
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Disciplinas ministradas: ");
                for(String disciplina : ((Professor) pessoa).disciplinas)
                {
                    System.out.println(disciplina);
                }
            }
        }
    }

    public static void listarTecnicosADM(BancoDAO banco)
    {
        for (Pessoa p : banco.getArrayPessoa())
        {
            //como ele faz a verificação que esse componente realçmente é um tácnico ADM?
            if(p instanceof TecnicoADM)
            {
                System.out.println("Nome: " + p.getNome());
                System.out.println("Função: " + ((TecnicoADM) p).getFuncaoTecnico());
            }
        }
    } 

    public static void deletarProfessor(BancoDAO banco)
    {
        System.out.println("Insira a matrícula do professor que deseja deletar: ");
        long matricula = scaner.nextLong();
        scaner.nextLine();
        for(Pessoa pessoa : banco.getArrayPessoa())
        {
            if(pessoa instanceof Professor)
            {
                if(((Professor) pessoa).getMatricula().equals(matricula))
                {
                    banco.getArrayPessoa().remove(pessoa);
                    System.out.println("Professor deletado com sucesso!!");
                    break;
                }
            }
        }
    }

    public static void deletarTecnico(BancoDAO banco)
    {
        System.out.println("Insira a matrícula do Técnico que deseja deletar: ");

        long matricula = scaner.nextLong();
        scaner.nextLine();

        for(Pessoa pessoa : banco.getArrayPessoa())
        {
            if(pessoa instanceof Professor)
            {
                if(((Professor) pessoa).getMatricula().equals(matricula))
                {
                    System.out.println("O(a) Técnico(a) " + pessoa.getNome() + " foi deletado(a) com sucesso!!");
                    banco.getArrayPessoa().remove(pessoa);
                    break;
                }
            }
        }
    }

    public static void buscarProfessorMatricula(BancoDAO banco)
    {
        System.out.println("Insira a matrícula do professor que deseja buscar: ");
        long matricula = scaner.nextLong();
        scaner.nextLine();

        for(Pessoa p : banco.getArrayPessoa())
        {
            if(p instanceof Professor)
            {
                if(((Professor) p).getMatricula().equals(matricula))
                {
                    System.out.println("Nome: " + p.getNome());
                    System.out.println("CPF: " + p.getCpf());
                    System.out.println("Data de nascimento: " + p.getDataNascimento());
                    System.out.println("Genero: " + p.getGenero());
                    System.out.println("Endereço: " + p.getEndereco());
                    System.out.println("Matrícula: " + ((Professor) p).getMatricula());
                    System.out.println("Salário: " + ((Professor) p).getSalario());
                    System.out.println("Departamento: " + ((Professor) p).getDepartamento());
                    System.out.println("Carga horária: " + ((Professor) p).getCargaHoraria());
                    System.out.println("Data de ingresso: " + ((Professor) p).getDataIngresso());
                    System.out.println("Nível: " + ((Professor) p).getNivelProfessor());
                    System.out.println("Formação: " + ((Professor) p).getFormacaoProfessor());
                    System.out.println("Disciplinas ministradas: ");
                    for(String disciplina : ((Professor) p).disciplinas)
                    {
                        System.out.println(disciplina);
                    }
                }
            }
        }
    }  

    public static void buscarTecnicoMatricula(BancoDAO banco)
    {
        System.out.println("Insira a matrícula do técnico que deseja buscar: ");
        long matricula = scaner.nextLong();
        scaner.nextLine();

        for(Pessoa p : banco.getArrayPessoa())
        {
            if(p instanceof TecnicoADM)
            {
                if(((TecnicoADM) p).getMatricula().equals(matricula))
                {
                    System.out.println("Nome: " + p.getNome());
                    System.out.println("CPF: " + p.getCpf());
                    System.out.println("Data de nascimento: " + p.getDataNascimento());
                    System.out.println("Genero: " + p.getGenero());
                    System.out.println("Endereço: " + p.getEndereco());
                    System.out.println("Matrícula: " + ((TecnicoADM) p).getMatricula());
                    System.out.println("Salário: " + ((TecnicoADM) p).getSalario());
                    System.out.println("Departamento: " + ((TecnicoADM) p).getDepartamento());
                    System.out.println("Carga horária: " + ((TecnicoADM) p).getCargaHoraria());
                    System.out.println("Data de ingresso: " + ((TecnicoADM) p).getDataIngresso());
                    System.out.println("Nível: " + ((TecnicoADM) p).getNivelTecnico());
                    System.out.println("Formação: " + ((TecnicoADM) p).getFormacaoTecnico());
                }
            }
        }
    }
}
