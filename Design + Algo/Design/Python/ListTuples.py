#!/usr/bin/env python3

#list [1,2,3]  mutable so value can be changed
#tuple (1,2,3) immutable tuple value cant be changed
#dictionary key value pair {"a":1 , "b":2 , "c":3}
# set unordered list of unique valye {1,2,3,4,5}

def main():
    cities =[ 'new york' , 'Boston', 'Dallas' , 'Seattle' , 'Chicago', 'Miami' ,'DC' , 'Atlanta' , 'SFO'] #list index starts from 0
    print(cities[1])
    print()
    print(cities)
    print()
    print_list(cities)
    print()
    print(cities[1:3])  #includes 1 excludes 3
    print()
    print(cities[1:7:2])  # includes 1 excludes 7 (Atlanta) step 2
    print()
    index = cities.index('Atlanta')
    print(index)

def print_list(list):
    index =0
    for v in list:
        print('value of at index {} is {} '.format( index, v))
        index+=1



if __name__=='__main__':main()


