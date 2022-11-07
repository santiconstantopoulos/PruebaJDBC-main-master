public class Reina extends Pieza {

    public Reina() {
    }


    public Reina(String nombrePieza, String capacidadDesplazamiento, String conducta, String color, String posicion) {
        super(nombrePieza, capacidadDesplazamiento, conducta, color, posicion);
        System.out.println("Se ha creado la Pieza de la Reina");
    }

    @Override
    public void mover() {
        
    }

    }

