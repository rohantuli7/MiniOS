import java.util.*;
public class MacOS
{
    Scanner in=new Scanner(System.in);
    void mlfq()
    {
        //input
        int p,q;
        System.out.println("Enter number of processes in each queue");
        p=in.nextInt();
        System.out.println("Enter number of queues");
        q=in.nextInt();
        int inp[][]=new int[q][p];
        int t[]=new int[q];
        for(int i=0;i<q;i++)
        {
            System.out.println("Enter time slice of queue:"+(i+1));
            t[i]=in.nextInt();
        }
        System.out.println("Enter processes");
        for(int i=0;i<p;i++)
        {
            inp[0][i]=in.nextInt();
        }
        int io[]=new int[p];
        System.out.println("Enter I/O priority for each process");
        for(int i=0;i<p;i++)
        {
            io[i]=in.nextInt();
        }
        int lim[]=new int[p];
        System.out.println("Enter I/O limit for each process");
        for(int i=0;i<p;i++)
        {
            if(io[i]!=0)
            lim[i]=in.nextInt();
            else
            lim[i]=0;
        }
        //execution
        
        int z=0;
        int exec=0;
        int cnt[]=new int[p];
        int temp[]=new int[p];
        int temp1[]=new int[p];
        for(int i=0;i<p;i++)
        {
            cnt[i]=0;
            
        }
        
        for(int k=0;k<2;k++)
        {
            for(int i=0;i<p;i++)
            {
                if(inp[0][i]>t[0])
                {
                    inp[0][i]=inp[0][i]-t[0];
                    System.out.println("Queue:1 Time Remaining:"+inp[0][i]);
                    
                    
                    if(io[i]==0||k==1)
                    {
                    inp[1][cnt[0]]=inp[0][i];
                    temp[z]=io[i];
                    temp1[z]=lim[i];
                    z++;
                    cnt[0]++;
                    inp[0][i]=-1;
                    }
                    else
                    {
                        exec++;
                        if(k==0)
                        lim[i]--;
                    }
                }
                else
                {
                    
                    if(inp[0][i]!=-1)
                    {System.out.println("Queue:1 Process Completed:"+inp[0][i]);
                    io[i]=-1;}
                    inp[0][i]=-1;
                }
            }
            if(exec==0)
            {
                break;
            }
            exec=0;
        }
        
            for(int i=1;i<q-1;i++)
            {
                for(int k=0;k<2;k++)
                {
                for(int j=0;j<cnt[i-1];j++)
                {
                    if(inp[i][j]>t[i])
                    {
                        inp[i][j]=inp[i][j]-t[i];
                        System.out.println("Queue:"+(i+1)+" Time Remaining:"+inp[i][j]);
                        z=j;
                    
                    
                        if(temp[z]==0||temp1[z]==0)
                        {
                        inp[i+1][cnt[i]]=inp[i][j];
                        cnt[i]++;
                        inp[i][j]=-1;
                        }
                        else if(temp[z]==1 && temp1[z]!=0)
                        {
                         exec++;
                        if(k==0)
                        temp1[z]--;
                        }
                    }
                    else
                    {
                        
                        if(inp[i][j]!=-1)
                        {System.out.println("Queue:"+(i+1)+" Process Completed:"+inp[i][j]);
                        temp[z]=-1;}
                        inp[i][j]=-1;
                    }
                }
                 if(exec==0)
               {
                break;
               }
               exec=0;
               }
              
            }
            
            int proc=cnt[q-2];
            while(proc!=0)
           {
                
             for(int i=0;i<cnt[q-2];i++)
            {
                if(inp[q-1][i]>t[q-1])
                {
                    inp[q-1][i]=inp[q-1][i]-t[q-1];
                    System.out.println("Queue:"+(q)+" Time Remaining:"+inp[q-1][i]);
                    
                }
                else
                {
                    if(inp[q-1][i]!=-1)
                   {
                    System.out.println("Queue:"+(q)+" Process Completed:"+inp[q-1][i]);
                    inp[q-1][i]=-1;
                    proc=proc-1;
                   }
                }
            }
           }
         
            
        
    }
    public static void main(String args[])
    {
        MacOS obj=new MacOS();
        obj.mlfq();
    }
}

