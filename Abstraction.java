abstract class father{
    public abstract void says();
    public void Hello(){
        System.out.print("Hello");
    }
}

class son extends baby{
    @Override
    public void says(){
        System.out.print("Dada");
    }
}
class Test{
public static void main (String []a){
father f=new son();
f.says();
}
}
