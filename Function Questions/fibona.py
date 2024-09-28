def fibonacci_series(n):
    fib_series = []
    a, b = 0, 1
    for _ in range(n):
        fib_series.append(a)
        a, b = b, a + b
    return fib_series

n = int(input("Koto term porjonto dekhte chao? "))

fib_sequence = fibonacci_series(n)
print("Fibonacci series:", ' '.join(map(str, fib_sequence)))
