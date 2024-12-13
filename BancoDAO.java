package model.imd.corp

import java.util.ArrayList;

public class BancoDAO 
{
    private static BancoDAO instance;
    private ArrayList<Pessoa> funcionarios;

    public static BancoDAO getInstance() 
    {
        if(instance == null)
        {
            BancoDAO.instance = new BancoDAO();
        }
        return instance;
    }

    public ArrayList<Pessoa> getArrayPessoa()
    {
        if(instance == null)
        {
            BancoDAO.instance = new BancoDAO();
        }

        return funcionarios;
    }

    private BancoDAO() 
    {
        //quando eu estava fazendo, a IA à qual estou usando para tirar as dúvidas informou que eu não deveria colocar nenhum tipo de dado no construtor do arraylist, mas porque isso?
        funcionarios = new ArrayList<Pessoa>();
    }
}
