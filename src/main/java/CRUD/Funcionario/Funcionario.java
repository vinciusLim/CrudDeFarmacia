package CRUD.Funcionario;

public class Funcionario {
  private static int proximoId = 1;
  private int idFuncionario;
  private String nomeFuncionario;
  private double salarioFuncionario;

  public Funcionario(String nomeFuncionario, double salarioFuncionario) {
    this.nomeFuncionario = nomeFuncionario;
    this.salarioFuncionario = salarioFuncionario;
    this.idFuncionario = proximoId;
    proximoId++;
  }

  public static int getProximoId() {
    return proximoId;
  }

  public int getIdFuncionario() {
    return idFuncionario;
  }

  public String getNomeFuncionario() {
    return nomeFuncionario;
  }

  public double getSalarioFuncionario() {
    return salarioFuncionario;
  }

  @Override
  public String toString() {
    return "Funcionario: " +
            "ID = " + idFuncionario +
            ", nome = " + nomeFuncionario + '\'' +
            ", salario = " + salarioFuncionario;
  }
}
