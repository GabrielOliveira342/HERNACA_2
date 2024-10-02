//import do localDate
import java.time.LocalDate;
//class vendedor 
public class Vendedor extends Pessoa {
//atributos da class com encapsulamento 
	
    private LocalDate dataContratacao;
    private double salarioBase;
    private double percentualComissao;
//construtores e os parametros definidos 
    public Vendedor(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, double percentualComissao) {
    	super (nome, cpf, dataNascimento);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
    }

// getters e setters para os atributos 
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

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}