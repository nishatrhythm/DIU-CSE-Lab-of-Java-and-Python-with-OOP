class Vector2D:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"Vector2D({self.x}, {self.y})"

    def __repr__(self):
        return f"Vector2D(x={self.x}, y={self.y})"

    def __add__(self, other):
        if isinstance(other, Vector2D):
            return Vector2D(self.x + other.x, self.y + other.y)
        return NotImplemented

    def __sub__(self, other):
        if isinstance(other, Vector2D):
            return Vector2D(self.x - other.x, self.y - other.y)
        return NotImplemented

    def __mul__(self, scalar):
        if isinstance(scalar, (int, float)):
            return Vector2D(self.x * scalar, self.y * scalar)
        return NotImplemented

    def __eq__(self, other):
        if isinstance(other, Vector2D):
            return self.x == other.x and self.y == other.y
        return False

    def magnitude(self):
        return (self.x ** 2 + self.y ** 2) ** 0.5

if __name__ == "__main__":
    v1 = Vector2D(3, 4)
    v2 = Vector2D(1, 2)

    print("v1:", v1)
    print("v2:", v2)
    print("v1 + v2:", v1 + v2)
    print("v1 - v2:", v1 - v2)
    print("v1 * 3:", v1 * 3)
    print("v1 == Vector2D(3, 4):", v1 == Vector2D(3, 4))
    print("v1 == v2:", v1 == v2)
    print("Magnitude of v1:", v1.magnitude())