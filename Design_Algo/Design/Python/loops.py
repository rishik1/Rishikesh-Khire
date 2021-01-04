#!/usr/bin/env python3

a=True
b=False
x=('bear' , 'cat' , 'dog' ,'elephant')
y='elephant'

if a==b:
    print("conditional statement matches")
else:
    print("conditional statement does not match")

if y in x:
    print(" animal "+ y + " is in the list of animals")
else:
    print(" animal "+ y  + " is not in the lsit of animals")

print( id(y) )
print( id(x[3]) ) # same address as the y for x[3] as same values 

print(" Python operator precedence is  exponent ** is the highest")
print(" Then  +x -x has the second precednece")
print(" Then * ,/ ,//  , % multiplication division remainder has the prercdece")
print(" Then Bitwise shifts << , >> has the precedence ")
print(" then Bitise  AND & , then comes Bitwise XOR ^ , then comes Bitwise OR '|' ")
print(" then comes all conditional checks for precedence")

p =5
q =3
z=p/q
print(f'result is {z}')

count =0
r = x[count]
while r != 'elephant':
    print( r )
    count+= 1
    r = x[count]

print(x)
for pet in x:
    print(pet)

for i in range(4):
    print("item at "+ str(i) + " is "+ x[i])


