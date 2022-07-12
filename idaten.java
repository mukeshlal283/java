public class idaten{
    
    static void myfunc(){
        System.out.println("this is function");
    }

    static void deep(String name, int age){
        System.out.println(name + "is" + age);   //method parameter
    }

    static int john(int a, int b){
        return a+b;
    }                                        //both are method overload

    static double john(double x, double y){
        return x+y;
    }

    static void checkage(int age){
        if(age < 18){
            System.out.println("small");
        }else if (age < 20){
            System.out.println("medium");
        }else{
            System.out.println("big");
        }
    }

    int a = 90;    //class/object

    // Create a fullThrottle() method
    static void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    static int speed(int maxSpeed) {
        return maxSpeed;
    }
    public static void main(String[] args){
        
        int a = 5;
        int b = 12;
        String goku = "john";
        String gohan = " deeper";
        String goten = goku + gohan;
        int ran = (int)(Math.random() * 101);
        int time = 24;
        int day = 4;
        String[] cars = {"maruti", "suzuki", "honda", "toyota"}; //list

        System.out.println("my new journey");
        System.out.println("hello");
        System.out.println("welcome");
        System.out.println(1+1); //this is comment
        System.out.println(a+b);
        System.out.println(goten);
        System.out.println(a > 10 || a < 2);
        System.out.println("the lenght is " + goten.length());
        System.out.println(goku.toUpperCase());
        System.out.println(gohan.toLowerCase());
        System.out.println(goku.concat(gohan));
        System.out.println(Math.max(12,18));
        System.out.println(Math.min(12,18));
        System.out.println((int) (Math.random() * 10));
        System.out.println(ran);
        
        if (time < 10){
            System.out.println("good morning");
        } else if (time < 12) {
            System.out.println("good afternoon");    //if else
        }else{
            System.out.println("good night");
        }

        switch (day) {                                      //switch
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("tuseday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("thursday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;
        }

        for(int x = 0; x < 10; x++){
            if(x == 6){
                break;                          //for loop
            }
            System.out.println(x);
        }

        System.out.println(cars[1]);       //list

        myfunc();

        deep("golak ", 22);
        deep("atul ", 23);      //all three are method parameter
        deep("ajay ", 24);

        checkage(100);             //method parameter

        System.out.println(john(1,1));       //method overload
        System.out.println(john(1.23,1));    //method overload

        idaten object1 = new idaten();  //make object
        idaten object2 = new idaten();  //make object  
        object2.a = 2; 
        System.out.println(object1.a);
        System.out.println(object2.a);

        idaten myCar = new idaten();     // Create a myCar object
        myCar.fullThrottle(); // Call the fullThrottle() method
        int x = myCar.speed(200);
        System.out.println("the max speed : " + x);          // Call the speed() method

    }
}