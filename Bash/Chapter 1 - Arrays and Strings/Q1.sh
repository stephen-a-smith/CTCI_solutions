#!/bin/bash
#
#    Is Unique: Implement and algorithm to determine if a string has all unique characters.
#
#               What if you can't use additional data structures?
#*/


if [ $# -ne 1 ]; then
    echo "Illlegal number of args"
    exit -1
fi

if  echo "$1" | egrep -iq '(.).*\1'; then
    #Let's break this RegEx down
    #  (.) - Match any single charater, and keep as a backreference
    #   .* - follow it up with any number (0 inclusive) of arbitrary characters
    #   \1 - then check for anything that matches the backreference
    echo "This Word has duplicate characters"
else
    echo "This Word has only unique characters"
fi
