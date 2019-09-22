//Single Inheritance
class Student{
    String Name="FD";
    String RegNo="15MIS0111";
}
class Test extends Student{
    String phone="9600341213";
    public static void main(String []a){
        Test t=new Test();
        System.out.print("RegNo: "+t.RegNo+" and name is "+t.Name+" contact: "+t.phone);
    }
}

//Multilevel inheritance
class Animal{
    public void eats(){
        System.out.println("Eating.....");
    }
}

class dog extends Animal{
    public void bark(){
        System.out.println("Barking......");
    }
}

class babydog extends dog{
    public void crying(){
        System.out.println("Crying..");
    }
}
    
class Inheritance{
    public static void main(String []a){
        babydog b=new babydog();
        b.eats();
        b.bark();
        b.crying();
    }
}
//Hierarchical
class Animal{
    public void eats(){
        System.out.println("Eating.....");
    }
}

class dog extends Animal{
    public void bark(){
        System.out.println("Barking......");
    }
}

class babydog extends Animal{
    public void crying(){
        System.out.println("Crying..");
    }
}
    
class Inheritance{
    public static void main(String []a){
        babydog b=new babydog();
        b.eats();
        //b.bark();
        b.crying();
    }
}
