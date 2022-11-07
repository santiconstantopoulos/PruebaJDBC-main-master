public class Tablero {
    
    Casillero casilleros[][] = new Casillero [8][8];

    public Tablero() {

        //primer for es para los que van para arriba A C E G. SI es impar es negro
        for(int i=0; i<8; i+=2){
            //esto es para setearlos verticalmente
            for(int j=0; j<8;j++){
                Casillero nuevoCasillero = new Casillero();
                if (j%2==0){
                    nuevoCasillero.setColor("Blanco");
                }
                else{
                    nuevoCasillero.setColor("Negro");
                }

                nuevoCasillero.setPos(((char)(i+65)) + String.valueOf(j+1));
                //System.out.println(nuevoCasillero.getPos());
                this.casilleros[i][j] = nuevoCasillero;

            }

        }

        for(int i=1; i<8; i+=2){
            //esto es para recorrerlos verticalmente
            for(int j=0; j<8;j++){
                Casillero nuevoCasillero = new Casillero();
                if (j%2==0){
                    nuevoCasillero.setColor("Negro");
                }
                else{
                    nuevoCasillero.setColor("Blanco");
                }

                nuevoCasillero.setPos(((char)(i+65)) + String.valueOf(j+1));
                //System.out.println(nuevoCasillero.getPos());
                this.casilleros[i][j] = nuevoCasillero;
            }

        }

        
    }



    
}
