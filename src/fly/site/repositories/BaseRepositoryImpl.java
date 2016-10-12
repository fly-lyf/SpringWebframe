package fly.site.repositories;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;

public class BaseRepositoryImpl<E, ID extends Serializable> extends SimpleJpaRepository<E, ID>
        implements BaseRepository<E, ID> {

    private final Class<E> entityClass;
    private EntityManager entityManager;



    public BaseRepositoryImpl(Class<E> entityClass, EntityManager entityManager) {
        super(entityClass, entityManager);
        this.entityClass = entityClass;
        this.entityManager = entityManager;
    }

    @Override
    public void test(E entity){
        System.out.println(123123);
    }
}
