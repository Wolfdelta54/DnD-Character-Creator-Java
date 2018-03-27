public class Spells
{
	private String className;
	private int numChoices;
	private String[] bard = new String[20];
	private String[] cleric = new String[13];
	private String[] druid = new String[16];
	private String[] paladin = new String[11]; // paladins can't use spells at lvl 1
	private String[] ranger = new String[11];	// rangers can't use spells at lvl 1
	private String[] sorcerer = new String[17];
	private String[] warlock = new String[9];
	private String[] wizard = new String[27]; // change the 50 to the actual amount of available spells
	private String[] extra = new String[2];
	private String[] spellList;

	private String[] none = new String[1]; // Barbarian, Fighter, Monk, Rogue

	private String[] tempStorage;
	@SuppressWarnings("unused")
	private String[] spells;

	public Spells()
	{
	}

	public void setClass(String name)
	{
		className = name;
		setArrays();
		setStorage(name);
		setNumChoices(name);
		spellList = new String[numChoices];
	}

	private void setNumChoices(String name)
	{
		if(name.equalsIgnoreCase("bard"))
		{
			numChoices = 4;
		}
		else if(name.equalsIgnoreCase("barbarian") || name.equalsIgnoreCase("fighter") || name.equalsIgnoreCase("monk") || name.equalsIgnoreCase("rogue") || name.equalsIgnoreCase("paladin") || name.equalsIgnoreCase("ranger"))
		{
			numChoices = 1;
		}
		else if(name.equalsIgnoreCase("wizard"))
		{
			numChoices = 6;
		}
		else
		{
			numChoices = 2;
		}
	}

	private void setArrays()
	{
		bardArray();
		clericArray();
		druidArray();
		paladinArray();
		rangerArray();
		sorcererArray();
		warlockArray();
		wizardArray();
		none[0] = "Can't use spells";
	}

	private void bardArray()
	{
		bard[0] = "Animal Friendship - 30ft range, convince a beast with less than 4 int that you mean no harm, wis saving throw(target), lasts 24hr";
		bard[1] = "Bane - 30ft range, up to 3 targets, chr saving throw(target), if target fails saving throw 1d4 debuff to next attack roll or saving throw";
		bard[2] = "Charm Person - 30ft range, target must be humanoid, wis saving throw(target), if target fails saving throw it is charmed for 1hr";
		bard[3] = "Comprehend Languages - self target, for 1hr you understand any spoken language and can read any non-coded text as long as you are touching it";
		bard[4] = "Cure Wounds - touch cast, heal a creature for 1d8 + spellcasting modifier, no effect on undead or constructs";
		bard[5] = "Detect Magic - self target, for 10 min you sense the presence of magic within 30ft of you, use an action to see the school of any magic bearing creature or object";
		bard[6] = "Disguise Self - self target, alters your appearance for 1hr, cannot change number of limbs, spells ends upon a successful Investigation check against your spell save DC";
		bard[7] = "Faerie Fire - 60ft range, dex saving throw(creatures), each object or creature in a 20ft cube is outlined by dim(10ft) blue/green/violet light, advan on attacks against affected";
		bard[8] = "Feather Fall - 60ft range, up to 5 falling creatures, falling speed is decreased to 60ft per round for 1min, if they hit the gound within the duration they take no fall damage";
		bard[9] = "Healing Word - 60ft range, the target regains 1d4 + spellcasting mod, does not effect undead or constructs";
		bard[10] = "Heroism - touch cast, willing creature, target is immune to being frightened and gains temp hit points equal to your spellcasting mod";
		bard[11] = "Hideous Laughter - 30ft range, wis saving throw(target), target finds everything funny and becomes incapacitated for 1 min, no effect on creatures with 4 or less int";
		bard[12] = "Identify - touch cast, learn the properties/attunement requirement/charges of a target magic or magic-imbued object";
		bard[13] = "Illusory Script - touch cast, imbue a parchemtn/paper with a potent illusion that lasts for 10 days, you and those you choose can still read it to all others it is giberish";
		bard[14] = "Longstrider - touch cast, target's speed increases by 10ft for 1hr";
		bard[15] = "Silent Image - 60ft range, create an image of an object/creature/visual phenomenon no larger than a 15ft cube, the image produces no smell/sound, image ends upon physical interaction or investigation check against your spell save DC";
		bard[16] = "Sleep - 90ft range, targets with less than or equal to 5d8 hit points, choose a point creatures within 20ft of it fall asleep in ascending order of hp, subtract affected hitpoints from total then continue, wakes up upon dmg";
		bard[17] = "Speak with Animals - self target, for 10min you can comprehend and verbally communicate with beasts";
		bard[18] = "Thunderwave - self target, affects 15ft cube, con saving throw(affected), fails take 2d8 thunder dmg and are pushed 10ft away, successful ones take (1/2)2d8 and aren't pushed, unsecured objects go flying for 10ft, heard from 300ft";
		bard[19] = "Unseen Servant - 60ft range, summon an invisible mindless shapeless force, can perform simple tasks at your command, lasts 1hr, 10 AC 1hp 2 str, can't attack, 15ft movement";
	}
	
	private void clericArray()
	{
		cleric[0] = "Bane - 30ft range, up to 3 targets, chr saving throw(target), if target fails saving throw 1d4 debuff to next attack roll or saving throw";
		cleric[1] = "Bless - 30ft range, bless up to three creatures of choice within range, targets gain a 1d4 buff to attack rolls or saving throws for 1min";
		cleric[2] = "Ceremony - touch cast, (choose 1): dc 20 wis check to restore alignment, willing creature; turn a vial of water into holy water; 24hr 1d4 buff to ability checks, young adult; 24hr 1d4 buff to saving throws; prevent a corpse from becoming undead for 7 days; marry 2 targets";
		cleric[3] = "Create or Destroy Water - 30ft range, 2 options: create up to 10 gallons of clean water within range in an open container or as rain in a 30ft cube, or destroy up to 10 gallons of water in an open container within range or a 30ft cube of fog";
		cleric[4] = "Cure Wounds - touch cast, heal a creature for 1d8 + spellcasting modifier, no effect on undead or constructs";
		cleric[5] = "Detect Evil and Good - self cast, for 10min you can detect aberrations,celestials,elementals,fey,fiends,or undead within 30ft of you, you also know where the creature is located, for 10min you know if an object within 30ft of you has been magically consecrated or desecrated";
		cleric[6] = "Detect Magic - self target, for 10 min you sense the presence of magic within 30ft of you, use an action to see the school of any magic bearing creature or object";
		cleric[7] = "Detect Poison and Disease - self cast, for 10min you sense the presence and location of poisons,poisonous creatures, and diseases within 30ft of you and what kind it is(in each case)";
		cleric[8] = "Guiding Bolt - 120ft range, single target, ranged spell attack roll, on hit target takes 4d6 radiant damage and next atk roll against target has advan";
		cleric[9] = "Healing Word - 60ft range, the target regains 1d4 + spellcasting mod, does not effect undead or constructs";
		cleric[10] = "Inflict Wounds - touch cast, melee spell attack, on hit target takes 3d10 necrotic damage";
		cleric[11] = "Protection from Evil and Good - touch cast,target a willing creature , lasts 10min, protected against aberrations,celestials,elementals,fey,fiends,and undead creatures have disadvan on atk rolls against target, can't be charmed,frightened,or possessed by them";
		cleric[12] = "Purify Food and Drink - 10ft range, all non-magical food and drink within a 5ft radius sphere centered on a point within range is purified and rendered free of poison and disease";
	}
	
	private void druidArray()
	{
		druid[0] = "Absorb Elements - self target, used as a reaction when taking acid,cold,fire,lightning,or thunder dmg, the spell captures and stores some of the energy for use on next melee attack, adds 1d6 of the triggering elemental type";
		druid[1] = "Animal Friendship - 30ft range, convince a beast with less than 4 int that you mean no harm, wis saving throw(target), lasts 24hr";
		druid[2] = "Beast Bond - touch cast, establish a telepathing link with one friendly/charmed beast with int of less than 4, you can telepathically comunicate with the beast if it is within line of sight";
		druid[3] = "Charm Person - 30ft range, target must be humanoid, wis saving throw(target), if target fails saving throw it is charmed for 1hr";
		druid[4] = "Create or Destroy Water - 30ft range, 2 options: create up to 10 gallons of clean water within range in an open container or as rain in a 30ft cube, or destroy up to 10 gallons of water in an open container within range or a 30ft cube of fog";
		druid[5] = "Cure Wounds - touch cast, heal a creature for 1d8 + spellcasting modifier, no effect on undead or constructs";
		druid[6] = "Detect Magic - self target, for 10 min you sense the presence of magic within 30ft of you, use an action to see the school of any magic bearing creature or object";
		druid[7] = "Detect Poison and Disease - self cast, for 10min you sense the presence and location of poisons,poisonous creatures, and diseases within 30ft of you and what kind it is(in each case)";
		druid[8] = "Earth Tremor - 10ft range, target the gound within range, each creature within that area does a dex saving throw, fails take 1d6 bludgeoning and fall prone, if the ground is loose earth or stone it becomes difficult terrain until cleared";
		druid[9] = "Faerie Fire - 60ft range, dex saving throw(creatures), each object or creature in a 20ft cube is outlined by dim(10ft) blue/green/violet light, advan on attacks against affected";
		druid[10] = "Goodberry - touch cast, up to ten berries appear in your hand and are infused with magic, any creature can spend 1 action to eat a berry, each berry restores 1hp and provides enough nourishment to sustain a creature for 1 day";
		druid[11] = "Healing Word - 60ft range, the target regains 1d4 + spellcasting mod, does not effect undead or constructs";
		druid[12] = "Ice Knife - 60ft range, you create and flind a shard of ice at one creature within range, ranged spell atk, on hit deals 1d10 piercing dmg, regardless of hitting or missing the shard then explodes, creatures within 5ft of the shard make a dex saving throw, fails take 2d6 cold damage";
		druid[13] = "Purify Food and Drink - 10ft range, all non-magical food and drink within a 5ft radius sphere centered on a point within range is purified and rendered free of poison and disease";
		druid[14] = "Speak with Animals - self target, for 10min you can comprehend and verbally communicate with beasts";
		druid[15] = "Thunderwave - self target, affects 15ft cube, con saving throw(affected), fails take 2d8 thunder dmg and are pushed 10ft away, successful ones take (1/2)2d8 and aren't pushed, unsecured objects go flying for 10ft, heard from 300ft";
	}
	
	private void paladinArray()
	{
		paladin[0] = "Bless - 30ft range, bless up to three creatures of choice within range, targets gain a 1d4 buff to attack rolls or saving throws for 1min";
		paladin[1] = "Command - 60ft range, wis saving throw(target), speak a one-word command to a creature you can see within range, Commands: approach-moves 5ft toward you, drop, flee, grovel-fulls prone, halt, has no effect on undead or if the target doesn't understand or if it the command is harmful";
		paladin[2] = "Cure Wounds - touch cast, heal a creature for 1d8 + spellcasting modifier, no effect on undead or constructs";
		paladin[3] = "Detect Evil and Good - self cast, for 10min you can detect aberrations,celestials,elementals,fey,fiends,or undead within 30ft of you, you also know where the creature is located, for 10min you know if an object within 30ft of you has been magically consecrated or desecrated";
		paladin[4] = "Detect Magic - self target, for 10 min you sense the presence of magic within 30ft of you, use an action to see the school of any magic bearing creature or object";
		paladin[5] = "Detect Poison and Disease - self cast, for 10min you sense the presence and location of poisons,poisonous creatures, and diseases within 30ft of you and what kind it is(in each case)";
		paladin[6] = "Divine Favor - self target, you pray to your god and your prayer empowers you with divine radiance, for 1min you weapon attacks deal an extra 1d4 radiant damage on hit";
		paladin[7] = "Heroism - touch cast, willing creature, target is immune to being frightened and gains temp hit points equal to your spellcasting mod";
		paladin[8] = "Protection from Good and Evil - touch cast,target a willing creature , lasts 10min, protected against aberrations,celestials,elementals,fey,fiends,and undead creatures have disadvan on atk rolls against target, can't be charmed,frightened,or possessed by them";
		paladin[9] = "Purify Food and Drink - 10ft range, all non-magical food and drink within a 5ft radius sphere centered on a point within range is purified and rendered free of poison and disease";
		paladin[10] = "Shield of Faith - 60ft range, surrounds a creature of your choice with a shimmering field, grants a +2 AC bonus for 10min";
	}

	private void rangerArray()
	{
		ranger[0] = "Alarm - 30ft range, rig a door/window/20ft cube area with a magical alarm, alarm lasts 8hrs, when cast designate what creatures will not set it off, when cast choose if the alarm is mental or audible, audible for 60ft for 10 secs";
		ranger[1] = "Animal Friendship - 30ft range, convince a beast with less than 4 int that you mean no harm, wis saving throw(target), lasts 24hr";
		ranger[2] = "Cure Wounds - touch cast, heal a creature for 1d8 + spellcasting modifier, no effect on undead or constructs";
		ranger[3] = "Detect Magic - self target, for 10 min you sense the presence of magic within 30ft of you, use an action to see the school of any magic bearing creature or object";
		ranger[4] = "Detect Poison and Disease - self cast, for 10min you sense the presence and location of poisons,poisonous creatures, and diseases within 30ft of you and what kind it is(in each case)";
		ranger[5] = "Fog Cloud - 120ft range, create a 20ft radius of fog centered on a point int range, spreads around corners, lasts 1hr or until blown away by at least a 10 mph (~16 kmph) wind";
		ranger[6] = "Goodberry - touch cast, up to ten berries appear in your hand and are infused with magic, any creature can spend 1 action to eat a berry, each berry restores 1hp and provides enough nourishment to sustain a creature for 1 day";
		ranger[7] = "Hunter's Mark - 30ft range, marks a visible creature within range as your quarry, you deal an extra 1d6 dmg when you hit it, you have advan on perception/survival checks to find it";
		ranger[8] = "Jump - touch cast, targets jump distance is tripled for 1min";
		ranger[9] = "Longstrider - touch cast, target's speed increases by 10ft for 1hr";
		ranger[10] = "Speak with Animals - self target, for 10min you can comprehend and verbally communicate with beasts";
	}

	private void sorcererArray()
	{
		sorcerer[0] = "Burning Hands - self target, affects 15ft cone, dex saving throw(affected), fails take 3d6 fire damage, successfuls take (1/2)3d6 fire damage";
		sorcerer[1] = "Charm Person - 30ft range, target must be humanoid, wis saving throw(target), if target fails saving throw it is charmed for 1hr";
		sorcerer[2] = "Color Spray - self target, affects 15ft cone, roll 6d10 for total hp of those affected, in ascending order each creature is blinded for 1 round, subtract the creature's hp from total";
		sorcerer[3] = "Comprehend Languages - self target, for 1hr you understand any spoken language and can read any non-coded text as long as you are touching it";
		sorcerer[4] = "Detect Magic - self target, for 10 min you sense the presence of magic within 30ft of you, use an action to see the school of any magic bearing creature or object";
		sorcerer[5] = "Disguise Self - self target, alters your appearance for 1hr, cannot change number of limbs, spells ends upon a successful Investigation check against your spell save DC";
		sorcerer[6] = "Expeditious Retreat - self target, allows use of the dash action as a bonus action for 10min";
		sorcerer[7] = "False Life - self target, gain 1d4 + 4 temporary hitpoints for 1hr";
		sorcerer[8] = "Feather Fall - 60ft range, up to 5 falling creatures, falling speed is decreased to 60ft per round for 1min, if they hit the gound within the duration they take no fall damage";
		sorcerer[9] = "Fog Cloud - 120ft range, create a 20ft radius of fog centered on a point int range, spreads around corners, lasts 1hr or until blown away by at least a 10 mph (~16 kmph) wind";
		sorcerer[10] = "Jump - touch cast, targets jump distance is tripled for 1min";
		sorcerer[11] = "Mage Armor - touch cast, targets an unarmored willing creature, target's base AC becomes 13 + it's dex mod, ends after 8hrs or when target equips armor";
		sorcerer[12] = "Magic Missile - 120ft range, creates three glowing darts, darts hit a creature of your choice(1-3 targets), each dart deals 1d4 + 1 force damage";
		sorcerer[13] = "Shield - self target, creates an invisible barrier infront of you, gain a +5 bonus AC, you are immune to Magic Missile";
		sorcerer[14] = "Silent Image - 60ft range, create an image of an object/creature/visual phenomenon no larger than a 15ft cube, the image produces no smell/sound, image ends upon physical interaction or investigation check against your spell save DC";
		sorcerer[15] = "Sleep - 90ft range, targets with less than or equal to 5d8 hit points, choose a point creatures within 20ft of it fall asleep in ascending order of hp, subtract affected hitpoints from total then continue, wakes up upon dmg";
		sorcerer[16] = "Thunderwave - self target, affects 15ft cube, con saving throw(affected), fails take 2d8 thunder dmg and are pushed 10ft away, successful ones take (1/2)2d8 and aren't pushed, unsecured objects go flying for 10ft, heard from 300ft";
	}

	private void warlockArray()
	{
		warlock[0] = "Charm Person - 30ft range, target must be humanoid, wis saving throw(target), if target fails saving throw it is charmed for 1hr";
		warlock[1] = "Comprehend Languages - self target, for 1hr you understand any spoken language and can read any non-coded text as long as you are touching it";
		warlock[2] = "Expeditious Retreat - self cast, allows use of the dash action as a bonus action for 10min";
		warlock[3] = "Hellish Rebuke - 60ft range, target a creature that has damaged you, dex saving throw(target), 2d10 fire damage on fail, (1/2)2d10 on success";
		warlock[4] = "Illusory Script - touch cast, imbue a parchemtn/paper with a potent illusion that lasts for 10 days, you and those you choose can still read it to all others it is giberish";
		warlock[5] = "Protection from Good and Evil - touch cast,target a willing creature , lasts 10min, protected against aberrations,celestials,elementals,fey,fiends,and undead creatures have disadvan on atk rolls against target, can't be charmed,frightened,or possessed by them";
		warlock[6] = "Unseen Servant - 60ft range, summon an invisible mindless shapeless force, can perform simple tasks at your command, lasts 1hr, 10 AC 1hp 2 str, can't attack, 15ft movement";
		warlock[7] = extra[0];
		warlock[8] = extra[1];
	}
	
	private void wizardArray()
	{
		wizard[0] = "Alarm - 30ft range, rig a door/window/20ft cube area with a magical alarm, alarm lasts 8hrs, when cast designate what creatures will not set it off, when cast choose if the alarm is mental or audible, audible for 60ft for 10 secs";
		wizard[1] = "Burning Hands - self target, affects 15ft cone, dex saving throw(affected), fails take 3d6 fire damage, successfuls take (1/2)3d6 fire damage";
		wizard[2] = "Charm Person - 30ft range, target must be humanoid, wis saving throw(target), if target fails saving throw it is charmed for 1hr";
		wizard[3] = "Color Spray - self target, affects 15ft cone, roll 6d10 for total hp of those affected, in ascending order each creature is blinded for 1 round, subtract the creature's hp from total";
		wizard[4] = "Comprehend Languages - self target, for 1hr you understand any spoken language and can read any non-coded text as long as you are touching it";
		wizard[5] = "Detect Magic - self target, for 10 min you sense the presence of magic within 30ft of you, use an action to see the school of any magic bearing creature or object";
		wizard[6] = "Disguise Self - self target, alters your appearance for 1hr, cannot change number of limbs, spells ends upon a successful Investigation check against your spell save DC";
		wizard[7] = "Expeditious Retreat - self cast, allows use of the dash action as a bonus action for 10min";
		wizard[8] = "False Life - self target, gain 1d4 + 4 temporary hitpoints for 1hr";
		wizard[9] = "Feather Fall - 60ft range, up to 5 falling creatures, falling speed is decreased to 60ft per round for 1min, if they hit the gound within the duration they take no fall damage";
		wizard[10] = "Find Familiar - 10ft range, you gain the service of a familiar, choose form: bat,car,crab,frog/toad,hawk,lizard,octopus,owl,poisonous snake,fish,rat,raven,sea horse,spider, or weasel, can communicate with you telepathically, you can only have 1 familiar at a time, can cast YOUR touch cast spells";
		wizard[11] = "Floating Disk - 30ft range, creates a circular horizontal plane of force(3ft diameter, 1in thick) that floars 3ft above gound, lasts 1hr and can hold 500 lbs, the disk will move to remain within 20ft of you, elevation changes of 10ft or more at one time ends the spell";
		wizard[12] = "Fog Cloud - 120ft range, create a 20ft radius of fog centered on a point int range, spreads around corners, lasts 1hr or until blown away by at least a 10 mph (~16 kmph) wind";
		wizard[13] = "Grease - 60ft range, dex saving throw(creatures in affected area), grease covers the ground in a 10ft square centered on a point within range, fails fall prone, creatures that enter/ends turn in the area perform the dex saving throw as well";
		wizard[14] = "Hideous Laughter - 30ft range, wis saving throw(target), target finds everything funny and becomes incapacitated for 1 min, no effect on creatures with 4 or less in";
		wizard[15] = "Identify - touch cast, learn the properties/attunement requirement/charges of a target magic or magic-imbued object";
		wizard[16] = "Illusory Script - touch cast, imbue a parchemtn/paper with a potent illusion that lasts for 10 days, you and those you choose can still read it to all others it is giberish";
		wizard[17] = "Jump - touch cast, targets jump distance is tripled for 1min";
		wizard[18] = "Longstrider - touch cast, target's speed increases by 10ft for 1hr";
		wizard[19] = "Mage Armor - touch cast, targets an unarmored willing creature, target's base AC becomes 13 + it's dex mod, ends after 8hrs or when target equips armor";
		wizard[20] = "Magic Missile - 120ft range, creates three glowing darts, darts hit a creature of your choice(1-3 targets), each dart deals 1d4 + 1 force damage";
		wizard[21] = "Protection from Good and Evil - touch cast,target a willing creature , lasts 10min, protected against aberrations,celestials,elementals,fey,fiends,and undead creatures have disadvan on atk rolls against target, can't be charmed,frightened,or possessed by them";
		wizard[22] = "Shield - self target, creates an invisible barrier infront of you, gain a +5 bonus AC, you are immune to Magic Missile";
		wizard[23] = "Silent Image - 60ft range, create an image of an object/creature/visual phenomenon no larger than a 15ft cube, the image produces no smell/sound, image ends upon physical interaction or investigation check against your spell save DC";
		wizard[24] = "Sleep - 90ft range, targets with less than or equal to 5d8 hit points, choose a point creatures within 20ft of it fall asleep in ascending order of hp, subtract affected hitpoints from total then continue, wakes up upon dmg";
		wizard[25] = "Thunderwave - self target, affects 15ft cube, con saving throw(affected), fails take 2d8 thunder dmg and are pushed 10ft away, successful ones take (1/2)2d8 and aren't pushed, unsecured objects go flying for 10ft, heard from 300ft";
		wizard[26] = "Unseen Servant - 60ft range, summon an invisible mindless shapeless force, can perform simple tasks at your command, lasts 1hr, 10 AC 1hp 2 str, can't attack, 15ft movement";
	}

	public void addSpells(String[] spellsToAdd)
	{
		extra = spellsToAdd;
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
		else if(name.equalsIgnoreCase("ranger"))
		{
			return ranger;
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
			return none;
		}
	}

	private void setStorage(String className)
	{
		tempStorage = classArray(className);
		spells = classArray(className);
	}

	private void updateUnused(String used)
	{
		String[] unusedSpells = new String[tempStorage.length - 1];

		for(int x = 0; x < unusedSpells.length; x++)
		{
			unusedSpells[x] = "";
		}

		int slot = 0;

		for(int i = 0; i < tempStorage.length; i++)
		{
			String curSlot = tempStorage[i];

		//	if(!curSlot.equalsIgnoreCase(used))
		//	{
				if(!curSlot.equalsIgnoreCase(used))
				{
					unusedSpells[slot] = curSlot;
					slot++;
				}
		//	}
		}

		tempStorage = unusedSpells;
	}

	public void updateList(int curSlot, String used)
	{
		spellList[curSlot] = used;
		updateUnused(used);
	}

	public String getSpell(int slot)
	{
		return tempStorage[slot];
	}

	public void prntFinal()
	{
		System.out.println("--------SPELLS--------");
		if(className.equalsIgnoreCase("wizard"))
		{
			System.out.println("Your spell book contains the 6 following spells:");
		}
		for(int i = 0; i < spellList.length; i++)
		{
			System.out.println(spellList[i]);
		}
	}
	
	public String[] getFinal()
	{
		String[] fin;
		if(className.equalsIgnoreCase("wizard"))
		{
			fin = new String[spellList.length + 2];
		}
		else
		{
			fin = new String[spellList.length + 1];
		}
		
	    fin[0] = System.lineSeparator() + "--------SPELLS--------";
	    
		if(className.equalsIgnoreCase("wizard"))
		{
			fin[2] = "Your spell book contains the 6 following spells:";
		}
	    
	    for(int i = 0; i < spellList.length; i++)
	    {
	        fin[i+1] = System.lineSeparator() + spellList[i];
	    }
	    
	    return fin;
	}
	
	public String[] getFinal2()
	{
		String[] fin;
		if(className.equalsIgnoreCase("wizard"))
		{
			fin = new String[spellList.length + 2];
		}
		else
		{
			fin = new String[spellList.length + 1];
		}
		
	    fin[0] = "null--------SPELLS--------";
	    
		if(className.equalsIgnoreCase("wizard"))
		{
			fin[2] = "nullYour spell book contains the 6 following spells:";
		}
	    
	    for(int i = 0; i < spellList.length; i++)
	    {
	        fin[i+1] = "null" + spellList[i];
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