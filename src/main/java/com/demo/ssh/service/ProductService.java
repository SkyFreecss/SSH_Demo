package com.demo.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.demo.ssh.dao.ProductDao;
import com.demo.ssh.domain.Product;

/**
 * 
 *��Ʒ��ҵ�����
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
	    * ҵ����б�����Ʒ�ķ���
	    * 
	    */
       public void save(Product product)
       {
    	   System.out.println("Service�е�save����ִ���ˡ�����");
    	   productDao.save(product);
       }
} 
