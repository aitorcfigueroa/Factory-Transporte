public class Bicicleta implements Transporte {
    @Override
    public Float costeTotal(Integer cp) {
        Float coste = Float.valueOf(cp);
        return coste;
    }

    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        if (x <= 0 || y <= 0 || z <= 0 || peso <= 0) {
            System.out.println("[Error]: Invalid Data");
        } else if (x < medidasCarton.get("largo") && y < medidasCarton.get("alto") && z < medidasCarton.get("ancho") && peso < medidasCarton.get("peso")) {
            return 1;
        } else {
            System.out.println("[Error]: El paquete es demasiado grande");
        }

        return null;
    }
}
