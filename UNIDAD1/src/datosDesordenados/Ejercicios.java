package datosDesordenados;

public class Ejercicios {
    
   /* public static boolean numPrimo(int a){
        int n=2;
        boolean comp=true;
        while ((comp)&&(n<a)){
            if((a%n)==0)
                comp=false;
            else
                n=n+1;
        }
        return comp;
    } */
    
    
    public static int totalDigitos(int a){
        int c=0;
        while (a!=0){
            a/=10;
            c++;
        }
        return c;
    }    
            
    public static   String numCapicua(int a){
        int residuo, numInverso=0, aux;
        aux=a;
        while (a!=0){//mientras (while) a(el numero que recibe) es diferente (!=) a 0 despues de los {} se pone lo que pasaria
            residuo=a%10; //% es para sacar el residuo de una division
            numInverso*=10+residuo; 
            a=a/10;//quita el ultimo digito
            
        }
        if (numInverso==aux) { //este es la condicion == es igual
            return("es un numero capicua");
        }
        else 
            return("no es capicua");
    }
      
    
    /*

public static String numPrimo(int n){
          int comp1,comp2;
          do{
              comp1=n%n;
              comp2=n/1;
              
          }while(n!=0);
          if((comp1==1) && (comp2==n)){
              return ("Es primo");  // ES PAR
          }
          else
              return ("NO es primo");
          
      }*/
          
      
    
    
    
}
