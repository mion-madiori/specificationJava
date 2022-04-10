package fr.madiori.specification.pattern.composition;

import fr.madiori.specification.pattern.Specification;

import java.util.HashSet;
import java.util.Set;

public class AndSpecification<T> extends AbstractSpecification<T> {
    private Set<Specification<T>> set = new HashSet<Specification<T>>();

    public AndSpecification(Specification<T> a, Specification<T> b) {
        set.add(a);
        set.add(b);
    }

    public boolean isSatisfiedBy(T candidate) {
        for (Specification<T> s : set) {
            if (!s.isSatisfiedBy(candidate)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public AbstractSpecification<T> and(Specification<T> s) {
        set.add(s);
        return this;
    }
}
