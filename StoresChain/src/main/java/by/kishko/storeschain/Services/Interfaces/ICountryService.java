package by.kishko.storeschain.Services.Interfaces;

import by.kishko.storeschain.Model.Country;

import java.util.List;

public interface ICountryService {
    List<Country> findAll();
    void deleteCountryByName(String country);
    void addCountry(String country);
}
