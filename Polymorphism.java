class Overloading{
    
    //operator overloading
    static void  add(String a,String b){
        System.out.println(a+b);
    }
    
    //operator overloading
    static void  add(int a,int b){
        System.out.println(a+b);
    }
    //method overloading
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    
    public static void main(String []args){
        add(3,2);
        add(5,5,5);
        add("FD","17");
    }
}

//Runtime polymorphism
class Dog{
    public void barks(){
        System.out.print("Barking...");
    }
}
class babydog extends Dog{
    @Override
    public void barks(){
        System.out.print("Can't Bark");
    }
}
class Overloading{
    public static void main(String []a){
        Dog d=new babydog();
        d.barks();
    }
}
