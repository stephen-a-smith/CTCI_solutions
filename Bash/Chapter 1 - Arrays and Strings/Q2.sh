#!/bin/bash

# Write code to determine if two strings are premutations of each other

if [ $# -ne 2 ]; then
    echo "Illegal number of arguments"
    exit -1
fi

S1=`echo $1 | sed 's/./&\n/g' | sort | tr -d '\n'`
S2=`echo $2 | sed 's/./&\n/g' | sort | tr -d '\n'`

# echo var | replace all characters with themselves + a newline | sort | remove all newlines

if echo "$S1" | grep -wiq "$S2"; then
    echo "The strings are permutations of each other"
else
    echo "The strings are not permutations of each other"
fi
