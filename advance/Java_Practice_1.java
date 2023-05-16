package adv_java_classwork;

class invalidradiusexception extends Exception{
    public invalidradiusexception(String msg){

        super(msg);
    		}
    }
    class CircleWithException{
        private double radius;
        public double getRadius(){
        	return radius;
        	}
        public void setRadius( double r)throws invalidradiusexception{
            if(r>=0){
                radius=r;
            }
            else{
               
                throw new invalidradiusexception("invalid radius");
            }
        }
        CircleWithException(double rd)throws invalidradiusexception{
            setRadius(rd);
        }
        public double printRadius(){
            return radius;
        }
    }

public class Java_Practice_1 {
    public static void main(String[] args) {
        try{
        CircleWithException obj1=new CircleWithException(0);
            System.out.println("\n\tRadius is zero : " +obj1.printRadius());
            CircleWithException obj2=new CircleWithException(2);
            System.out.println("\tRadius is positive : "+obj2.printRadius());
            CircleWithException obj3=new CircleWithException(-15);
            System.out.println("\tRadius is negative : "+obj3.printRadius());
        	}
        catch(Exception e){
            e.printStackTrace();
            e.getMessage();
        	}
    	}
	}