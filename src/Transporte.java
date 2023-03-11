import java.util.Map;

public interface Transporte {
    Map<String, Integer> medidasCarton = Map.of("largo", 70, "ancho", 50, "alto", 70, "peso", 90);
    Map<String, Integer> medidasPale = Map.of("largo", 120, "ancho", 80, "peso", 1500);
    Map<String, Integer> medidasMadera = Map.of("largo", 1148, "ancho", 226, "altura", 218, "peso", 25000);

    static Float costeTotal(Integer cp) {
        Float coste = Float.valueOf(cp);
        return coste;
    };
    static Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        return null;
    };
}
