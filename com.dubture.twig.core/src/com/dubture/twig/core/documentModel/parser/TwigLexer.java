/* The following code was generated by JFlex 1.4.1 on 11/17/11 10:57 PM */

/******************************************************************************** 
 * Copyright (c) 2006 Zend Corporation and IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Zend and IBM - Initial implementation
 ********************************************************************************/

package com.dubture.twig.core.documentModel.parser;

import org.eclipse.php.internal.core.util.collections.IntHashtable;
import org.eclipse.wst.sse.core.utils.StringUtils;
import com.dubture.twig.core.util.Debug;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 11/17/11 10:57 PM from the specification file
 * <tt>highlighting_scanner.jflex</tt>
 */
public class TwigLexer extends com.dubture.twig.core.documentModel.parser.AbstractTwigLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ST_TWIG_DOUBLE_QUOTES = 4;
  public static final int ST_TWIG_IN_STATEMENT = 2;
  public static final int ST_TWIG_SINGLE_QUOTES = 5;
  public static final int YYINITIAL = 0;
  public static final int ST_TWIG_COMMENT = 7;
  public static final int ST_TWIG_HIGHLIGHTING_ERROR = 6;
  public static final int ST_TWIG_IN_STATEMENT_BODY = 3;
  public static final int ST_TWIG_IN_PRINT = 1;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\21\1\32\2\0\1\21\22\0\1\21\1\22\1\33\1\24"+
    "\1\22\1\26\1\22\1\30\5\22\1\23\2\22\12\2\1\22\1\0"+
    "\5\22\1\7\2\1\1\11\1\12\1\13\1\1\1\15\1\6\2\1"+
    "\1\17\1\1\1\3\1\4\2\1\1\16\1\10\1\5\2\1\1\14"+
    "\1\1\1\20\1\1\1\22\1\31\2\22\1\1\1\0\1\7\2\1"+
    "\1\11\1\12\1\13\1\1\1\15\1\6\2\1\1\17\1\1\1\3"+
    "\1\4\2\1\1\16\1\10\1\5\2\1\1\14\1\1\1\20\1\1"+
    "\1\27\1\22\1\25\1\22\201\1\uff00\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\10\0\1\1\1\2\1\3\6\2\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\7\12\1\13\1\1\1\6\1\1"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1"+
    "\2\2\1\23\3\2\1\24\1\0\1\25\3\0\2\12"+
    "\1\23\3\12\1\26\1\27\1\30\3\2\3\12\1\2"+
    "\1\12\1\2\1\12";

  private static int [] zzUnpackAction() {
    int [] result = new int[73];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\34\0\70\0\124\0\160\0\214\0\250\0\304"+
    "\0\0\0\340\0\374\0\u0118\0\u0134\0\u0150\0\u016c\0\u0188"+
    "\0\u01a4\0\u01c0\0\0\0\u01dc\0\0\0\u01f8\0\u0214\0\u0230"+
    "\0\u024c\0\u0268\0\u0284\0\u02a0\0\u02bc\0\u02d8\0\0\0\u02f4"+
    "\0\0\0\u0310\0\u032c\0\0\0\u0348\0\0\0\0\0\u0364"+
    "\0\u0380\0\u039c\0\u03b8\0\u03d4\0\340\0\u03f0\0\u040c\0\u0428"+
    "\0\u0444\0\u01f8\0\0\0\u0460\0\u0214\0\u047c\0\u0498\0\u04b4"+
    "\0\u0230\0\u04d0\0\u04ec\0\u0508\0\u0524\0\u0540\0\u055c\0\u0578"+
    "\0\u0594\0\u05b0\0\u05cc\0\u05e8\0\u0604\0\u0620\0\u063c\0\u0658"+
    "\0\u0674";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[73];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\34\0\1\11\1\12\1\13\1\14\1\15\1\12\1\16"+
    "\1\17\1\12\1\20\2\12\1\21\4\12\1\22\2\23"+
    "\1\11\1\24\1\11\1\25\1\26\1\11\1\22\1\27"+
    "\1\11\1\30\1\11\1\31\1\32\1\30\1\33\1\34"+
    "\1\30\1\35\2\30\1\36\4\30\2\11\1\37\2\11"+
    "\1\40\3\11\1\0\2\11\1\12\1\13\1\14\1\15"+
    "\1\12\1\16\1\17\1\12\1\20\2\12\1\21\4\12"+
    "\1\22\2\23\1\11\1\41\1\42\1\25\1\26\1\11"+
    "\1\22\1\27\33\43\1\44\30\45\1\46\3\45\21\47"+
    "\1\50\10\47\1\50\1\47\24\51\1\52\7\51\1\0"+
    "\20\12\15\0\1\13\32\0\3\12\1\53\14\12\14\0"+
    "\2\12\1\54\12\12\1\55\2\12\14\0\2\12\1\55"+
    "\4\12\1\55\10\12\14\0\2\12\1\56\4\12\1\55"+
    "\10\12\14\0\11\12\1\57\6\12\14\0\5\12\1\60"+
    "\12\12\34\0\1\22\10\0\1\22\26\0\1\61\6\0"+
    "\30\62\1\63\1\64\2\62\31\65\1\66\1\65\1\63"+
    "\1\0\20\30\14\0\3\30\1\67\14\30\14\0\2\30"+
    "\1\70\12\30\1\71\2\30\14\0\2\30\1\71\4\30"+
    "\1\71\10\30\14\0\2\30\1\72\4\30\1\71\10\30"+
    "\14\0\11\30\1\73\6\30\14\0\5\30\1\74\12\30"+
    "\40\0\1\75\33\0\1\76\6\0\33\43\1\0\30\45"+
    "\1\0\3\45\21\0\1\50\10\0\1\50\1\0\24\51"+
    "\1\0\7\51\25\0\1\77\7\0\4\12\1\55\13\12"+
    "\14\0\16\12\1\100\1\12\14\0\10\12\1\55\7\12"+
    "\14\0\12\12\1\101\5\12\14\0\4\12\1\102\13\12"+
    "\34\0\1\61\10\0\1\61\1\0\32\62\1\0\1\62"+
    "\32\65\1\0\1\65\1\0\4\30\1\71\13\30\14\0"+
    "\16\30\1\103\1\30\14\0\10\30\1\71\7\30\14\0"+
    "\12\30\1\104\5\30\14\0\4\30\1\105\13\30\34\0"+
    "\1\75\10\0\1\75\22\0\1\76\10\0\1\76\22\0"+
    "\1\77\10\0\1\77\2\0\17\12\1\55\14\0\5\12"+
    "\1\106\12\12\14\0\14\12\1\55\3\12\14\0\17\30"+
    "\1\71\14\0\5\30\1\107\12\30\14\0\14\30\1\71"+
    "\3\30\14\0\2\12\1\110\15\12\14\0\2\30\1\111"+
    "\15\30\14\0\11\12\1\56\6\12\14\0\11\30\1\72"+
    "\6\30\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1680];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\10\7\0\1\11\11\1\1\11\1\1\1\11\11\1"+
    "\1\11\1\1\1\11\2\1\1\11\1\1\2\11\12\1"+
    "\1\0\1\11\3\0\23\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[73];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
    public TwigLexer(int state){
        initialize(state);
    }
    public void reset(char array[], int offset, int length) {
        this.zzBuffer = array;
        this.zzCurrentPos = offset;
        this.zzMarkedPos = offset;
        this.zzPushbackPos = offset;
        this.yychar = offset;
        this.zzEndRead = offset + length;
        this.zzStartRead = offset;
        this.zzAtEOF = zzCurrentPos >= zzEndRead;
        this.firstPos = offset;
    }

    public void reset(java.io.Reader  reader, char[] buffer, int[] parameters){
    	this.zzReader = reader;
    	this.zzBuffer = buffer;
    	this.zzMarkedPos = parameters[0];
    	this.zzPushbackPos = parameters[1];
    	this.zzCurrentPos = parameters[2];
    	this.zzStartRead = parameters[3];
    	this.zzEndRead = parameters[4];
    	this.yyline = parameters[5];  
    	initialize(parameters[6]);
    }

    
    public int[] getParamenters(){
    	return new int[]{zzMarkedPos, zzPushbackPos, zzCurrentPos, zzStartRead, zzEndRead, yyline, zzLexicalState};
    }

    protected int getZZLexicalState() {
        return zzLexicalState;
    }

    protected int getZZMarkedPos() {
        return zzMarkedPos;
    }

    protected int getZZEndRead() {
        return zzEndRead;
    }

    public char[] getZZBuffer() {
        return zzBuffer;
    }
    
    protected int getZZStartRead() {
    	return this.zzStartRead;
    }

    protected int getZZPushBackPosition() {
    	return this.zzPushbackPos;
    }

	protected void pushBack(int i) {
		yypushback(i);
	}

	// A pool of states. To avoid creation of a new state on each createMemento.
	private static final IntHashtable lexerStates = new IntHashtable(100);
	
	protected IntHashtable getLexerStates() {
		return lexerStates;
	}
	
	private final void dump(String s) {
		if (Debug.debugTokenizer) {
			System.out.println("lexer: " + s + " (" + yychar + "-" + //$NON-NLS-2$//$NON-NLS-1$
				(yylength() + yychar) + "):\'" +//$NON-NLS-1$
					StringUtils.escape(yytext()) + "\'");//$NON-NLS-1$
		}
	}
	
	

 // End user code


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public TwigLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public TwigLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 152) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public String yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 24: 
          { if(Debug.debugTokenizer)
		dump("TWIG COMMENT CLOSE");
		

	return TWIG_COMMENT_CLOSE;
          }
        case 25: break;
        case 11: 
          { if(Debug.debugTokenizer)
		dump("TWIG MINUS");
    

	return TWIG_MINUS;
          }
        case 26: break;
        case 13: 
          { if(Debug.debugTokenizer)
		dump("TWIG DOUBLE QUOTES END");

	popState();
    return TWIG_DOUBLE_QUOTES_END;
          }
        case 27: break;
        case 23: 
          { if(Debug.debugTokenizer)
		dump("TWIG_STMT_CLOSE");

	popState();
	return TWIG_STMT_CLOSE;
          }
        case 28: break;
        case 17: 
          { popState();return TWIG_WHITESPACE;
          }
        case 29: break;
        case 1: 
          { if(Debug.debugTokenizer)
		dump("TWIG HIGHLIGHT ERROR");

	reportError();
    yypushback(1);
    pushState(ST_TWIG_HIGHLIGHTING_ERROR);
          }
        case 30: break;
        case 19: 
          { if(Debug.debugTokenizer)
		dump("TWIG KEYWORD");

	return TWIG_KEYWORD;
          }
        case 31: break;
        case 4: 
          { if(Debug.debugTokenizer)
		dump("TWIG WHITESPACE");

	return TWIG_WHITESPACE;
          }
        case 32: break;
        case 2: 
          { if(Debug.debugTokenizer)
		dump("TWIG LABEL");

	return TWIG_LABEL;
          }
        case 33: break;
        case 9: 
          { if(Debug.debugTokenizer)
		dump("TWIG DOUBLE QUOTES START");

	pushState(ST_TWIG_DOUBLE_QUOTES);
    return TWIG_DOUBLE_QUOTES_START;
          }
        case 34: break;
        case 22: 
          { if(Debug.debugTokenizer)
		dump("TWIG_STMT_CLOSE");

	return TWIG_STMT_CLOSE;
          }
        case 35: break;
        case 12: 
          { if(Debug.debugTokenizer)
		dump("TWIG DOUBLE QUOTES CONTENT");

    return TWIG_DOUBLE_QUOTES_CONTENT;
          }
        case 36: break;
        case 15: 
          { if(Debug.debugTokenizer)
		dump("TWIG DOUBLE QUOTES END");

	popState();
    return TWIG_SINGLE_QUOTES_END;
          }
        case 37: break;
        case 7: 
          { if(Debug.debugTokenizer)
		dump("TWIG JSON START");


    return TWIG_JSON_START;
          }
        case 38: break;
        case 5: 
          { if(Debug.debugTokenizer)
		dump("TWIG DELIMITER TOKEN");
	return TWIG_DELIMITER;
          }
        case 39: break;
        case 21: 
          { if(Debug.debugTokenizer)
		dump("TWIG_CONSTANT_ENCAPSED_STRING");

    return TWIG_CONSTANT_ENCAPSED_STRING;
          }
        case 40: break;
        case 20: 
          { if(Debug.debugTokenizer)
		dump("TWIG_CLOSETAG");

	return TWIG_CLOSETAG;
          }
        case 41: break;
        case 18: 
          { if(Debug.debugTokenizer)
		dump("TWIG COMMENT");

	return TWIG_COMMENT;
          }
        case 42: break;
        case 3: 
          { if(Debug.debugTokenizer)
		dump("TWIG NUMBER");

    return TWIG_NUMBER;
          }
        case 43: break;
        case 10: 
          { if(Debug.debugTokenizer)
		dump("TWIG KEYWORD");

	pushState(ST_TWIG_IN_STATEMENT_BODY);
	return TWIG_KEYWORD;
          }
        case 44: break;
        case 14: 
          { if(Debug.debugTokenizer)
		dump("TWIG SINGLE QUOTES CONTENT");

    return TWIG_SINGLE_QUOTES_CONTENT;
          }
        case 45: break;
        case 8: 
          { if(Debug.debugTokenizer)
		dump("TWIG DOUBLE QUOTES START");

	pushState(ST_TWIG_SINGLE_QUOTES);
    return TWIG_SINGLE_QUOTES_START;
          }
        case 46: break;
        case 6: 
          { if(Debug.debugTokenizer)
		dump("TWIG JSON END");

	//yybegin(ST_TWIG_JSON)

    return TWIG_JSON_END;
          }
        case 47: break;
        case 16: 
          { return UNKNOWN_TOKEN;
          }
        case 48: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
