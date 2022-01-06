public class Funcionario {
    private String nome;
    private Cargo cargo;

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo.getFuncao() + '\'' +
                ", salario='" + cargo.getSalario() + '\'' +
                '}';
    }
}