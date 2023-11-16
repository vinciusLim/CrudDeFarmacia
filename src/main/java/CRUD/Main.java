package CRUD;

    import CRUD.Funcionario.Funcionario;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            List <Funcionario> listaDeFuncionario = new ArrayList<>();
            Funcionario f1 = new Funcionario("cini",520);
            Funcionario f2 = new Funcionario("pol", 630);
            listaDeFuncionario.add(f1);
            listaDeFuncionario.add(f2);

            System.out.println(listaDeFuncionario);

        }
    }
