/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;
import assignment7.FulltimeEmployee;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author user
 */
public class ParttimeTable {
        
    public static void insertEmployee(ParttimeEmployee emp) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assignment7PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(emp);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    public static void updateEmployee(ParttimeEmployee emp) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assignment7PU");
        EntityManager em = emf.createEntityManager();
        FulltimeEmployee fromDb = em.find(FulltimeEmployee.class, emp.getId());
        fromDb.setName(emp.getName());
        fromDb.setSalary(emp.getHoursWork());
        em.getTransaction().begin();
        try {
            em.persist(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    public static ParttimeEmployee findEmployeeById(Integer id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assignment7PU");
        EntityManager em = emf.createEntityManager();
        ParttimeEmployee emp = em.find(ParttimeEmployee.class, id);
        em.close();
        return emp;
    }
    public static List<ParttimeEmployee> findAllEmployee() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assignment7PU");
        EntityManager em = emf.createEntityManager();
        List<ParttimeEmployee> empList = (List<ParttimeEmployee>) em.createNamedQuery("Employee.findAll").getResultList();
        em.close();
        return empList;
    }
    public static List<ParttimeEmployee> findEmployeeByName(String name) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assignment7PU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Employee.findByName");
        query.setParameter("name", name);
        List<ParttimeEmployee> empList = (List<ParttimeEmployee>) query.getResultList();
        em.close();
        return empList;
    }
    public static void removeEmployee(ParttimeEmployee emp) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Assignment7PU");
        EntityManager em = emf.createEntityManager();
        FulltimeEmployee fromDb = em.find(FulltimeEmployee.class, emp.getId());
        em.getTransaction().begin();
        try {
            em.remove(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
                
    }
    
    
    
}