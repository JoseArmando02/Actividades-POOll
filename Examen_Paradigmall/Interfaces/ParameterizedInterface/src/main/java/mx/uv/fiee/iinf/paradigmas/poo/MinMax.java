package mx.uv.fiee.iinf.paradigmas.poo;
/*
 * INTEGRANTES DEL EQUIPO
 * - CANELA BELTRAN JOSE
 * - PICHAL PIO JOSE ARMANDO*/

/* implementa la interfaz Comparable para realizar las comparaciones
* a travez de la edad*/
public class MinMax<T extends Comparable<T>> implements IMinMax<T>
{
    private final T[] values;
    //Contructor de la clase
    public MinMax(T[] values){
        this.values = values;
    }
    @Override
    /*Obtine el valor minimo del conjunto de los elementos
     e imprime el valor, despues lo retorna*/
    public T min() {
        T min = values[0];
        for (T value : values) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        System.out.println("Este es el valor mínimo: ");
        return min;
    }
    @Override
    /*Obtiene el valor maximo de los elemntos y lo imprime
     retorna el valor encontrado*/
    public T max(){
        T max = values[0];
        for( T value : values){
            if(value.compareTo(max)>0){
                max = value;
            }
        }
        System.out.println("Este es el valor máximo: ");
        return max;
    }
}
