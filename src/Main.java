//import localDate
import java.time.LocalDate;
//class main 
public class Main {
    public static void main(String[] args) {
//criando vendedores e declarando os parametros 
        Vendedor vendedor = new Vendedor("João Silva", "123.456.789-00", LocalDate.of(1990, 5, 15), LocalDate.of(2020, 6, 1), 2500.00, 5.0);
//criando gerentes e declarando os parametros 
        Gerente gerente1 = new Gerente("Carlos Souza", "555.666.777-88", LocalDate.of(1975, 2, 20), LocalDate.of(2010, 2, 28), 5000.00, "TI");
//criando clientes e declarando os parametros 
        Cliente cliente1 = new Cliente("Pedro Gomes", "111.222.333-44", LocalDate.of(2000, 3, 13), "pedro@example.com", "12345", "9999-8888");
       
// System para exibir info do vendedores
        System.out.println("Vendedor 1:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("CPF: " + vendedor.getCpf());
        System.out.println("Data de Nascimento: " + vendedor.getDataNascimento());
        System.out.println("Data de Contratação: " + vendedor.getDataContratacao());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Percentual de Comissão: " + vendedor.getPercentualComissao());
// System para exibir info do gerente
        System.out.println("\nGerente 1:");
        System.out.println("Nome: " + gerente1.getNome());
        System.out.println("CPF: " + gerente1.getCpf());
        System.out.println("Data de Nascimento: " + gerente1.getDataNascimento());
        System.out.println("Data de Contratação: " + gerente1.getDataContratacao());
        System.out.println("Salário Base: " + gerente1.getSalarioBase());
        System.out.println("Departamento: " + gerente1.getDepartamento());
// System para exibir info do cliente
        System.out.println("\nCliente 1:");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Data de Nascimento: " + cliente1.getDataNascimento());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Número Cartão de Fidelidade: " + cliente1.getNumeroCartaoFidelidade());
        System.out.println("Telefone: " + cliente1.getTelefone());

    }
}

