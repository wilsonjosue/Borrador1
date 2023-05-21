import java.util.*;
public class Ejercicio3 {

   
    public static void main(String[] args) {
    
    Scanner dar=new Scanner(System.in);
     
    int cant;
    System.out.println("Ingresa el tamaño de la base"); 
    cant=dar.nextInt();
    
    String[] base=new String[cant];
    
    trianguloRecursivo(cant);
    
    }
    public static void trianguloRecursivo(int base){
        
        int j;
        String cad="";
        //Me permitira guardar las cadenas en su respectivo lugar
        String[] cadena=new String[base];
        
        if(base==0){
            System.out.println("Triangulo recursivo");
        } 
        else{
            if(base>0){
            for(int i=0; i<base;i++){
                cad=cad+"*";
            }
            cadena[base-1]=cad;
            //Me volvera a llamar otra vez al mwetodo trianguloRecursivo()
            trianguloRecursivo(base-1);
            }
        }
        /** 
         Para imprimir el triangulo recursivo llamamos al metodo
         imprimirTrianguloRecursivo();
        */
        imprimirTrianguloRecursivo(cadena);
    }
    
    public static void imprimirTrianguloRecursivo(String[] array){
        
        for(int i=0; i<array.length;i++){
            if(array[i]!=null)
                System.out.println(array[i]); 
        }
    }
}