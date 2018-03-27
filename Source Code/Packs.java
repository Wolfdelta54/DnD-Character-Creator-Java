public class Packs
{
	private String contents;
	private String selPack;
	private String saveInfo;

	public Packs()
	{
	}

	public String getContents(String type) // Used in StartingEquip class
	{
		if(type.equalsIgnoreCase("explorer"))
		{
			String temp = explorer();
			saveInfo = temp;
			saveInfo.replaceAll("\n", System.lineSeparator());
			return explorer();
		}
		else if(type.equalsIgnoreCase("burglar"))
		{
			String temp = burglar();
			saveInfo = temp.replaceAll("\n", System.lineSeparator());
			return burglar();
		}
		else if(type.equalsIgnoreCase("diplomat"))
		{
			String temp = diplomat();
			saveInfo = temp.replaceAll("\n", System.lineSeparator());
			return diplomat();
		}
		else if(type.equalsIgnoreCase("dungeoneer"))
		{
			String temp = dungeoneer();
			saveInfo = temp.replaceAll("\n", System.lineSeparator());
			return dungeoneer();
		}
		else if(type.equalsIgnoreCase("entertainer"))
		{
			String temp = entertainer();
			saveInfo = temp.replaceAll("\n", System.lineSeparator());
			return entertainer();
		}
		else if(type.equalsIgnoreCase("priest"))
		{
			String temp = priest();
			saveInfo = temp.replaceAll("\n", System.lineSeparator());
			return priest();
		}
		else if(type.equalsIgnoreCase("scholar"))
		{
			String temp = scholar();
			saveInfo = temp.replaceAll("\n", System.lineSeparator());
			return scholar();
		}
		else
		{
			return "";
		}
	}
	
	public void setContents() // Used in Override class
	{
		if(selPack.equalsIgnoreCase("explorer"))
		{
			String temp = explorer();
			saveInfo = temp;
			saveInfo.replaceAll("\n", "null");
		}
		else if(selPack.equalsIgnoreCase("burglar"))
		{
			String temp = burglar();
			saveInfo = temp.replaceAll("\n", "null");
		}
		else if(selPack.equalsIgnoreCase("diplomat"))
		{
			String temp = diplomat();
			saveInfo = temp.replaceAll("\n", "null");
		}
		else if(selPack.equalsIgnoreCase("dungeoneer"))
		{
			String temp = dungeoneer();
			saveInfo = temp.replaceAll("\n", "null");
		}
		else if(selPack.equalsIgnoreCase("entertainer"))
		{
			String temp = entertainer();
			saveInfo = temp.replaceAll("\n", "null");
		}
		else if(selPack.equalsIgnoreCase("priest"))
		{
			String temp = priest();
			saveInfo = temp.replaceAll("\n", "null");
		}
		else if(selPack.equalsIgnoreCase("scholar"))
		{
			String temp = scholar();
			saveInfo = temp.replaceAll("\n", "null");
		}
		else
		{
		}
	}

	private String explorer()
	{
		contents = "a backpack, a bedroll, a mess kit, a tinderbox, \n10 torches, 10 days of rations, a waterskin, 50ft of hempen rope";
		return contents;
	}

	private String burglar()
	{
		contents = "a backpack, a bag of 1000 ball bearings, 10ft of string, a bell, \n5 candles, a crowbar, a hammer, 10 pitons, \na hooded lantern";
		contents = contents + ", 2 flasks of oil, 5 days rations, a tinderbox, \na waterskin, 50ft of hempen rope";
		return contents;
	}

	private String diplomat()
	{
		contents = "a chest, 2 cases for maps and scrolls, a set of fine clothes, a bottle of ink, \nan ink pen, a lamp, 2 flasks of oil";
		contents = contents + ", 5 sheets of paper, \na vial of perfume, sealing wax, soap";
		return contents;
	}

	private String dungeoneer()
	{
		contents = "a backpack, a crowbar, a hammer, 10 pitons, \n10 torches, a tinderbox, 10 days of rations, a waterskin, \n50ft of hempen rope";
		return contents;
	}

	private String entertainer()
	{
		contents = "a backpack, a bedroll, 2 costumes, 5 candles, \n5 days of rations, a waterskin, a disguise kit";
		return contents;
	}

	private String priest()
	{
		contents = "a backpack, a blanket, 10 candles, a tinderbox, \nan alms box, 2 blocks of incense, a censar, vestaments, \n2 days of rations, a waterskin";
		return contents;
	}

	private String scholar()
	{
		contents = "a backpack, a book of lore, a bottle of ink, an ink pen, \n10 sheets of parchment, a little bag of sand, a small knife";
		return contents;
	}

	public void setPack(String type)
	{
		selPack = type;
	}

	public String getPack()
	{
		return selPack;
	}
	
	public String[] getFinal()
	{
	    String[] fin = new String[1];
	    
	    fin[0] = System.lineSeparator() + saveInfo;
	    
	    return fin;
	}
	
	public String[] getFinal2()
	{
	    String[] fin = new String[1];
	    
	    fin[0] = saveInfo;
	    
	    return fin;
	}
}