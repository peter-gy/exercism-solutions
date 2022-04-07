class Matrix:
    def __init__(self, matrix_string):
        self.grid = [[int(num) for num in line.split(' ')] for line in matrix_string.splitlines()]

    def row(self, index):
        return self.grid[index - 1]

    def column(self, index):
        return [self.grid[r][index - 1] for r in range(len(self.grid))]
