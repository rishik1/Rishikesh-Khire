#!/usr/bin/env python3

#Python only support PASS BY REFERNCE but integer is immutable so when value is change a new refernce is created 

def main():
    less_argument(1,2)

    print()

    x =5
    print(f'value of x before method call is {x}')
    print(f'address of argument before method x ::: {id(x)}') 
    kitten(x)
    print(f'value of x after method call is {x}')   #value remains 5 after the method hence call by value and object is not passed
    print(f'address of argument x ::: {id(x)}')                                              #integer are immutable


def kitten(a , b=101):
    print(f'Inside method kitten a = {a}')
    print(f'address of argument ::: {id(a)}')
    a=3
    print(f'value of argument a changed to {a}')
    print(f'address of argument after value change ::: {id(a)}')
    print(f'value of secondary argument is {b}')
    return b


def less_argument( a, b ,c):
    print(a)
    print(b)
    print(c)



if __name__=='__main__': main()
