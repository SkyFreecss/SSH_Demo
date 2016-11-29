package com.demo.ssh.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.demo.ssh.domain.Product;

/**
 * 
 * 商品管理的DAO类
 *
 */
public class ProductDao extends HibernateDaoSupport{
       
	 /**
	  * Dao中保存商品的方法
	  * 因为Dao类继承了HibernateDaoSupport类，它提供了set方法，并且当你模板为空的时候它会自动创建一个模板。
	  * 在Dao中调用模板来完成保存操作。
	  */
	
	   public void save(Product product)
	   {
		   System.out.println("Dao中的save方法执行了");
		   this.getHibernateTemplate().save(product);
	   }
}
