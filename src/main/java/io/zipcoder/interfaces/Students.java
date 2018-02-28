package io.zipcoder.interfaces;

public final class Students extends People {

    private static Students studentsSingleton;

    private Students(){
        Student ericB = new Student(23);
        Student vinceG = new Student(25);
        Student joeH = new Student(45);
        Student kibret = new Student(50);
        Student dan = new Student(55);
        this.add(ericB);
        this.add(vinceG);
        this.add(joeH);
        this.add(kibret);
        this.add(dan);
    }

    public static Students getInstance(){
        if(studentsSingleton == null){
            studentsSingleton = new Students();
        }
            return studentsSingleton;
    }

}
