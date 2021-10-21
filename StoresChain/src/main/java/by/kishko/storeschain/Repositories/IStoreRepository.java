package by.kishko.storeschain.Repositories;

import by.kishko.storeschain.Model.Stores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStoreRepository extends JpaRepository<Stores,Long> {
    Stores getStoresByNameAndAddress();
}
