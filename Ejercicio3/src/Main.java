public class Main {
    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.añadirpuerta();
        System.out.println(micoche.puertas);
        suma(10,20,6);

    }
    public static void suma(int a, int b, int c){
        System.out.println(a+b+c);

    }
    static class coche{
       public int puertas = 4;

       public void añadirpuerta(){
           this.puertas++;
       }

    }
}