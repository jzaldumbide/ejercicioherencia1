// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Empleado E1=new Empleado("Pedro","0001");
    Operario O1=new Operario("Juan","0002");
    Directivo D1=new Directivo("Andrea","0003");


        O1.saludoOperario();
        O1.saludo();

        D1.saludoDirectivo();
        D1.saludo();

    }
}