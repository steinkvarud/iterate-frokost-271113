package no.j8play;

import java.util.Optional;

import static com.google.common.base.Preconditions.checkNotNull;

public class Person {

    //Final fields... they are immutable so why not?
    public final FirstName firstName;
    public final Optional<MiddleName> middleName; //Optional helps expressiveness
    public final LastName lastName;

    public Person(
            final FirstName firstName,
            final MiddleName middleName,
            final LastName lastName
    ) {
        this(firstName, Optional.ofNullable(middleName), lastName);
    }

    public Person(
            final FirstName firstName,
            final LastName lastName
    ) {
        this(firstName, Optional.empty(), lastName);
    }

    //Fields only set at construction
    private Person(
            final FirstName firstName,
            final Optional<MiddleName> middleName,
            final LastName lastName
    ) {
        this.firstName = checkNotNull(firstName);
        this.middleName = checkNotNull(middleName);
        this.lastName = checkNotNull(lastName);
    }







    //Idempotence
    private EmployeeStatus employeeStatus = EmployeeStatus.Unemployed;

    public EmployeeStatus hire() {
        this.employeeStatus = EmployeeStatus.Employed;
        return employeeStatus;
    }

    public EmployeeStatus fire() {
        this.employeeStatus = EmployeeStatus.Unemployed;
        return employeeStatus;
    }

    //OO, but still immutable
    public Person changeName(LastName newLastName) {
        return new Person(firstName, middleName, newLastName);
    }

    @Override
    public String toString() {
        return firstName + " " + middleName.orElse(new MiddleName("")) + (middleName.isPresent() ? " " : "") + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person user = (Person) o;

        if (!firstName.equals(user.firstName)) return false;
        if (!lastName.equals(user.lastName)) return false;
        if (!middleName.equals(user.middleName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + middleName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
