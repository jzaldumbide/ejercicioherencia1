public class Empleado {
    String nombre;
    String codigo;

    public Empleado(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //metodo personalizado
    public void saludo(){
        System.out.println("Hola a todos desde empleado");
    }
}
