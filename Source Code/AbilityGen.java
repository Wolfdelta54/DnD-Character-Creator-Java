public class AbilityGen
{
	private int[] abilityRolls = new int[6];
	private String[] abilities;
	private int[] tempStorage;
	private int[] abilityScores;
	private int[] modifiers;

	public AbilityGen()
	{
		abilityScores = new int[6];
		modifiers = new int[6];
		abilities = new String[6];
		abilities[0] = "Charisma";
		abilities[1] = "Constitution";
		abilities[2] = "Dexterity";
		abilities[3] = "Intelligence";
		abilities[4] = "Strength";
		abilities[5] = "Wisdom";

		genScores();
	}

	private int genRoll()
	{
		double tempNum1 = (Math.random() * 6) + 1;
		double tempNum2 = (Math.random() * 6) + 1;
		double tempNum3 = (Math.random() * 6) + 1;
		double tempNum4 = (Math.random() * 6) + 1;

		int num1 = (int)Math.floor(tempNum1);
		int num2 = (int)Math.floor(tempNum2);
		int num3 = (int)Math.floor(tempNum3);
		int num4 = (int)Math.floor(tempNum4);

		int totalAll = num1 + num2 + num3 + num4;

		int minNum = Math.min(num1, num2);
		minNum = Math.min(minNum, num3);
		minNum = Math.min(minNum, num4);

		int genNum = totalAll - minNum;

		return genNum;
	}

	public void genScores()
	{
		for(int i = 0; i < 6; i++)
		{
			abilityRolls[i] = genRoll();
		}
		
		tempStorage = abilityRolls;
	}

	private int prntScore(int slot)
	{
		return tempStorage[slot];
	}

	public void assignScore(int slot)
	{
		System.out.println("Ability to Asign to :: " + abilities[slot]);

		for(int i = 0; i < tempStorage.length; i++)
		{
			System.out.println((i + 1) + ". " + prntScore(i));
		}
	}

	public void determineMod(int slot)
	{
		int score = abilityScores[slot];

		if(score == 3)
		{
			modifiers[slot] = -4;
		}
		else if(score == 4 || score == 5)
		{
			modifiers[slot] = -3;
		}
		else if(score == 6 || score == 7)
		{
			modifiers[slot] = -2;
		}
		else if(score == 8 || score == 9)
		{
			modifiers[slot] = -1;
		}
		else if(score == 10 || score == 11)
		{
			modifiers[slot] = 0;
		}
		else if(score == 12 || score == 13)
		{
			modifiers[slot] = 1;
		}
		else if(score == 14 || score == 15)
		{
			modifiers[slot] = 2;
		}
		else if(score == 16 || score == 17)
		{
			modifiers[slot] = 3;
		}
		else if(score == 18 || score == 19)
		{
			modifiers[slot] = 4;
		}
		else if(score == 20 || score == 21)
		{
			modifiers[slot] = 5;
		}
		else
		{
			modifiers[slot] = 6;
		}
	}

	private void updateUnused(int usedSlot)
	{
		int[] unusedRolls = new int[tempStorage.length - 1];

		 /*for(int x = 0; x < unusedRolls.length; x++)
		{
			unusedRolls[x] = 0;
		}

		int slot = 0;

		for(int i = 0; i < tempStorage.length; i++)
		{
			int curSlot = tempStorage[i];

		//	if(!curSlot.equalsIgnoreCase(used))
		//	{
				if(i == usedSlot)
				{
					int temp = 0;
				}
				else
				{
					unusedRolls[slot] = curSlot;
					slot++;
				}
		//	}
		} */
		int slot = 0;
		
		for(int i = 0; i < tempStorage.length; i++)
		{
			if(usedSlot != i)
			{
				unusedRolls[slot] = tempStorage[i];
				slot++;
			}
		}

		tempStorage = unusedRolls;
	}

	public void updateScores(int abilityRollsSlot, int abilitySlot)
	{
		int score = tempStorage[abilityRollsSlot];

		abilityScores[abilitySlot] = score;
		updateUnused(abilityRollsSlot);
	}

	public String getAbility(int slot)
	{
		return abilities[slot];
	}

	public void prntFinal()
	{
		System.out.println("--------ABILITY SCORES--------");
		System.out.println("Ability Name  - Score -  Modifier");
		String val = "";

		for(int i = 0; i < abilities.length; i++)
		{
			determineMod(i);
			if(modifiers[i] >= 0)
				val = "+";
			else
				val = "";

			System.out.println(abilities[i] + " - " + abilityScores[i] + " - " + val + modifiers[i]);
		}
	}
	
	public String[] getFinal()
	{
		String val = "";
		
	    String[] fin = new String[abilities.length + 1];
	    fin[0] = System.lineSeparator() + "--------ABILITY SCORES--------";
	    
	    for(int i = 0; i < abilities.length; i++)
	    {
	    	determineMod(i);
			if(modifiers[i] >= 0)
				val = "+";
			else
				val = "";
	        fin[i+1] = System.lineSeparator() + abilities[i] + " - " + abilityScores[i] + " - " + val + modifiers[i];
	    }
	    
	    return fin;
	}
	
	public String[] getFinal2()
	{
		String val = "";
		
	    String[] fin = new String[abilities.length + 1];
	    fin[0] = "null--------ABILITY SCORES--------";
	    
	    for(int i = 0; i < abilities.length; i++)
	    {
	    	determineMod(i);
			if(modifiers[i] >= 0)
				val = "+";
			else
				val = "";
	        fin[i+1] = "null" + abilities[i] + " - " + abilityScores[i] + " - " + val + modifiers[i];
	    }
	    
	    return fin;
	}

	public void addBonus(String ability, int bonus)
	{
		for(int i = 0; i < abilities.length; i++)
		{
			if(abilities[i].equalsIgnoreCase(ability))
			{
				abilityScores[i] = abilityScores[i] + bonus;
			}
			else
			{
				abilityScores[i] = abilityScores[i];
			}
		}
	}

	public void addRaceBonus(String[] ability, int[] bonuses)
	{
		for(int i = 0; i < ability.length; i++)
		{
			for(int x = 0; x < abilities.length; x++)
			{
				if(abilities[x].equalsIgnoreCase(ability[i]))
				{
					abilityScores[x] = abilityScores[x] + bonuses[i];
				}
				else
				{
					abilityScores[x] = abilityScores[x];
				}
			}
		}
	}

	public int getCharismaMod()
	{
		return modifiers[0];
	}
	
	public int getConstitutionMod()
	{
		return modifiers[1];
	}

	public int getDexterityMod()
	{
		return modifiers[2];
	}

	public int getIntMod()
	{
		return modifiers[3];
	}
	
	public int getStrMod()
	{
		return modifiers[4];
	}

	public int getWidMod()
	{
		return modifiers[5];
	}
	
	public int[] getAllMods()
	{
		return modifiers;
	}
	
	public void masterCharacter()
	{
		for(int i = 0; i < 6; i++)
		{
			abilityScores[i] = 20;
		}
	}
}