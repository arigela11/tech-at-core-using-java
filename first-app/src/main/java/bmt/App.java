package bmt;

/*package com.app.ReadWriteExcelApp;*/



public class App 
{
    public static void main( String[] args )
    {
        
        System.out.println( "Hello World!" );
        
        ExcelUpdateService excelService = new ExcelUpdateService();
        
        excelService.updateExcelFile();
        
        System.out.println(" main method execution end.........");
       
    }
    
    

}
