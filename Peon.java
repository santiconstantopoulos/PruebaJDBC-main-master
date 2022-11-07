public class Peon extends Pieza{

    public Peon() {
    }

    public Peon(String nombrePieza, String capacidadDesplazamiento, String conducta, String color, String posicion) {
        super(nombrePieza, capacidadDesplazamiento, conducta, color, posicion);
        System.out.println("Se ha creado la Pieza del Peon");
    }
    @Override
    public void mover() {
        
    }

}
