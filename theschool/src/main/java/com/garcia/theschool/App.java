package com.garcia.theschool;

import com.garcia.theschool.util.GenerateDataUtil;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//    	GenerateDataUtil obj = new GenerateDataUtil();
//    	obj.CreateDataManyToOne();
    	
	GenerateDataUtil obj = new GenerateDataUtil();
//     GenerateDataUtil.createDataOneToMany();
//   GenerateDataUtil.createDataOneToOne();
	 GenerateDataUtil.createDataManyToMany();
    }
}
