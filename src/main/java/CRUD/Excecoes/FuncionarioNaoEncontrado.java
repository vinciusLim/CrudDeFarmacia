package CRUD.Excecoes;

public class FuncionarioNaoEncontrado extends IllegalArgumentException {
    public FuncionarioNaoEncontrado() {
    }

    public FuncionarioNaoEncontrado(String message) {
        super(message);
    }
}
