public abstract class Pieza {

    private String nombrePieza;
    private String capacidadDesplazamiento;
    private String conducta;
    private String color;
    private String posicion;

    public Pieza ()
    {

    }
    public Pieza(String nombrePieza, String capacidadDesplazamiento, String conducta, String color, String posicion){        
        this.nombrePieza = nombrePieza;
        this.capacidadDesplazamiento = capacidadDesplazamiento;
        this.conducta = conducta;
        this.color = color;
        this.posicion = posicion;
    }

    public String getNombrePieza() {
        return nombrePieza;
    }

    public void setNombrePieza(String nombrePieza) {
        this.nombrePieza = nombrePieza;
    }

    public String getCapacidadDesplazamiento() {
        return capacidadDesplazamiento;
    }

    public void setCapacidadDesplazamiento(String capacidadDesplazamiento) {
        this.capacidadDesplazamiento = capacidadDesplazamiento;
    }

    public String getConducta() {
        return conducta;
    }

    public void setConducta(String conducta) {
        this.conducta = conducta;
    }

    public String getColor() {
        if (color == "Negro") {
            return "2";
        } else
            return "1";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public abstract void mover();

}
