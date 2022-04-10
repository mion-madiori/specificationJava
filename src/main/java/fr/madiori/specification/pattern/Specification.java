package fr.madiori.specification.pattern;

public interface Specification<T> {
    public boolean isSatisfiedBy(T candidate);
}
