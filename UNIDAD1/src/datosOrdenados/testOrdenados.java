package datosOrdenados;

public class testOrdenados {
           
public static void menu(){
        int tam = tools.leeInt("Tamaño del array:");
        DatosOrdenados oper = new DatosOrdenados(tam);
        
        byte op;
        do {
            op = tools.leeByte("1. Agregar datos\n2. Imprimir datos\n3. Busqueda secuencial ordenada\n"+
                    "4. Eliminar\n5..Modificar\n7.Salir");

            switch (op) {
                
                // AGREGAR ORDENADO
                case 1:
                    oper.agregarOrdenado();
                break;
                
                // IMPRIMIR DATOS
                case 2:
                    if (oper.validaVacio()) {
                        tools.imprime("Array vacío");
                    } 
                    else {
                        oper.imprimeDatos();
                    }
                    break;
                    
                // BUSQUEDA SECUENCIAL ORDENADA
                case 3:
                    
                    int dato = tools.leeInt("¿Qué valor desea buscar?:");
                    if (oper.busquedaSecuencialOrdenada(dato) == -1)
                    {
                        tools.imprime("El dato no se encontró.");
                    }
                    else{
                    tools.imprime("Se encontró el valor en la posición: " + oper.busquedaSecuencialOrdenada(dato));
                    }
                    break;
                 
                // ELIMINAR DATOS
                case 4: 
                    if (oper.validaVacio()){
                        tools.imprime("Array vacío");
                    }
                    else{
                        byte pos = tools.leeByte("¿Que valor desea borrar?:");
                        oper.busquedaSecuencialOrdenada((int)pos);
                        
                        if(pos!= -1) {oper.eliminaDatos(pos);}
                        else tools.imprime("El dato no se encuentra en el array."); 
                    }
                    
                    break;
                
                // MODIFICAR DATOS
                case 5: 
                    if (oper.validaVacio()) {
                        tools.imprime("Array vacío.");
                    } else {
                        dato = tools.leeInt("Dato a modificar:");
                        
                        byte pos = oper.busquedaSecuencialOrdenada(dato);
                            oper.modificar(pos);
                    }
                    
                    break;
                
                // SALIR & DEFAULT
                case 6: break;
                default: System.out.println("Opción no válida.");
            }
        } while ((byte) op != 6);
    }       
    public static void main(String[] args) {
    
     menu();
        
    } 
    }

