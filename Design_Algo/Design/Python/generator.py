#!/usr/bin/env python3

#Generator are like iterators where you will have start stop and step 

def main():
    for i in inclusive_range(7):
        print(i , end =' ')
    print()

    for i in inclusive_range(2, 25, 5):
        print(i , end =' ')
    print()
    print()

    for i in inclusive_range(2, 25, 5 , 6 , 7):
       
        print(i , end =' ')
    print()



def inclusive_range(*args):
    numargs = len(args)
    start =0
    step =1

    if numargs < 1:
        raise TypeError(f'expected at least 1 argument , got {numargs}')
    elif numargs ==1:
        stop = args[0]
    elif numargs ==2:
        (start, stop) =args
    elif numargs ==3:
        (start , stop , step) =args
    else: raise TypeError(f'expected at most 3 argument s , got {numargs}')

    #genratir
    i=start
    while i <= stop:
        yield i                #yield is like return just like return except for iterator
        i += step



if __name__=='__main__' : main()