# OneLiners solutions in Ruby

There is #OneLiners Challenge solutions in Ruby. 

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

[Guard Flamingos](easy/guard-flamingos/README.md)

```ruby
puts gets.to_i + gets.to_i
```

[Izzy the Iguana](easy/pro-izzy-the-iguana/README.md)
```ruby
puts gets.split.map {|item| {Lettuce: 5, Carrot: 4, Mango: 9, Cheeseburger: 0}[item.to_sym]}.inject(:+) >= 10 ? 'Come on Down!' : 'Time to wait'
```
[Land Ho!](easy/pro-land-ho/README.md)
```ruby
puts gets.to_i / 20 * 20 + 10
```

[Extra-Terrestrials](easy/extra-terristrials/README.md)
```ruby
puts gets.reverse
```

[Zip Code Validator](easy/pro-zip-code-validator/README.md)
```ruby
puts gets.match(/^\d{5}$/) != nil
```

[Vowel Counter](easy/pro-vowel-counter/README.md)
```ruby
puts gets.gsub(/[^AEIOUaeiou]/, '').size
```

[Isogram Detector](easy/pro-isogram-detector/README.md)

```ruby
puts gets.match(/(.).*\1/) == nil
```

[Multiples](easy/pro-multiples/README.md)

```ruby
puts (0...gets.to_i).filter {|i| i % 3 == 0 || i % 5 == 0}.reduce(0) { |sum, i| sum += i}
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
