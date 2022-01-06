import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarFuncionarios() {
        Empresa empresa = new Empresa();

        empresa.contratar("Carlos", "Analista de Suporte", 4000f);
        empresa.contratar("Julia", "Analista de Suporte", 4000f);
        empresa.contratar("Aline", "Analista de Suporte", 4000f);
        empresa.contratar("Marcelo", "Analista de Infra", 3500f);
        empresa.contratar("Humberto", "Analista de Infra", 3500f);
        empresa.contratar("Marco", "Desenvolvedor", 4500f);
        empresa.contratar("Ricardo", "Desenvolvedor", 4500f);

        List<String> exibir = Arrays.asList(
                "Funcionario{nome='Carlos', cargo='Analista de Suporte', salario='4000.0'}",
                "Funcionario{nome='Julia', cargo='Analista de Suporte', salario='4000.0'}",
                "Funcionario{nome='Aline', cargo='Analista de Suporte', salario='4000.0'}",
                "Funcionario{nome='Marcelo', cargo='Analista de Infra', salario='3500.0'}",
                "Funcionario{nome='Humberto', cargo='Analista de Infra', salario='3500.0'}",
                "Funcionario{nome='Marco', cargo='Desenvolvedor', salario='4500.0'}",
                "Funcionario{nome='Ricardo', cargo='Desenvolvedor', salario='4500.0'}"
        );
        assertEquals(exibir, empresa.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalCargos() {
        Empresa empresa = new Empresa();

        empresa.contratar("Carlos", "Analista de Suporte", 4000f);
        empresa.contratar("Julia", "Analista de Suporte", 4000f);
        empresa.contratar("Aline", "Analista de Suporte", 4000f);
        empresa.contratar("Marcelo", "Analista de Infra", 3500f);
        empresa.contratar("Humberto", "Analista de Infra", 3500f);
        empresa.contratar("Marco", "Desenvolvedor", 4500f);
        empresa.contratar("Ricardo", "Desenvolvedor", 4500f);
        empresa.contratar("Cláudia", "Desenvolvedor", 4500f);

        assertEquals(3, CargoFactory.getTotalCargos());
    }
}