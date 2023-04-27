package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        
        //HashSet -> Evita los valores duplicados y los va ordenando.
        HashSet<String> nombres = new HashSet();
  
        nombres.add("Vigil");
        nombres.add("Aaron");
        nombres.add("Alan");
        nombres.add("Aaron");
        
        for(String nombre : nombres){
            System.out.println(nombre);
        }
        
        //TreeSet -> Mantiene los elementos de forma ordenada pero los métodos para agregar y eliminar son más lentos. No permite valores duplicados
        TreeSet<Integer> numeros = new TreeSet();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(5);
        numeros.add(3);
        numeros.add(2);
        
        for (Integer numero : numeros){
            System.out.println(numero);
        }
        
        //LinkedHashSet -> Se agregan los elementos en el orden que los vayas agregando. No permite valores duplicados.
        LinkedHashSet<String> paises = new LinkedHashSet();
        
        paises.add("Argentina");
        paises.add("Colombia");
        paises.add("Venezuela");
        paises.add("Argentina");
        paises.add("Brasil");
        
        for(String pais : paises){
            System.out.println(pais);
        }
    }
    
}
