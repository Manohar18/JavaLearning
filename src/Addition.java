public class Addition extends Inheritance {

     int a =18;
     int age=49;
     String name = "Ramarao";
     int number = 170031069;
    public Addition(int a, int b, String name) {
       this.a=a;
        int sum = a+b;
       System.out.println(sum);
       System.out.println("Hey it's"+" "+name);
    }


    public void details(){

        //Child class properties
        //System.out.println(age);
        //System.out.println(name);
        //System.out.println(number);

        //Parent class properties
        System.out.println(super.age);
        System.out.println(super.name);
        System.out.println(super.number);
    }

    public static void main(String[] args) {
         Addition ob = new Addition(1,5, "Manogna");
        //Inheritance in = new Inheritance();
        ob.details();



    }
}


