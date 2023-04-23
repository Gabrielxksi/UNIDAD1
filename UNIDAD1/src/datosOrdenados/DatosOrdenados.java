package datosOrdenados;


import javax.swing.JOptionPane;

public class DatosOrdenados {

    private int ordenados[];
    private byte p;
    
    public DatosOrdenados(int tam){
    
        ordenados = new int[tam];
        p=-1;
    }
    
    public boolean validaVacio(){
    
        return(p==-1);
    }
    
    public void imprimeDatos(){
    
        String cad = "";
        for(int i = 0; i<= p ; i++){
           // cad += i+"["+ordenados[i]+"] "+ "\n";
            cad += "["+i+"] "+ ordenados[i]+ "\n";

        }
        JOptionPane.showMessageDialog(null,"Datos en el array:\n" +  cad);
    }

    public byte busquedaSecuencialOrdenada(int dato) {

        byte i = 0;
    
        while(i <= p && ordenados[i] <dato)
        
            i++;
        return(byte) ((i > p || ordenados[i] > dato)? -i: i);    
        
      /*  while (i <= p && ordenados[i] < dato) 
            i++; 
        if (i > p)
            return (-1);
        else
            return i;*/
    }
    
    public void eliminaDatos(byte pos) {

        for (int j = pos; j < p; j++) {

            ordenados[j] = ordenados[j + 1];
        }
        p--;
    }

    public void recorrePosiciones(byte pos) {

        for (int j = p + 1; j > pos; j--) {
            ordenados[j] = ordenados[j - 1];

        }
    }

    public void agregarOrdenado() {

        int dato = tools.leeInt("Dame un valor entero:");
        if (validaVacio()) {

            ordenados[p + 1] = dato;
            p++;
        } else {
            byte pos = busquedaSecuencialOrdenada(dato);

            //>0
            if (pos > dato) {
                tools.imprime("Ya existe el dato.");
            } else {
                pos *= -1;
                recorrePosiciones(pos);
                ordenados[pos] = dato;
                p++;
            }
        }
    }

    public void modificar(byte pos) {

        int dato = tools.leeInt("Dame el nuevo valor:");

        if (pos == 0 && dato < ordenados[pos + 1]) {
            ordenados[pos] = dato;
        } 
        else {

            if (pos == p && dato > ordenados[pos - 1]) {
                ordenados[pos] = dato;
        
            }
            else {
                
                if (pos > 0 && pos < p) {

                    ordenados[pos] = dato;
                }
                else {
                    JOptionPane.showMessageDialog(null, dato, "No fue posible modificar.", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }
}