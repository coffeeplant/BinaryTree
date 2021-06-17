package com.pluralsight.binarytreetbaa;

public class Student implements Comparable<Student>{

    private String name;
    private int age;
    private int studentNo;
    private List<Result> res;

    public Student() {
    }
//comparator to fill the Student object
    public Student(String name, int age, int studentNo, List<Result> res) {
        this.name = name;
        this.age = age;
        this.studentNo = studentNo;
        this.res = res;
    }
//bring the average calculated in the main method into the Student object, this is how I chose to make the
// average grade a comparable within the object

    Result r = new Result();
    double avg = r.getAvg();

    public double getAvg() {
        return avg;
    }
//comparable method that means the student object is ordered according to the avg grade or any variable I should choose
    @Override
    public int compareTo(Student o) {
        if (avg==o.avg){
            return 0;
        }else if(avg<o.avg){
            return 1;
        }else{
            return -1;
        }
    //return ((Comparable)o.getAvg()).compareTo((Comparable)this.avg);
    }

//testing s toString method for printing the result, didn't get as fas a being able to test
//    @Override
//    public String toString(){
//        return "Student" +name+ '"+name+ '\''+", age=" +age+"}";
//    }


}


