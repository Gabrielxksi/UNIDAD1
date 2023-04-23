package datosDesordenados;

import datosOrdenados.tools;

public class principal {
    
   
    public static void menu() {
        int tam = tools.leeInt("Tamaño del array:");
        ArrayOperacion oper = new ArrayOperacion(tam);

        byte op;
        do {
            op = tools.leeByte("1. Agregar datos\n2. Imprimir datos\n3. Buscar un dato\n4. Modificar un dato\n5. Eliminar un dato\n6.  Salir");

            switch (op) {
                case 1:
                    oper.agregarDatos();
                    break;
                case 2:
                    if (oper.arrayVacio()) {
                        tools.imprime("Array vacío");
                    } else {
                        oper.imprimirArray();
                    }
                    break;
                case 3:
                    int dato = tools.leeInt("¿Qué valor desea buscar?:");
                    if (oper.busquedaSecuencial(dato) == -1) {
                        tools.imprime("El dato no se encontró.");
                    } else {
                        tools.imprime("Se encontró el valor en la posición: " + oper.busquedaSecuencial(dato));
                    }
                    break;
                case 4:
                    if (oper.arrayVacio() == false) {
                        byte g = oper.busquedaSecuencial(tools.leeInt("ingresa el dato a modificar: "));
                        oper.modificaDato(g);
                    } else {
                        tools.imprime("Array vacio");
                    }
                    break;
                case 5:
                    if (oper.arrayVacio()) {
                        tools.imprime("Array vacio");
                    } else {
                        byte pos = oper.busquedaSecuencial(tools.leeByte("Dato a eliminar: "));
                        if (pos != -1) {
                            tools.imprime("El dato eliminado estaba en la posición: " + pos);
                            oper.eliminaDato(pos);
                        } else {
                            tools.errorMsj("El dato no se encuentra en el arreglo");
                        }
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while ((byte) op != 6);
    }

    public static void main(String[] args) {
    
     menu();
        
    }
}
