package com.entity.view;

import com.entity.DiquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 地区
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 11:47:10
 */
@TableName("diqu")
public class DiquView  extends DiquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiquView(){
	}
 
 	public DiquView(DiquEntity diquEntity){
 	try {
			BeanUtils.copyProperties(this, diquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
