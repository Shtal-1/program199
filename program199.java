import java.lang.*;
import java.util.*;
//  0000    0000    0000    0000    0010    0000    0000    0000
//      0       0           0         0          2          0           0       0
class Bitwise
{
    public int OnBit(int iNo)       // 4
    {
        int iMask = 0X04000000;
        int iResult = 0;

        iResult = iNo | iMask;
        return iResult;
    }
}

class program199
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);  // 9th July

        System.out.println("Enter number ");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        int iret = bobj.OnBit(value);
        System.out.println("Updated number is  : "+iret);
    }
}

