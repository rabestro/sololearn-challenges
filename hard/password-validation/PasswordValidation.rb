password = gets

isStrong = password.length > 6 && password.match(/\d.*\d/) && password.match(/([!@#$%&*].*){2,}/)
      
puts isStrong ? "Strong": "Weak"
