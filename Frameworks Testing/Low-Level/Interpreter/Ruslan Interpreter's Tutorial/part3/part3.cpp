/*
Solutions to exercises for https://ruslanspivak.com/lsbasi-part3/

Check your understanding
1. What is a syntax diagram?
A syntax diagram is a graphical representation of a programming language’s syntax rules. Basically, a syntax diagram visually shows you which statements are allowed in your programming language and which are not.

2. What is syntax analysis?
Parsing is also called syntax analysis

3. What is a syntax analyzer?
The parser is also aptly called, you guessed it right, a syntax analyzer.

Programming exercises
1. Draw a syntax diagram for arithmetic expressions that contain only multiplication and division, for example “7 * 4 / 2 * 3”. Seriously, just grab a pen or a pencil and try to draw one.

         -------->-------------
         |                    |
         |  ->(*)--           |
-> term ----|     |--> term -------->
         |  ->(-)--          |
         |                   |
         -----------<---------

2. Modify the source code of the calculator to interpret arithmetic expressions that contain only multiplication and division, for example “7 * 4 / 2 * 3”.
(Happened to already have done in part 2)

3. Write an interpreter that handles arithmetic expressions like “7 - 3 + 2 - 1” from scratch. Use any programming language you’re comfortable with and write it off the top of your head without looking at the examples. When you do that, think about components involved: a lexer that takes an input and converts it into a stream of tokens, a parser that feeds off the stream of the tokens provided by the lexer and tries to recognize a structure in that stream, and an interpreter that generates results after the parser has successfully parsed (recognized) a valid arithmetic expression. String those pieces together. Spend some time translating the knowledge you’ve acquired into a working interpreter for arithmetic expressions
(Doing now, but this time in C++)
*/

#include <bits/stdc++.h>

using namespace std;

#define ERRORCODE -1000000

#define INTEGER 1
#define OPERATOR 2
#define END_OF_EXE 4

class Token{
    public:
        int type; int value;
        Token(int t, int v){
            type = t; value = v;
        }
        string repr(){

            return "Token("+to_string(type)+","+to_string(value)+")";
        }
};

/// Char and Digit Management //////////////////////////////////
int char_to_digit(char c){
    return c-48;
}
bool char_is_digit(char c){
    return (
        0 <= char_to_digit(c)
        && char_to_digit(c) <= 9
    );
}
/// Tokenization //////////////////////////////////////////////
Token get_next_token(string eval_string, int* pos){
    // skip whitespace
    while (*pos < eval_string.length() && eval_string[*pos] == ' '){
        (*pos)++;
    }
    if (*pos >= eval_string.length() || eval_string[*pos] == '\n'){
        //cout<<"Pos of ending:"<<*pos<<endl;
        return Token(END_OF_EXE, 0);
    }
    // Parse digits
    if (char_is_digit(eval_string[(*pos)])){
        int num_value = 0;
        while ((*pos) < eval_string.length() && char_is_digit(eval_string[(*pos)])){
            num_value *= 10;
            num_value += char_to_digit(eval_string[(*pos)]);
            (*pos)++;
        }
        return Token(INTEGER, num_value);
    }

    // Parse Operators
    switch(eval_string[(*pos)]){
        case '+':
        case '-':
        case '*':
        case '/':
            (*pos)++;
            return Token(OPERATOR, (int)eval_string[(*pos)-1]);
            break;
        default:
            return Token(END_OF_EXE, 0);
            break;
    }


}

int expr(string eval_string){
    int pos = 0;
    int result = 0;

    Token curr = get_next_token(eval_string, &pos);
    if (curr.type == INTEGER || curr.type == END_OF_EXE){
        result = curr.value;
    }else{
        return -100000; // Error code
    }

    // Next operators
    curr = get_next_token(eval_string, &pos);
    while (curr.type == OPERATOR){
        char op = curr.value;

        curr = get_next_token(eval_string, &pos);
        if (curr.type != INTEGER){
            return -2000000;
        }
        switch (op){
            case '+':
                result = result + curr.value; break;
            case '-':
                result = result - curr.value; break;
            case '*':
                result = result * curr.value; break;
            case '/':
                result = result / curr.value; break;
        }
        curr = get_next_token(eval_string, &pos);
    }
    /*
    if (curr.type != EOF){
        return -300000; // Error code
    }*/
    return result;
}

int main(){
    while (1){
        string eval_string;
        cout<<"stupid calculator> ";getline(cin, eval_string);
        if (eval_string == "exit()"){return 1;}
        cout<<expr(eval_string)<<"\n";
    }
}
