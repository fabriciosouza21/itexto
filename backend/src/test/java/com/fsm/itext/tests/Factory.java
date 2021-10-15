package com.fsm.itext.tests;

import java.time.Instant;

import com.fsm.itext.entities.BlogPost;
import com.fsm.itext.entities.Site;

public class Factory {
	public static BlogPost createBlogPost() {
		Site site = new Site(1L,1L,true,1L,"https:","fabricio","https","test",10,Instant.now(),5);
		BlogPost blogPost = new BlogPost(1L,1L,5,"test",Instant.parse("2018-11-30T18:35:24.00Z"),Instant.parse("2018-11-30T18:35:24.00Z"),"test","https",0,5,true,1,10L,1L,"test",site);
		return blogPost;		
	}
	
}
