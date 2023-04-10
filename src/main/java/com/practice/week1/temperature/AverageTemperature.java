package com.practice.week1.temperature;
import java.util.Locale;
import java.util.Scanner;
public class AverageTemperature {

    public static double toCelsius(double temp, TemperatureScale scale){
        return (scale==TemperatureScale.CELSIUS?temp:(((temp - 32) * 5)/9));
    }

    public static double toFahrenheit(double temp, TemperatureScale scale){
        return (scale==TemperatureScale.FAHRENHEIT?temp:((temp * 9)/5 + 32));
    }

    public static void main(String[] args)
    {
        String city;
        String month;
        int days=0;
        double sum=0.0;
        double avgTempCelsius;
        double avgTempCFahrenheit;

        Scanner sc = new Scanner(System.in);

        System.out.print("City: ");
        city = sc.nextLine();

        System.out.print("Month: ");
        month = sc.nextLine();

        System.out.println("Min and Max temp for each day of month in F or C (min max F/C): ");
        while(true&&days<30)
        {
            System.out.print("Day " + (days+1) + ": ");
            String minmaxTempString = sc.nextLine();

            if(minmaxTempString.isEmpty())
                break;

            String[] tempSplit = minmaxTempString.split(" ");
            double min = Double.parseDouble(tempSplit[0]);
            double max = Double.parseDouble(tempSplit[1]);
            TemperatureScale scale = TemperatureScale.getScalefromSymbol((tempSplit[2]));

            double minCelsius = toCelsius(min, scale);
            double maxCelsius = toCelsius(max, scale);
            //double minFahrenheit = toFahrenheit(min, scale);
            //double maxFahrenheit = toFahrenheit(max, scale);

            sum+=(maxCelsius+minCelsius) / 2;
            days++;
        }

        avgTempCelsius = sum/days;
        avgTempCFahrenheit = toFahrenheit(avgTempCelsius,TemperatureScale.CELSIUS);

        System.out.println("Average temp in "+ city + " in the month of "+month+" is "+avgTempCelsius+"°C ("+avgTempCFahrenheit+"°F)");
    }
}
