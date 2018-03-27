public class Instruments
{
	private String[] instruments;
	private String selInstrument;

	public Instruments()
	{
		setList();
	}

	private void setList()
	{
		instruments = new String[10];
		instruments[0] = "Bagpipes (Wind)";
		instruments[1] = "Drum (Percussion)";
		instruments[2] = "Dulcimer (String)";
		instruments[3] = "Flute (Wind)";
		instruments[4] = "Lute (String)";
		instruments[5] = "Lyre (String)";
		instruments[6] = "Horn (Wind)";
		instruments[7] = "Pan flute (Wind)";
		instruments[8] = "Shawm (Wind)";
		instruments[9] = "Viol (String)";
	}

	public void listInstr()
	{
		for(int i = 0; i < instruments.length; i++)
		{
			System.out.println((i + 1) + ". " + instruments[i]);
		}
	}

	public void setInstr(int slot)
	{
		selInstrument = instruments[slot];
	}

	public String getInstr()
	{
		return selInstrument;
	}
}