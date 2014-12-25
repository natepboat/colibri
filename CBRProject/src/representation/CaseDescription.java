package representation;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;
 import colibristudio.annotations.JCOLIBRIAttributeType;


public class CaseDescription implements CaseComponent { 


	/* Generated Class. Please Do Not Modify... */ 


	private java.lang.Integer id;


	public java.lang.Integer getId()
		{
			return id;
		}
	public void setId(java.lang.Integer id0)
		{
			this.id = id0;
		}

	private java.lang.String area;


	public java.lang.String getArea()
		{
			return area;
		}
	public void setArea(java.lang.String area1)
		{
			this.area = area1;
		}

	private java.lang.Integer open_time;


	public java.lang.Integer getOpen_time()
		{
			return open_time;
		}
	public void setOpen_time(java.lang.Integer open_time2)
		{
			this.open_time = open_time2;
		}

	private java.lang.Integer close_time;


	public java.lang.Integer getClose_time()
		{
			return close_time;
		}
	public void setClose_time(java.lang.Integer close_time3)
		{
			this.close_time = close_time3;
		}

	private java.lang.Boolean outdoor;


	public java.lang.Boolean getOutdoor()
		{
			return outdoor;
		}
	public void setOutdoor(java.lang.Boolean outdoor4)
		{
			this.outdoor = outdoor4;
		}

	private java.lang.Boolean aircondition;


	public java.lang.Boolean getAircondition()
		{
			return aircondition;
		}
	public void setAircondition(java.lang.Boolean aircondition5)
		{
			this.aircondition = aircondition5;
		}

	private java.lang.Boolean free_wifi;


	public java.lang.Boolean getFree_wifi()
		{
			return free_wifi;
		}
	public void setFree_wifi(java.lang.Boolean free_wifi6)
		{
			this.free_wifi = free_wifi6;
		}

	private java.lang.Boolean public_karaoke;


	public java.lang.Boolean getPublic_karaoke()
		{
			return public_karaoke;
		}
	public void setPublic_karaoke(java.lang.Boolean public_karaoke7)
		{
			this.public_karaoke = public_karaoke7;
		}

	private java.lang.Boolean live_music;


	public java.lang.Boolean getLive_music()
		{
			return live_music;
		}
	public void setLive_music(java.lang.Boolean live_music8)
		{
			this.live_music = live_music8;
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

	private java.lang.Boolean remove_chair;


	public java.lang.Boolean getRemove_chair()
		{
			return remove_chair;
		}
	public void setRemove_chair(java.lang.Boolean remove_chair10)
		{
			this.remove_chair = remove_chair10;
		}

	private java.lang.Boolean smoothies;


	public java.lang.Boolean getSmoothies()
		{
			return smoothies;
		}
	public void setSmoothies(java.lang.Boolean smoothies11)
		{
			this.smoothies = smoothies11;
		}

	private java.lang.Boolean draft_beer;


	public java.lang.Boolean getDraft_beer()
		{
			return draft_beer;
		}
	public void setDraft_beer(java.lang.Boolean draft_beer12)
		{
			this.draft_beer = draft_beer12;
		}

	private java.lang.Boolean cocktail;


	public java.lang.Boolean getCocktail()
		{
			return cocktail;
		}
	public void setCocktail(java.lang.Boolean cocktail13)
		{
			this.cocktail = cocktail13;
		}

	private java.lang.Boolean snack;


	public java.lang.Boolean getSnack()
		{
			return snack;
		}
	public void setSnack(java.lang.Boolean snack14)
		{
			this.snack = snack14;
		}

	private java.lang.Boolean food;


	public java.lang.Boolean getFood()
		{
			return food;
		}
	public void setFood(java.lang.Boolean food15)
		{
			this.food = food15;
		}

	private java.lang.Boolean beer_girl;


	public java.lang.Boolean getBeer_girl()
		{
			return beer_girl;
		}
	public void setBeer_girl(java.lang.Boolean beer_girl16)
		{
			this.beer_girl = beer_girl16;
		}

	private java.lang.Integer avg_price;


	public java.lang.Integer getAvg_price()
		{
			return avg_price;
		}
	public void setAvg_price(java.lang.Integer avg_price17)
		{
			this.avg_price = avg_price17;
		}

	private java.lang.Boolean open_bottle;


	public java.lang.Boolean getOpen_bottle()
		{
			return open_bottle;
		}
	public void setOpen_bottle(java.lang.Boolean open_bottle18)
		{
			this.open_bottle = open_bottle18;
		}


	public Attribute getIdAttribute()
		{
			return new Attribute("id",this.getClass());
		} 

	public String toString()		{
			return "["+ area + " , " + free_wifi + " , " + dj + " , " + smoothies + " , " + snack + " , " + open_time + " , " + avg_price + " , " + close_time + " , " + aircondition + " , " + remove_chair + " , " + food + " , " + public_karaoke + " , " + outdoor + " , " + live_music + " , " + open_bottle + " , " + cocktail + " , " + beer_girl + " , " + id + " , " + draft_beer +"]";
		}

}
