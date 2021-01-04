#!/usr/bin/env python3

#arguments in python can be passed as list just like java
# single start is list *args

def main():
    kitten('meow' , 'grrr' , 'purr')
    kitten_kv(Usa='washinton Dc' , India='New Delhi' , UK='London')
    x = dict(Usa='washinton Dc' , India='New Delhi' , UK='London' , Mexico ='Mexico city')
    kitten_kv(**x)


def kitten(*args):
    for sound in args:
        print('Kitten making sound :: '+ sound)

#key word argument is like has Map or in python dictionary
def kitten_kv(**kwargs):
    if len(kwargs):
        for k in kwargs:
            print('key = {} and value = {}'.format(k, kwargs[k] ))
    else:
        print('No value in the  dictionary ')


if __name__=='__main__': main()
