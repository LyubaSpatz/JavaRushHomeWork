package com.javarush.test.level03.lesson06.task04;

/* Экранирование символов
Про экранирование символов в Java читайте в дополнительном материале к лекции.
Вывести на экран следующий текст - две строки:

It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\\"
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s1, s2;
        char dq = '\u0022', bs = '\\';
        s1 = "It's Windows path: "+dq +"C:"+bs+"Program Files"+bs+"Java"+bs+"jdk1.7.0"+bs+"bin"+dq;
        s2 = "It's Java string: "+bs+dq+"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin"+bs+dq;
        System.out.println(s1);
        System.out.println(s2);
    }
}