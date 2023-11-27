import java.io;
class NumberOfCharachtersLinesAndWords
{
	public static void main(String[]args)throws IOException
	{
	FileReader fr= new FileReader("java.txt");
	int chars = -1 , lines =0, words =0;
	int c = fr.read();
	while(c !=-1)
	{
		chars++;
		if(c == '\n')
		{
			lines++;
		
			words++;
		}
		if( c == ' ')
		{
			words++;
		}
		c = fr.read();
	}
		System.out.println("Chars:"+chars+",Lines"+lines+"and words:"+words);
		
	}
}
