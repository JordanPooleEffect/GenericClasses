package Arithmetic;

public class Arithmetic {
    private final Number n1;
    private final Number n2;

    public Arithmetic(Number num1, Number num2) {
        this.n1 = num1;
        this.n2 = num2;
    }

    public double add() {
        return n1.doubleValue() + n2.doubleValue();
    }

    public double subtract() {
        return n1.doubleValue() - n2.doubleValue();
    }

    public double multiply() {
        return n1.doubleValue() * n2.doubleValue();
    }

    public double divide() {
        return n1.doubleValue() / n2.doubleValue();
    }

    public double getMin() {
        return Math.min(n1.doubleValue(), n2.doubleValue());
    }

    public double getMax() {
        return Math.max(n1.doubleValue(), n2.doubleValue());
    }
}
