/* The following code was generated by JFlex 1.4.3 on 8/9/12 1:54 PM */

package com.rapleaf.jack.util;
import java.io.IOException;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 8/9/12 1:54 PM from the specification file
 * <tt>src/jflex/mysql.flex</tt>
 */
class MysqlFlex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0, 15, 15, 17,  0,  0, 16,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    44, 45, 19,  0,  0,  0, 40, 20, 28, 29, 36, 34, 25, 35, 23, 37, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 26, 27, 38, 22, 39,  0, 
     0,  8,  1,  1, 42,  6,  7,  1,  1, 41,  1, 12,  9,  1, 11, 13, 
     1,  1,  4, 10,  3,  5,  1, 14, 43,  1,  1, 30, 18, 31, 46, 24, 
    47,  8,  1,  1, 42,  6,  7,  1,  1, 41,  1, 12,  9,  1, 11, 13, 
     1,  1,  4, 10,  3,  5,  1, 14, 43,  1,  1, 32, 21, 33,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\4\2\2\4\2\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\2\2\1\31\1\32\1\1\1\0\1\3"+
    "\3\2\1\33\1\4\1\5\1\34\1\5\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\2\1\47\1\2\1\50\1\0\1\3\1\0\1\51"+
    "\1\2\1\52\1\5\1\0\1\34\1\5\1\0\1\35"+
    "\1\0\1\53\1\54\1\55\15\0\1\56\6\0\1\57"+
    "\1\0\1\60\1\0\1\61\16\0\1\62\1\0\1\63"+
    "\2\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[120];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\60"+
    "\0\u02d0\0\60\0\60\0\60\0\60\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\u0300\0\u0330\0\u0360\0\u0390"+
    "\0\u03c0\0\u03f0\0\60\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0"+
    "\0\u0510\0\140\0\60\0\u0540\0\60\0\u0570\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\60\0\60\0\60"+
    "\0\u05a0\0\140\0\u05d0\0\60\0\u0600\0\u0630\0\u0630\0\140"+
    "\0\u0660\0\u0690\0\u06c0\0\u06f0\0\u01e0\0\u0720\0\u0750\0\u0210"+
    "\0\u0780\0\140\0\60\0\140\0\u07b0\0\u07e0\0\u0810\0\u0840"+
    "\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0"+
    "\0\u09f0\0\60\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0\0\u0b10"+
    "\0\60\0\u0b40\0\60\0\u0b70\0\60\0\u0ba0\0\u0bd0\0\u0c00"+
    "\0\u0c30\0\u0c60\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80"+
    "\0\u0db0\0\u0de0\0\u0e10\0\60\0\u0e40\0\60\0\u0e70\0\u0ea0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[120];
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
    "\1\2\1\3\1\4\5\3\1\5\1\6\1\3\1\7"+
    "\1\3\1\10\1\3\1\11\1\12\1\11\1\2\1\13"+
    "\1\14\1\15\1\16\1\17\1\2\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\3\1\41"+
    "\1\11\1\42\1\43\1\44\61\0\16\3\11\0\1\3"+
    "\20\0\3\3\6\0\1\4\3\0\1\45\16\0\1\45"+
    "\1\0\1\46\31\0\12\3\1\47\3\3\11\0\1\3"+
    "\20\0\3\3\5\0\16\3\11\0\1\3\20\0\1\50"+
    "\2\3\5\0\14\3\1\51\1\3\11\0\1\3\20\0"+
    "\3\3\5\0\3\3\1\52\12\3\11\0\1\3\20\0"+
    "\3\3\23\0\1\11\1\0\1\11\32\0\1\11\24\0"+
    "\1\53\36\0\20\13\2\0\1\54\1\55\34\13\20\14"+
    "\2\0\1\56\1\14\1\57\33\14\25\0\1\60\60\0"+
    "\1\61\33\0\1\46\103\0\1\62\57\0\1\63\17\0"+
    "\1\64\1\65\36\0\1\66\20\0\1\67\60\0\1\70"+
    "\10\0\11\3\1\71\1\72\3\3\11\0\1\3\20\0"+
    "\3\3\5\0\14\3\1\73\1\3\11\0\1\3\20\0"+
    "\3\3\32\0\1\74\32\0\1\75\1\0\14\75\32\0"+
    "\3\75\6\0\1\76\22\0\2\77\13\0\1\77\17\0"+
    "\1\46\3\0\1\45\16\0\1\45\33\0\16\3\11\0"+
    "\1\3\20\0\1\3\1\100\1\3\5\0\13\3\1\101"+
    "\2\3\11\0\1\3\20\0\3\3\5\0\2\3\1\102"+
    "\13\3\11\0\1\3\20\0\3\3\4\0\17\13\1\103"+
    "\2\104\1\54\1\105\30\13\1\103\3\13\17\14\1\106"+
    "\2\107\1\56\1\14\1\110\27\14\1\106\3\14\1\0"+
    "\16\3\11\0\1\3\20\0\3\3\1\111\4\0\3\3"+
    "\1\112\12\3\11\0\1\3\20\0\3\3\5\0\16\75"+
    "\11\0\1\75\20\0\3\75\3\0\1\113\2\0\1\76"+
    "\56\0\5\3\1\114\10\3\11\0\1\3\20\0\3\3"+
    "\5\0\16\3\11\0\1\3\20\0\3\3\1\115\3\0"+
    "\17\13\1\103\2\104\1\54\1\55\30\13\1\103\3\13"+
    "\17\0\3\104\1\13\31\0\1\104\3\0\17\14\1\106"+
    "\2\107\1\56\1\14\1\57\27\14\1\106\3\14\17\0"+
    "\3\107\1\14\31\0\1\107\6\0\1\116\1\0\1\117"+
    "\1\0\1\120\3\0\1\121\55\0\1\122\37\0\1\123"+
    "\12\0\1\124\66\0\1\125\54\0\1\126\54\0\1\127"+
    "\7\0\1\130\113\0\1\131\21\0\1\132\51\0\1\133"+
    "\66\0\1\134\54\0\1\135\57\0\1\136\51\0\1\137"+
    "\70\0\1\140\51\0\1\141\64\0\1\142\56\0\1\133"+
    "\56\0\1\143\122\0\1\144\11\0\1\145\66\0\1\146"+
    "\45\0\1\147\1\0\1\150\1\0\1\151\3\0\1\152"+
    "\62\0\1\153\45\0\1\154\66\0\1\155\54\0\1\156"+
    "\54\0\1\157\65\0\1\141\51\0\1\160\66\0\1\161"+
    "\54\0\1\162\57\0\1\163\54\0\1\164\64\0\1\165"+
    "\56\0\1\160\56\0\1\166\63\0\1\167\60\0\1\170"+
    "\54\0\1\164\44\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3792];
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
    "\1\0\1\11\15\1\1\11\1\1\13\11\6\1\1\11"+
    "\1\1\1\0\5\1\1\11\1\1\1\11\1\1\12\11"+
    "\3\1\1\11\1\0\1\1\1\0\4\1\1\0\2\1"+
    "\1\0\1\1\1\0\1\1\1\11\1\1\15\0\1\11"+
    "\6\0\1\11\1\0\1\11\1\0\1\11\16\0\1\11"+
    "\1\0\1\11\2\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[120];
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

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  MysqlFlex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  MysqlFlex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
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
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
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
  public Token yylex() throws java.io.IOException {
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
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


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
        case 3: 
          { return (new Token(64,yytext()));
          }
        case 52: break;
        case 16: 
          { return (new Token(7,yytext()));
          }
        case 53: break;
        case 1: 
          { throw new IOException("Unmatched character");
          }
        case 54: break;
        case 5: 
          { String str =  yytext().substring(1,yytext().length());
    throw new IOException("Unclosed string");
          }
        case 55: break;
        case 35: 
          { return (new Token(15,yytext()));
          }
        case 56: break;
        case 45: 
          { return (new Token(24,yytext()));
          }
        case 57: break;
        case 47: 
          { return (new Token(42,yytext()));
          }
        case 58: break;
        case 25: 
          { return (new Token(33,yytext()));
          }
        case 59: break;
        case 9: 
          { return (new Token(0,yytext()));
          }
        case 60: break;
        case 23: 
          { return (new Token(18,yytext()));
          }
        case 61: break;
        case 43: 
          { return (new Token(27,yytext()));
          }
        case 62: break;
        case 28: 
          { return (new Token(60,yytext()));
          }
        case 63: break;
        case 37: 
          { return (new Token(36,yytext()));
          }
        case 64: break;
        case 12: 
          { return (new Token(3,yytext()));
          }
        case 65: break;
        case 19: 
          { return (new Token(11,yytext()));
          }
        case 66: break;
        case 24: 
          { return (new Token(20,yytext()));
          }
        case 67: break;
        case 40: 
          { return (new Token(39,yytext()));
          }
        case 68: break;
        case 15: 
          { return (new Token(6,yytext()));
          }
        case 69: break;
        case 7: 
          { return (new Token(14,yytext()));
          }
        case 70: break;
        case 2: 
          { return (new Token(66,yytext()));
          }
        case 71: break;
        case 30: 
          { return (new Token(23,yytext()));
          }
        case 72: break;
        case 48: 
          { return (new Token(32,yytext()));
          }
        case 73: break;
        case 8: 
          { return (new Token(9,yytext()));
          }
        case 74: break;
        case 50: 
          { return (new Token(41,yytext()));
          }
        case 75: break;
        case 41: 
          { return (new Token(26,yytext()));
          }
        case 76: break;
        case 33: 
          { return (new Token(17,yytext()));
          }
        case 77: break;
        case 34: 
          { return (new Token(35,yytext()));
          }
        case 78: break;
        case 49: 
          { return (new Token(44,yytext()));
          }
        case 79: break;
        case 11: 
          { return (new Token(2,yytext()));
          }
        case 80: break;
        case 18: 
          { return (new Token(10,yytext()));
          }
        case 81: break;
        case 42: 
          { return (new Token(29,yytext()));
          }
        case 82: break;
        case 29: 
          { return (new Token(62,yytext()));
          }
        case 83: break;
        case 14: 
          { return (new Token(5,yytext()));
          }
        case 84: break;
        case 31: 
          { return (new Token(38,yytext()));
          }
        case 85: break;
        case 21: 
          { return (new Token(13,yytext()));
          }
        case 86: break;
        case 38: 
          { return (new Token(22,yytext()));
          }
        case 87: break;
        case 17: 
          { return (new Token(8,yytext()));
          }
        case 88: break;
        case 51: 
          { return (new Token(40,yytext()));
          }
        case 89: break;
        case 22: 
          { return (new Token(16,yytext()));
          }
        case 90: break;
        case 27: 
          { return (new Token(25,yytext()));
          }
        case 91: break;
        case 26: 
          { return (new Token(34,yytext()));
          }
        case 92: break;
        case 46: 
          { return (new Token(43,yytext()));
          }
        case 93: break;
        case 10: 
          { return (new Token(1,yytext()));
          }
        case 94: break;
        case 36: 
          { return (new Token(19,yytext()));
          }
        case 95: break;
        case 39: 
          { return (new Token(28,yytext()));
          }
        case 96: break;
        case 32: 
          { return (new Token(37,yytext()));
          }
        case 97: break;
        case 13: 
          { return (new Token(4,yytext()));
          }
        case 98: break;
        case 20: 
          { return (new Token(12,yytext()));
          }
        case 99: break;
        case 44: 
          { String str = yytext().substring(1,yytext().length()-1);
    return (new Token(66,str));
          }
        case 100: break;
        case 6: 
          { return (new Token(21,yytext()));
          }
        case 101: break;
        case 4: 
          { 
          }
        case 102: break;
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
