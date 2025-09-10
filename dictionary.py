d={"emno":27,"emname":"gif"}
print(d)
print(d["emno"])
print(d.get("emname"))
d["emname"]="nethra"
print(d)
d["age"]=18
print(d)
for key in d:
    print(key)
for value in d:
    print(value)
for key,value in d.items():
    print(key,":",value)
d.pop("emno")
print(d)
