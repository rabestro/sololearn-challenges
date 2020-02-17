# OneLiners solutions in Ruby

There is my OneLiners Challenge solutions in Ruby.

[Halloween Candy](easy/halloween-candy/README.md)

```ruby
puts (100 * 2.0 / gets.chomp.to_i).ceil
```

[It's a Sign](hard/pro-its-a-sign/README.md)

```ruby
puts Array.new(4) { gets.chomp }.any? {|s| s == s.reverse} ? 'Open' : 'Trash'
```
