package fr.madiori.specification.specification;

import fr.madiori.specification.entity.Person;
import fr.madiori.specification.pattern.composition.AbstractSpecification;

public class PersonIsMale extends AbstractSpecification<Person> {
    @Override
    public boolean isSatisfiedBy(Person person) {
        return person.getMale().equals(true);
    }
}
