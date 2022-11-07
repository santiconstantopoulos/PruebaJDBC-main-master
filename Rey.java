public class Rey extends Pieza{

    public Rey() {
    }
    
    public Rey(String nombrePieza, String capacidadDesplazamiento, String conducta, String color, String posicion) {
        super(nombrePieza, capacidadDesplazamiento, conducta, color, posicion);
        System.out.println("Se ha creado la Pieza del Rey");

    }




    @Override
    public void mover() {
        System.out.println("Se ha movido el Rey");
        return;
    }

    
    }