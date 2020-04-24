package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

/**
 * The purpose of this model is to hold selective data from the rest country api system found at
 * <br><a href="https://restcountries.eu">https://restcountries.eu</a>
 * Note that this class is not an entity so will not get saved into the database.
 */

// needed to ignore any fields coming across that we do not want in our final class.
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryData
{
    /**
     * name for this country
     */
    private String name;

    /**
     * List of the internet top level domains assigned to this country
     */
    private List<String> topleveldomain;

    /**
     * The demonym, name, of the people of this country
     */
    private String demonym;

    /**
     * The population of this country
     */
    private long population;

    /**
     * List of currencies used in this country
     */
    private List<Currency> currencies;

    /**
     * Map of the translations of the name of this country. The country code with the translation
     */
    private Map<String, String> translations;

    // Yes we need getters and setters for all the fields so Jackson can convert from JSON to POJO

    /**
     * Getter for the name of this country
     *
     * @return the name (String) of this country
     */
    public String getName()
    {
        return name;
    }

    /**
     * Setter for the name of this country
     *
     * @param name the new name (String) of this country
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * List of the internet top level domains assigned to this country
     *
     * @return List of the internet top level domains (String) assigned to this country
     */
    public List<String> getTopleveldomain()
    {
        return topleveldomain;
    }

    /**
     * Setter for the list of the internet top level domains assigned to this country
     *
     * @param topleveldomain the new list of the internet top level domains (String) assigned to this country
     */
    public void setTopleveldomain(List<String> topleveldomain)
    {
        this.topleveldomain = topleveldomain;
    }

    /**
     * Getter for the demonym, name, of the people of this country
     *
     * @return The demonym, name, (String) of the people of this country
     */
    public String getDemonym()
    {
        return demonym;
    }

    /**
     * Setter for the demonym, name, of the people of this country
     *
     * @param demonym The new demonym, name, (String) of the people of this country
     */
    public void setDemonym(String demonym)
    {
        this.demonym = demonym;
    }

    /**
     * Getter for the population of this country
     *
     * @return the population (long) of this country
     */
    public long getPopulation()
    {
        return population;
    }

    /**
     * Setter for the population of this country
     *
     * @param population the new population (long) of this country
     */
    public void setPopulation(long population)
    {
        this.population = population;
    }

    /**
     * List of currencies used in this country
     *
     * @return list of Currency used in this country
     */
    public List<Currency> getCurrencies()
    {
        return currencies;
    }

    /**
     * Setter for the list of currencies used in the country
     *
     * @param currencies new list of Currency used in this country
     */
    public void setCurrencies(List<Currency> currencies)
    {
        this.currencies = currencies;
    }

    /**
     * Getter for the translations of this country's name
     *
     * @return Map with country code as key and the translation of this country's name for the given country code as the value
     */
    public Map<String, String> getTranslations()
    {
        return translations;
    }

    /**
     * Setter for the translations of this country's name
     *
     * @param translations new map with country code as key and the translation of this country's name for the given country code as the value
     */
    public void setTranslations(Map<String, String> translations)
    {
        this.translations = translations;
    }
}
