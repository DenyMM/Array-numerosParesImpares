import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        int i; // indice//
        int[] numbers = new int[40]; // se declara el arreglo con el limite de numeros//

        Scanner newNumb = new Scanner(System.in);
        
        for(i=0; i<numbers.length; i++) //se recorre el arreglo//
        {
        System.out.printf("Introduce el número %d: ", i+1);
        numbers[i] = newNumb.nextInt(); //se guardan los numeros insertados//
        }
        
        //se imprime de manera ascendente//
        System.out.println("Ascendente pares");
        for(i=0; i<numbers.length; i++){ // despues de recorrer el arreglo se condiciona//
            if(numbers[i]%2==0)
        {  // se imprimen los numeros pares e impares se llama al metodo Ascendent()    	
        System.out.println(numbers[i]);
        Ascendent(numbers);     
        }
        }
        System.out.println("Ascendente impares");
        for(i=0; i<numbers.length; i++){ // despues de recorrer el arreglo se condiciona//
            if(numbers[i]%2!=0)
        {       
        System.out.println(numbers[i]);
        Ascendent(numbers);     
        }
        }
        
      //se imprime de manera descendente//
        System.out.println("Descendente pares");
        for(i=0; i<numbers.length; i++){ // despues de recorrer el array se condiciona//
            if(numbers[i]%2==0)
        {  // se imprimen los numeros pares e impares se llama al metodo Descendent()   
        System.out.println(numbers[i]);
        Descendent(numbers);  
        }
        }
        System.out.println("Descendente impares");
        for(i=0; i<numbers.length; i++){ // despues de recorrer el array se condiciona//
            if(numbers[i]%2!=0)
        {
        System.out.println(numbers[i]);
        Descendent(numbers);  
        }
        } 
    }
	
// Se declara el metodo Ascendent para ordenar el arreglo
static void Ascendent(int[] arreglo) {
        //Iteramos sobre el arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
             int min = i;
        //Se busca el numero menor
        for (int j = i + 1 ; j < arreglo.length ; j++) {
             if (arreglo[j] < arreglo[min]) {
                 min = j;    //aqui se encuentra el numero menor
             }
        }
             if (i != min) {
                 //Aqui se ordenan los valores
                 int aux = arreglo[i];
                 arreglo[i] = arreglo[min];
                 arreglo[min] = aux;
             }
        }    
}

//Se declara el metodo Descendent para ordenar el arreglo
static void Descendent(int[] arreglo) {
	    //Iteramos sobre el arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
             int max = i;
        //Se busca el numero mayor
        for (int j = i + 1 ; j < arreglo.length ; j++) {
             if (arreglo[j] > arreglo[max]) {
                 max = j;    //aqui se encuentra el numero mayor
             }
        }
             if (i != max) {
                 //Aqui se ordenan los valores
                 int aux = arreglo[i];
                 arreglo[i] = arreglo[max];
                 arreglo[max] = aux;
             }
        }
}
}