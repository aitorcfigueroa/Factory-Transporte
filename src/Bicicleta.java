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
        } else if (x < 140 && y < 20 && z < 75 && peso < 50) {
            return 1;
        } else {
            System.out.println("[Error]: El paquete es demasiado grande");
        }

        return null;
    }
}
