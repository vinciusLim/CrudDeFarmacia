package CRUD;

import CRUD.Funcionario.Departamentos;
import CRUD.Funcionario.Funcionario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();
        int op = 0;
        String nome, cpf, departamento;
        double salario;
        int dia, mes, ano;

        do {
            System.out.println("1 - Cadastro de funcionario");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("1 - Cadastrar funcionario\n2 - C");
                    op = scanner.nextInt();
                    switch (op) {
                        case 1:
                            scanner.nextLine();
                            System.out.println("Digitar nome:");
                            nome = scanner.nextLine();
                            System.out.println("Digitar salario:");
                            salario = scanner.nextDouble();
                            System.out.println("Digitar dia, mes e ano da data de admissão:");
                            dia = scanner.nextInt();
                            mes = scanner.nextInt();
                            ano = scanner.nextInt();
                            System.out.println("Digitar Departamento:");
                            scanner.nextLine();
                            departamento = scanner.nextLine();

                            listaDeFuncionarios.add(new Funcionario(nome, salario, LocalDate.of(ano, mes, dia), Departamentos.valueOf(departamento.toUpperCase())));

                            for (Funcionario f : listaDeFuncionarios) {
                                System.out.println(listaDeFuncionarios);
                            }
                            break;
                    }
            }
        } while (op != 0);
    }
}
