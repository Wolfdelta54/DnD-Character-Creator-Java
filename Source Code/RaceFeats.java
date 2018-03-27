public class RaceFeats
{
	private String race;
	private String subrace;
	private String[] feats;

	public RaceFeats()
	{
	}

	public void setRace(String raceName, String subraceName)
	{
		race = raceName;
		subrace = subraceName;
		setFeats();
	}

	private void setFeats()
	{
		if(race.equalsIgnoreCase("Dragonborn"))
		{
			if(subrace.equalsIgnoreCase("Black"))
			{
				feats = new String[2];
				feats[0] = "Acid Damage Resistance (1/2 damage) ";
				feats[1] = "Acid Breath Weapon - 5 by 30ft line(Dex Save)";
			}
			else if(subrace.equalsIgnoreCase("Blue"))
			{
				feats = new String[2];
				feats[0] = "Lightning Damage Resistance (1/2 damage) ";
				feats[1] = "Lightning Breath Weapon - 5 by 30ft line(Dex Save)";
			}
			else if(subrace.equalsIgnoreCase("Brass"))
			{
				feats = new String[2];
				feats[0] = "Fire Damage Resistance (1/2 damage) ";
				feats[1] = "Fire Breath Weapon - 5 by 30ft line(Dex Save)";
			}
			else if(subrace.equalsIgnoreCase("Bronze"))
			{
				feats = new String[2];
				feats[0] = "Lightning Damage Resistance (1/2 damage) ";
				feats[1] = "Lightning Breath Weapon - 5 by 30ft line(Dex Save)";
			}
			else if(subrace.equalsIgnoreCase("Copper"))
			{
				feats = new String[2];
				feats[0] = "Acid Damage Resistance (1/2 damage) ";
				feats[1] = "Acid Breath Weapon - 5 by 30ft line(Dex Save)";
			}
			else if(subrace.equalsIgnoreCase("Gold"))
			{
				feats = new String[2];
				feats[0] = "Fire Damage Resistance (1/2 damage) ";
				feats[1] = "Fire Breath Weapon - 15ft cone(Dex Save)";
			}
			else if(subrace.equalsIgnoreCase("Green"))
			{
				feats = new String[2];
				feats[0] = "Poison Damage Resistance (1/2 damage) ";
				feats[1] = "Poison Breath Weapon - 15ft cone(Con Save)";
			}
			else if(subrace.equalsIgnoreCase("Red"))
			{
				feats = new String[2];
				feats[0] = "Fire Damage Resistance (1/2 damage) ";
				feats[1] = "Fire Breath Weapon - 15ft cone(Dex Save)";
			}
			else if(subrace.equalsIgnoreCase("Silver"))
			{
				feats = new String[2];
				feats[0] = "Cold(Ice) Damage Resistance (1/2 damage) ";
				feats[1] = "Cold(Ice) Breath Weapon - 15ft cone(Con Save)";
			}
			else if(subrace.equalsIgnoreCase("White"))
			{
				feats = new String[2];
				feats[0] = "Cold(Ice) Damage Resistance (1/2 damage) ";
				feats[1] = "Cold(Ice) Breath Weapon - 15ft cone(Con Save)";
			}
			else
			{
				feats = new String[2];
				feats[0] = "Acid Damage Resistance (1/2 damage) ";
				feats[1] = "Acid Breath Weapon - 5 by 30ft line(Dex Save)";
			}
		}
		else if(race.equalsIgnoreCase("Dwarf"))
		{
			if(subrace.equalsIgnoreCase("Hill"))
			{
				feats = new String[5];
				feats[0] = "Darkvision (60ft)";
				feats[1] = "Dwarven Resilience - advantage against poison, Resistance (1/2 damage)  to poison damage";
				feats[2] = "Dwarven Combat Training";
				feats[3] = "Stonecunning";
				feats[4] = "Dwarven Toughness - max hp +1";
			}
			else if(subrace.equalsIgnoreCase("Gray"))
			{
				feats = new String[6];
				feats[0] = "Superior Darkvision (120ft)";
				feats[1] = "Dwarven Resilience - advantage against poison, Resistance (1/2 damage)  to poison damage";
				feats[2] = "Dwarven Combat Training";
				feats[3] = "Stonecunning";
				feats[4] = "Duergar Resilience - advantage against illusions, charm, and paralysis";
				feats[5] = "Sunlight Sensitivity - disadvantage on atk and perc rolls when in direct sunlight";
			}
			else if(subrace.equalsIgnoreCase("Mountain"))
			{
				feats = new String[5];
				feats[0] = "Darkvision (60ft)";
				feats[1] = "Dwarven Resilience - advantage against poison, Resistance (1/2 damage)  to poison damage";
				feats[2] = "Dwarven Combat Training";
				feats[3] = "Stonecunning";
				feats[4] = "Dwarven Armor Training";
			}
			else if(subrace.equalsIgnoreCase("Regular"))
			{
				feats = new String[4];
				feats[0] = "Darkvision (60ft)";
				feats[1] = "Dwarven Resilience - advantage against poison, Resistance (1/2 damage)  to poison damage";
				feats[2] = "Dwarven Combat Training";
				feats[3] = "Stonecunning";
			}
			else
			{
			}
		}
		else if(race.equalsIgnoreCase("Elf"))
		{
			if(subrace.equalsIgnoreCase("Eladrin"))
			{
				feats = new String[6];
				feats[0] = "Darkvision (60ft)";
				feats[1] = "Keen Senses - prof in perc";
				feats[2] = "Fey Ancestry - advantage against magical charms, immune to magic-induced sleep";
				feats[3] = "Trance - can meditate for 4 hours instead of sleeping for 8";
				feats[4] = "Elf Weapon Training";
				feats[5] = "Fey Step - once per rest you can cast Misty Step";
			}
			else if(subrace.equalsIgnoreCase("High"))
			{
				feats = new String[6];
				feats[0] = "Darkvision (60ft)";
				feats[1] = "Keen Senses - prof in perc";
				feats[2] = "Fey Ancestry - advantage against magical charms, immune to magic-induced sleep";
				feats[3] = "Trance - can meditate for 4 hours instead of sleeping for 8";
				feats[4] = "Elf Weapon Training";
				feats[5] = "Cantrip - gain one Wizard cantrip of your choice";
			}
			else if(subrace.equalsIgnoreCase("Wood"))
			{
				feats = new String[7];
				feats[0] = "Darkvision (60ft)";
				feats[1] = "Keen Senses - prof in perc";
				feats[2] = "Fey Ancestry - advantage against magical charms, immune to magic-induced sleep";
				feats[3] = "Trance - can meditate for 4 hours instead of sleeping for 8";
				feats[4] = "Elf Weapon Training";
				feats[5] = "Fleet of Foot";
				feats[6] = "Mask of the Wild - can try to hide when lightly obscured";
			}
			else if(subrace.equalsIgnoreCase("Dark"))
			{
				feats = new String[7];
				feats[0] = "Superior Darkvision (120ft)";
				feats[1] = "Keen Senses - prof in perc";
				feats[2] = "Fey Ancestry - advantage against magical charms, immune to magic-induced sleep";
				feats[3] = "Trance - can meditate for 4 hours instead of sleeping for 8";
				feats[4] = "Drow Weapon Training";
				feats[5] = "Sunlight Sensitivity - disadvantage on atk rolls and wis checks that rely on sight when you or your target in direct sunlight";
				feats[6] = "Drow Magic - at 1st lvl gain the Dancing Lights cantrip (does not take up cantrip slot)";
			}
			else if(subrace.equalsIgnoreCase("Regular"))
			{
				feats = new String[4];
				feats[0] = "Darkvision (60ft)";
				feats[1] = "Keen Senses - prof in perc";
				feats[2] = "Fey Ancestry - advantage against magical charms, immune to magic-induced sleep";
				feats[3] = "Trance - can meditate for 4 hours instead of sleeping for 8";
			}
			else
			{
			}
		}
		else if(race.equalsIgnoreCase("Gnome"))
		{
			if(subrace.equalsIgnoreCase("Forest"))
			{
				feats = new String[4];
				feats[0] = "Darkvision (60ft)";
				feats[1] = "Gnome Cunning - advan on int, wis, and charisma saving throws against magic";
				feats[2] = "Natural Illusionist - you know the Minor Illusion cantrip (does not count against cantrip slots";
				feats[3] = "Speak with Small Beasts - you can communicate simple ideas with Small or smaller beasts";
			}
			else if(subrace.equalsIgnoreCase("Rock"))
			{
				feats = new String[4];
				feats[0] = "Darkvision (60ft)";
				feats[1] = "Gnome Cunning - advan on int, wis, and charisma saving throws against magic";
				feats[2] = "Artificer's Lore";
				feats[3] = "Tinker -  you can spend 1 hr and 10 gp worth of materials to construct a Tiny clockwork device (AC 5, 1 hp)";
			}
			else if(subrace.equalsIgnoreCase("Deep"))
			{
				feats = new String[3];
				feats[0] = "Superior Darkvision (120ft)";
				feats[1] = "Gnome Cunning - advan on int, wis, and charisma saving throws against magic";
				feats[2] = "Stone Camouflage - advan on Stealth checks to hide in rocky terrain";
			}
			else if(subrace.equalsIgnoreCase("Regular"))
			{
				feats = new String[2];
				feats[0] = "Darkvision (60ft)";
				feats[1] = "Gnome Cunning - advan on int, wis, and charisma saving throws against magic";
			}
			else
			{
			}
		}
		else if(race.equalsIgnoreCase("Half-Elf"))
		{
			feats = new String[2];
			feats[0] = "Darkvision (60ft)";
			feats[1] = "Fey Ancestry - advan on saves against charms and immune to magic-induced sleep";
		}
		else if(race.equalsIgnoreCase("Half-Orc"))
		{
			feats = new String[3];
			feats[0] = "Darkvision (60ft)";
			feats[1] = "Relentless Endurace - when you are reduced to 0 hp but not killed, you can drop to 1 hp instead";
			feats[2] = "Savage Attacks - when you score a critical hit with a melee weapon, you can roll a damage dice one additional time";
		}
		else if(race.equalsIgnoreCase("Halfling"))
		{
			if(subrace.equalsIgnoreCase("Ghostwise"))
			{
				feats = new String[3];
				feats[0] = "Lucky - you can reroll the die if you roll a 1 for any roll other than damage, must use result";
				feats[1] = "Brave - advan on saving throws against being frightened";
				feats[2] = "Silent Speech - you can telepathically speak to any creature within 30ft, it understands you only if you share a known language";
			}
			else if(subrace.equalsIgnoreCase("Lightfoot"))
			{
				feats = new String[3];
				feats[0] = "Lucky - you can reroll the die if you roll a 1 for any roll other than damage, must use result";
				feats[1] = "Brave - advan on saving throws against being frightened";
				feats[2] = "Naturally Stealthy - you can attempt to hide even when you are abuscured by a creature larger than you";
			}
			else if(subrace.equalsIgnoreCase("Stout"))
			{
				feats = new String[3];
				feats[0] = "Lucky - you can reroll the die if you roll a 1 for any roll other than damage, must use result";
				feats[1] = "Brave - advan on saving throws against being frightened";
				feats[2] = "Stout Resilience - advan on saving throws against poison, resistant to poison damage";
			}
			else if(subrace.equalsIgnoreCase("Regular"))
			{
				feats = new String[2];
				feats[0] = "Lucky - you can reroll the die if you roll a 1 for any roll other than damage, must use result";
				feats[1] = "Brave - advan on saving throws against being frightened";
			}
			else
			{
			}
		}
		else if(race.equalsIgnoreCase("Human"))
		{
			feats = new String[1];
			feats[0] = "No special racial features";
		}
		else if(race.equalsIgnoreCase("Orc"))
		{
			feats = new String[4];
			feats[0] = "Darkvision (60ft)";
			feats[1] = "Aggressive - can move up to your speed closer to an enemy of your choice that you can see/hear as a bonus action";
			feats[2] = "Menacing - you are trained in the Intimidation skill";
			feats[3] = "Powerful Build - you count as one size larger when determining carrying capacity and the weight you can push/drag/lift";
		}
		else if(race.equalsIgnoreCase("Tiefling"))
		{
			feats = new String[3];
			feats[0] = "Darkvision (60ft)";
			feats[1] = "Hellish Resistance (1/2 damage)  - resistant to fire damage";
			feats[2] = "Infernal Legacy - you know the Thaumaturgy cantip (does not count against cantrip slots)";
		}
		else
		{
		}
	}

	public String[] getRaceFeats()
	{
		return feats;
	}
}