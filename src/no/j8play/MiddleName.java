package no.j8play;

public class MiddleName {

    public final String stringValue;

    public MiddleName(final String value) {
        this.stringValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MiddleName lastName = (MiddleName) o;

        if (!stringValue.equals(lastName.stringValue)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return stringValue.hashCode();
    }
}
