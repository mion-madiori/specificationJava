package fr.madiori.specification.specification;

import fr.madiori.specification.entity.Person;
import fr.madiori.specification.pattern.composition.AbstractSpecification;

public class PersonAgeIsLessThan extends AbstractSpecification<Person> {
    @Override
    public boolean isSatisfiedBy(Person candidate) {
        Integer age = 40;
        return candidate.getAge() <= age;
    }
}
