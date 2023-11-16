package CRUD.Funcionario;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Funcionario {
  private static int proximoId = 1;
  private int idFuncionario;
  private String nomeFuncionario;
  private double salarioFuncionario;
  private String CPF;
  private Instant dataCadastro;
  private LocalDate dataAdmissao;
  private String departamento;

  public Funcionario(String nomeFuncionario, double salarioFuncionario, String CPF, LocalDate dataAdmissao, String departamento) {
    this.idFuncionario = proximoId;
    proximoId++;
    this.nomeFuncionario = nomeFuncionario;
    this.salarioFuncionario = salarioFuncionario;
    this.CPF = CPF;
    this.dataCadastro = Instant.now();
    this.dataAdmissao = dataAdmissao;
    this.departamento = departamento;
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

  public String getCPF() {
    return CPF;
  }

  public Instant getDataCadastro() {
    return dataCadastro;
  }

  public LocalDate getDataAdmissao() {
    return dataAdmissao;
  }

  public String getDepartamento() {
    return departamento;
  }

  @Override
  public String toString() {
    return "Funcionario{" +
            "idFuncionario=" + idFuncionario +
            ", nomeFuncionario='" + nomeFuncionario + '\'' +
            ", salarioFuncionario=" + salarioFuncionario +
            ", CPF='" + CPF + '\'' +
            ", dataCadastro=" + dataCadastro +
            ", dataAdmissao=" + dataAdmissao +
            ", departamento='" + departamento + '\'' +
            '}';
  }
}
