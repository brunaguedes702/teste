package model.imd.corp;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Seja bem vindo ao sigaa!!");

        BancoDAO banco = BancoDAO.getInstance();

        int opcoes = -1;

        do
        {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Técnico Administrativo");
            System.out.println("3 - Listar todos os Professores");
            System.out.println("4 - Listar todos os Técnicos Administrativos");
            System.out.println("5 - Deletar um professor");
            System.out.println("6 - Deletar um técnico administrativo");
            System.out.println("7 - Buscar professor por matrícula");
            System.out.println("0 - Sair");
            opcoes = scaner.nextInt();
            scaner.nextLine();

            switch (opcoes)
            {
                case 1:
                    
                    Professor professor = Operacoes.cadastrarProfessor();
                    banco.getArrayPessoa().add(professor);

                    break;
                case 2:

                    TecnicoADM tecnico = Operacoes.cadastrarTecnico();
                    banco.getArrayPessoa().add(tecnico);

                    break;
                case 3:
                    if(banco.getArrayPessoa().isEmpty())
                    {
                        System.out.println("Não há professores cadastrados!!");
                        break;
                    }
                    else
                    {
                        Operacoes.listarProfessores(banco);
                    }
                    break;
                case 4:
                    //Operacoes.listarTecnicosADM(banco);
                    break;

                case 5:
                        Operacoes.deletarProfessor(banco);
                    break;
                case 6: 
                    Operacoes.deletarTecnico(banco);
                    break;

                case 7:
                    Operacoes.buscarProfessorMatricula(banco);

                    break;
                
                case 8:
                    Operacoes.buscarTecnicoMatricula(banco);
                    break;
                case 0:
                    System.out.println("Obrigado por usar o sigaa!!");
                    break;
                default:
                    System.out.println("Opção inválida!!");
                    break;
            }
        } while (opcoes != 0);

        scaner.close();
    }
}
