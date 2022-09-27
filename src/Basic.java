class Student{
    int id;
    String name;
    void insert(int i,String n){
        id=i;
        name=n;
    }
   void display(){
       System.out.println("id >> ::"+id +" name >> :: "+name);
   }
}
class Basic {
    public static void main(String[] args){
        Student s1=new Student();
        s1.insert(101,"Manish");
        s1.display();
    }
}
