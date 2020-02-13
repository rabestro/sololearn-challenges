distanceApart = 50
distanceSafety = gets.chomp.to_i
speedRoadrunner = gets.chomp.to_i
speedCoyote = gets.chomp.to_i
        
timeToSafety = distanceSafety.to_f / speedRoadrunner
        
isCoyoteCaughtRoadrunner = speedCoyote > (distanceApart + distanceSafety) / timeToSafety
        
puts isCoyoteCaughtRoadrunner ? "Yum": "Meep Meep"
