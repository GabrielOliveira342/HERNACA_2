//import local date
import java.time.LocalDate;
//class cliente
public class Cliente extends Pessoa{
//atributos da class com encapsulamento    
	
    private String email;
    private String numeroCartaoFidelidade;
    private String telefone;
//construtores e os parametros da class 
    public Cliente(String nome, String cpf, LocalDate dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        super(nome, cpf, dataNascimento);
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

// getters e setters dos atributos
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }

    public void setNumeroCartaoFidelidade(String numeroCartaoFidelidade) {
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
