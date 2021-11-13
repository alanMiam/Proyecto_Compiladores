// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/analizador/lex.flex

package analizador;
import static analizador.Tokens.*;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\1\1\5"+
    "\1\6\2\0\1\7\1\10\1\0\1\11\1\12\1\13"+
    "\1\14\1\1\1\15\1\0\1\16\12\17\1\0\1\20"+
    "\1\21\1\22\1\23\2\0\2\24\1\25\1\24\1\26"+
    "\1\27\5\24\1\30\1\31\1\24\1\32\2\24\1\33"+
    "\1\34\1\35\6\24\1\36\1\0\1\37\1\0\1\24"+
    "\1\0\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\2\24\1\51\1\52\1\53\1\54\2\24"+
    "\1\55\1\56\1\57\1\60\1\24\1\61\1\24\1\62"+
    "\1\24\1\63\1\64\1\65\7\0\1\3\u01a2\0\2\3"+
    "\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\1\1\4"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\16\3\20\1\21\1\22\12\20\1\23"+
    "\1\4\1\24\1\16\1\25\1\4\1\0\1\26\1\2"+
    "\5\20\1\27\4\20\1\30\5\20\1\0\11\20\1\31"+
    "\1\32\4\20\1\14\1\33\3\20\1\34\1\35\1\36"+
    "\3\20\1\37\1\40\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[89];
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
    "\0\0\0\66\0\154\0\66\0\242\0\66\0\330\0\u010e"+
    "\0\u0144\0\66\0\330\0\u017a\0\u01b0\0\u01e6\0\u021c\0\66"+
    "\0\u0252\0\242\0\u0288\0\u02be\0\u02f4\0\u032a\0\66\0\66"+
    "\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\u046e\0\u04a4\0\u04da"+
    "\0\u0510\0\u0546\0\66\0\u057c\0\66\0\66\0\66\0\66"+
    "\0\u05b2\0\66\0\u05e8\0\u061e\0\u0654\0\u068a\0\u06c0\0\u06f6"+
    "\0\u072c\0\u0762\0\u0798\0\u07ce\0\u0804\0\u02be\0\u083a\0\u0870"+
    "\0\u08a6\0\u08dc\0\u0912\0\u0948\0\u097e\0\u09b4\0\u09ea\0\u0a20"+
    "\0\u0a56\0\u0a8c\0\u0ac2\0\u0af8\0\u0b2e\0\u02be\0\u02be\0\u0b64"+
    "\0\u0b9a\0\u0bd0\0\u0c06\0\66\0\u02be\0\u0c3c\0\u0c72\0\u0ca8"+
    "\0\u02be\0\u02be\0\u02be\0\u0cde\0\u0d14\0\u0d4a\0\u02be\0\u02be"+
    "\0\u02be";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[89];
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
    "\1\2\1\3\1\4\1\0\1\3\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\3\24\1\25\4\24\1\26"+
    "\1\24\1\27\1\30\1\24\1\31\1\32\1\33\1\34"+
    "\1\35\2\24\1\36\1\37\1\40\4\24\1\41\1\24"+
    "\1\42\1\24\1\43\1\44\1\45\67\0\1\3\2\0"+
    "\1\3\103\0\1\46\65\0\1\47\53\0\1\50\72\0"+
    "\1\51\64\0\1\52\5\0\1\47\60\0\1\52\4\0"+
    "\1\47\61\0\1\53\3\0\1\47\62\0\1\17\67\0"+
    "\2\46\65\0\2\46\61\0\1\24\4\0\12\24\2\0"+
    "\23\24\22\0\1\24\4\0\7\24\1\54\2\24\2\0"+
    "\23\24\22\0\1\24\4\0\2\24\1\55\7\24\2\0"+
    "\17\24\1\56\3\24\22\0\1\24\4\0\12\24\2\0"+
    "\22\24\1\57\22\0\1\24\4\0\12\24\2\0\7\24"+
    "\1\60\13\24\22\0\1\24\4\0\12\24\2\0\14\24"+
    "\1\61\6\24\22\0\1\24\4\0\12\24\2\0\11\24"+
    "\1\62\11\24\22\0\1\24\4\0\12\24\2\0\1\63"+
    "\10\24\1\64\2\24\1\65\6\24\22\0\1\24\4\0"+
    "\12\24\2\0\5\24\1\66\5\24\1\67\7\24\22\0"+
    "\1\24\4\0\12\24\2\0\14\24\1\70\6\24\22\0"+
    "\1\24\4\0\12\24\2\0\1\71\22\24\22\0\1\24"+
    "\4\0\12\24\2\0\15\24\1\72\5\24\22\0\1\24"+
    "\4\0\12\24\2\0\7\24\1\73\13\24\67\0\1\50"+
    "\20\0\1\74\46\0\2\53\3\0\61\53\17\0\1\24"+
    "\4\0\6\24\1\75\3\24\2\0\23\24\22\0\1\24"+
    "\4\0\4\24\1\76\5\24\2\0\23\24\22\0\1\24"+
    "\4\0\12\24\2\0\15\24\1\77\5\24\22\0\1\24"+
    "\4\0\12\24\2\0\17\24\1\100\3\24\22\0\1\24"+
    "\4\0\12\24\2\0\1\101\22\24\22\0\1\24\4\0"+
    "\12\24\2\0\20\24\1\102\2\24\22\0\1\24\4\0"+
    "\12\24\2\0\16\24\1\103\4\24\22\0\1\24\4\0"+
    "\12\24\2\0\11\24\1\104\11\24\22\0\1\24\4\0"+
    "\12\24\2\0\14\24\1\105\6\24\22\0\1\24\4\0"+
    "\12\24\2\0\15\24\1\106\5\24\22\0\1\24\4\0"+
    "\12\24\2\0\17\24\1\107\3\24\22\0\1\24\4\0"+
    "\12\24\2\0\13\24\1\110\7\24\22\0\1\24\4\0"+
    "\12\24\2\0\10\24\1\111\12\24\22\0\1\24\4\0"+
    "\12\24\2\0\20\24\1\112\2\24\22\0\1\24\4\0"+
    "\12\24\2\0\10\24\1\113\12\24\15\0\1\114\4\0"+
    "\1\74\65\0\1\24\4\0\5\24\1\115\4\24\2\0"+
    "\23\24\22\0\1\24\4\0\2\24\1\116\7\24\2\0"+
    "\23\24\22\0\1\24\4\0\12\24\2\0\10\24\1\117"+
    "\12\24\22\0\1\24\4\0\12\24\2\0\4\24\1\107"+
    "\16\24\22\0\1\24\4\0\12\24\2\0\15\24\1\107"+
    "\5\24\22\0\1\24\4\0\12\24\2\0\1\24\1\120"+
    "\21\24\22\0\1\24\4\0\12\24\2\0\4\24\1\121"+
    "\16\24\22\0\1\24\4\0\12\24\2\0\16\24\1\112"+
    "\4\24\22\0\1\24\4\0\12\24\2\0\1\67\22\24"+
    "\22\0\1\24\4\0\12\24\2\0\6\24\1\107\14\24"+
    "\22\0\1\24\4\0\12\24\2\0\13\24\1\122\7\24"+
    "\22\0\1\24\4\0\12\24\2\0\4\24\1\123\16\24"+
    "\22\0\1\24\4\0\12\24\2\0\11\24\1\124\11\24"+
    "\22\0\1\24\4\0\1\24\1\125\10\24\2\0\23\24"+
    "\22\0\1\24\4\0\12\24\2\0\13\24\1\126\7\24"+
    "\22\0\1\24\4\0\12\24\2\0\11\24\1\100\11\24"+
    "\22\0\1\24\4\0\12\24\2\0\4\24\1\127\16\24"+
    "\22\0\1\24\4\0\11\24\1\130\2\0\23\24\22\0"+
    "\1\24\4\0\12\24\2\0\6\24\1\131\14\24\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3456];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\1\1\1\11\3\1\1\11"+
    "\5\1\1\11\6\1\2\11\12\1\1\11\1\1\4\11"+
    "\1\0\1\11\21\1\1\0\17\1\1\11\15\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[89];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return ERROR;
            }
            // fall through
          case 34: break;
          case 2:
            { /*Ignore*/
            }
            // fall through
          case 35: break;
          case 3:
            { return Linea;
            }
            // fall through
          case 36: break;
          case 4:
            { lexeme=yytext(); return Op_logico;
            }
            // fall through
          case 37: break;
          case 5:
            { lexeme=yytext(); return Comillas;
            }
            // fall through
          case 38: break;
          case 6:
            { lexeme=yytext(); return Parentesis_a;
            }
            // fall through
          case 39: break;
          case 7:
            { lexeme=yytext(); return Parentesis_c;
            }
            // fall through
          case 40: break;
          case 8:
            { lexeme=yytext(); return Multiplicacion;
            }
            // fall through
          case 41: break;
          case 9:
            { lexeme=yytext(); return Suma;
            }
            // fall through
          case 42: break;
          case 10:
            { lexeme=yytext(); return Resta;
            }
            // fall through
          case 43: break;
          case 11:
            { lexeme=yytext(); return Division;
            }
            // fall through
          case 44: break;
          case 12:
            { lexeme=yytext(); return Numero;
            }
            // fall through
          case 45: break;
          case 13:
            { lexeme=yytext(); return P_coma;
            }
            // fall through
          case 46: break;
          case 14:
            { lexeme = yytext(); return Op_relacional;
            }
            // fall through
          case 47: break;
          case 15:
            { lexeme=yytext(); return Igual;
            }
            // fall through
          case 48: break;
          case 16:
            { lexeme=yytext(); return Identificador;
            }
            // fall through
          case 49: break;
          case 17:
            { lexeme = yytext(); return Corchete_a;
            }
            // fall through
          case 50: break;
          case 18:
            { lexeme = yytext(); return Corchete_c;
            }
            // fall through
          case 51: break;
          case 19:
            { lexeme=yytext(); return Llave_a;
            }
            // fall through
          case 52: break;
          case 20:
            { lexeme=yytext(); return Llave_c;
            }
            // fall through
          case 53: break;
          case 21:
            { lexeme = yytext(); return Op_atribucion;
            }
            // fall through
          case 54: break;
          case 22:
            { lexeme = yytext(); return Op_incremento;
            }
            // fall through
          case 55: break;
          case 23:
            { lexeme=yytext(); return Do;
            }
            // fall through
          case 56: break;
          case 24:
            { lexeme=yytext(); return If;
            }
            // fall through
          case 57: break;
          case 25:
            { lexeme=yytext(); return For;
            }
            // fall through
          case 58: break;
          case 26:
            { lexeme=yytext(); return T_dato;
            }
            // fall through
          case 59: break;
          case 27:
            { lexeme=yytext(); return FROM;
            }
            // fall through
          case 60: break;
          case 28:
            { lexeme=yytext(); return Else;
            }
            // fall through
          case 61: break;
          case 29:
            { lexeme=yytext(); return Main;
            }
            // fall through
          case 62: break;
          case 30:
            { lexeme = yytext(); return Op_booleano;
            }
            // fall through
          case 63: break;
          case 31:
            { lexeme=yytext(); return While;
            }
            // fall through
          case 64: break;
          case 32:
            { lexeme=yytext(); return SELECT;
            }
            // fall through
          case 65: break;
          case 33:
            { lexeme=yytext(); return Cadena;
            }
            // fall through
          case 66: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}