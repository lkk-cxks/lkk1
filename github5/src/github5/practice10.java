package github5;

public class practice10 {
		public static void main(String[] args) {
			QuadraticEquation n=new QuadraticEquation(1,4,4);
	        if(n.getRoot1()==0 && n.getRoot2()==0){
	            System.out.println("The equation has no roots");
	        }
	        else if(n.getRoot1()==n.getRoot2())
	            System.out.println("R : " +n.getRoot1());
	        else
	            System.out.println("R1 : " +n.getRoot1() + "    " + "R2 :" +n.getRoot2());
		}
	}
	class QuadraticEquation{
	    private double  first, second,third;
	    QuadraticEquation(double x,double y,double z){
	        first=x;
	        second=y;
	        third=z;
	    }
	    public double getFirst(){
	        return  first;
	    }
	    public double getSecond(){
	        return  second;
	    }
	    public double getThird(){
	        return third;
	    }
	    public double getDiscriminant(){
	        return second*second-4*first*third;
	    }
	    public double getRoot1(){
	        double s=this.getDiscriminant();
	        if(s>=0){
	            return (-second+Math.sqrt(s))/(2*first);
	        }
	        else
	            return 0;
	    }
	    public double getRoot2(){
	        double s=this.getDiscriminant();
	        if(s>=0){
	            return (-second+Math.sqrt(s))/(2*first);
	        }
	        else
	            return 0;
	    }
}
