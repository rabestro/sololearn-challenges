apart = 50
safety = int(input())
roadrunners_speed = int(input())
coyotes_speed = int(input())

time = safety / roadrunners_speed

if coyotes_speed > (apart + safety) / time:
    print ('Yum')
else:
    print ('Meep Meep')
