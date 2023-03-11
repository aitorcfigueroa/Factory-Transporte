import java.util.HashMap;
import java.util.Map;

public class Camion implements Transporte {
    private Map<String, Integer> medidasPale = Map.of("largo", 120, "ancho", 80, "peso", 1500);
    private Map<String, Integer> medidasCamion = Map.of("largo", 1148, "ancho", 226, "altura", 218, "peso", 25000);

    @Override
    public Float costeTotal(Integer cp) {
        return Float.valueOf(cp);
    }

    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        if (x <= 0 || y <= 0 || z <= 0 || peso <= 0) {
            System.out.println("[Error]: Invalid Data");
        } else if (x < 140 && y < 20 && z < 75 && peso < 50) {
            return 1;
        } else if (x <= medidasPale.get("largo") && y < medidasCamion.get("altura") && z <= medidasPale.get("ancho") && peso < medidasPale.get("peso")) {
            return 0;
        } else if (x < medidasCamion.get("largo") && y < medidasCamion.get("altura") && z < medidasCamion.get("ancho") && peso < medidasCamion.get("peso")) {
            return 2;
        } else {
            System.out.println("[Error]: El paquete es demasiado grande");
        }
        return null;
    }
}
