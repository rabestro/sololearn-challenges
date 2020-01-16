STUDENTS = 15
COLORS = 4

blocks = [int(input()) for i in range(COLORS)]

left_over = sum(map(lambda x: x % STUDENTS, blocks))

print(left_over)
