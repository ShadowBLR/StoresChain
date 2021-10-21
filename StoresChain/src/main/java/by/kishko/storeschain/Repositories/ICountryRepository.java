package by.kishko.storeschain.Repositories;

import by.kishko.storeschain.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country, Long> {
    Country getCountryByName(String name);
}