package CRUD.Funcionario;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    private static int proximoId = 1;
    private int idFuncionario;
    private String nomeFuncionario;
    private double salarioFuncionario;
    private Instant dataCadastro;
    private LocalDate dataAdmissao;
    private Departamentos departamento;

    public Funcionario(String nomeFuncionario, double salarioFuncionario, LocalDate dataAdmissao, Departamentos departamento) {
        this.idFuncionario = proximoId;
        proximoId++;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
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


    public Instant getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public Departamentos getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFuncionario=" + idFuncionario +
                ", nomeFuncionario='" + nomeFuncionario + '\'' +
                ", salarioFuncionario=" + salarioFuncionario +
                ", dataCadastro=" + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("-03:00")).format(dataCadastro) +
                ", dataAdmissao=" + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataAdmissao) +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
