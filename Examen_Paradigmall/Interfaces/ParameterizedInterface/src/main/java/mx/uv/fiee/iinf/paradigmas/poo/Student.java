package mx.uv.fiee.iinf.paradigmas.poo;
/*
* INTEGRANTES DEL EQUIPO
* - CANELA BELTRAN JOSE
* - PICHAL PIO JOSE ARMANDO*/

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    //Constructor para los nombres y edad de los estudiantes
    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }
    //se obtiene la edad del estudiante y lo retorna
    public int GetAge(){
        return age;
    }

    @Override
    /*Compara a los estudiantes con respecto a su edad
    * @param other Otro objeto Student con el que se va a comparar
    * @return Valor negativo si este objeto es menor, cero si son iguales, positivo si es mayor*/
    public int compareTo(Student other){
        return Integer.compare(this.age, other.age);
    }

    @Override
    //imprime la cadena de informacion del estudiante
    public String toString () {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                " }";
    }
}