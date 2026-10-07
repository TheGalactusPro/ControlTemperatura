package temperatura;

public class Main {
    static void main() {
        SensorTemperatura s1 = new SensorTemperatura();
        SensorTemperatura s2 = new SensorTemperatura();

        s1.setValorActual(30);
        s1.setUnidad("C");
        s2.setValorActual(-0.5);
        s2.setUnidad("C");

        s1.mostrarLectura();
        s2.mostrarLectura();
    }
}
