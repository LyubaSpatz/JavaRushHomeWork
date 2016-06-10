package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    static  void  tablecomplication (int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int n) {
        i1 = i1*n;
        i2 = i2*n;
        i3 = i3*n;
        i4 = i4*n;
        i5 = i5*n;
        i6 = i6*n;
        i7 = i7*n;
        i8 = i8*n;
        i9 = i9*n;
        i10 = i10*n;
        String s1=i1+" ", s2=i2+" ", s3=i3+" ", s4=i4+" ", s5=i5+" ", s6=i6+" ", s7=i7+" ", s8=i8+" ", s9=i9+" ";
        System.out.println(s1+s2+s3+s4+s5+s6+s7+s8+s9+i10);
    }
    public static void main(String[] args)
    {
        int i1=1, i2=2, i3=3, i4=4, i5=5, i6=6, i7=7, i8=8, i9=9, i10=10, n=1;
        String s1=i1+" ", s2=i2+" ", s3=i3+" ", s4=i4+" ", s5=i5+" ", s6=i6+" ", s7=i7+" ", s8=i8+" ", s9=i9+" ";
        System.out.println(s1+s2+s3+s4+s5+s6+s7+s8+s9+i10);
        n = n + 1;
        tablecomplication(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, n);
        n = n + 1;
        tablecomplication(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, n);
        n = n + 1;
        tablecomplication(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, n);
        n = n + 1;
        tablecomplication(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, n);
        n = n + 1;
        tablecomplication(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, n);
        n = n + 1;
        tablecomplication(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, n);
        n = n + 1;
        tablecomplication(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, n);
        n = n + 1;
        tablecomplication(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, n);
        n = n + 1;
        tablecomplication(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, n);
    }
}