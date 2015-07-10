package org.moflon.mosl.utils.exceptions;

import MOSLCodeAdapter.moslPlus.MoslCategory;

public class CanNotResolvePathException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1628826593032436625L;
   private String referencePath;
   private String name;
   private MoslCategory category;
	
	public CanNotResolvePathException(String message, Throwable arg, String referencePath, String name, MoslCategory category){
		super(message, arg);
		
		this.referencePath = referencePath;
      this.name = name;
      this.category = category; 
	}
	
	public CanNotResolvePathException(String message, String referencePath, String name, MoslCategory category){
		this(message, null, referencePath, name, category);
	}
	
	public CanNotResolvePathException(String message, Throwable arg){
      this(message, arg, null, null, null);
   }
	
	public CanNotResolvePathException(String message){
      this(message, null, null, null, null);
   }

   public String getReferencePath()
   {
      return referencePath;
   }

   public String getName()
   {
      return name;
   }

   public MoslCategory getCategory()
   {
      return category;
   }
	
	
}
