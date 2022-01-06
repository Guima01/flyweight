import java.util.HashMap;
import java.util.Map;

public class CargoFactory {
    private static Map<String, Cargo> cargos = new HashMap<>();

    public static Cargo getCargo(String funcao, float salario) {
        Cargo cargo = cargos.get(funcao);

        if (cargo == null) {
            cargo = new Cargo(funcao, salario);
            cargos.put(funcao, cargo);
        }
        return cargo;
    }

    public static int getTotalCargos() {
        return cargos.size();
    }
}