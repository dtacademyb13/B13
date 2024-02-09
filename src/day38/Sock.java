package day38;

import java.util.Objects;

public class Sock{

    private String color;
    private String pattern;

    public Sock(String color, String pattern) {
        this.color = color;
        this.pattern = pattern;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }


    @Override
    public String toString() {
        return "Sock{" +
                "color='" + color + '\'' +
                ", pattern='" + pattern + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sock sock = (Sock) o;
        return Objects.equals(color, sock.color) && Objects.equals(pattern, sock.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color,pattern);
    }
}