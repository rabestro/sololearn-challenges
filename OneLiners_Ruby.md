# OneLiners solutions in Ruby

There is my OneLiners Challenge solutions in Ruby.

[It's a Sign](hard/its-a-sign)
```ruby
puts Array.new(4) { gets.chomp }.any? {|s| s == s.reverse} ? 'Open' : 'Trash'
```
