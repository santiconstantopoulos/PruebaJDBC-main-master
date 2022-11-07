public class Alfil extends Pieza {

    public Alfil() {
    }

    public Alfil(String nombrePieza, String capacidadDesplazamiento, String conducta, String color, String posicion) {
        super(nombrePieza, capacidadDesplazamiento, conducta, color, posicion);
        System.out.println("Se ha creado la Pieza del Alfil");
    }

    @Override
    public void mover() {
    }

}
