public class Student{
    private String regNo;
    private String Name;
    
    public void setregNo(String regNo){
        this.regNo=regNo;
    }
    public void setName(String Name){
    this.Name=Name;        
    }
    public String getregNo(){
        return regNo;
    }
    public String getName(){
        return Name;
    }
}

class Encapsulation{
    public static void main(String []a){
        Student s=new Student();
        s.setName("FD");
        s.setregNo("15MIS0111");
        System.out.print("Reg No:"+s.getregNo()+ " and Name is: "+s.getName());
    }
}
