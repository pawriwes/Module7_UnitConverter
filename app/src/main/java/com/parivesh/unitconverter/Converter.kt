package com.parivesh.unitconverter


class Converter {
    fun convertUnits(value: Double, conversionType: ConversionType): Double {
        return when (conversionType) {
            ConversionType.CELSIUS_TO_FAHRENHEIT -> value * 9 / 5 + 32
            ConversionType.FAHRENHEIT_TO_CELSIUS -> (value - 32) * 5 / 9
            ConversionType.METERS_TO_FEET -> value * 3.28084
            ConversionType.FEET_TO_METERS -> value / 3.28084
            ConversionType.KILOGRAMS_TO_POUNDS -> value * 2.20462
            ConversionType.POUNDS_TO_KILOGRAMS -> value / 2.20462
            ConversionType.LITERS_TO_GALLONS -> value / 3.78541
            ConversionType.GALLONS_TO_LITERS -> value * 3.78541
            ConversionType.KILOMETERS_TO_MILES -> value / 1.60934
            ConversionType.MILES_TO_KILOMETERS -> value * 1.60934
        }
    }
}