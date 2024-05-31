package com.parivesh.unitconverter

import org.junit.Assert.assertEquals
import org.junit.Test

class ConverterTest {

    private val conversion = Converter()

    @Test
    fun testCelsiusToFahrenheit() {
        val result = conversion.convertUnits(0.0, ConversionType.CELSIUS_TO_FAHRENHEIT)
        assertEquals(32.0, result, 0.0)
    }
    @Test
    fun testCelsiusToFahrenheitMinus40() {
        val result = conversion.convertUnits(-40.0, ConversionType.CELSIUS_TO_FAHRENHEIT)
        assertEquals(-40.0, result, 0.0)
    }

    @Test
    fun testFahrenheitToCelsius() {
        val result = conversion.convertUnits(32.0, ConversionType.FAHRENHEIT_TO_CELSIUS)
        assertEquals(0.0, result, 0.0)
    }
    @Test
    fun testFahrenheitToCelsiusMinus40() {
        val result = conversion.convertUnits(-40.0, ConversionType.FAHRENHEIT_TO_CELSIUS)
        assertEquals(-40.0, result, 0.0)
    }

    @Test
    fun testMetersToFeet() {
        val result = conversion.convertUnits(1.0, ConversionType.METERS_TO_FEET)
        assertEquals(3.28084, result, 0.0)
    }

    @Test
    fun testFeetToMeters() {
        val result = conversion.convertUnits(3.28084, ConversionType.FEET_TO_METERS)
        assertEquals(1.0, result, 0.0)
    }

    @Test
    fun testKilogramsToPounds() {
        val result = conversion.convertUnits(1.0, ConversionType.KILOGRAMS_TO_POUNDS)
        assertEquals(2.20462, result, 0.0)
    }

    @Test
    fun testPoundsToKilograms() {
        val result = conversion.convertUnits(2.20462, ConversionType.POUNDS_TO_KILOGRAMS)
        assertEquals(1.0, result, 0.0)
    }

    @Test
    fun testLitersToGallons() {
        val result = conversion.convertUnits(3.78541, ConversionType.LITERS_TO_GALLONS)
        assertEquals(1.0, result, 0.0)
    }

    @Test
    fun testGallonsToLiters() {
        val result = conversion.convertUnits(1.0, ConversionType.GALLONS_TO_LITERS)
        assertEquals(3.78541, result, 0.0)
    }

    @Test
    fun testKilometersToMiles() {
        val result = conversion.convertUnits(1.60934, ConversionType.KILOMETERS_TO_MILES)
        assertEquals(1.0, result, 0.0)
    }

    @Test
    fun testMilesToKilometers() {
        val result = conversion.convertUnits(1.0, ConversionType.MILES_TO_KILOMETERS)
        assertEquals(1.60934, result, 0.0)
    }
}
