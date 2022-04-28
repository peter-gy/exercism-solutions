/*
Package weather implements a highly sophisticated weather forecast service.
*/
package weather

// CurrentCondition is the current weather condition in the city.
var CurrentCondition string

// CurrentLocation represents the current location.
var CurrentLocation string

// Forecast returns the weather forecast.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
