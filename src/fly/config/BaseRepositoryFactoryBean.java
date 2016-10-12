package fly.config;

import fly.site.repositories.BaseRepositoryImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * Created by admin on 2016/10/12.
 */

public class BaseRepositoryFactoryBean<R extends JpaRepository<E, ID>, E, ID extends Serializable> extends JpaRepositoryFactoryBean<R, E, ID> {
    @Override
    protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {
        return new BaseRepositoryFactory<E, ID>(entityManager);
    }

    private static class BaseRepositoryFactory<E, ID extends Serializable> extends JpaRepositoryFactory {
        private EntityManager entityManager;

        public BaseRepositoryFactory(EntityManager entityManager) {
            super(entityManager);
            this.entityManager = entityManager;
        }

        @Override
        @SuppressWarnings("unchecked")
        protected Object getTargetRepository(RepositoryMetadata metadata) {
            return new BaseRepositoryImpl<E, ID>(
                    (Class<E>) metadata.getDomainType(), this.entityManager
            );
        }

        @Override
        protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
            return BaseRepositoryImpl.class;
        }
    }
}


