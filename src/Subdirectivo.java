public class Subdirectivo extends Directivo{
    public Subdirectivo(String nombre, String codigo) {
        super(nombre, codigo);
    }

    public void saludoSubdirectivo(){
        System.out.println("Este saludo es desde Subdirectivo");
        System.out.println("Mi nombre es:");
        System.out.println(this.getNombre());
    }
}
