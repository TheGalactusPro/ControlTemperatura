package temperatura;

public class SensorTemperatura {
    private String idSensor;
    private double valorActual;
    private String unidad;

    //Setter

    public void setValorActual(double valorActual){
        this.valorActual = valorActual;
    }

    public void setUnidad(String unidad){
        if (unidad != null && !unidad.trim().isEmpty())
            this.unidad = unidad;
    }

    public void setIdSensor(String idSensor){
        if (idSensor != null && !idSensor.trim().isEmpty())
            this.idSensor = idSensor;
    }

    //Getter

    public String getIdSensor(){
        return idSensor;
    }

    public double getValorActual(){
        return valorActual;
    }

    public String getUnidad() {
        return unidad;
    }

    public void mostrarLectura() {
        System.out.println(getValorActual()+" "+getUnidad());
    }
}