package fr.madiori.specification.pattern.composition;

import fr.madiori.specification.pattern.Specification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractSpecification<T> implements Specification<T> {

    public abstract boolean isSatisfiedBy(T candidate);

    public AbstractSpecification<T> or(Specification<T> s){
        return new OrSpecification<T>(this, s);
    }

    public AbstractSpecification<T> and(Specification<T> s){
        return new AndSpecification<T>(this, s);
    }

    public AbstractSpecification<T> not(){
        return new NotSpecification<>(this);
    }
}
