package simplenlg.lexicon.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;

import simplenlg.framework.LexicalCategory;
import simplenlg.framework.WordElement;
import simplenlg.lexicon.Lexicon;
import simplenlg.lexicon.NIHDBLexicon;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import simplenlg.format.english.TextFormatter;
import simplenlg.framework.DocumentElement;
import simplenlg.framework.NLGElement;
import simplenlg.phrasespec.NPPhraseSpec;
import simplenlg.phrasespec.PPPhraseSpec;
import simplenlg.phrasespec.SPhraseSpec;
import simplenlg.features.Feature; 

import simplenlg.lexicon.util.NIHLexiconXMLDumpUtil;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NIHLexiconXMLDumpUtilTest {
/*
	public NIHLexiconXMLDumpUtilTest(String name) {
		super(name);
	}

	@Before
	public void setUp() {
		super.setUp();
	}

	@Override
	@After
	public void tearDown() {
		super.tearDown();
	}
*/
	@Test
	public void testNotEnoughArguments() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setErr(new PrintStream(outContent));
		
		NIHLexiconXMLDumpUtil.main(new String[] {});
				
		String output = "Insuffient number of arguments supplied. Please supply the following Arguments: \n\n" + "\t\t 1. The full path to the NIHDB Lexicon database file e.g. C:\\NIHDB\\lexAccess2009 \n" + "\t\t 2. The full path to the list of baseforms and POS tags to include in the written out XML Lexicon file\n" + "\t\t 3. The full path to the XML file that the XML Lexicon will be written out to.\n";
		Assert.assertEquals(output, outContent.toString());
	}

}
