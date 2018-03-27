public class Cantrips
{
	private int numChoices;
	private String[] bard = new String[9];
	private String[] cleric = new String[6];
	private String[] druid = new String[7];
	private String[] sorcerer = new String[14];
	private String[] warlock = new String[7];
	private String[] wizard = new String[14];
	private String[] cantUse = new String[1];
	private String[] cantripList;
	private String[] tempStorage;
	@SuppressWarnings("unused")
	private String[] cantrips;

	public Cantrips()
	{
	}

	public void setClass(String name)
	{
		setArrays();
		setStorage(name);
		setNumChoices(name);
		cantripList = new String[numChoices];
	}

	private void setNumChoices(String name)
	{
		if(name.equalsIgnoreCase("sorcerer"))
		{
			numChoices = 4;
		}
		else if(name.equalsIgnoreCase("bard") || name.equalsIgnoreCase("druid") || name.equalsIgnoreCase("warlock"))
		{
			numChoices = 2;
		}
		else if(name.equalsIgnoreCase("wizard") || name.equalsIgnoreCase("cleric"))
		{
			numChoices = 3;
		}
		else
		{
			numChoices = 1;
		}
	}

	private void setArrays()
	{
		bardArray();
		clericArray();
		druidArray();
		sorcererArray();
		warlockArray();
		wizardArray();
		cantUse[0] = "Can't use cantrips";
	}

	private void bardArray()
	{
		bard[0] = "Dancing Light - 120ft range, create 4 small dim(10ft) floating lights, lights can move 60ft";
		bard[1] = "Light - touch cast, object shines bright light(20ft) then dim light(20ft) for 1 hour";
		bard[2] = "Mage Hand - 30ft range, create a floating spectral hand, may be used like a normal hand";
		bard[3] = "Mending - touch cast, repair a single break or tear no large then 1ft in any dimension";
		bard[4] = "Message - 120ft range, whisper a message, only the target hears the message";
		bard[5] = "Minor Illusion - 30ft range, create a sound(whisper to scream) or an object(no larger than 5ft cube)";
		bard[6] = "Prestidigitation - 10ft range, create harmless sensory effect, light/unlight small fires, clean/soil a small object";
		bard[7] = "True Strike - 30ft range, brief insight on target's defenses, advan on 1st atk against it";
		bard[8] = "Vicious Mockery - 60ft range, wis saving throw(target), 1d4 psychic dmg and disadvan on next atk";
	}

	private void clericArray()
	{
		cleric[0] = "Guidance - touch cast, willing target, 1d4 bonus to an ability check of its choice, spell ends after bonus is used";
		cleric[1] = "Light - touch cast, object shines bright light(20ft) then dim light(20ft) for 1 hour";
		cleric[2] = "Mending - touch cast, repair a single break or tear no large then 1ft in any dimension";
		cleric[3] = "Resistance - touch cast, willing target, 1d4 bonus to a saving throw of its choice, spells ends after bonus is used";
		cleric[4] = "Sacred Flame - 60ft range, dex saving throw(target), 1d8 radiant dmg";
		cleric[5] = "Thaumaturgy - 30ft range, your voice is 3 times louder(1min), effect the light from flames(1min), harmless tremors(1min)";
	}

	private void druidArray()
	{
		druid[0] = "Druidcraft - 30ft range, create harmless sensory effect, predicts weather for the next 24hr for current location";
		druid[1] = "Guidance - touch cast, willing target, 1d4 bonus to an ability check of its choice, spell ends after bonus is used";
		druid[2] = "Mending - touch cast, repair a single break or tear no larger then 1ft in any dimension";
		druid[3] = "Poison Spray - 10ft range, project a puff of noxious gas, con saving throw(target), 1d12 poison dmg";
		druid[4] = "Produce Flame - self, create a small harmless flame in your palm, 10ft bright light then 10ft dim light, may be hurled(30ft range, 1d8 fire dmg)";
		druid[5] = "Resistance - touch cast, willing target, 1d4 bonus to a saving throw of its choice, spells ends after bonus is used";
		druid[6] = "Shillelagh - touch cast, effects wood of clubs or quarterstaffs, for 1 min spellcasting is used for melee atks(#d8 dmg)";
	}

	private void sorcererArray()
	{
		sorcerer[0] = "Acid Splash - 60ft range, dex saving throw(target), 1d6 acid";
		sorcerer[1] = "Chill Touch - 120ft range, ranged spell atk, 1d8 necrotic dmg, undead targets have disadvan on atk rolls against you";
		sorcerer[2] = "Dancing Light - 120ft range, create 4 small dim(10ft) floating lights, lights can move 60ft";
		sorcerer[3] = "Fire Bolt - 120ft range, ranged spell atk, 1d10 fir damage, flammable objects(when hit) ignite if not being worn/carried";
		sorcerer[4] = "Light - touch cast, object shines bright light(20ft) then dim light(20ft) for 1 hour";
		sorcerer[5] = "Mage Hand - 30ft range, create a floating spectral hand, may be used like a normal hand";
		sorcerer[6] = "Mending - touch cast, repair a single break or tear no large then 1ft in any dimension";
		sorcerer[7] = "Message - 120ft range, whisper a message, only the target hears the message";
		sorcerer[8] = "Minor Illusion - 30ft range, create a sound(whisper to scream) or an object(no larger than 5ft cube)";
		sorcerer[9] = "Poison Spray - 10ft range, project a puff of noxious gas, con saving throw(target), 1d12 poison dmg";
		sorcerer[10] = "Prestidigitation - 10ft range, create harmless sensory effect, light/unlight small fires, clean/soil a small object";
		sorcerer[11] = "Ray of Frost - 60ft range, ranged spell atk, 1d8 cold dmg, speed is reduced by 10ft for 1 turn";
		sorcerer[12] = "Shocking Grasp - touch cast, melee spell atk, advan if target is wearing metal armor, 1d8 lightningh dmg";
		sorcerer[13] = "True Strike - 30ft range, brief insight on target's defenses, advan on 1st atk against it";
	}

	private void warlockArray()
	{
		warlock[0] = "Chill Touch - 120ft range, ranged spell atk, 1d8 necrotic dmg, undead targets have disadvan on atk rolls against you";
		warlock[1] = "Eldritch Blast - 120ft range, ranged spell atk, 1d10 force dmg";
		warlock[2] = "Mage Hand - 30ft range, create a floating spectral hand, may be used like a normal hand";
		warlock[3] = "Minor Illusion - 30ft range, create a sound(whisper to scream) or an object(no larger than 5ft cube)";
		warlock[4] = "Poison Spray - 10ft range, project a puff of noxious gas, con saving throw(target), 1d12 poison dmg";
		warlock[5] = "Prestidigitation - 10ft range, create harmless sensory effect, light/unlight small fires, clean/soil a small object";
		warlock[6] = "True Strike - 30ft range, brief insight on target's defenses, advan on 1st atk against it";
	}

	private void wizardArray()
	{
		wizard[0] = "Acid Splash - 60ft range, dex saving throw(target), 1d6 acid";
		wizard[1] = "Chill Touch - 120ft range, ranged spell atk, 1d8 necrotic dmg, undead targets have disadvan on atk rolls against you";
		wizard[2] = "Dancing Light - 120ft range, create 4 small dim(10ft) floating lights, lights can move 60ft";
		wizard[3] = "Fire Bolt - 120ft range, ranged spell atk, 1d10 fir damage, flammable objects(when hit) ignite if not being worn/carried";
		wizard[4] = "Light - touch cast, object shines bright light(20ft) then dim light(20ft) for 1 hour";
		wizard[5] = "Mage Hand - 30ft range, create a floating spectral hand, may be used like a normal hand";
		wizard[6] = "Mending - touch cast, repair a single break or tear no large then 1ft in any dimension";
		wizard[7] = "Message - 120ft range, whisper a message, only the target hears the message";
		wizard[8] = "Minor Illusion - 30ft range, create a sound(whisper to scream) or an object(no larger than 5ft cube)";
		wizard[9] = "Poison Spray - 10ft range, project a puff of noxious gas, con saving throw(target), 1d12 poison dmg";
		wizard[10] = "Prestidigitation - 10ft range, create harmless sensory effect, light/unlight small fires, clean/soil a small object";
		wizard[11] = "Ray of Frost - 60ft range, ranged spell atk, 1d8 cold dmg, speed is reduced by 10ft for 1 turn";
		wizard[12] = "Shocking Grasp - touch cast, melee spell atk, advan if target is wearing metal armor, 1d8 lightningh dmg";
		wizard[13] = "True Strike - 30ft range, brief insight on target's defenses, advan on 1st atk against it";
	}

	private String[] classArray(String name)
	{
		if(name.equalsIgnoreCase("bard"))
		{
			return bard;
		}
		else if(name.equalsIgnoreCase("cleric"))
		{
			return cleric;
		}
		else if(name.equalsIgnoreCase("druid"))
		{
			return druid;
		}
		else if(name.equalsIgnoreCase("sorcerer"))
		{
			return sorcerer;
		}
		else if(name.equalsIgnoreCase("warlock"))
		{
			return warlock;
		}
		else if(name.equalsIgnoreCase("wizard"))
		{
			return wizard;
		}
		else
		{
			return cantUse;
		}
	}

	private void setStorage(String className)
	{
		tempStorage = classArray(className);
		cantrips = classArray(className);
	}

	private void updateUnused(String used)
	{
		String[] unusedCantrips = new String[tempStorage.length - 1];

		for(int x = 0; x < unusedCantrips.length; x++)
		{
			unusedCantrips[x] = "";
		}

		int slot = 0;

		for(int i = 0; i < tempStorage.length; i++)
		{
			String curSlot = tempStorage[i];

		//	if(!curSlot.equalsIgnoreCase(used))
		//	{
				if(!curSlot.equalsIgnoreCase(used))
				{
					unusedCantrips[slot] = curSlot;
					slot++;
				}
		//	}
		}

		tempStorage = unusedCantrips;
	}

	public void updateList(int curSlot, String used)
	{
		cantripList[curSlot] = used;
		updateUnused(used);
	}

	public String getCantrip(int slot)
	{
		return tempStorage[slot];
	}

	public void prntFinal()
	{
		System.out.println("--------CANTRIPS--------");
		for(int i = 0; i < cantripList.length; i++)
		{
			System.out.println(cantripList[i]);
		}
	}
	
	public String[] getFinal()
	{
	    String[] fin = new String[cantripList.length + 1];
	    fin[0] = System.lineSeparator() + "--------CANTRIPS--------";
	    
	    for(int i = 0; i < cantripList.length; i++)
	    {
	        fin[i+1] = System.lineSeparator() + cantripList[i];
	    }
	    
	    return fin;
	}
	
	public String[] getFinal2()
	{
	    String[] fin = new String[cantripList.length + 1];
	    fin[0] = "null--------CANTRIPS--------";
	    
	    for(int i = 0; i < cantripList.length; i++)
	    {
	        fin[i+1] = "null" + cantripList[i];
	    }
	    
	    return fin;
	}

	public void prntList()
	{
		for(int i = 0; i < tempStorage.length; i++)
		{
			System.out.println((i + 1) + ". " + tempStorage[i]);
		}
	}

	public int getNumSlots()
	{
		return numChoices;
	}
}