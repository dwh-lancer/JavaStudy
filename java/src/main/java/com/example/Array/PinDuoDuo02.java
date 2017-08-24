package com.example.Array;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by dlancer on 2017/8/17.
 */

public class PinDuoDuo02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        str.append(sc.nextLine());
        System.out.print(getResult(str));
        }
    public static boolean getResult(StringBuilder str) {

        if (str.length() == 0) return false;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    if (!stack.empty()) {
                     char chX = stack.peek();
                        if ((ch == '{' && chX == '{')
                        || (ch == '{' && chX == '[')
                        || (ch == '{' && chX == '(')
                        || (ch == '[' && chX == '[')
                        || (ch == '[' && chX == '(')
                        || (ch == '(' && chX == '(')) {
                            return false; //左括号入栈前，要判断优先级，如果不符合，则false
                            } else {
                            stack.push(ch); //符合优先级，则入栈
                            }
                        } else {
                        stack.push(ch);
                        }
                    break;
                case '}':
                case ']':
                case ')':
                    if (!stack.empty()) {
                        char chX = stack.pop();
                        if ((ch == '}' && chX != '{')
                        || (ch == ']' && chX != '[')
                        || (ch == ')' && chX != '('))
                        return false;
                        } else {
                        return false;
                        }
                    break;
                default:
                    break;
                }
            }

        if (!stack.empty()) //栈内不为空，则证明还有左括号没有匹配，所以false
        return false;
        else
        return true;
        }
}
