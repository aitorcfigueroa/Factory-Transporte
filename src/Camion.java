public class Camion implements Transporte {
    @Override
    public Float costeTotal(Integer cp) {
        return Float.valueOf(cp);
    }

    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        if (x <= 0 || y <= 0 || z <= 0 || peso <= 0) {
            System.out.println("[Error]: Invalid Data");
        } else if (x < medidasCarton.get("largo") && y < medidasCarton.get("alto") && z < medidasCarton.get("ancho") && peso < medidasCarton.get("peso")) {
            return 1;
        } else if (x <= medidasPale.get("largo") && y < medidasMadera.get("altura") && z <= medidasPale.get("ancho") && peso < medidasPale.get("peso")) {
            return 0;
        } else if (x < medidasMadera.get("largo") && y < medidasMadera.get("altura") && z < medidasMadera.get("ancho") && peso < medidasMadera.get("peso")) {
            return 2;
        } else {
            System.out.println("[Error]: El paquete es demasiado grande");
        }
        return null;
    }
}
