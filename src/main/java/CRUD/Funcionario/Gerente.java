package CRUD.Funcionario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gerente extends Funcionario {
    public Gerente(String nomeFuncionario, double salarioFuncionario, String CPF, LocalDate dataAdmissao, String departamento) {
        super(nomeFuncionario, salarioFuncionario, CPF, dataAdmissao, departamento);
    }

    @Override
    public double getSalarioFuncionario() {
        return super.getSalarioFuncionario() * 2;
    }
}
