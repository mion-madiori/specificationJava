package fr.madiori.specification.pattern.composition;

import fr.madiori.specification.pattern.Specification;

public class NotSpecification<T> extends AbstractSpecification<T> {
   private Specification<T> spec;

   public NotSpecification(Specification<T> s){
       this.spec = s;
   }

    @Override
    public boolean isSatisfiedBy(T candidate) {
        return !spec.isSatisfiedBy(candidate);
    }
}
