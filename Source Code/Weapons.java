public class Weapons
{
	private String[] simMelee;
	private String[] simRange;
	private String[] marMelee;
	private String[] marRange;

	private String[] sim;
	private String[] mar;

	private String selWeap;
	
	private int[] abilityMods;
	private String[] profs;

	public Weapons()
	{
		setLists();
	}

	private void setLists()
	{
		simMelee = new String[10];
		simMelee[0]  = "Club         - 1d4 + bonus  bludgeoning - +roll to hit, Light";
		simMelee[1]  = "Dagger       - 1d4 + bonus  piercing    - +roll to hit, Finesse, light, thrown (range 20/60)";
		simMelee[2]  = "Greatclub    - 1d8 + bonus  bludgeoning - +roll to hit, Two-handed";
		simMelee[3]  = "Handaxe      - 1d6 + bonus  slashing    - +roll to hit, Light, thrown (range 20/60)";
		simMelee[4]  = "Javelin      - 1d6 + bonus  piercing    - +roll to hit, Thrown (range 30/120)";
		simMelee[5]  = "Light Hammer - 1d4 + bonus  bludgeoning - +roll to hit, Light, thrown (range 20/60)";
		simMelee[6]  = "Mace         - 1d6 + bonus  bludgeoning - +roll to hit";
		simMelee[7]  = "Quarterstaff - 1d6 + bonus  bludgeoning - +roll to hit, Versatile (1d8)";
		simMelee[8]  = "Sickle       - 1d4 + bonus  slashing    - +roll to hit, Light";
		simMelee[9]  = "Spear        - 1d6 + bonus  piercing    - +roll to hit, Thrown (range 20/60), versatile (1d8)";

		simRange = new String[4];
		simRange[0]  = "Light Crossbow  - 1d8 + bonus  piercing    - +roll to hit, Ammunition (range 80/320), loading, two-handed";
		simRange[1]  = "Dart         - 1d4 + bonus  piercing    - +roll to hit, Finesse, thrown (range 20/60)";
		simRange[2]  = "Shortbow     - 1d6 + bonus  piercing    - +roll to hit, Ammunition (range 80/320), two-handed";
		simRange[3]  = "Sling        - 1d4 + bonus  bludgeoning - +roll to hit, Ammunition (range 30/120)";

		sim = new String[14];
		sim[0]  = "Club         - 1d4 + bonus  bludgeoning - +roll to hit, Light";
		sim[1]  = "Dagger       - 1d4 + bonus  piercing    - +roll to hit, Finesse, light, thrown (range 20/60)";
		sim[2]  = "Greatclub    - 1d8 + bonus  bludgeoning - +roll to hit, Two-handed";
		sim[3]  = "Handaxe      - 1d6 + bonus  slashing    - +roll to hit, Light, thrown (range 20/60)";
		sim[4]  = "Javelin      - 1d6 + bonus  piercing    - +roll to hit, Thrown (range 30/120)";
		sim[5]  = "Light Hammer - 1d4 + bonus  bludgeoning - +roll to hit, Light, thrown (range 20/60)";
		sim[6]  = "Mace         - 1d6 + bonus  bludgeoning - +roll to hit";
		sim[7]  = "Quarterstaff - 1d6 + bonus  bludgeoning - +roll to hit, Versatile (1d8)";
		sim[8]  = "Sickle       - 1d4 + bonus  slashing    - +roll to hit, Light";
		sim[9]  = "Spear        - 1d6 + bonus  piercing    - +roll to hit, Thrown (range 20/60), versatile (1d8)";
		sim[10] = "Light Crossbow  - 1d8 + bonus  piercing    - +roll to hit, Ammunition (range 80/320), loading, two-handed";
		sim[11] = "Dart         - 1d4 + bonus  piercing    - +roll to hit, Finesse, thrown (range 20/60)";
		sim[12] = "Shortbow     - 1d6 + bonus  piercing    - +roll to hit, Ammunition (range 80/320), two-handed";
		sim[13] = "Sling        - 1d4 + bonus  bludgeoning - +roll to hit, Ammunition (range 30/120)";

		marMelee = new String[18];
		marMelee[0]  = "Battleaxe    - 1d8 + bonus  slashing    - +roll to hit, Versatile (1d10)";
		marMelee[1]  = "Flail        - 1d8 + bonus  bludgeoning - +roll to hit";
		marMelee[2]  = "Glaive       - 1d10 + bonus slashing    - +roll to hit, Heavy, reach, two-handed";
		marMelee[3]  = "Greataxe     - 1d12 + bonus slashing    - +roll to hit, Heavy, two-handed";
		marMelee[4]  = "Greatsword   - 2d6 + bonus  slashing    - +roll to hit, Heavy, two-handed";
		marMelee[5]  = "Halberd      - 1d10 + bonus slashing    - +roll to hit, Heavy, reach, two-handed";
		marMelee[6]  = "Lance        - 1d12 + bonus piercing    - +roll to hit, Reach, special (disad when target is within 5ft, two-handed when not mounted)";
		marMelee[7]  = "Longsword    - 1d8 + bonus  slashing    - +roll to hit, Versatile (1d10)";
		marMelee[8]  = "Maul         - 2d6 + bonus  bludgeoning - +roll to hit, Heavy, two-handed";
		marMelee[9]  = "Morningstar  - 1d8 + bonus  piercing 	- +roll to hit, ";
		marMelee[10] = "Pike         - 1d10 + bonus piercing    - +roll to hit, Heavy, reach, two-handed";
		marMelee[11] = "Rapier       - 1d8 + bonus  piercing    - +roll to hit, Finesse";
		marMelee[12] = "Scimitar     - 1d6 + bonus  slashing    - +roll to hit, Finesse, light";
		marMelee[13] = "Shortsword   - 1d6 + bonus  piercing    - +roll to hit, Finesse, light";
		marMelee[14] = "Trident      - 1d6 + bonus  piercing    - +roll to hit, Thrown (range 20/60), versatile (1d8)";
		marMelee[15] = "War Pick     - 1d8 + bonus  piercing	- +roll to hit";
		marMelee[16] = "Warhammer    - 1d8 + bonus  bludgeoning - +roll to hit, Versatile (1d10)";
		marMelee[17] = "Whip         - 1d4 + bonus  slashing    - +roll to hit, Finesse, reach";

		marRange = new String[5];
		marRange[0]  = "Blowgun      - 1 + bonus piercing    - +roll to hit, Ammunition (range 25/100), loading";
		marRange[1]  = "Hand Crossbow - 1d6 + bonus  piercing    - +roll to hit, Ammunition (range 30/120), light, loading";
		marRange[2]  = "Heavy Crossbow - 1d10 + bonus piercing    - +roll to hit, Ammunition (range 100/400), heavy, loading, two-handed";
		marRange[3]  = "Longbow      - 1d8 + bonus  piercing    - +roll to hit, Ammunition (range 150/600), heavy, two-handed";
		marRange[4]  = "Net          - does no damage   - +roll to hit, Special (restrains creatures of size <=L), thrown (range 5/15)";

		mar = new String[23];
		mar[0]  = "Battleaxe    - 1d8 + bonus slashing     - +roll to hit, Versatile (1d10)";
		mar[1]  = "Flail        - 1d8 + bonus  bludgeoning - +roll to hit";
		mar[2]  = "Glaive       - 1d10 + bonus slashing    - +roll to hit, Heavy, reach, two-handed";
		mar[3]  = "Greataxe     - 1d12 + bonus slashing    - +roll to hit, Heavy, two-handed";
		mar[4]  = "Greatsword   - 2d6 + bonus  slashing    - +roll to hit, Heavy, two-handed";
		mar[5]  = "Halberd      - 1d10 + bonus slashing    - +roll to hit, Heavy, reach, two-handed";
		mar[6]  = "Lance        - 1d12 + bonus piercing    - +roll to hit, Reach, special (disad when target is within 5ft, two-handed when not mounted)";
		mar[7]  = "Longsword    - 1d8 + bonus  slashing    - +roll to hit, Versatile (1d10)";
		mar[8]  = "Maul         - 2d6 + bonus  bludgeoning - +roll to hit, Heavy, two-handed";
		mar[9]  = "Morningstar  - 1d8 + bonus  piercing    - +roll to hit";
		mar[10] = "Pike         - 1d10 + bonus piercing    - +roll to hit, Heavy, reach, two-handed";
		mar[11] = "Rapier       - 1d8 + bonus  piercing    - +roll to hit, Finesse";
		mar[12] = "Scimitar     - 1d6 + bonus  slashing    - +roll to hit, Finesse, light";
		mar[13] = "Shortsword   - 1d6 + bonus  piercing    - +roll to hit, Finesse, light";
		mar[14] = "Trident      - 1d6 + bonus  piercing    - +roll to hit, Thrown (range 20/60), versatile (1d8)";
		mar[15] = "War Pick     - 1d8 + bonus  piercing    - +roll to hit";
		mar[16] = "Warhammer    - 1d8 + bonus  bludgeoning - +roll to hit, Versatile (1d10)";
		mar[17] = "Whip         - 1d4 + bonus  slashing    - +roll to hit, Finesse, reach";
		mar[18] = "Blowgun      - 1 + bonus piercing    - +roll to hit, Ammunition (range 25/100), loading";
		mar[19] = "Hand Crossbow - 1d6 + bonus  piercing    - +roll to hit, Ammunition (range 30/120), light, loading";
		mar[20] = "Heavy Crossbow - 1d10 + bonus piercing    - +roll to hit, Ammunition (range 100/400), heavy, loading, two-handed";
		mar[21] = "Longbow      - 1d8 + bonus  piercing    - +roll to hit, Ammunition (range 150/600), heavy, two-handed";
		mar[22] = "Net          - does no damage   - +roll to hit, Special (restrains creatures of size <=L), thrown (range 5/15)";
	}

	public void prntMarMelee()
	{
		prntPropertyInfo();
		System.out.println("Weapon           - Damage           - Properties");
		System.out.println();
		for(int i = 0; i < marMelee.length; i++)
		{
			int listNum = i + 1;
			System.out.println(listNum + ". " + marMelee[i]);
		}
	}

	public void prntMarRange()
	{
		prntPropertyInfo();
		System.out.println("Weapon           - Damage           - Properties");
		System.out.println();
		for(int i = 0; i < marRange.length; i++)
		{
			int listNum = i + 1;
			System.out.println(listNum + ". " + marRange[i]);
		}
	}

	public void prntSimMelee()
	{
		prntPropertyInfo();
		System.out.println("Weapon           - Damage           - Properties");
		System.out.println();
		for(int i = 0; i < simMelee.length; i++)
		{
			int listNum = i + 1;
			System.out.println(listNum + ". " + simMelee[i]);
		}
	}

	public void prntSimRange()
	{
		prntPropertyInfo();
		System.out.println("Weapon           - Damage           - Properties");
		System.out.println();
		for(int i = 0; i < simRange.length; i++)
		{
			int listNum = i + 1;
			System.out.println(listNum + ". " + simRange[i]);
		}
	}

	public void prntSim()
	{
		prntPropertyInfo();
		System.out.println("Weapon           - Damage           - Properties");
		System.out.println();
		for(int i = 0; i < sim.length; i++)
		{
			int listNum = i + 1;
			System.out.println(listNum + ". " + sim[i]);
		}
	}

	public void prntMar()
	{
		prntPropertyInfo();
		System.out.println("Weapon           - Damage           - Properties");
		System.out.println();
		for(int i = 0; i < mar.length; i++)
		{
			int listNum = i + 1;
			System.out.println(listNum + ". " + mar[i]);
		}
	}

	public void setWeap(String weapType, int slot)
	{
		if(slot < 0)
			slot = 0;
		
		if(weapType.equalsIgnoreCase("marMelee"))
		{
			if(slot >= marMelee.length)
				slot = slot - 1;
			
			selWeap = marMelee[slot];
		}
		else if(weapType.equalsIgnoreCase("marRange"))
		{
			if(slot >= marRange.length)
				slot = slot - 1;
			
			selWeap = marRange[slot];
		}
		else if(weapType.equalsIgnoreCase("simMelee"))
		{
			if(slot >= simMelee.length)
				slot = slot - 1;
			
			selWeap = simMelee[slot];
		}
		else if(weapType.equalsIgnoreCase("simRange"))
		{
			if(slot >= simRange.length)
				slot = slot - 1;
			
			selWeap = simRange[slot];
		}
		else if(weapType.equalsIgnoreCase("sim"))
		{
			if(slot >= sim.length)
				slot = slot - 1;
			
			selWeap = sim[slot];
		}
		else if(weapType.equalsIgnoreCase("mar"))
		{
			if(slot >= mar.length)
				slot = slot - 1;
			
			selWeap = mar[slot];
		}
		else
			selWeap = "unarmed";
	}

	public String getWeap()
	{
		return selWeap;
	}

	private void prntPropertyInfo()
	{
		System.out.println("Range x/y   - x is the min range, y is max");
		System.out.println("Versatile   - can be wielded with one or two hands");
		System.out.println("Ammunition  - signifies that this weapon uses ammunition");
		System.out.println("Loading     - signifies that it take time to ready the weapon for use");
		System.out.println("Reach       - signifies when a melee weapon has a long reach");
		System.out.println("Special(x)  - signifies that a weapon has a draw back defined as x");
		System.out.println();
	}

	public void setMods(int[] mods)
	{
		abilityMods = mods;
		setBonuses();
	}
	
	public void setProfs(String name)
	{
		if(name.equalsIgnoreCase("Barbarian") || name.equalsIgnoreCase("Fighter") || name.equalsIgnoreCase("Paladin") || name.equalsIgnoreCase("Ranger"))
		{
			profs = new String[1];
			profs[0] = "all";
		}
		else if(name.equalsIgnoreCase("Bard") || name.equalsIgnoreCase("Rogue"))
		{
			profs = new String[5];
			profs[0] = "simple";
			profs[1] = "hand crossbow";
			profs[2] = "longsword";
			profs[3] = "rapier";
			profs[4] = "shortsword";
		}
		else if(name.equalsIgnoreCase("Cleric") || name.equalsIgnoreCase("Warlock"))
		{
			profs = new String[1];
			profs[0] = "simple";
		}
		else if(name.equalsIgnoreCase("Druid"))
		{
			profs = new String[10];
			profs[0] = "club";
			profs[1] = "dagger";
			profs[2] = "dart";
			profs[3] = "javelin";
			profs[4] = "mace";
			profs[5] = "quarterstaff";
			profs[6] = "scimitar";
			profs[7] = "sickle";
			profs[8] = "sling";
			profs[9] = "spear";
		}
		else if(name.equalsIgnoreCase("Monk"))
		{
			profs = new String[2];
			profs[0] = "simple";
			profs[1] = "shortsword";
		}
		else if(name.equalsIgnoreCase("Sorcerer") || name.equalsIgnoreCase("Wizard"))
		{
			profs = new String[5];
			profs[0] = "dagger";
			profs[1] = "dart";
			profs[2] = "sling";
			profs[3] = "quarterstaff";
			profs[4] = "light crossbow";
		}
		else
		{
			profs = new String[1];
			profs[0] = "No proficiencies";
		}
	}
	
	private void setBonuses()
	{
		setAllSim();
		setMelSim();
		setRanSim();
		setAllMar();
		setMelMar();
		setRanMar();
	}
	
	private void setAllSim()
	{
		// sim, simMelee, simRange,mar, marMelee, marRange
		for(int i = 0; i < sim.length; i++)
		{
			String temp = sim[i];
			int finIndex = temp.indexOf("Finesse");
			int ammoIndex = temp.indexOf("Ammunition");
			int aMod = 0;
			int profMod = 2;
			int rollMod = 0;
			
			if(finIndex != -1 || ammoIndex != -1)
			{
				if(abilityMods[2] >= 0)
					aMod = abilityMods[2];
				else
					aMod = 0;
			}
			else
			{
				if(abilityMods[4] >= 0)
					aMod = abilityMods[4];
				else
					aMod = 0;
			}
			
			temp = temp.replace("bonus", (aMod + ""));
			rollMod += aMod;
			
			for(int j = 0; j < profs.length; j++)
			{
				if(profs[j].equalsIgnoreCase("all") || profs[j].equalsIgnoreCase("simple"))
				{
					rollMod += profMod;
					j = 50;
				}
				else if(temp.indexOf(profs[j]) != -1)
				{
					rollMod += profMod;
					j = 50;
				}
				else
				{
				}
			}
			
			temp = temp.replace("roll", (rollMod + ""));
			
			sim[i] = temp;
		}
	}

	private void setMelSim()
	{
		for(int i = 0; i < simMelee.length; i++)
		{
			String temp = simMelee[i];
			int finIndex = temp.indexOf("Finesse");
			int ammoIndex = temp.indexOf("Ammunition");
			int aMod = 0;
			int profMod = 2;
			int rollMod = 0;
			
			if(finIndex != -1 || ammoIndex != -1)
			{
				if(abilityMods[2] >= 0)
					aMod = abilityMods[2];
				else
					aMod = 0;
			}
			else
			{
				if(abilityMods[4] >= 0)
					aMod = abilityMods[4];
				else
					aMod = 0;
			}
			
			temp = temp.replace("bonus", (aMod + ""));
			rollMod += aMod;
			
			for(int j = 0; j < profs.length; j++)
			{
				if(profs[j].equalsIgnoreCase("all") || profs[j].equalsIgnoreCase("simple"))
				{
					rollMod += profMod;
					j = 50;
				}
				else if(temp.indexOf(profs[j]) != -1)
				{
					rollMod += profMod;
					j = 50;
				}
				else
				{
				}
			}
			
			temp = temp.replace("roll", (rollMod + ""));
			
			simMelee[i] = temp;
		}
	}
	
	private void setRanSim()
	{
		for(int i = 0; i < simRange.length; i++)
		{
			String temp = simRange[i];
			int finIndex = temp.indexOf("Finesse");
			int ammoIndex = temp.indexOf("Ammunition");
			int aMod = 0;
			int profMod = 2;
			int rollMod = 0;
			
			if(finIndex != -1 || ammoIndex != -1)
			{
				if(abilityMods[2] >= 0)
					aMod = abilityMods[2];
				else
					aMod = 0;
			}
			else
			{
				if(abilityMods[4] >= 0)
					aMod = abilityMods[4];
				else
					aMod = 0;
			}
			
			temp = temp.replace("bonus", (aMod + ""));
			rollMod += aMod;
			
			for(int j = 0; j < profs.length; j++)
			{
				if(profs[j].equalsIgnoreCase("all") || profs[j].equalsIgnoreCase("simple"))
				{
					rollMod += profMod;
					j = 50;
				}
				else if(temp.indexOf(profs[j]) != -1)
				{
					rollMod += profMod;
					j = 50;
				}
				else
				{
				}
			}
			
			temp = temp.replace("roll", (rollMod + ""));
			
			simRange[i] = temp;
		}
	}
	
	private void setAllMar()
	{
		for(int i = 0; i < mar.length; i++)
		{
			String temp = mar[i];
			int finIndex = temp.indexOf("Finesse");
			int ammoIndex = temp.indexOf("Ammunition");
			int aMod = 0;
			int profMod = 2;
			int rollMod = 0;
			
			if(finIndex != -1 || ammoIndex != -1)
			{
				if(abilityMods[2] >= 0)
					aMod = abilityMods[2];
				else
					aMod = 0;
			}
			else
			{
				if(abilityMods[4] >= 0)
					aMod = abilityMods[4];
				else
					aMod = 0;
			}
			
			temp = temp.replace("bonus", (aMod + ""));
			rollMod += aMod;
			
			for(int j = 0; j < profs.length; j++)
			{
				if(profs[j].equalsIgnoreCase("all") || profs[j].equalsIgnoreCase("simple"))
				{
					rollMod += profMod;
					j = 50;
				}
				else if(temp.indexOf(profs[j]) != -1)
				{
					rollMod += profMod;
					j = 50;
				}
				else
				{
				}
			}
			
			temp = temp.replace("roll", (rollMod + ""));
			
			mar[i] = temp;
		}
	}
	
	private void setMelMar()
	{
		for(int i = 0; i < marMelee.length; i++)
		{
			String temp = marMelee[i];
			int finIndex = temp.indexOf("Finesse");
			int ammoIndex = temp.indexOf("Ammunition");
			int aMod = 0;
			int profMod = 2;
			int rollMod = 0;
			
			if(finIndex != -1 || ammoIndex != -1)
			{
				if(abilityMods[2] >= 0)
					aMod = abilityMods[2];
				else
					aMod = 0;
			}
			else
			{
				if(abilityMods[4] >= 0)
					aMod = abilityMods[4];
				else
					aMod = 0;
			}
			
			temp = temp.replace("bonus", (aMod + ""));
			rollMod += aMod;
			
			for(int j = 0; j < profs.length; j++)
			{
				if(profs[j].equalsIgnoreCase("all") || profs[j].equalsIgnoreCase("simple"))
				{
					rollMod += profMod;
					j = 50;
				}
				else if(temp.indexOf(profs[j]) != -1)
				{
					rollMod += profMod;
					j = 50;
				}
				else
				{
				}
			}
			
			temp = temp.replace("roll", (rollMod + ""));
			
			marMelee[i] = temp;
		}
	}
	
	private void setRanMar()
	{
		for(int i = 0; i < marRange.length; i++)
		{
			String temp = marRange[i];
			int finIndex = temp.indexOf("Finesse");
			int ammoIndex = temp.indexOf("Ammunition");
			int aMod = 0;
			int profMod = 2;
			int rollMod = 0;
			
			if(finIndex != -1 || ammoIndex != -1)
			{
				if(abilityMods[2] >= 0)
					aMod = abilityMods[2];
				else
					aMod = 0;
			}
			else
			{
				if(abilityMods[2] >= 0)
					aMod = abilityMods[4];
				else
					aMod = 0;
			}
			
			temp = temp.replace("bonus", (aMod + ""));
			rollMod += aMod;
			
			for(int j = 0; j < profs.length; j++)
			{
				if(profs[j].equalsIgnoreCase("all") || profs[j].equalsIgnoreCase("simple"))
				{
					rollMod += profMod;
					j = 50;
				}
				else if(temp.indexOf(profs[j]) != -1)
				{
					rollMod += profMod;
					j = 50;
				}
				else
				{
				}
			}
			
			temp = temp.replace("roll", (rollMod + ""));
			
			marRange[i] = temp;
		}
	}

	public String[] masterCharacter()
	{
		int vorDmgMod = 0 + abilityMods[2] + 3;
		int vorRollMod = vorDmgMod + 2;
		
		int sunDmgMod = 0 + abilityMods[2] + 2;
		int sunRollMod = sunDmgMod + 2;
		
		int oathDmgMod = 0 + abilityMods[2];
		int oathRollMod = oathDmgMod + 2;
		
		String[] weaps = new String[9];
		weaps[0] = "nullSilvered Vorpal Shortsword   - 1d6 + " + vorDmgMod + "  piercing    - +" + vorRollMod + ", Finesse, light, Silvered(ignores resistance/immunity to nonmagical weapons, unless in this case but still cool to have)";
		weaps[1] = "nullVorpal Effects: When you roll a natural 20 on an attack roll with this weapon, you cur off one of the target's heads, target dies if it can't survive without the lost head, target is immune to the effect if it is immune to slashing or doesn't have/need a head, in this case target takes an extra 6d8 slashing dmg null";
		weaps[2] = "nullSun Blade (longsword) - 1d8 + " + sunDmgMod + " radiant - +" + sunRollMod + " versatile (1d10)";
		weaps[3] = "nullSun Blade Effects: is just a hilt until activated,use a bonus action to cause a blade of pure radiance to spring into existence, adds Finesse, does an extra 1d8 to undead, emits bright light for 15ft then dim light for an additional 15ft, use an action to expand/reduce the radius of light by 5ft, max of 30ft min of 10ftnull";
		weaps[4] = "nullOathbow (longbow) - 1d8 + " + oathDmgMod + "  piercing    - +" + oathRollMod + " to hit, Ammunition (range 150/600), heavy, two-handed";
		weaps[5] = "nullOathbow Effects: when you make a ranged atk with this weapon use the command phrase \"Swift death to you who have wronged me\", target becomes sworn enemy until it dies or until dawn 7 days later, can only have 1 sworn enemy, when sworn enemy dies you can choose a new one after the next dawn, advan on atk rolls against sworn enemy,null                 sworn enemy gains no benefit from cover other than total cover, if atk hits sworn enemy they take an extra 3d6 piercing, while sworn enemy is alive you have disadvan on atk rolls with all other weaponsnull";
		weaps[6] = "null100 Arrows of Slaying - 10 arrows of each of the following: Aberration, Celestial, Construct, Dragon, Elemental, Fiend, Giant, Humanoid, Monstrosity, Undead";
		weaps[7] = "nullArrow of Slaying Effects: if the target belongs to the type of arrow used and takes damage from the arrow they most succeed a DC 17 Con saving throw, on failure deal an extra 6d10 piercing, on success deal 1/2(6d10) piercing, once the arrow deal dmg it becomes nonmagical(basically it becomes a normal arrow)null";
		weaps[8] = "null60 Silvered Arrows - has no magical properties other than the Silvered property, Silvered(ignores resistance/immunity to nonmagical weapons)null";
		return weaps;
	}
}