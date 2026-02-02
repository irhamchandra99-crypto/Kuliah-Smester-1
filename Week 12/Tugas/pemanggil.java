public class pemanggil {
    public static void main(String[] args) {
        ellips e1 = new ellips(4, 6);
        circle c1 = new circle(5);
        triangle t1 = new triangle(3, 5, 6);
        square s1 = new square(5);
        rectangle r1 = new rectangle(8, 4);

        
        shape[] shapes = {e1, c1, t1, s1, r1};

        for(int i = 0; i <=4; i++){
            printInfo(shapes[i]);
        }

        double total=0;

        for (int n = 0; n<shapes.length; i++){
            total = total +shapes[n].area(); 
        } 

    }   
    public static void printInfo(shape s) {
	    System.out.println("The shape: " + s);
	    System.out.println("luas : " + s.area());
	    System.out.println("keliling: " + s.perimeter());
	}

}
