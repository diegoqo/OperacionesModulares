package Operaciones;


import java.util.Arrays;
import java.util.Optional;

public enum OperacionesEnum {
    SUMA("1", "suma"),
    RESTA("2", "resta"),
    MULTIPLICACION("3", "multiplicación"),
    DIVISION("4", "división");

    private final String id;
    private final String descripcion;

    OperacionesEnum(String id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }

    public static Optional<OperacionesEnum> getOperacion(String codigo) {
        return  Arrays.stream(OperacionesEnum.values())
                        .filter(operacion -> codigo != null && operacion.id.equalsIgnoreCase(codigo))
                        .findFirst();
    }

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
