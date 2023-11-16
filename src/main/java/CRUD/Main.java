package CRUD;

    import CRUD.Funcionario.Funcionario;

    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.ArrayList;
    import java.util.Date;
    import java.util.List;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            List <Funcionario> listaDeFuncionario = new ArrayList<>();
            Funcionario f1 = new Funcionario("cini",520, "1245", LocalDate.of(2012,3,12), "Vendas");
            Funcionario f2 = new Funcionario("pol",2012, "2563", LocalDate.of(2022,8,14), "Auxiliar Limpeza");
            listaDeFuncionario.add(f1);
            listaDeFuncionario.add(f2);

            System.out.println(listaDeFuncionario);

        }
    }
