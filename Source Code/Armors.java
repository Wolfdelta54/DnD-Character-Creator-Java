public class Armors
{
    private String[] light;
    private String[] medium;
    private String[] heavy;

    private int[] lightAC;
    private int[] mediumAC;
    private int[] heavyAC;

    private int totalAC;

    private String shield;

    private int shieldAC;
    private int dexMod;

    private String[] equiped;
    private int[] equipedAC;

    public Armors()
    {
        equiped = new String[0];
        equipedAC = new int[0];
    }

    public void setDex(int mod)
    {
        dexMod = mod;
    }

    public void setLength(int len)
    {
        equiped = new String[len];
        equipedAC = new int[len];
    }

    public void setLists()
    {
        light = new String[3];
        light[0]  = "Padded";
        light[1]  = "Leather";
        light[2]  = "Studded Leather";

        lightAC = new int[3];
        lightAC[0] = 11 + dexMod;
        lightAC[1] = 11 + dexMod;
        lightAC[2] = 12 + dexMod;

        medium = new String[5];
        medium[0] = "Hide";
        medium[1] = "Chain Shirt";
        medium[2] = "Scale Mail";
        medium[3] = "Breastplate";
        medium[4] = "Half Plate";

        mediumAC = new int[5];
        mediumAC[0] = 12 + dexMod;
        mediumAC[1] = 13 + dexMod;
        mediumAC[2] = 14 + dexMod;
        mediumAC[3] = 14 + dexMod;
        mediumAC[4] = 15 + dexMod;

        heavy = new String[4];
        heavy[0]  = "Ring Mail";
        heavy[1]  = "Chain Mail";
        heavy[2]  = "Splint";
        heavy[3]  = "Plate";

        heavyAC = new int[4];
        heavyAC[0] = 14;
        heavyAC[1] = 16;
        heavyAC[2] = 17;
        heavyAC[3] = 18;

        shield = "Shield";
        shieldAC = 2;
    }

    public void setSel(String cate, int selSlot, int listSlot)
    {
        if(cate.equalsIgnoreCase("light"))
        {
            equiped[listSlot] = light[selSlot];
            equipedAC[listSlot] = lightAC[selSlot];
        }
        else if(cate.equalsIgnoreCase("medium"))
        {
            equiped[listSlot] = medium[selSlot];
            equipedAC[listSlot] = mediumAC[selSlot];
        }
        else if(cate.equalsIgnoreCase("heavy")  )
        {
            equiped[listSlot] = heavy[selSlot];
            equipedAC[listSlot] = heavyAC[selSlot];
        }
        else if(cate.equalsIgnoreCase("shield"))
        {
            equiped[listSlot] = shield;
            equipedAC[listSlot] = shieldAC;
        }
        else
        {
            equiped[listSlot] = "none";
            equipedAC[listSlot] = 0;
        }
    }

    public int getTotalAC()
    {
        totalAC = 0;

        if(equiped.length != 0)
            for(int i = 0; i < equiped.length; i++)
            {
                totalAC = totalAC + equipedAC[i];
            }

        return totalAC;
    }

    public String getArmor()
    {
        String armor = "";
        if(!equiped[0].equalsIgnoreCase("shield"))
            armor = equiped[0];

        for(int i = 1; i < equiped.length; i++)
        {
            if(!equiped[i].equalsIgnoreCase("shield") && !equiped[0].equalsIgnoreCase("shield"))
                armor = armor + ", " + equiped[i];
            else if(!equiped[i].equalsIgnoreCase("shield"))
                armor = equiped[i];
        }

        return armor;
    }
}