# OneLiners solutions in Ruby

There is my OneLiners Challenge solutions in Ruby.

[Halloween Candy](easy/halloween-candy/README.md)

```ruby
puts (100 * 2.0 / gets.to_i).ceil
```

[Fruit Bowl](easy/fruit-bowl/README.md)
```ruby
puts gets.to_i / 6
```

[Skee-ball](easy/skee-ball/README.md)

```ruby
puts gets.to_i / 12 >= gets.to_i ? "Buy it!" : "Try again"
```

[Paint Costs](easy/paint-costs/README.md)

```ruby
puts (1.1 * (5 * gets.to_i + 40)).round
```

[Argentina](easy/argentina/README.md)

```ruby
puts gets.to_i < gets.to_i * 50 ? "Pesos" : "Dollars"
```

[Candles](easy/pro-candles/README.md)

```ruby
puts 9 * gets.to_i + 9
```

[Duct Tape](/easy/pro-duct-tape/README.md)

```ruby
puts (2.0 * gets.to_i * gets.to_i / 10).ceil
```

[Easter Eggs](easy/pro-easter-eggs/README.md)

```ruby
puts gets.to_i > gets.to_i + gets.to_i ? 'Keep Hunting' : 'Candy Time'
```

[Pig Latin](medium/pig-latin/README.md) 
```ruby
puts gets.split.map {|w| w[1,w.size] + w[0] + 'ay'}.join(' ')
```

[It's a Sign](hard/pro-its-a-sign/README.md)

```ruby
puts Array.new(4) { gets.chomp }.any? {|s| s == s.reverse} ? 'Open' : 'Trash'
```

```ruby

```
