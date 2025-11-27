def ispalindrome(s):
    if s[::-1]==s:
        return True
    else:
        return False
l=["racecar","malayalam","nethra"]
for s in l:
    if ispalindrome(s):
        print(s)
    
