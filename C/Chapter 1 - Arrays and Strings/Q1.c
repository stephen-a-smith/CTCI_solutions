/*
    Is Unique: Implement an algorithm to determine if a string has all unique characters.

               What if you can't use additional data structures?
*/

//Assumption - Only Ascii Strings
#include <string.h>
#include <stdio.h>
int isUnique(char* str);
int main(){
    char* string = "This is a Test String";
    char* passstring = "qwertyu";
    
    if(isUnique(string)){
        printf("\"%s\" is unique\n", string);
    } else {
        printf("\"%s\" is not unique\n", string);
    }

    if(isUnique(passstring)){
        printf("\"%s\" is unique\n", passstring);
    } else {
        printf("\"%s\" is not unique\n", passstring);
    }
return 0;
}

int isUnique(char* str){
int flagArray[126] = {0}; //assuming normal ascii
int i;
for(i = 0; i < strlen(str); i++){
    flagArray[str[i]]++;
    if(flagArray[str[i]] > 1){
        return 0;
    }
}

return 1;
}
