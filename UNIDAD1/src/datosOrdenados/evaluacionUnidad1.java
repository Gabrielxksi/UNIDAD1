package datosOrdenados;

public class evaluacionUnidad1 {
    private String datos[];
    private byte j;
    
    public evaluacionUnidad1(int tam){
        //dimensionar
        datos = new String [tam]; 
        j = -1;
    }

    public boolean arrayVacio(){
        return (j == -1);
    }
    public void agregarDatos(){
        if(j<datos.length -1){ // en CASO DE DERBORDAMIENTO se le debe añadir
            datos[j+1] = tools.leeString("Escribe los nombres:");
            j++;
        }
        else 
            tools.errorMsj("Array lleno");
    }
    
    public void imprimirArray(){
        String cad = "";
        for (int i=0; i <= j ;i++){
            cad += "["+i+"] "+ datos[i]+ "\n";
        }
        tools.imprime ("Datos del array: \n " + cad);
    }
    public byte busquedaSecuencial(String dato) {
        byte i = 0;
        while (i <= j && dato.equals(datos [i])) {
            i++;
        }
        if (i > j)
            return (-1);
        else
            return i;
    }
    public void eliminaDato (byte pos){
        for (int k = pos; k < datos.length-1; k++) {
            datos[k]=datos[k+1];
        }
        j--;
    }
   /* public void modificaDato (byte pos){
        byte y=tools.leeByte("ingrese el nuevo numero: ");
        datos[pos]=y;
    }
}
   public static void main(String[] args) {
        
    }
    
}*/

}
