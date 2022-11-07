public class Torre extends Pieza {

    public Torre() {
    }

    public Torre(String nombrePieza, String capacidadDesplazamiento, String conducta,String color, String posicion) {
        super(nombrePieza, capacidadDesplazamiento, conducta, color, posicion);
        System.out.println("Se ha creado la Pieza de la Torre");
    }

    @Override
    public void mover() {
    }

    
    }
