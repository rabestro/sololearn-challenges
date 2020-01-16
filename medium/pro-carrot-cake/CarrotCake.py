CAKE = 7

carrots = int(input())
boxes = int(input())

left_over = carrots % boxes

if left_over < CAKE:
    need_more = CAKE - left_over
    print(f'I need to buy {need_more} more')
else:
    print('Cake Time')
