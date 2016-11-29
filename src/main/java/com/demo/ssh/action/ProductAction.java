package com.demo.ssh.action;

import com.demo.ssh.domain.Product;
import com.demo.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * 商品的业务处理类
 *
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	   /**
	 * 
	 */

	//模型驱动使用的类
	   private Product product = new Product();
		@Override
		public Product getModel() {
			
			return product;
		}
		
	   //整合Spring和Struts2的过程中按名称自动注入的类
	   private ProductService productService;

	 
	   
	 public void setProductService(ProductService productService) {
		this.productService = productService;
	}



     /**
      * 保存商品的执行方法
      * 
      */
	   public String save()
	   {
		   System.out.println("Action中的save方法执行了");
		   productService.save(product);
		   return NONE;
	   }
	   
}
