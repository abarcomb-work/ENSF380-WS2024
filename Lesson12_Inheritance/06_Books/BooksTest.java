package edu.ucalgary.oop;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import static org.junit.Assume.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.jupiter.api.extension.ExtendWith;
import jdk.jfr.Timestamp;
import java.lang.reflect.Method;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


/*
The following are a selection of tests to get you started with checking your Books.java implementation. Feel free to add your own!
*/


public class BooksTest{
    
    String isbn = "0987654321";
    int pages = 10;

	public BooksTest(){
	}

    @Test
    public void checkRelationship_AnthologyCoverArt(){
       Anthology anthology = new Anthology();
       String expected = "Method coverArt called from Anthology";
       assertEquals("Expected statement was not returned from coverArt() in the Anthology class: ", expected,anthology.coverArt());        
    }

    @Test
    public void testAnthology_DefaultConstructor(){
        
        Anthology newAnthology = new Anthology();
        assertNotNull("Default constructor failed, new Anthology object is null: ", newAnthology);
    }

    @Test
    public void testAnthology_InheritedConstructor(){
        
        Anthology newAnthology = new Anthology(isbn, pages);
        assertNotNull("Inherited constructor failed, new Anthology object is null: ", newAnthology);
    }

    @Test
    public void testPaperbackCoverArt(){
     
        Nonfiction newNF = new Nonfiction();
		String expected = "Method coverArt called from Paperback";
        assertEquals("Expected statement was not returned from coverArt() in the Paperback class: ", expected, newNF.coverArt());
        
    }

    @Test
    public void checkRelationship_NovelCoverArt(){
       Novel novel = new Novel();
       String expected = "Method coverArt called from Novel";
       assertEquals("Expected statement was not returned from coverArt() in the Novel class: ", expected,novel.coverArt());        
    }
	

    @Test
    public void testFictionGenre(){
     
        Anthology antho = new Anthology();
        String expected = "Method genre called from Fiction";
        assertEquals("Expected statement was not returned from genre() in the Fiction class: ", expected,antho.genre());
    }
	
    @Test
    public void checkRelationship_NonfictionTopic(){
        Nonfiction nonfiction = new Nonfiction();
        String expected = "Method topic called from Nonfiction";
        assertEquals("Expected statement was not returned from topic() in the Nonfiction class: ", expected,nonfiction.topic());        
    }

	

}
