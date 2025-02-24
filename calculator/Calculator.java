package mx.uv.fiee.iinf.poo.calculator;

public class Calculator <T extends Number>{
    private T[] numbers;

    public Calculator(T[] numbers) {
        this.numbers = numbers;
    }

    public double average() {
        double sum = 0.0;
        for (T num : numbers) {
            sum += num.doubleValue(); // Convertimos a double para operar
        }
        return numbers.length > 0 ? sum / numbers.length : 0; // Evitamos división por cero
    }
}