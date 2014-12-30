package representation;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;
 import colibristudio.annotations.JCOLIBRIAttributeType;


public class CaseDescription implements CaseComponent { 


	/* Generated Class. Please Do Not Modify... */ 


	private java.lang.Boolean open_bottle;


	public java.lang.Boolean getOpen_bottle()
		{
			return open_bottle;
		}
	public void setOpen_bottle(java.lang.Boolean open_bottle0)
		{
			this.open_bottle = open_bottle0;
		}

	private java.lang.Integer avg_price;


	public java.lang.Integer getAvg_price()
		{
			return avg_price;
		}
	public void setAvg_price(java.lang.Integer avg_price1)
		{
			this.avg_price = avg_price1;
		}

	private java.lang.Boolean beer_girl;


	public java.lang.Boolean getBeer_girl()
		{
			return beer_girl;
		}
	public void setBeer_girl(java.lang.Boolean beer_girl2)
		{
			this.beer_girl = beer_girl2;
		}

	private java.lang.Boolean food;


	public java.lang.Boolean getFood()
		{
			return food;
		}
	public void setFood(java.lang.Boolean food3)
		{
			this.food = food3;
		}

	private java.lang.Boolean snack;


	public java.lang.Boolean getSnack()
		{
			return snack;
		}
	public void setSnack(java.lang.Boolean snack4)
		{
			this.snack = snack4;
		}

	private java.lang.Boolean cocktail;


	public java.lang.Boolean getCocktail()
		{
			return cocktail;
		}
	public void setCocktail(java.lang.Boolean cocktail5)
		{
			this.cocktail = cocktail5;
		}

	private java.lang.Boolean draft_beer;


	public java.lang.Boolean getDraft_beer()
		{
			return draft_beer;
		}
	public void setDraft_beer(java.lang.Boolean draft_beer6)
		{
			this.draft_beer = draft_beer6;
		}

	private java.lang.Boolean smoothies;


	public java.lang.Boolean getSmoothies()
		{
			return smoothies;
		}
	public void setSmoothies(java.lang.Boolean smoothies7)
		{
			this.smoothies = smoothies7;
		}

	private java.lang.Boolean remove_chair;


	public java.lang.Boolean getRemove_chair()
		{
			return remove_chair;
		}
	public void setRemove_chair(java.lang.Boolean remove_chair8)
		{
			this.remove_chair = remove_chair8;
		}

	private java.lang.Boolean dj;


	public java.lang.Boolean getDj()
		{
			return dj;
		}
	public void setDj(java.lang.Boolean dj9)
		{
			this.dj = dj9;
		}

	private java.lang.Boolean live_music;


	public java.lang.Boolean getLive_music()
		{
			return live_music;
		}
	public void setLive_music(java.lang.Boolean live_music10)
		{
			this.live_music = live_music10;
		}

	private java.lang.Boolean public_karaoke;


	public java.lang.Boolean getPublic_karaoke()
		{
			return public_karaoke;
		}
	public void setPublic_karaoke(java.lang.Boolean public_karaoke11)
		{
			this.public_karaoke = public_karaoke11;
		}

	private java.lang.Boolean free_wifi;


	public java.lang.Boolean getFree_wifi()
		{
			return free_wifi;
		}
	public void setFree_wifi(java.lang.Boolean free_wifi12)
		{
			this.free_wifi = free_wifi12;
		}

	private java.lang.Boolean aircondition;


	public java.lang.Boolean getAircondition()
		{
			return aircondition;
		}
	public void setAircondition(java.lang.Boolean aircondition13)
		{
			this.aircondition = aircondition13;
		}

	private java.lang.Boolean outdoor;


	public java.lang.Boolean getOutdoor()
		{
			return outdoor;
		}
	public void setOutdoor(java.lang.Boolean outdoor14)
		{
			this.outdoor = outdoor14;
		}

	private java.lang.Integer close_time;


	public java.lang.Integer getClose_time()
		{
			return close_time;
		}
	public void setClose_time(java.lang.Integer close_time15)
		{
			this.close_time = close_time15;
		}

	private java.lang.Integer open_time;


	public java.lang.Integer getOpen_time()
		{
			return open_time;
		}
	public void setOpen_time(java.lang.Integer open_time16)
		{
			this.open_time = open_time16;
		}

	private java.lang.String area;


	public java.lang.String getArea()
		{
			return area;
		}
	public void setArea(java.lang.String area17)
		{
			this.area = area17;
		}

	private java.lang.Integer id;


	public java.lang.Integer getId()
		{
			return id;
		}
	public void setId(java.lang.Integer id18)
		{
			this.id = id18;
		}


	public Attribute getIdAttribute()
		{
			return new Attribute("id",this.getClass());
		} 

	public String toString()		{
			return "["+ area + " , " + free_wifi + " , " + snack + " , " + smoothies + " , " + dj + " , " + open_time + " , " + avg_price + " , " + aircondition + " , " + close_time + " , " + remove_chair + " , " + food + " , " + public_karaoke + " , " + outdoor + " , " + open_bottle + " , " + live_music + " , " + cocktail + " , " + beer_girl + " , " + id + " , " + draft_beer +"]";
		}

}
