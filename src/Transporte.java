public interface Transporte {
    Float costeTotal(Integer cp);
    Integer tipoEmbalaje(Float x, Float y, Float z, Float peso);
}
