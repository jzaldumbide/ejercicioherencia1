public class Directivo extends Empleado{
    public Directivo(String nombre, String codigo) {
        super(nombre, codigo);
    }

    //metodo personalizado
    public void saludoDirectivo(){
        System.out.println("Este saludo es desde Directivo");
        System.out.println("Mi nombre es:");
        System.out.println(this.getNombre());
    }
}
