def sound(n):
   if n % 3 == 0: return 'Pop'
   if n % 2 == 0: return 'Crackle'
   else: return 'Snap'
   

sounds = ' '.join(map(sound, [int(input()) for i in range(6)]))

print(sounds)
