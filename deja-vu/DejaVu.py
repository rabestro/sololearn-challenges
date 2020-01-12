def dejaVu(string):
    for i in range(len(string) - 1):
        if string[i] in string[i + 1::]:
            return 'Deja Vu'
    return 'Unique'


print(dejaVu(input()))
