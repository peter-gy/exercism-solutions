export class Matrix {
  private rawMatrixData: string;

  /**
   * Constructs a new Matrix from raw string data.
   * @param rawMatrixData a string in which columns are separated by spaces and rows by newlines.
   */
  constructor(rawMatrixData: string) {
    this.rawMatrixData = rawMatrixData;
  }

  get rows(): number[][] {
    return this.rawMatrixData
      .split("\n")
      .map((row) => row.split(" ").map(Number));
  }

  get columns(): number[][] {
    return this.rows.map((_, rowIndex) =>
      this.rows.map((row) => row[rowIndex])
    );
  }
}
