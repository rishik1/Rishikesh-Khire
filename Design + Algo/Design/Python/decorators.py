#!/usr/bin/env python3

#python everthing is object , so func is also object 
#you can assign function to object and call the obj


def f4(f):
    def f4():
        print('this is before the function call')
        f()
        print('this is after function call ')
    return f4

def f1():
    def f2():
        print(' this is f2')
    return f2


def f3():
    print('this is f3')

@f4
def f3_decorator():
    print('f4 is f3 decorator')

def main():
    f3_decorator()  #basic decorator annotaion @f4 is decoractor for func f3
    print()


    x= f4(f3) # basic decoractor
    x()
    print()

    y = f1()  #basic nested function
    y()
    print()

if __name__=='__main__': main()
