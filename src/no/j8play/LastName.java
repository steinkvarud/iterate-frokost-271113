package no.j8play;

public class LastName {

    public final String stringValue;

    public LastName(final String value) {
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

        LastName lastName = (LastName) o;

        if (!stringValue.equals(lastName.stringValue)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return stringValue.hashCode();
    }
}
