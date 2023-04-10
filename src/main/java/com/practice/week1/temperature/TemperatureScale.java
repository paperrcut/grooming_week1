package com.practice.week1.temperature;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TemperatureScale {
    CELSIUS("C"),
    FAHRENHEIT("F");

    public final String symbol;

    public static TemperatureScale getScalefromSymbol(String symbol)
    {
        for(TemperatureScale value : TemperatureScale.values()) {
            if (value.symbol.equalsIgnoreCase(symbol) )
            {
                return value;
            }
        }
        return TemperatureScale.CELSIUS;            //Default Scale  ---> CELSIUS
    }
}
