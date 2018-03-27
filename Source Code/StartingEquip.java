import java.util.*;

public class StartingEquip
{
	private String className;
	private String[] equipList;

	private Scanner wolf = new Scanner(System.in);

	private Weapons weaps = new Weapons();
	private Armors armors = new Armors();
	private Instruments instru = new Instruments();
	private Packs pack = new Packs();
	@SuppressWarnings("unused")
	private int[] modifiers;

	public StartingEquip()
	{
	}

	public void setClass(String name)
	{
		className = name;
		weaps.setProfs(name);
	}
	
	public void setMods(int[] mods)
	{
		weaps.setMods(mods);
		modifiers = mods;
	}

	public void listChoices()
	{
		armors.setLists();

		if(className.equalsIgnoreCase("Barbarian"))
			listBarbarian();
		else if(className.equalsIgnoreCase("Bard"))
			listBard();
		else if(className.equalsIgnoreCase("Cleric"))
			listCleric();
		else if(className.equalsIgnoreCase("Druid"))
			listDruid();
		else if(className.equalsIgnoreCase("Fighter"))
			listFighter();
		else if(className.equalsIgnoreCase("Monk"))
			listMonk();
		else if(className.equalsIgnoreCase("Paladin"))
			listPaladin();
		else if(className.equalsIgnoreCase("Ranger"))
			listRanger();
		else if(className.equalsIgnoreCase("Rogue"))
			listRogue();
		else if(className.equalsIgnoreCase("Sorcerer"))
			listSorcerer();
		else if(className.equalsIgnoreCase("Warlock"))
			listWarlock();
		else if(className.equalsIgnoreCase("Wizard"))
			listWizard();
	}

	public void setDex(int mod)
	{
		armors.setDex(mod);
	}

	private void listBarbarian() // no pack option, explorer's
	{
		equipList = new String[3];
		weaps.prntMarMelee();
		System.out.print("\nChoose a martial melee weapon :: ");
		int chosen = wolf.nextInt() - 1;
		weaps.setWeap("marMelee", chosen);
		equipList[0] = "Weapon 1 - " + weaps.getWeap();
		System.out.println();
		System.out.println("a)two handaxes or b) any simple weapon");
		System.out.print("\nChoose an option (a or b) :: ");
		char sel = wolf.next().charAt(0);

		if(sel == 'a' || sel == 'A')
			equipList[1] = "two handaxes (1d6  slashing)";
		else
		{
			System.out.println();
			weaps.prntSim();
			System.out.print("\nChoose a simple weapon :: ");
			chosen = wolf.nextInt() - 1;
			weaps.setWeap("sim", chosen);
			equipList[1] = "Weapon 2 - " + weaps.getWeap();
		}
		equipList[2] = "Explorer's Pack and four javelins (1d6  piercing)";
		pack.setPack("Explorer");
	}

	private void listBard() // pack options are diplomat's and entertainer's
	{
		equipList = new String[4];
		weaps.prntSimMelee();
		System.out.print("\nChoose a simple melee weapon :: ");
		int chosen = wolf.nextInt() - 1;
		weaps.setWeap("simMelee", chosen);
		equipList[0] = "Weapon 1 - " + weaps.getWeap();

		System.out.println();
		System.out.println("a)Diplomat's pack or b)Entertainer's pack");
		System.out.print("\nChoose a pack (a or b) :: ");
		char sel = wolf.next().charAt(0);

		if(sel == 'a' || sel == 'A')
		{
			equipList[1] = "Diplomat's pack";
			pack.setPack("Diplomat");
		}
		else
		{
			equipList[1] = "Entertainer's pack";
			pack.setPack("Entertainer");
		}

		System.out.println();
		instru.listInstr();
		System.out.print("\nChoose an instrument :: ");
		int selIns = wolf.nextInt() - 1;
		instru.setInstr(selIns - 1);
		equipList[2] = instru.getInstr();

		armors.setLength(1);
		armors.setSel("light", 1, 0);
		equipList[3] = armors.getArmor() + ", and a Dagger (1d4 piercing)";
	}

	private void listCleric() // pack options are priest's and explorer's
	{
		equipList = new String[5];
		System.out.println("a)Mace or b)Warhammer");
		System.out.print("\nChoose a weapon (a or b):: ");
		char sel = wolf.next().charAt(0);

		if(sel == 'a' || sel == 'A')
		{
			equipList[0] = "mace (1d6 bludgeoning)";
			weaps.setWeap("simMelee", 6);
		}
		else
		{
			equipList[0] = "warhammer (1d8 bludgeoning)";
			weaps.setWeap("marMelee", 16);
		}
		equipList[0] = "Weapon 1 - " + weaps.getWeap();;

		System.out.println();
		System.out.println("a)Scale mail or b)Leather Armor or c)Chain Mail");
		System.out.print("\nChoose an option (a or b or c) :: ");
		char sel2 = wolf.next().charAt(0);

		armors.setLength(2);

		if(sel2 == 'a' || sel2 == 'A')
		{
			armors.setSel("medium", 2, 0);
		}
		else if(sel2 == 'b' || sel2 == 'B')
		{
			armors.setSel("light", 1, 0);
		}
		else
		{
			armors.setSel("heavy", 1,0);
		}
		equipList[1] = armors.getArmor();

		System.out.println();
		System.out.println("a)light crossbow with 20 bolts or b)any simple weapon");
		System.out.print("\nChoose one (a or b) :: ");
		char sel3 = wolf.next().charAt(0);

		if(sel3 == 'a' || sel3 == 'A')
			equipList[2] = "Weapon 2 - light crossbow (1d8 piercing) with 20 bolts (range 80/320)";
		else
		{
			System.out.println();
			weaps.prntSim();
			System.out.print("\nChoose a simple weapon :: ");
			int chosen = wolf.nextInt() - 1;
			weaps.setWeap("sim", chosen);
			equipList[2] = "Weapon 2 - " + weaps.getWeap();
		}

		System.out.println();
		System.out.println("a)Priest's pack or b)Explorer's pack");
		System.out.print("\nChoose a pack (a or b) :: ");
		char sel4 = wolf.next().charAt(0);

		if(sel4 == 'a' || sel4 == 'A')
		{
			equipList[3] = "Priest's pack";
			pack.setPack("Priest");
		}
		else
		{
			equipList[3] = "Explorer's pack";
			pack.setPack("Explorer");
		}

		equipList[4] = "A shield and a holy symbol";
		armors.setSel("shield", 1, 1);
	}

	private void listDruid() // no pack option, explorer's
	{
		equipList = new String[3];
		System.out.println("a)wooden Shield or b)any simple weapon");
		System.out.print("\nChoose one (a or b) :: ");
		char sel = wolf.next().charAt(0);

		if(sel == 'a' || sel == 'A')
		{
			equipList[0] = "wooden shield";
			armors.setLength(2);
			armors.setSel("shield", 1, 0);
		}
		else
		{
			armors.setLength(1);
			System.out.println();
			weaps.prntSim();
			System.out.print("\nChoose a simple weapon :: ");
			int tempChosen = wolf.nextInt() - 1;
			weaps.setWeap("sim", tempChosen);
			equipList[0] = "Weapon 1 - " + weaps.getWeap();
		}
		System.out.println();
		weaps.prntSim();
		System.out.print("\nChoose a simple weapon :: ");
		int chosen = wolf.nextInt() - 1;
		weaps.setWeap("simMelee", chosen);
		if(sel == 'a' || sel == 'A')
			equipList[1] = "Weapon 2 - " + weaps.getWeap();
		else
			equipList[1] = "Weapon 1 - " + weaps.getWeap();
		equipList[2] = "Leather Armor, Explorer's Pack, druidic focus";
		if(sel == 'a' || sel == 'A')
			armors.setSel("light", 1, 1);
		else
			armors.setSel("light", 1, 0);

		pack.setPack("Explorer");
	}

	private void listFighter() // pack options are dungeoneer's and explorer's
	{
		equipList = new String[4];

		System.out.println("a)martial weapon and a shield or b)two martial weapons");
		System.out.print("\nChoose one (a or b) :: ");
		char sel2 = wolf.next().charAt(0);

		if(sel2 == 'a' || sel2 == 'A')
		{
			armors.setLength(2);
			armors.setSel("shield", 1, 1);

			System.out.println();
			weaps.prntMar();
			System.out.print("\nChoose a martial weapon :: ");
			int chosen = wolf.nextInt() - 1;
			weaps.setWeap("mar", chosen);
			equipList[1] = "Weapon 2 - " + weaps.getWeap() + "\nShield";
		}
		else
		{
			armors.setLength(1);

			System.out.println();
			weaps.prntMar();
			System.out.println("\nChoose a martial weapon :: ");
			int chosen = wolf.nextInt() - 1;
			weaps.setWeap("mar", chosen);
			equipList[1] = "Weapon 2 -" + weaps.getWeap();

			System.out.println();
			weaps.prntMar();
			System.out.println("You may choose a duplicate of your previous choice if you wish to do so");
			System.out.print("\nChoose a martial weapon :: ");
			int chosen2 = wolf.nextInt() - 1 - 1;
			weaps.setWeap("mar", chosen2);
			equipList[1] = equipList[1] + "\nWeapon 3 - " + weaps.getWeap();
		}

		System.out.println();
		System.out.println("a)Chain mail or b)leather armor and longbow with 20 arrows");
		System.out.print("\nChoose one (a or b) :: ");
		char sel = wolf.next().charAt(0);

		if(sel == 'a' || sel == 'A')
		{
			equipList[0] = "Chain mail";
			armors.setSel("heavy", 1, 0);
		}
		else
		{
			equipList[0] = "leather armor\nWeapon 1 - longbow (1d8 piercing), and 20 arrows (range 150/600)";
			armors.setSel("light", 1, 0);
		}

		System.out.println();
		System.out.println("a)Light crossbow with 20 bolts or b)two handaxes");
		System.out.print("\nChoose one (a or b) :: ");
		char sel3 = wolf.next().charAt(0);

		if(sel3 == 'a' || sel3 == 'A')
		{
			if(sel2 == 'a' || sel2 == 'A')
				equipList[2] = "Weapon 3 - light crossbow (1d8 piercing) with 20 bolts (range 80/320)";
			else
				equipList[2] = "Weapon 4 - light crossbow (1d8 piercing) with 20 bolts (range 80/320)";
		}
		else
		{
			if(sel2 == 'a' || sel2 == 'A')
				equipList[2] = "Weapon 3 - two handaxes (1d6 slashing each)";
			else
				equipList[2] = "Weapon 4 - two handaxes (1d6 slashing each)";
		}

		System.out.println();
		System.out.println("a)Dungeoneer's pack or b)Explorer's pack");
		System.out.print("\nChoose a pack (a or b) :: ");
		char sel4 = wolf.next().charAt(0);

		if(sel4 == 'a' || sel4 == 'A')
		{
			equipList[3] = "Dungeoneer's pack";
			pack.setPack("Dungeoneer");
		}
		else
		{
			equipList[3] = "Explorer's pack";
			pack.setPack("Explorer");
		}
	}

	private void listMonk() // pack options are dungeoneer's and explorer's
	{
		equipList = new String[3];
		weaps.prntSim();
		System.out.print("\nChoose a simple weapon :: ");
		int chosen = wolf.nextInt() - 1;
		weaps.setWeap("sim", chosen);
		equipList[0] = "Weapon 1 - " + weaps.getWeap();
		System.out.println();
		System.out.println("a)Dungeoneer's pack or b)Explorer's pack");
		System.out.print("\nChoose an option (a or b) :: ");
		char sel = wolf.next().charAt(0);

		if(sel == 'a' || sel == 'A')
		{
			equipList[1] = "Dungeoneer's pack";
			pack.setPack("Dungeoneer");
		}
		else
		{
			equipList[1] = "Explorer's pack";
			pack.setPack("Explorer");
		}
		equipList[2] = "10 darts (1d4 piercing each)";
	}

	private void listPaladin() // pack options are priest's and explorer's
	{
		equipList = new String[4];
		System.out.println("a)a martial weapon and a shield or b)two martial weapons");
		System.out.print("\nChoose an option :: ");
		char sel = wolf.next().charAt(0);

		if(sel == 'a' || sel == 'A')
		{
			armors.setLength(2);
			weaps.prntMar();
			System.out.print("\nChoose a martial weapon :: ");
			int chosen = wolf.nextInt() - 1;
			weaps.setWeap("mar", chosen);
			equipList[0] = "Weapon 1 - " + weaps.getWeap() + "\nShield";
			armors.setSel("shield", 1, 1);
		}
		else
		{
			armors.setLength(1);
			weaps.prntMar();
			System.out.print("\nChoose a martial weapon :: ");
			int chosen = wolf.nextInt() - 1;
			weaps.setWeap("mar", chosen);
			equipList[0] = equipList[0] + "\nWeapon 1 - " + weaps.getWeap();
			System.out.println();
			weaps.prntMar();
			System.out.print("\nChoose another martial weapon :: ");
			int chosen2 = wolf.nextInt() - 1;
			weaps.setWeap("mar", chosen2);
			equipList[0] = equipList[0] + "\nWeapon 2 - " + weaps.getWeap();
		}
		System.out.println();
		System.out.println("a)two handaxes or b) any simple weapon");
		System.out.print("\nChoose an option (a or b) :: ");
		char sel2 = wolf.next().charAt(0);

		if(sel2 == 'a' || sel2 == 'A')
			equipList[1] = "two handaxes (1d6 slashing, light, thrown(range 20/60))";
		else
		{
			System.out.println();
			weaps.prntSimMelee();
			System.out.print("\nChoose a simple melee weapon :: ");
			int chosen = wolf.nextInt() - 1;
			weaps.setWeap("simMelee", chosen);

			if(sel == 'a' || sel == 'A')
				equipList[1] = "Weapon 2 - " + weaps.getWeap();
			else
				equipList[1] = "Weapon 3 - " + weaps.getWeap();
		}

		System.out.println();
		System.out.println("a)Priest's pack or b)Explorer's pack");
		System.out.print("\nChoose a pack (a or b) :: ");
		char sel3 = wolf.next().charAt(0);

		if(sel3 == 'a' || sel3 == 'A')
		{
			equipList[2] = "Priest's pack";
			pack.setPack("Priest");
		}
		else
		{
			equipList[2] = "Explorer's pack";
			pack.setPack("Explorer");
		}

		equipList[3] = "Chain mail and a holy symbol";
		armors.setSel("heavy", 1, 0);
	}

	private void listRanger() // pack options are dungeoneer's and explorer's
	{
		equipList = new String[4];
		armors.setLength(1);
		System.out.println("a)Scale mail or b)leather armor");
		System.out.print("\nChoose an armor (a or b) :: ");
		char sel = wolf.next().charAt(0);

		if(sel == 'a' || sel == 'A')
		{
			equipList[0] = "Scale mail";
			armors.setSel("medium", 2, 0);
		}
		else
		{
			equipList[0] = "Leather armor";
			armors.setSel("light", 1, 0);
		}
		weaps.prntSimMelee();
		System.out.print("\nChoose a simple melee weapon :: ");
		int chosen = wolf.nextInt() - 1;
		weaps.setWeap("simMelee", chosen);
		equipList[1] = "Weapon 1 - " + weaps.getWeap();
		System.out.println();
		weaps.prntSimMelee();
		System.out.print("\nChoose a simple melee weapon :: ");
		int chosen2 = wolf.nextInt() - 1;
		weaps.setWeap("simMelee", chosen2);
		equipList[1] = equipList[1] + "\nWeapon 2 - " + weaps.getWeap();
		System.out.println("a)Dungeoneer's pack or b)Explorer's pack");
		System.out.print("\nChoose an option (a or b) :: ");
		char sel2 = wolf.next().charAt(0);

		if(sel2 == 'a' || sel == 'A')
		{
			equipList[2] = "Dungoeneer's pack";
			pack.setPack("Dungeoneer");
		}
		else
		{
			equipList[2] = "Explorer's pack";
			pack.setPack("Explorer");
		}
		equipList[3] = "Longbow (1d8 piercing) and a Quiver of 20 arrows (range 150/600)";
	}

	private void listRogue() // pack options are burglar's , dungeoneer's , and explorer's
	{
		equipList = new String[4];
		System.out.println("a)rapier or b)shortsword");
		System.out.print("\nChoose an option (a or b) :: ");
		char sel = wolf.next().charAt(0);

		if(sel == 'a' || sel == 'A')
			equipList[0] = "Weapon 1 - rapier (1d8 piercing)";
		else
			equipList[0] = "Weapon 1 - shortsword (1d6 piercing)";
		System.out.println();
		System.out.println("a)shortbow and 20 arrows or b)shortsword");
		System.out.print("\nChoose an option (a or b) :: ");
		char sel2 = wolf.next().charAt(0);

		if(sel2 == 'a' || sel == 'A')
			equipList[1] = "Weapon 2 - shortbow (1d6 piercing) and 20 arrows (range 80/320)";
		else
			equipList[1] = "Weapon 2 - shortsword (1d6 piercing)";
		System.out.println();
		System.out.println("a)Burglar's pack or b)Dungeoneer's pack or c)Explorer's pack");
		System.out.print("\nChoose an option (a or b or c) :: ");
		char sel3 = wolf.next().charAt(0);

		if(sel3 == 'a' || sel == 'A')
		{
			equipList[2] = "Burglar's pack";
			pack.setPack("Burglar");
		}
		else if(sel3 == 'b' || sel3 == 'B')
		{
			equipList[2] = "Dungeoneer's pack";
			pack.setPack("Dungeoneer");
		}
		else
		{
			equipList[2] = "Explorer's pack";
			pack.setPack("Explorer");
		}

		equipList[3] = "Leather armor, two daggers (1d4 piercing, range 20/60), Thieves' tools";
	}

	private void listSorcerer() // pack options are dungeoneer's and explorer's
	{
		System.out.println("a)light crossbow with 20 bolts or b) any simple weapon");
		System.out.print("\nChoose an option (a or b) :: ");
		char sel = wolf.next().charAt(0);

		if(sel == 'a' || sel == 'A')
			equipList[0] = "Weapon 1 - light crossbow (1d8 piercing) with 20 bolts (range 80/320)";
		else
		{
			System.out.println();
			weaps.prntSim();
			System.out.print("\nChoose a simple weapon :: ");
			int chosen = wolf.nextInt() - 1;
			weaps.setWeap("sim", chosen);
			equipList[0] = "Weapon 1 - " + weaps.getWeap();
		}
		System.out.println();
		System.out.println("a)Component pouch or b)arcane focus");
		System.out.print("\nChoose one (a or b) :: ");
		char sel2 = wolf.next().charAt(0);

		if(sel2 == 'a' || sel2 == 'A')
			equipList[1] = "component pouch";
		else
			equipList[1] = "arcane focus";

		System.out.println();
		System.out.println("a)Dungeoneer's pack or b)Explorer's pack");
		System.out.print("\nChoose a pack (a or b) :: ");
		char sel3 = wolf.next().charAt(0);

		if(sel3 == 'a' || sel3 == 'A')
		{
			equipList[2] = "Dungeoneer's pack";
			pack.setPack("Dungeoneer");
		}
		else
		{
			equipList[2] = "Explorer's pack";
			pack.setPack("Explorer");
		}

		equipList[3] = "two daggers (1d4 piercing each, thrown range 20/60)";
	}

	private void listWarlock() // pack options are scholar's and dungeoneer's
	{
		System.out.println("a)light crossbow with 20 bolts or b) any simple weapon");
		System.out.print("\nChoose an option (a or b) :: ");
		char sel = wolf.next().charAt(0);

		if(sel == 'a' || sel == 'A')
			equipList[0] = "Weapon 1 - light crossbow (1d8 piercing) with 20 bolts (range 80/320)";
		else
		{
			System.out.println();
			weaps.prntSim();
			System.out.print("\nChoose a simple weapon :: ");
			int chosen = wolf.nextInt() - 1;
			weaps.setWeap("sim", chosen);
			equipList[0] = "Weapon 1 - " + weaps.getWeap();
		}
		System.out.println();
		System.out.println("a)Component pouch or b)arcane focus");
		System.out.print("\nChoose one (a or b) :: ");
		char sel2 = wolf.next().charAt(0);

		if(sel2 == 'a' || sel2 == 'A')
			equipList[1] = "component pouch";
		else
			equipList[1] = "arcane focus";

		System.out.println();
		System.out.println("a)Scholar's pack or b)Explorer's pack");
		System.out.print("\nChoose a pack (a or b) :: ");
		char sel3 = wolf.next().charAt(0);

		if(sel3 == 'a' || sel3 == 'A')
		{
			equipList[2] = "Scholar's pack";
			pack.setPack("Scholar");
		}
		else
		{
			equipList[2] = "Explorer's pack";
			pack.setPack("Explorer");
		}

		equipList[3] = "Leather armor, ";

		armors.setLength(1);
		armors.setSel("light", 1, 0);

		System.out.println();
		weaps.prntSim();
		System.out.print("\nChoose a simple weapon :: ");
		int chosen2 = wolf.nextInt() - 1;
		weaps.setWeap("sim", chosen2);
		equipList[3] = equipList[3] + weaps.getWeap() + ", two daggers (1d4 piercing each, thrown range 20/60)";
	}

	private void listWizard() // pack options are scholar's and dungeoneer's
	{
		System.out.println("a)quarterstaff or b)dagger");
		System.out.print("\nChoose an option (a or b) :: ");
		char sel = wolf.next().charAt(0);

		if(sel == 'a' || sel == 'A')
			equipList[0] = "Weapon 1 - quarterstaff (1d6 bludgeoning)";
		else
		{
			equipList[0] = "Weapon 1 - dagger (1d4 piercing, thrown range 20/60)";
		}
		System.out.println();
		System.out.println("a)Component pouch or b)arcane focus");
		System.out.print("\nChoose one (a or b) :: ");
		char sel2 = wolf.next().charAt(0);

		if(sel2 == 'a' || sel2 == 'A')
			equipList[1] = "component pouch";
		else
			equipList[1] = "arcane focus";

		System.out.println();
		System.out.println("a)Scholar's pack or b)Explorer's pack");
		System.out.print("\nChoose a pack (a or b) :: ");
		char sel3 = wolf.next().charAt(0);

		if(sel3 == 'a' || sel3 == 'A')
		{
			equipList[2] = "Scholar's pack";
			pack.setPack("Scholar");
		}
		else
		{
			equipList[2] = "Explorer's pack";
			pack.setPack("Explorer");
		}

		equipList[3] = "spellbook";
	}

	public void prntFinal()
	{
		System.out.println("--------EQUIPMENT--------");
		for(int i = 0; i < equipList.length; i++)
		{
			System.out.println(equipList[i]);
		}

		System.out.println("--------Pack Contents--------");
		pack.getContents(pack.getPack());
	}
	
	public String[] getFinal()
	{
	    String[] fin = new String[equipList.length + 4];
	    fin[0] = System.lineSeparator() + "--------EQUIPMENT--------";
	    int curSlot = 1;
	    
	    for(int i = 0; i < equipList.length; i++)
	    {
	        fin[i+1] = System.lineSeparator() + equipList[i];
	        curSlot++;
	    }
	    
	    fin[curSlot] = System.lineSeparator();
	    curSlot++;
	    
	    fin[curSlot] = System.lineSeparator() + "--------Pack Contents--------";
	    curSlot++;
	    
	    fin[curSlot] = System.lineSeparator() + pack.getFinal()[0];
	    
	    return fin;
	}
	
	public String[] getFinal2()
	{
		String[] fin = new String[equipList.length + 2];
	    fin[0] = "--------EQUIPMENT--------";
	    int curSlot = 1;
	    
	    for(int i = 0; i < equipList.length; i++)
	    {
	        fin[i+1] = equipList[i];
	        curSlot++;
	    }
	    
	    fin[curSlot] = "";
	    
	    return fin;
	}
	
	public String[] getCodeFinal()
	{
		String[] fin = new String[equipList.length + 2];
	    fin[0] = "--------EQUIPMENT--------";
	    int curSlot = 1;
	    
	    for(int i = 0; i < equipList.length; i++)
	    {
	        fin[i+1] = "null" + equipList[i];
	        curSlot++;
	    }
	    
	    fin[curSlot] = "null";
	    
	    return fin;
	}

	public int getAC()
	{
		return armors.getTotalAC();
	}
	
	public String getPack()
	{
		return pack.getPack();
	}
	
	public void masterCharacter()
	{
		equipList = new String[12];
		
		for(int i = 0; i < weaps.masterCharacter().length; i++)
		{
			equipList[i] = weaps.masterCharacter()[i];
		}
		equipList[11] = "Dungeoneer's pack";
		pack.setPack("Dungeoneer");
	}
}