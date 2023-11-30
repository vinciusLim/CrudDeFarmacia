package CRUD.Funcionario;

import java.sql.*;

public class Conexao {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/CrudFarmacia";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/CrudFarmacia","root", "");
            Statement statement = conexao.createStatement();
            ResultSet funcionarios = statement.executeQuery("select * from Funcionarios");
            while (funcionarios.next()) {
                System.out.println("Id_Funcionario : " + funcionarios.getInt("idFuncionario"));
                System.out.println("Nome : " + funcionarios.getString("nomeFuncionario"));
            }
            System.out.println("consegui");
            conexao.close();

        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao acessar o banco " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não localizado");
        }
    }
}
