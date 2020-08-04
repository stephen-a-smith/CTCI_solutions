#!/bin/bash

# Create a method to replace all spaces in a string with %20

if [ $# -ne 1 ]; then
    echo "illegal number of arguments"
    exit -1
fi

echo "$1" | sed 's/ /%20/g'
