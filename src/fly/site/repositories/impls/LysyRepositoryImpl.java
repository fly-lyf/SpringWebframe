package fly.site.repositories.impls;

import fly.site.repositories.GenericJpaBaseRepository;
import fly.site.repositories.interfaces.LysyRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fly on 2016/10/8.
 */

@Repository
public class LysyRepositoryImpl extends GenericJpaBaseRepository<String, String> implements LysyRepository {

}
