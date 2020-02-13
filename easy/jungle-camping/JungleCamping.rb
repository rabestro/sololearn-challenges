animals = {Grr: "Lion", Rawr: "Tiger", Ssss: "Snake", Chirp: "Bird"}

gets.split.each {|sound| print animals[sound.to_sym], ' '}
