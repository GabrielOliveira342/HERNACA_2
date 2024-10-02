//import localDate
import java.time.LocalDate;
//class gerente 
public class Gerente extends Pessoa{
//atributos da class com encapsulamento
	 private LocalDate dataContratacao;
	 private double salarioBase;
	 private String departamento;

//construtores e os parametros definidos 
    public Gerente(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, String departamento) {
    	super(nome, cpf, dataNascimento);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

// getters e setters dos atributos 
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
