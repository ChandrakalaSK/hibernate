package com.pwskills.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student stud = new Student();
        stud.setRollno(006);
        stud.setName("chandrakala");
        stud.setMarks(95);
        
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(stud);//Here we are trying to save student object
        tx.commit();
        
        System.out.println(stud);
    }
}
