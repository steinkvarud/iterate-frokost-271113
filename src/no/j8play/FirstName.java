package no.j8play;

public class FirstName {

    public final String stringValue;

    public FirstName(final String value) {
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

        FirstName firstName = (FirstName) o;

        if (!stringValue.equals(firstName.stringValue)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return stringValue.hashCode();
    }
}
