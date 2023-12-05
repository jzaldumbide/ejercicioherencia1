public class Tecnico extends Operario{
    public Tecnico(String nombre, String codigo) {
        super(nombre, codigo);
    }

    //metodo personalizado
    public void saludoTecnico(){
        System.out.println("Este saludo es desde Tecnico");
        System.out.println("Mi nombre es:");
        System.out.println(this.getNombre());
    }


}
