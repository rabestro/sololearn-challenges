STUDENTS = 15
blocks = [int(input()) for i in range(4)]
left_over = sum(map(lambda x: x % STUDENTS, blocks))
print(left_over)
