 public class Main{
public static void main(String args []){Line l1;
l1=new Line(1,2,2,3);
System.out.print(l1.cuxi+" "+l1.color+" ");

}}
class Line{
int x1,y1,x2,y2;
int cuxi;
static int color; 
Line(){x1=0;y1=0;x2=10;y2=10;cuxi=1;color=16;}
Line(int a,int b,int c,int d){x1=a;y1=b;x2=c;y2=d;    }
void setcolor(int color){if(color>16) this.color=16;

   else this.color=color;}
int huodeyanse(){return color;   }
double jisuanchangdu(){double d;
int m;m=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
d=Math.sqrt(m);
return d;
}





}