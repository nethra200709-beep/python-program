class eb:
     def __init__(self,a,b,c,d,e,f):
         self.consumerno=a
         self.name=b
         self.address=c
         self.currentunit=d
         self.previousunit=e
         self.unitrate=f


     def calculate(self):
         self.unit=self.currentunit - self.previousunit
         self.amount=self.unit*self.unitrate

     def display(self):
         print("consumer number:",self.consumerno)
         print("consumer name:",self.name)
         print("consumer address:",self.address)
         print("current reading:",self.currentunit)
         print("previous unit:",self.previousunit)
         print("amount:",self.amount)

h=int(input("enter consumer no:"))
i=input("enter consumer name")
j=input("enter address:")
k=int(input("enter current unit:"))
l=int(input("enter previous unit:"))
m=int(input("enter unit rate:"))

ob=eb(h,i,j,k,l,m)
ob.calculate()
ob.display()         
