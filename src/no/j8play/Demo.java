package no.j8play;

import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * Short demo - Inspired by
 *
 * Functional principles for object oriented programmers
 * Jessica Kerr - Øredev 2013
 * http://oredev.org/2013/wed-fri-conference/functional-principles-for-object-oriented-developers
 *
 * Data in / Data out
 * Immutability
 * Verbs Are People Too
 * Declarative Style
 * Specific Typing
 * Lazy Evaluation
 */
public class Demo {

    public static void main(String[] args) {
        /*
         - Specific Typing
         - Expressiveness / Immutability
         - Domain language
         */
        final Set<Person> people = Sets.newHashSet(
                new Person(
                        new FirstName("Stein"),
                        new LastName("Kvarud")
                ),
                new Person(
                        new FirstName("Morten"),
                        new MiddleName("Weel"),
                        new LastName("Johnsen")
                ),
                new Person(
                        new FirstName("Kristian"),
                        new LastName("Klette")
                ),
                new Person(
                        new FirstName("Pål"),
                        new LastName("Ruud")
                ),
                new Person(
                        new FirstName("Simen"),
                        new MiddleName("Fure"),
                        new LastName("Jørgensen")
                ),
                new Person(
                        new FirstName("Rana"),
                        new MiddleName("Ranjit"),
                        new LastName("Singh")
                )
        );

        /* Declarative style
           - Say what you are doing. Not how
           Lazyness
           - Separate what to do from when to stop
        */






        /* Data in / Data out
           - No mutation
           - Can be static (Not very OO, but testable)
        */






        /* If you cant to immutability do idempotence
           - No toggles
        */




        /*
          Extra: OO, but immutable
         */


    }

}
