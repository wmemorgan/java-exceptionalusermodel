package com.lambdaschool.usermodel.models;

/**
 * Class to hold different types of currencies from the country data
 */
public class Currency
{
    /**
     * Code (String) for the currency
     */
    private String code;

    /**
     * Name (String) for the currency
     */
    private String name;

    /**
     * Symbol (String) for the currency
     */
    private String symbol;

    /**
     * Getter for Code for the currency
     *
     * @return code (String) for the currency
     */
    public String getCode()
    {
        return code;
    }

    /**
     * Setter for Code for the currency
     *
     * @param code the new code (String) for this currency
     */
    public void setCode(String code)
    {
        this.code = code;
    }

    /**
     * Getter for Name for the currency
     *
     * @return name (String) for the currency
     */
    public String getName()
    {
        return name;
    }

    /**
     * Setter for Name for the currency
     *
     * @param name the new name (String) for this currency
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Getter for Symbol for the currency
     *
     * @return symbol (String) for the currency
     */
    public String getSymbol()
    {
        return symbol;
    }

    /**
     * Setter for Symbol for the currency
     *
     * @param symbol the new Symbol (String) for this currency
     */
    public void setSymbol(String symbol)
    {
        this.symbol = symbol;
    }
}
