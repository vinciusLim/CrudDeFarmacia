package CRUD.Funcionario;

public class Gerente extends Funcionario {
    public Gerente(String nomeFuncionario, double salarioFuncionario) {
        super(nomeFuncionario, salarioFuncionario);
    }

    @Override
    public double getSalarioFuncionario() {
        return super.getSalarioFuncionario() * 2;
    }
}
