package dao;


import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class BaseDAO {
    /**
     * ���ʵ��
     * @param obj��Ҫ��ӵ�ʵ�����
     * @throws Exception
     */
    public void add(Object obj) throws Exception{
        Session session = null;
        try {
            session = HibernateSessionFactory.getSession();
            session.save(obj);
            session.beginTransaction().commit();
            if(session!=null){
                  session.close();
            }
        } catch (RuntimeException e) {
            session.beginTransaction().rollback();
            if(session!=null){
                  session.close();
            }
            throw e;
        }
    }
    
    /**
     * ɾ��ʵ��
     * @param obj��Ҫɾ���ʵ��
     * @throws Exception
     */
    public void delete(Object obj) throws Exception{
        Session session = null;
        try {
            //ȡ��session����
            session =HibernateSessionFactory.getSession();
            //ɾ��ʵ��
            session.delete(obj);
            //�ύ����
            session.beginTransaction().commit();
            if(session!=null){
                  session.close();
            }
        } catch (Exception e) {
            session.beginTransaction().rollback();//����ع�
            if(session!=null){
                  session.close();
            }
            throw e;
        }
    }

    /**
     * ����ʵ��
     * @param obj��Ҫ���µ�ʵ��
     * @throws Exception
     */
    public void update(Object obj) throws Exception{
        Session session=null;
        try {
            //ȡ��session����
            session=HibernateSessionFactory.getSession();
            //ɾ��ʵ��
            session.update(obj);
            //�ύ����
            session.beginTransaction().commit();
            if(session!=null){
                  session.close();
            }
        } catch (Exception e) {
            session.beginTransaction().rollback();//����ع�
            if(session!=null){
              session.close();
            }
            throw e;
        }
    }
    
    /**
     * ���ָ����hql���в�ѯ�������ز�ѯ���
     * @param hql��hql���
     * @return ��ѯ���
     * @throws Exception
     */
    public List<?> findByHQL(String hql) throws Exception{
        try {
            Query queryObject =HibernateSessionFactory.getSession().createQuery(hql);
            return queryObject.list();
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * ���ָ����ʵ�����ͺ������ֵ������ʵ�����
     * @param cls��ʵ�����
     * @param key�������ֵ
     * @return�����ҵ�ʵ�����
     * @throws Exception
     */
    public Object findById(String cls,Serializable key)
        throws Exception
    {
        try {
            Object instance = (Object) HibernateSessionFactory.getSession().get(cls, key);
            return instance;
        } catch (Exception e) {
            throw e;
        }
        
    }
}