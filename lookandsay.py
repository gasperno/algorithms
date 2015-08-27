#!/usr/bin/python2.7
import sys

def look_and_say(inp):
    """
    The method takes string as input and creates
    another string that's equivalent of the look_and_say for input string 'inp'
    """
    final=''
    index=0
    element=inp[0]
    counter=1
    index+=1
    while(index<len(inp)):
        if inp[index]==element :
            counter+=1
        else:
            final+=str(counter)+str(element)
            counter=1
            element=inp[index]
        index+=1
    final+=str(counter)+str(element)
    return final

def main():
    """
    Look and say sequence starting from 1 upto n th term
    """
    input='1'
    counter=0
    # sys.argv[1] is a string. without int converstion the while loops goes forever.. 
    n = int(sys.argv[1]) 
    while counter < n :
        input=look_and_say(input)
        print input
        counter+=1
    #uncomment the below line to find the n th term. The print in line 28 prints all values
    # print input
    return

if __name__=='__main__':
    main()