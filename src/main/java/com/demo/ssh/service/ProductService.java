package com.demo.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.demo.ssh.dao.ProductDao;
import com.demo.ssh.domain.Product;

/**
 * 
 *商品的业务层类
 *
 *
 */
@Transactional
public class ProductService {
	
       private ProductDao productDao;

       
       
	   public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
		
	  }
	   
	   /**
	    * 业务层中保存商品的方法
	    * 
	    */
       public void save(Product product)
       {
    	   System.out.println("Service中的save方法执行了。。。");
    	   productDao.save(product);
       }
} 
