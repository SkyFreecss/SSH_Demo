package com.demo.ssh.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.demo.ssh.domain.Product;

/**
 * 
 * ��Ʒ�����DAO��
 *
 */
public class ProductDao extends HibernateDaoSupport{
       
	 /**
	  * Dao�б�����Ʒ�ķ���
	  * ��ΪDao��̳���HibernateDaoSupport�࣬���ṩ��set���������ҵ���ģ��Ϊ�յ�ʱ�������Զ�����һ��ģ�塣
	  * ��Dao�е���ģ������ɱ��������
	  */
	
	   public void save(Product product)
	   {
		   System.out.println("Dao�е�save����ִ����");
		   this.getHibernateTemplate().save(product);
	   }
}
