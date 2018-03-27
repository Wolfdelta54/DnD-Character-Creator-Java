public class Skills
{
	private String[] barbarian;
	private String[] bard;
	private String[] cleric;
	private String[] druid;
	private String[] fighter;
	private String[] monk;
	private String[] paladin;
	private String[] ranger;
	private String[] rogue;
	private String[] sorcerer;
	private String[] warlock;
	private String[] wizard;
	private String[] classSkills;
	private int skills;
	private int[] abilityMods;
	private String[] allSkills;
	private int[] skillMods;

	private String[] tempStorage;
	private String[] chosenSkills;
	
	private String race;

	public Skills()
	{
		setArrays();
	}

	public void setClass(String name)
	{
		if(name.equalsIgnoreCase("Barbarian"))
		{
			classSkills = barbarian;
			skills = 2;
		}
		else if(name.equalsIgnoreCase("Bard"))
		{
			classSkills = bard;
			skills = 3;
		}
		else if(name.equalsIgnoreCase("Cleric"))
		{
			classSkills = cleric;
			skills = 2;
		}
		else if(name.equalsIgnoreCase("Druid"))
		{
			classSkills = druid;
			skills = 2;
		}
		else if(name.equalsIgnoreCase("Fighter"))
		{
			classSkills = fighter;
			skills = 2;
		}
		else if(name.equalsIgnoreCase("Monk"))
		{
			classSkills = monk;
			skills = 2;
		}
		else if(name.equalsIgnoreCase("Paladin"))
		{
			classSkills = paladin;
			skills = 2;
		}
		else if(name.equalsIgnoreCase("Ranger"))
		{
			classSkills = ranger;
			skills = 3;
		}
		else if(name.equalsIgnoreCase("Rogue"))
		{
			classSkills = rogue;
			skills = 4;
		}
		else if(name.equalsIgnoreCase("Sorcerer"))
		{
			classSkills = sorcerer;
			skills = 2;
		}
		else if(name.equalsIgnoreCase("Warlock"))
		{
			classSkills = warlock;
			skills = 2;
		}
		else if(name.equalsIgnoreCase("Wizard"))
		{
			classSkills = wizard;
			skills = 2;
		}
		else
		{
			classSkills = fighter;
			skills = 2;
		}

		chosenSkills = new String[skills];
		tempStorage = classSkills;
	}
	
	public void setRace(String raceName)
	{
		race = raceName;
	}

	private void setArrays()
	{
		setBarbarian();
		setBard();
		setCleric();
		setDruid();
		setFighter();
		setMonk();
		setPaladin();
		setRanger();
		setRogue();
		setSorcerer();
		setWarlock();
		setWizard();
		setAbilityArray();
	}

	private void setBarbarian()
	{
		barbarian = new String[6];

		barbarian[0] = "Animal Handling";
		barbarian[1] = "Athletics";
		barbarian[2] = "Intimidation";
		barbarian[3] = "Nature";
		barbarian[4] = "Perception";
		barbarian[5] = "Survival";
	}

	private void setBard()
	{
		bard = new String[18];

		bard[0] = "Acrobatics";
		bard[1] = "Animal Handling";
		bard[2] = "Arcana";
		bard[3] = "Athletics";
		bard[4] = "Deception";
		bard[5] = "History";
		bard[6] = "Insight";
		bard[7] = "Intimidation";
		bard[8] = "Investigation";
		bard[9] = "Medicine";
		bard[10] = "Nature";
		bard[11] = "Perception";
		bard[12] = "Performance";
		bard[13] = "Persuasion";
		bard[14] = "Religion";
		bard[15] = "Sleight of Hand";
		bard[16] = "Stealth";
		bard[17] = "Survival";
	}

	private void setCleric()
	{
		cleric = new String[5];

		cleric[0] = "History";
		cleric[1] = "Insight";
		cleric[2] = "Medicine";
		cleric[3] = "Persuasion";
		cleric[4] = "Religion";
	}

	private void setDruid()
	{
		druid = new String[8];

		druid[0] = "Arcana";
		druid[1] = "Animal Handling";
		druid[2] = "Insight";
		druid[3] = "Medicine";
		druid[4] = "Nature";
		druid[5] = "Perception";
		druid[6] = "Religion";
		druid[7] = "Survival";
	}

	private void setFighter()
	{
		fighter = new String[8];

		fighter[0] = "Acrobatics";
		fighter[1] = "Animal Handling";
		fighter[2] = "Athletics";
		fighter[3] = "History";
		fighter[4] = "Insight";
		fighter[5] = "Intimidation";
		fighter[6] = "Perception";
		fighter[7] = "Survival";
	}

	private void setMonk()
	{
		monk = new String[6];

		monk[0] = "Acrobatics";
		monk[1] = "Athletics";
		monk[2] = "History";
		monk[3] = "Insight";
		monk[4] = "Religion";
		monk[5] = "Stealth";
	}

	private void setPaladin()
	{
		paladin = new String[6];

		paladin[0] = "Athletics";
		paladin[1] = "Insight";
		paladin[2] = "Intimidation";
		paladin[3] = "Medicine";
		paladin[4] = "Persuasion";
		paladin[5] = "Religion";
	}

	private void setRanger()
	{
		ranger = new String[8];

		ranger[0] = "Animal Handling";
		ranger[1] = "Athletics";
		ranger[2] = "Insight";
		ranger[3] = "Investigation";
		ranger[4] = "Nature";
		ranger[5] = "Perception";
		ranger[6] = "Stealth";
		ranger[7] = "Survival";
	}

	private void setRogue()
	{
		rogue = new String[11];

		rogue[0] = "Acrobatics";
		rogue[1] = "Athletics";
		rogue[2] = "Deception";
		rogue[3] = "Insight";
		rogue[4] = "Intimidation";
		rogue[5] = "Investigation";
		rogue[6] = "Perception";
		rogue[7] = "Performance";
		rogue[8] = "Persuasion";
		rogue[9] = "Sleight of Hand";
		rogue[10] = "Stealth";
	}

	private void setSorcerer()
	{
		sorcerer = new String[6];

		sorcerer[0] = "Arcana";
		sorcerer[1] = "Deception";
		sorcerer[2] = "Insight";
		sorcerer[3] = "Intimidation";
		sorcerer[4] = "Persuasion";
		sorcerer[5] = "Religion";
	}

	private void setWarlock()
	{
		warlock = new String[7];

		warlock[0] = "Arcana";
		warlock[1] = "Deception";
		warlock[2] = "History";
		warlock[3] = "Intimidation";
		warlock[4] = "Investigation";
		warlock[5] = "Nature";
		warlock[6] = "Religion";
	}

	private void setWizard()
	{
		wizard = new String[6];

		wizard[0] = "Arcana";
		wizard[1] = "History";
		wizard[2] = "Insight";
		wizard[3] = "Investigation";
		wizard[4] = "Medicine";
		wizard[5] = "Religion";
	}

	private void updateUnused(String used)
	{
		String[] unusedSkills = new String[tempStorage.length - 1];

		for(int x = 0; x < unusedSkills.length; x++)
		{
			unusedSkills[x] = "";
		}

		int slot = 0;

		for(int i = 0; i <= unusedSkills.length; i++)
		{
			String curSlot = tempStorage[i];

		//	if(!curSlot.equalsIgnoreCase(used))
		//	{
				if(!curSlot.equalsIgnoreCase(used))
				{
					unusedSkills[slot] = curSlot;
					slot++;
				}
		//	}
		}

		tempStorage = unusedSkills;
	}

	public void updateList(int curSlot, String used)
	{
		chosenSkills[curSlot] = used;
		updateUnused(used);
	}

	public void prntFinal()
	{
		System.out.println("--------SKILLS--------");
		for(int i = 0; i < chosenSkills.length; i++)
		{
			System.out.println(chosenSkills[i]);
		}
	}
	
	public String[] getFinal()
	{
		setSkillMods();
		String val = "";
	    String[] fin = new String[allSkills.length + 1];
	    fin[0] = System.lineSeparator() + "--------SKILLS--------";
	    
	    for(int i = 0; i < allSkills.length; i++)
	    {
	    	int finIndex = i + 1;
	        fin[finIndex] = System.lineSeparator() + allSkills[i] + " - " + val + skillMods[i];
	    }
	    
	    return fin;
	}
	
	public String[] getFinal2()
	{
		setSkillMods();
		String val = "";
	    String[] fin = new String[allSkills.length + 1];
	    fin[0] = "null--------SKILLS--------";
	    
	    for(int i = 0; i < allSkills.length; i++)
	    {
	    	if(skillMods[i] >= 0)
	    		val = "+";
	    	else
	    		val = "";
	    	
	        fin[i+1] = "null" + allSkills[i] + " - " + val + skillMods[i];
	    }
	    
	    return fin;
	}

	public int getNumSkills()
	{
		return skills;
	}

	public String getSkill(int slot)
	{
		return tempStorage[slot];
	}

	public void prntList()
	{
		for(int i = 0; i < tempStorage.length; i++)
		{
			System.out.println((i + 1) + ". " + tempStorage[i]);
		}
	}
	
	private void setAbilityArray()
	{
		allSkills = new String[18];
		allSkills[0] = "Acrobatics (dex)";
		allSkills[1] = "Animal Handling (wis)";
		allSkills[2] = "Arcana (int)";
		allSkills[3] = "Athletics (str)";
		allSkills[4] = "Deception (cha)";
		allSkills[5] = "History (int)";
		allSkills[6] = "Insight (wis)";
		allSkills[7] = "Intimidation (cha)";
		allSkills[8] = "Investigation (int)";
		allSkills[9] = "Medicine (wis)";
		allSkills[10] = "Nature (int)";
		allSkills[11] = "Perception (wis)";
		allSkills[12] = "Performance (cha)";
		allSkills[13] = "Persuasion (cha)";
		allSkills[14] = "Religion (int)";
		allSkills[15] = "Sleight of Hand (dex)";
		allSkills[16] = "Survival (wis)";
		allSkills[17] = "Stealth (dex)";
		
		skillMods = new int[18];
		
		for(int i = 0; i < skillMods.length; i++)
			skillMods[i] = 0;
		
	}
	
	public void setModifierArray(int[] mods)
	{
		/* Order In Array ::
		   Charisma  -  0
		   Constitution  -  1
		   Dexterity  -  2
		   Intelligence  -  3
		   Strength  -  4
		   Wisdom  -  5
		 */
		abilityMods = mods;
	}
	
	private void setSkillMods()
	{
		for(int i = 0; i < allSkills.length; i++)
		{
			int spaceIndex = allSkills[i].indexOf(" (");
			int mod = 0;
			
			for(int j = 0; j < chosenSkills.length; j++)
			{
				String temp = chosenSkills[j];
				
				if(allSkills[i].substring(0, spaceIndex).equalsIgnoreCase(temp)  || (race.equalsIgnoreCase("Orc") && allSkills[i].equalsIgnoreCase("Intimidation (cha)")) )
				{
					mod += 2;
					j = 10;
				}
			}
			
			if(allSkills[i].indexOf("(str)") != -1)
				mod += abilityMods[4];
			else if(allSkills[i].indexOf("(dex)") != -1)
				mod += abilityMods[2];
			else if(allSkills[i].indexOf("(int)") != -1)
				mod += abilityMods[3];
			else if(allSkills[i].indexOf("(wis)") != -1)
				mod += abilityMods[5];
			else if(allSkills[i].indexOf("(cha)") != -1)
				mod += abilityMods[0];
			
			
			skillMods[i] = mod;
		}
	}
}