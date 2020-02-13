animals = {Grr: "Lion", Rawr: "Tiger", Ssss: "Snake", Chirp: "Bird"}

noise = gets.split(' ')
noise.each {|sound| print animals[sound.to_sym] + ' '}
