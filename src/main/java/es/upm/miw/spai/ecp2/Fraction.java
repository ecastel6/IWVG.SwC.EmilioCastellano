package es.upm.miw.spai.ecp2;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Object isImproper() {
        return getNumerator() > getDenominator();
    }

    public boolean isProper() {
        return getNumerator() < getDenominator();
    }

    public Fraction multiplyFractions(Fraction f1, Fraction f2) {
        Fraction fs = new Fraction();
        fs.numerator = f1.numerator * f2.numerator;
        fs.denominator = f1.denominator * f2.denominator;
        return fs;
    }
}
