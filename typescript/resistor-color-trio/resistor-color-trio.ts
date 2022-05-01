type Color =
  | "black"
  | "brown"
  | "red"
  | "orange"
  | "yellow"
  | "green"
  | "blue"
  | "violet"
  | "grey"
  | "white";
const colorCodes: Record<Color, number> = {
  black: 0,
  brown: 1,
  red: 2,
  orange: 3,
  yellow: 4,
  green: 5,
  blue: 6,
  violet: 7,
  grey: 8,
  white: 9,
};

export function decodedResistorValue(colors: Color[]): string {
  const value =
    10 ** colorCodes[colors[2]] *
    (10 * colorCodes[colors[0]] + colorCodes[colors[1]]);
  return value < 1000
    ? `${value} ohms`
    : `${Math.trunc(value / 1000)} kiloohms`;
}
