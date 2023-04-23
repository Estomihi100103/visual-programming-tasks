#include <stdio.h>
#include <string.h>

int main(){
char kata[10];
    fgets (kata, 10, stdin);
    kata[strlen(kata)-1]='\0';
    printf("%s|", kata);
}