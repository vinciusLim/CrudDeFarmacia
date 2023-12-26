package CRUD;

import CRUD.Excecoes.FuncionarioNaoEncontrado;
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
        int dia, mes, ano, id;
        boolean encontrado = false;

        do {
            System.out.println("1 - Cadastro de funcionario");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("1 - Cadastrar funcionario\n2 - Listar funcionarios\n3 - Atualizar funcionarios\n4 - Deletar funcionario");
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
                                System.out.println(f);
                            }
                            break;

                        case 2:

                            for (Funcionario f : listaDeFuncionarios) {
                                System.out.println(f);
                            }
                            break;

                        case 3:
                            encontrado = false;
                            System.out.println("Digitar ID do funcionario");
                            id = scanner.nextInt();

                            for (Funcionario f : listaDeFuncionarios) {
                                if (f.getIdFuncionario() == id) {
                                    System.out.println("Digitar nome:");
                                    nome = scanner.nextLine();
                                    f.setNomeFuncionario(nome);
                                    System.out.println("Digitar salario:");
                                    f.setSalarioFuncionario(scanner.nextDouble());
                                    encontrado = true;
                                }
                            }

                            if (!encontrado) {
                                throw new FuncionarioNaoEncontrado("Funcionario não encontrado");
                            }
                            break;

                        case 4:
                            System.out.println("Digitar ID do funcionario");
                            id = scanner.nextInt();
                            for (Funcionario f : listaDeFuncionarios) {
                                if (f.getIdFuncionario() == id) {
                                    encontrado = true;
                                }
                            }
                            if (encontrado) {
                                listaDeFuncionarios.remove(id - 1);
                            }else {
                                throw new FuncionarioNaoEncontrado("Funcionario não encontrado");
                            }
                            break;
                    }
            }
        } while (op != 0);
    }
}
