public class Oficial extends Operario{
    public Oficial(String nombre, String codigo) {
        super(nombre, codigo);
    }

    //metodo personalizado
    public void saludoOficial(){
        System.out.println("Este saludo es desde Oficial");
        System.out.println("Mi nombre es:");
        System.out.println(this.getNombre());
    }
}
