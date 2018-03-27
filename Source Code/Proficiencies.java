public class Proficiencies
{
	private String className;
	private String prof;
	private String savingThrows;

	public Proficiencies()
	{
	}

	public void setClass(String name)
	{
		className = name;
		setClassProf();
		setSavingThrows();
	}

	private void setClassProf()
	{
		if(className.equalsIgnoreCase("Barbarian"))
			prof = "Armor: light armor, medium armor, and shields \nWeapons: simple weapons and martial weapons \nTools: none";
		else if(className.equalsIgnoreCase("Bard"))
			prof = "Armor: light armor \nWeapons: simple weapons, hand crossbows, longswords, rapiers, and shortswords \nTools: wind, precussion, and string instruments";
		else if(className.equalsIgnoreCase("Cleric"))
			prof = "Armor: light armor, medium armor, and shields \nWeapons: simple weapons \nTools: none";
		else if(className.equalsIgnoreCase("Druid"))
			prof = "Armor: light armor, medium armor, and shields \nWeapons: clubs, daggers, darts, javelins, maces, quarterstaffs, scimitars, sickles, slings, and spears\nTools: herbalism kit";
		else if(className.equalsIgnoreCase("Fighter"))
			prof = "Armor: all armor and shields \nWeapons: simple weapons and martial weapons \nTools: none";
		else if(className.equalsIgnoreCase("Monk"))
			prof = "Armor: none \nWeapons: simple weapons and shortswords \nTools: artisan's tools";
		else if(className.equalsIgnoreCase("Paladin"))
			prof = "Armor: all armor and shields \nWeapons: simple weapons and martial weapons \nTools: none";
		else if(className.equalsIgnoreCase("Ranger"))
			prof = "Armor: light armor, medium armor, and shields \nWeapons: simple weapons and martial weapons \nTools: none";
		else if(className.equalsIgnoreCase("Rogue"))
			prof = "Armor: light armor \nWeapons: simple weapons, hand crossbows, longswords, rapiers, and shortswords \nTools: thieves' tools";
		else if(className.equalsIgnoreCase("Sorcerer"))
			prof = "Armor: none \nWeapons: daggers, darts, slings, quarterstaffs, and light crossbows \nTools: none";
		else if(className.equalsIgnoreCase("Warlock"))
			prof = "Armor: light armor \nWeapons: simple weapons \nTools: none";
		else if(className.equalsIgnoreCase("Wizard"))
			prof = "Armor: none \nWeapons: daggers, darts, slings, quarterstaffs, and light crossbows \nTools: none";
		else
			prof = "No proficiencies";
	}

	private void setSavingThrows()
	{
		if(className.equalsIgnoreCase("Barbarian"))
			savingThrows = "Saving throws: strength and constitution";
		else if(className.equalsIgnoreCase("Bard"))
			savingThrows = "Saving throws: dexterity and charisma";
		else if(className.equalsIgnoreCase("Cleric"))
			savingThrows = "Saving throws: wisdom and charisma";
		else if(className.equalsIgnoreCase("Druid"))
			savingThrows = "Saving throws: intelligence and wisdom";
		else if(className.equalsIgnoreCase("Fighter"))
			savingThrows = "Saving throws: strength and constitution";
		else if(className.equalsIgnoreCase("Monk"))
			savingThrows = "Saving throws: strength and dexterity";
		else if(className.equalsIgnoreCase("Paladin"))
			savingThrows = "Saving throws: strength and charisma";
		else if(className.equalsIgnoreCase("Ranger"))
			savingThrows = "Saving throws: dexterity and strength";
		else if(className.equalsIgnoreCase("Rogue"))
			savingThrows = "Saving throws: dexterity and intelligence";
		else if(className.equalsIgnoreCase("Sorcerer"))
			savingThrows = "Saving throws: constitution and charisma";
		else if(className.equalsIgnoreCase("Warlock"))
			savingThrows = "Saving throws: wisdom and charisma";
		else if(className.equalsIgnoreCase("Wizard"))
			savingThrows = "Saving throws: intelligence and wisdom";
		else
			savingThrows = "No saving throws";
	}

	public void prntFinal()
	{
		System.out.println("--------PROFICIENCIES--------");
		System.out.println(prof);
		System.out.println();
		System.out.println("--------SAVING THROWS--------");
		System.out.println(savingThrows);
	}
	
	public String[] getFinal()
	{
	    String[] fin = new String[5];
	    fin[0] = System.lineSeparator() + "--------PROFICIENCIES--------";
	    fin[1] = System.lineSeparator() + prof;
	    fin[2] = System.lineSeparator() + "";
	    fin[3] = System.lineSeparator() + "--------SAVING THROWS--------";
	    fin[4] = System.lineSeparator() + savingThrows;
	    
	    return fin;
	}
	
	public String[] getCodeFinal()
	{
	    String[] fin = new String[5];
	    fin[0] = "--------PROFICIENCIES--------";
	    fin[1] = "null" + prof.replaceAll("\n", "nullnull");
	    fin[2] = "";
	    fin[3] = "--------SAVING THROWS--------";
	    fin[4] = "null" + savingThrows;
	    
	    return fin;
	}
}