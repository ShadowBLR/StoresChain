package by.kishko.storeschain.Services;

import by.kishko.storeschain.Model.Country;
import by.kishko.storeschain.Repositories.ICountryRepository;
import by.kishko.storeschain.Services.Interfaces.ICountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CountryService implements ICountryService {
    private final ICountryRepository countryRepository;

    public CountryService(ICountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAll() {
        log.info(CountryService.class + ":findAll");
        return this.countryRepository.findAll();
    }

    @Override
    public void deleteCountryByName(String country) {
        log.info(CountryService.class + ":deleteCountryByName");
        this.deleteCountryByName(country);
    }

    @Override
    public void addCountry(String country) {
        log.info(CountryService.class + ":addCountry");
        this.deleteCountryByName(country);
    }
}
