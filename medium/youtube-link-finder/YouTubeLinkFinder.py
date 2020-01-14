import re
url = input()
videoId = re.search(r'[^=/]*$', url).group()
print(videoId)
