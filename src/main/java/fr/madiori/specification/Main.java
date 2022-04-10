package fr.madiori.specification;

import fr.madiori.specification.entity.Person;
import fr.madiori.specification.pattern.Specification;
import fr.madiori.specification.specification.PersonAgeIsLessThan;
import fr.madiori.specification.specification.PersonIsMale;

public class Main {
    public static void main(String[] args) {

        System.out.println("coucou le monde");

        Person person = new Person("Vincent", "Crombez", 42, true);

        if(new PersonAgeIsLessThan().isSatisfiedBy(person)){
            System.out.println("Moins de 41!");
        } else {
            System.out.println("Plus de 41!");
        }

        if(new PersonIsMale().isSatisfiedBy(person)){
            System.out.println("C'est un homme!");
        } else {
            System.out.println("C'est une femme!");
        }
        person.setAge(39);
        person.setMale(true);
        if(new PersonAgeIsLessThan().and(new PersonIsMale()).isSatisfiedBy(person)){
            System.out.println("Combinaison ok");
        } else {
            System.out.println("Combinaison ko");
        }

        if(new PersonAgeIsLessThan().not().isSatisfiedBy(person)){
            System.out.println("not ok");
        }
    }
}
