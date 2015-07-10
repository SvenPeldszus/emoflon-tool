package org.moflon.mosl.utils;

import java.util.ArrayList;

import org.moflon.mosl.utils.exceptions.CanNotResolveCategoryException;

import MOSLCodeAdapter.moslPlus.MoslCategory;
import MocaTree.Attribute;
import MocaTree.MocaTreeFactory;
import MocaTree.Node;
import MocaTree.Text;

public abstract class AbstractResolver {
	public static MoslCategory getCategory(String value){
		//add new Categories recognition here
		switch(value){		
		case "workingSet": return MoslCategory.WORKING_SET;
		case "package": return MoslCategory.PACKAGE;
		case "other": return MoslCategory.OTHER;
		case "eclassFile": return MoslCategory.ECLASS_FILE;
		case "tggFile": return MoslCategory.TGG_FILE;
		case "tggFolder": return MoslCategory.TGG_FOLDER;
		case "rulesFolder": return MoslCategory.RULES_FOLDER;
		case "mconfFile": return MoslCategory.MCONF_FILE;
		case "schemaFile": return MoslCategory.SCHEMA_FILE;
		case "patternFolder": return MoslCategory.PATTERN_FOLDER;
		case "patternFile": return MoslCategory.PATTERN_FILE;
		case "pattern": return MoslCategory.PATTERN;
		case "objectVariable": return MoslCategory.OBJECT_VARIABLE;
		case "link": return MoslCategory.LINK;
		case "rule": return MoslCategory.RULE;
		case "correspondence": return MoslCategory.CORRESPONDENCE;
		case "reference": return MoslCategory.REFERENCE;
		case "attribute": return MoslCategory.ATTRIBUTE;
		case "operation": return MoslCategory.OPERATION;
		case "parameter": return MoslCategory.PARAMETER;
		case "edatatype": return MoslCategory.TYPE;
		case "eenum": return MoslCategory.TYPE;
		case "eclass": return MoslCategory.TYPE;
		case "tggObjectVariable": return MoslCategory.TGG_OBJECT_VARIABLE;
		case "tggLink": return MoslCategory.TGG_LINK;
		case "metamodel": return MoslCategory.METAMODEL;
		case "opposite": return MoslCategory.OPPOSITE;
		case "typedExpression": return MoslCategory.TYPED_EXPRESSION;
		case "type": return MoslCategory.TYPE;
		
		default: throw new CanNotResolveCategoryException("Unknown Category: "+value);
		}
	}
	
	public MoslCategory getCategory(Node node){
		return getCategory(node, "category");
	}
	
	public MoslCategory getSearchCategory(Attribute searchCategory){
		return getCategory(searchCategory.getValue());
	}
	
	protected MoslCategory getCategory(Attribute attribute){
		return getCategory(attribute.getValue());
	}
	
	protected MoslCategory getCategory(Node node, String type){
		Attribute categoryAttr=null;
		MoslCategory category=null;
		try{
			categoryAttr=new ArrayList<Attribute>(node.getAttribute(type)).get(0);
		}catch (IndexOutOfBoundsException ioobe){
			categoryAttr = createAttribute("category", "other", node.getAttribute().size());					
		}catch (Exception e){
			throw new CanNotResolveCategoryException("Unknown Exception", node, e);
		}		 
		try{
			category=getCategory(categoryAttr.getValue());
		} catch(CanNotResolveCategoryException ce){	
		
			throw new CanNotResolveCategoryException("Unknown Category: "+categoryAttr.getValue(),node);
		}catch (Exception e){
			throw new CanNotResolveCategoryException("Unknown Exception", node, e);
		}	
		return category;
	
	}
	
	protected boolean hasChild(Node node, String childName){
		return node.getChildren(childName).size()>0;
	}
	
	protected Node getChild(Node node, String childName){
		try{
			return Node.class.cast(new ArrayList<Text>(node.getChildren(childName)).get(0));
		} catch (Exception e){
			return null;
		}
	}
	
	protected boolean hasAttribute(Node node, String attributeName){
		return node.getAttribute(attributeName).size()>0;
	}
	
	protected Attribute getAttribute (Node node, String attributeName){
		return new ArrayList<Attribute>(node.getAttribute(attributeName)).get(0);
	}
	
	protected Attribute createAttribute(String name, String value, int index){
		Attribute attribute = MocaTreeFactory.eINSTANCE.createAttribute();
		attribute.setName(name);
		attribute.setValue(value);
		attribute.setIndex(index);
		return attribute;
	}
	
	protected Node createNode(String name, int index){
		Node node = MocaTreeFactory.eINSTANCE.createNode();
		node.setName(name);
		node.setIndex(index);
		return node;
	}
}
