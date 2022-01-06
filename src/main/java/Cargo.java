public class Cargo {
    private String funcao;
    private float salario;

    public Cargo(String funcao, float salario) {
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public float getSalario() {
        return salario;
    }
}