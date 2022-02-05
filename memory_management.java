import java.util.*;
public class dm{
    int x=0;
    int c=0;
    int mm[]=new int[10];
    int sm[]=new int[50];
    int bs[]=new int[25];
    Scanner sc=new Scanner(System.in);
  void input()
    {
    System.out.println("Enter size for each process");
    for(int i=0;i<5;i++)
    {
    System.out.println("Process "+(i+1));
    bs[i]=sc.nextInt();
    }
    }
void calc(int n)
    {
        int j;
    if(bs[(n-1)]>10)
    {
    System.out.println("Given process cannot be accommodated");
    }
    else if(bs[n-1]<=x)
    {
    for(int i=c;i<(c+bs[n-1]);i++)
    {
        mm[i]=n;
    }
    x=x-bs[n-1];
    System.out.println("The MM contains the following process/processes");
    for(int i=0;i<(c+bs[n-1]);i++)
    {
    System.out.println("P"+mm[i]);
    }
    }
    else
    {
    System.out.println("The MM contains the following process/processes");
    for(j=0;j<bs[n-1];j++)
    {
    mm[j]=n;
    System.out.println("P"+mm[j]);
    }
    c=j;
    x=10-bs[n-1];
    }
    }

    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int numo=111;
    dm obj=new dm();
    obj.input();
    while(numo!=0)
    {
    System.out.println("Enter the process number you wish to choose:");
    System.out.println(" Process 1    Process 2    Process 3    Process 4   Process 5    0. Exit");
    numo=sc.nextInt();
    switch(numo)
    {
case 1:
    obj.calc(numo);
    break;
case 2:
    obj.calc(numo);
    break;
case 3:
    obj.calc(numo);
    break;
case 4:
    obj.calc(numo);
    break;
case 5:
    obj.calc(numo);
    break;
    }
    }
    }
    }
