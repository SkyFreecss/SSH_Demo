package com.demo.ssh.action;

import com.demo.ssh.domain.Product;
import com.demo.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * ��Ʒ��ҵ������
 *
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	   /**
	 * 
	 */

	//ģ������ʹ�õ���
	   private Product product = new Product();
		@Override
		public Product getModel() {
			
			return product;
		}
		
	   //����Spring��Struts2�Ĺ����а������Զ�ע�����
	   private ProductService productService;

	 
	   
	 public void setProductService(ProductService productService) {
		this.productService = productService;
	}



     /**
      * ������Ʒ��ִ�з���
      * 
      */
	   public String save()
	   {
		   System.out.println("Action�е�save����ִ����");
		   productService.save(product);
		   return NONE;
	   }
	   
}
