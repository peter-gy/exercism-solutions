const periodMap = new Map([
  ["mercury", 0.2408467],
  ["venus", 0.61519726],
  ["earth", 1.0],
  ["mars", 1.8808158],
  ["jupiter", 11.862615],
  ["saturn", 29.447498],
  ["uranus", 84.016846],
  ["neptune", 164.79132],
]);

const EARTH_YEAR_IN_SECONDS = 31_557_600;

export const age = (planet, seconds) => +(seconds / EARTH_YEAR_IN_SECONDS / periodMap.get(planet)).toFixed(2);
