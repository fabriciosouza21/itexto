package com.fsm.itext.tests;

import java.time.Instant;

import com.fsm.itext.entities.Autor;
import com.fsm.itext.entities.BlogPost;
import com.fsm.itext.entities.Site;

public class Factory {
	public static BlogPost createBlogPost() {
		Autor autor = new Autor(1L,"autor1"); 
		Site site = new Site(1L,1L,true,autor,"https:","fabricio","https","test",10,Instant.now(),5);
		BlogPost blogPost = new BlogPost(1L,1L,5,"test",Instant.parse("2018-11-30T18:35:24.00Z"),Instant.parse("2018-11-30T18:35:24.00Z"),"test","https",0,5,true,1,10L,1L,"test",site);
		return blogPost;		
	}
	
}
