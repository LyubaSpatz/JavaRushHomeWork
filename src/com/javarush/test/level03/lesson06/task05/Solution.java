package com.javarush.test.level03.lesson06.task05;

/* Изучаем японский
Выведи на экран 日本語
*/

public class Solution
{
    public static void main(String[] args)
    {
        char a1 = '\u65e5', a2 = '\u672c', a3 = '\u8a9e';
        Character c1 = a1, c2 = a2, c3 = a3;
        String s = c1.toString()+c2.toString()+c3.toString();
        System.out.print(s);
    }
}