# OneLiners solutions in Ruby

There is Ruby's #OneLiners solutions for Sololearn Code Coach challenges. 
All of the solutions has passed all tests in Sololearn.

## Easy

[Popsicles](easy/popsicles/README.md)

```ruby
puts [gets.to_i, gets.to_i].reverse.inject(:%) == 0 ? 'give away' : 'eat them yourself'
```

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
[Gotham City](easy/gotham-city/README.md) 

```ruby
puts ["I got this!", "Help me Batman", "Good Luck out there!"][((gets.to_i-5)/6<=>0)+1]
```

[Hovercraft](easy/hovercraft/README.md)

```ruby
puts ['Loss','Broke Even','Profit'][1+(gets.to_i<=>7)]
```

[Izzy the Iguana](easy/pro-izzy-the-iguana/README.md)
```ruby
puts gets.split.map {|item| {Lettuce: 5, Carrot: 4, Mango: 9, Cheeseburger: 0}[item.to_sym]}.inject(:+) >= 10 ? 'Come on Down!' : 'Time to wait'
```

[Jungle Camping](easy/jungle-camping/README.md)

```ruby
puts gets.split.map{|sound| {Grr:"Lion",Rawr:"Tiger",Ssss:"Snake",Chirp:"Bird"}[sound.to_sym]}.join(' ')
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
puts (0...gets.to_i).filter {|i| i % 3 == 0 || i % 5 == 0}.inject(:+)
```

[Number of Ones](easy/pro-number-of-ones/README.md)

```ruby
puts gets.to_i.to_s(2).gsub(/0/,'').size
```


## Medium

[Pig Latin](medium/pig-latin/README.md) 
```ruby
puts gets.split.map {|w| w[1,w.size] + w[0] + 'ay'}.join(' ')
```

[Safety Deposit Boxes](medium/pro-safety-deposit-boxes/README.md) 

```ruby
puts gets.chomp.split(',').index(gets) * 5 + 5
```

[Snap, Crackle and Pop](medium/pro-snap-crackle-and-pop/README.md)

```ruby
puts Array.new(6){gets.to_i}.map{|i| i % 3 > 0 ? i % 2 > 0 ? "Snap" : "Crackle" : "Pop"}.join(' ')
```

[Deja Vu](medium/deja-vu/README.md)

```ruby
puts gets.match(/(.).*\1/) ? 'Deja Vu' : 'Unique'
```

[The Spy Life](medium/the-spy-life/README.md)

```ruby
puts gets.gsub(/[^A-Za-z ]/, '').reverse
```

[Hex Color Code Generator](medium/pro-hex-color-code-generator/README.md) 

```ruby
printf("#%02x%02x%02x", gets.to_i, gets.to_i, gets.to_i)
```

[Symbols](medium/symbols/README.md)

```ruby
puts gets.gsub(/[^A-Za-z 0-9]/, '')
```
[Carrot Cake](medium/pro-carrot-cake/README.md)

```ruby
puts [7 - gets.to_i % gets.to_i].map{|x| x > 0 ? 'I need to buy %d more' % x : 'Cake Time'}
```

[Duty Free](medium/pro-duty-free/README.md)

```ruby
puts gets.split(' ').map(&:to_f).any?{|x| 20 < 1.1 * x} ? 'Back to the store' : 'On to the terminal'
```

[Building Blocks](medium/pro-building-blocks/README.md)

```ruby
puts Array.new(4){gets.to_i % 15}.inject(:+)
```

[Name Buddy](medium/pro-name-buddy/README.md)

```ruby
puts (gets.chomp + ' ' + gets).match(/\b(\w).*\b\1\w*$/) ? 'Compare notes' : 'No such luck'
```

[That's odd...](medium/thats-odd/README.md) 

```ruby
puts Array.new(gets.to_i){gets.to_i}.select(&:even?).push(0).inject(:+)
```

[Secret Message](medium/secret-message/README.md) 

```ruby
puts gets.downcase.chars().map{|c| c.match(/^[[:alpha:]]$/)?('az'.sum - c.ord).chr : c}.join()
```

[Even Numbers](medium/pro-even-numbers/README.md)

```ruby
puts gets.split(' ').map(&:to_i).select(&:even?).join(' ')
```

[Tax Free](medium/pro-tax-free/README.md) 

```ruby
puts gets.split(',').map(&:to_f).map{|x| x < 20 ? 1.07 * x : x}.inject(:+)
```

[How Far?](medium/pro-how-far/README.md)

```ruby
puts gets.gsub(/^B*[HP](B*)[HP]B*$/,'\1').size
```

[YouTube Link Finder](medium/youtube-link-finder/README.md)

```ruby
puts gets.gsub(/.*[=\/](?=[^=\/]*$)/, '')
```

[Camel to Snake](medium/pro-camel-to-snake/README.md) 

```ruby
puts gets.gsub(/(?<=[^\/b])([A-Z])/, '_\1').downcase
```

[Text Decompressor](medium/pro-text-decompressor/README.md)

```ruby
puts gets.split(/(?<=\d)/).map{|x| x[0] * x[1].to_i}.join()
```

[Snowballing Numbers](medium/pro-snowballing-numbers/README.md) 

```ruby
puts 0 < Array.new(gets.to_i){gets.to_i}.reduce{|a,b| a > 0 && b > a ? a + b : 0}
```

[Flowing Words](medium/pro-flowing-words/README.md)

```ruby
puts gets.match(/^(\S*(\S) \2\S*)*$/) != nil
```

[Splitting Strings](medium/pro-splitting-strings/README.md)

```ruby
puts gets.chomp.split(Regexp.new '(?<=\G.{%d})' % gets.to_i).join('-')
```

[Initials](medium/pro-initials/README.md)

```ruby
puts Array.new(gets.to_i){gets.chomp.gsub(/(\w)\w* (\w)\w*/,'\1\2')}.join(' ')
```

## Hard

[It's a Sign](hard/pro-its-a-sign/README.md)

```ruby
puts Array.new(4){gets.chomp}.any?{|s| s == s.reverse} ? 'Open' : 'Trash'
```

[Security](hard/security/README.md)

```ruby
puts gets.match(/[$T].*G.*[$T]/) ? 'quiet': 'ALARM'
```
