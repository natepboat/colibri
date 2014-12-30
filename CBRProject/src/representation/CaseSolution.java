package representation;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;
 import colibristudio.annotations.JCOLIBRIAttributeType;


public class CaseSolution implements CaseComponent { 


	/* Generated Class. Please Do Not Modify... */ 


	private java.lang.String name;


	public java.lang.String getName()
		{
			return name;
		}
	public void setName(java.lang.String name19)
		{
			this.name = name19;
		}

	private java.lang.Integer sol_id;


	public java.lang.Integer getSol_id()
		{
			return sol_id;
		}
	public void setSol_id(java.lang.Integer sol_id20)
		{
			this.sol_id = sol_id20;
		}


	public Attribute getIdAttribute()
		{
			return new Attribute("sol_id",this.getClass());
		} 

	public String toString()		{
			return "["+ sol_id + " , " + name +"]";
		}

}
