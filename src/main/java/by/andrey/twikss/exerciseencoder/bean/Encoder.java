package by.andrey.twikss.exerciseencoder.bean;

import java.util.Objects;

public class Encoder {
    short number;
    char symbol;

    public Encoder(short number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    public short getNumber() {
        return number;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encoder encoder = (Encoder) o;
        return number == encoder.number &&
                symbol == encoder.symbol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, symbol);
    }

    @Override
    public String toString() {
        return "Encoder{" +
                "number=" + number +
                ", symbol=" + symbol +
                '}';
    }
}
