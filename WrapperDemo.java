//this is the BussinessLogic class
public class WrapperDemo
      {
        int i,j,k;
        public void assign(int i,int j)
        {
         this.i=i;
         this.j=j;
        }
        public int mul()
        {
          k=i*j;
          return k;
        }
        public void disp()
        {
          System.out.println("Multiple Of Two Numbers= "+k);
        }
      }
      
      //this is the ExecutionLogic class
//you need to create sepreat class of WrapperExe 
      public class WrapperExe
      {
        public static void main(String[] args)
        {
          String a1=args[0];
          String a2=args[1];
          int i=Integer.parseInt(a1);
          int j=Integer.parseInt(a2);

          WrapperDemo wd=new WrapperDemo();
          wd.assign(i,j);
          wd.mul();
          wd.disp();
        }
      }

