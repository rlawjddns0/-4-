package sdfwfsdfag;


public class Song {
	String title;
	String article;
	String album;
	String[] composer;
	int year;
	int track;
	
	
	Song(String title,String article, String album, String []composer,int year,int track)
	{
		int len=composer.length;
		this.title=title;
		this.article=article;
		this.album=album;
		for(int i=0; i<composer.length; i++)
		    this.composer[i]=composer[i];
		this.year=year;
		this.track=track;
	}
	Song()
	{
		
	}
	
	void show()
	{
		System.out.println("����:"+title);
		System.out.println("����:"+article);
		System.out.println("����:"+album);
		    for(int i=0; i<composer.length;i++)
		      System.out.println("�۰�:"+composer[i]);
		System.out.println("�⵵:"+year);
		System.out.println("Ʈ��:"+track);
		
	}
	

}
