package ca.sheridancollege.searchWord;

import ArrayDetails.Details;
import ca.sheridancollege.FillArray.Fill;
import ca.sheridancollege.word.Word;

public class SearchColrev {
public int searchColRev(Word w)
	
	{   System.out.println(w.getWord());
	    System.out.println(Details.side);
	   int d=Details.side;
	    int res=0;
	    for(int i=d,r=d;i>0;i--)
	    {
	    	for(int j=d;j>0;j--)
	    	{ int h=0;
	    	   res=1;
	    	   while(h<w.getWord().length&&res==1)
	    	   {
	    		if(w.getWord()[h]==Fill.getA()[i][j])
	    		{   ++h;
	    		    r=i;
	    		    
	    		    while(h<w.getWord().length&&res==1)
	    		    {
	    		    	--r;
	    		    	
	    			  if(w.getWord()[h]==Fill.getA()[r][j])
	    			      {
	    			           ++h;	res=1;
	    			             if(h==w.getWord().length)
	    			                    {
	    				                       i=0;
	    				                       j=0;
	    			                     }
	    			   
	    			   
	    			      }
	    			      else
	    			         { res=0;}
	    		    }
	    		}
	    		else 
	    		{res=0;}
	    	   }
	    	}
	    }
	    
		return res;
	}


}
