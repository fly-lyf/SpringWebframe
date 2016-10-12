package fly.site.repositories;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<E, ID extends Serializable> extends PagingAndSortingRepository<E, ID> {
    void test(E e);
}
