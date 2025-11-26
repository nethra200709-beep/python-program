s = input("Enter a string: ")
v = 0
c = 0

for i in s:
    if i in "aeiouAEIOU":
        v += 1
    elif i.isalpha():   
        c += 1

print("Vowels:", v)
print("Consonants:", c)
