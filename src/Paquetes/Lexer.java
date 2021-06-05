/* The following code was generated by JFlex 1.6.1 */

/*-------CODIGO DE USUARIO-----*/
package Paquetes;
import static Paquetes.Tokens.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Ronal/Documents/NetBeansProjects/Proyecto_Compiladores/src/Paquetes/Lexer.flex</tt>
 */
public class Lexer {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\1\1\47\1\47\1\1\22\0\1\1\1\0\1\36"+
    "\5\0\1\11\1\12\1\37\1\40\1\43\1\41\1\4\1\0\12\2"+
    "\1\45\1\44\1\0\1\35\2\0\1\5\1\23\1\13\1\26\1\16"+
    "\1\17\1\20\1\42\1\31\1\21\2\3\1\22\1\30\1\25\1\14"+
    "\1\34\1\3\1\15\1\46\1\32\1\27\4\3\1\33\4\0\1\24"+
    "\1\0\26\3\1\7\3\3\12\0\1\47\32\0\1\6\11\0\1\10"+
    "\12\0\1\10\4\0\1\10\5\0\27\10\1\0\37\10\1\0\u01ca\10"+
    "\4\0\14\10\16\0\5\10\7\0\1\10\1\0\1\10\21\0\165\10"+
    "\1\0\2\10\2\0\4\10\1\0\1\10\6\0\1\10\1\0\3\10"+
    "\1\0\1\10\1\0\24\10\1\0\123\10\1\0\213\10\1\0\255\10"+
    "\1\0\46\10\2\0\1\10\7\0\47\10\11\0\55\10\1\0\1\10"+
    "\1\0\2\10\1\0\2\10\1\0\1\10\10\0\33\10\5\0\3\10"+
    "\35\0\13\10\5\0\112\10\4\0\146\10\1\0\10\10\2\0\12\10"+
    "\1\0\23\10\2\0\1\10\20\0\73\10\2\0\145\10\16\0\66\10"+
    "\4\0\1\10\5\0\56\10\22\0\34\10\104\0\23\10\61\0\200\10"+
    "\2\0\12\10\1\0\23\10\1\0\10\10\2\0\2\10\2\0\26\10"+
    "\1\0\7\10\1\0\1\10\3\0\4\10\2\0\11\10\2\0\2\10"+
    "\2\0\4\10\10\0\1\10\4\0\2\10\1\0\5\10\2\0\14\10"+
    "\17\0\3\10\1\0\6\10\4\0\2\10\2\0\26\10\1\0\7\10"+
    "\1\0\2\10\1\0\2\10\1\0\2\10\2\0\1\10\1\0\5\10"+
    "\4\0\2\10\2\0\3\10\3\0\1\10\7\0\4\10\1\0\1\10"+
    "\7\0\20\10\13\0\3\10\1\0\11\10\1\0\3\10\1\0\26\10"+
    "\1\0\7\10\1\0\2\10\1\0\5\10\2\0\12\10\1\0\3\10"+
    "\1\0\3\10\2\0\1\10\17\0\4\10\2\0\12\10\21\0\3\10"+
    "\1\0\10\10\2\0\2\10\2\0\26\10\1\0\7\10\1\0\2\10"+
    "\1\0\5\10\2\0\11\10\2\0\2\10\2\0\3\10\10\0\2\10"+
    "\4\0\2\10\1\0\5\10\2\0\12\10\1\0\1\10\20\0\2\10"+
    "\1\0\6\10\3\0\3\10\1\0\4\10\3\0\2\10\1\0\1\10"+
    "\1\0\2\10\3\0\2\10\3\0\3\10\3\0\14\10\4\0\5\10"+
    "\3\0\3\10\1\0\4\10\2\0\1\10\6\0\1\10\16\0\12\10"+
    "\20\0\4\10\1\0\10\10\1\0\3\10\1\0\27\10\1\0\20\10"+
    "\3\0\10\10\1\0\3\10\1\0\4\10\7\0\2\10\1\0\2\10"+
    "\6\0\4\10\2\0\12\10\21\0\3\10\1\0\10\10\1\0\3\10"+
    "\1\0\27\10\1\0\12\10\1\0\5\10\2\0\11\10\1\0\3\10"+
    "\1\0\4\10\7\0\2\10\7\0\1\10\1\0\4\10\2\0\12\10"+
    "\1\0\2\10\16\0\3\10\1\0\10\10\1\0\3\10\1\0\51\10"+
    "\2\0\10\10\1\0\3\10\1\0\5\10\10\0\1\10\10\0\4\10"+
    "\2\0\12\10\12\0\6\10\2\0\2\10\1\0\22\10\3\0\30\10"+
    "\1\0\11\10\1\0\1\10\2\0\7\10\3\0\1\10\4\0\6\10"+
    "\1\0\1\10\1\0\10\10\6\0\12\10\2\0\2\10\15\0\72\10"+
    "\5\0\17\10\1\0\12\10\47\0\2\10\1\0\1\10\2\0\2\10"+
    "\1\0\1\10\2\0\1\10\6\0\4\10\1\0\7\10\1\0\3\10"+
    "\1\0\1\10\1\0\1\10\2\0\2\10\1\0\15\10\1\0\3\10"+
    "\2\0\5\10\1\0\1\10\1\0\6\10\2\0\12\10\2\0\4\10"+
    "\40\0\1\10\27\0\2\10\6\0\12\10\13\0\1\10\1\0\1\10"+
    "\1\0\1\10\4\0\12\10\1\0\44\10\4\0\24\10\1\0\22\10"+
    "\1\0\44\10\11\0\1\10\71\0\112\10\6\0\116\10\2\0\46\10"+
    "\1\0\1\10\5\0\1\10\2\0\53\10\1\0\u014d\10\1\0\4\10"+
    "\2\0\7\10\1\0\1\10\1\0\4\10\2\0\51\10\1\0\4\10"+
    "\2\0\41\10\1\0\4\10\2\0\7\10\1\0\1\10\1\0\4\10"+
    "\2\0\17\10\1\0\71\10\1\0\4\10\2\0\103\10\2\0\3\10"+
    "\40\0\20\10\20\0\125\10\14\0\u026c\10\2\0\21\10\1\6\32\10"+
    "\5\0\113\10\3\0\13\10\7\0\15\10\1\0\7\10\13\0\25\10"+
    "\13\0\24\10\14\0\15\10\1\0\3\10\1\0\2\10\14\0\124\10"+
    "\3\0\1\10\4\0\2\10\2\0\12\10\41\0\3\10\2\0\12\10"+
    "\6\0\130\10\10\0\53\10\5\0\106\10\12\0\37\10\1\0\14\10"+
    "\4\0\14\10\12\0\50\10\2\0\5\10\13\0\54\10\4\0\32\10"+
    "\6\0\12\10\46\0\34\10\4\0\77\10\1\0\35\10\2\0\13\10"+
    "\6\0\12\10\15\0\1\10\10\0\17\10\101\0\114\10\4\0\12\10"+
    "\21\0\11\10\14\0\164\10\14\0\70\10\10\0\12\10\3\0\61\10"+
    "\122\0\3\10\1\0\43\10\1\0\2\10\6\0\366\10\6\0\u011a\10"+
    "\2\0\6\10\2\0\46\10\2\0\6\10\2\0\10\10\1\0\1\10"+
    "\1\0\1\10\1\0\1\10\1\0\37\10\2\0\65\10\1\0\7\10"+
    "\1\0\1\10\3\0\3\10\1\0\7\10\3\0\4\10\2\0\6\10"+
    "\4\0\15\10\5\0\3\10\1\0\7\10\3\0\13\6\35\0\1\47"+
    "\1\47\5\0\1\6\17\0\2\10\23\0\1\10\12\0\1\6\21\0"+
    "\1\10\15\0\1\10\20\0\15\10\63\0\41\10\21\0\1\10\4\0"+
    "\1\10\2\0\12\10\1\0\1\10\3\0\5\10\6\0\1\10\1\0"+
    "\1\10\1\0\1\10\1\0\4\10\1\0\13\10\2\0\4\10\5\0"+
    "\5\10\4\0\1\10\21\0\51\10\u032d\0\64\10\u0716\0\57\10\1\0"+
    "\57\10\1\0\205\10\6\0\11\10\14\0\46\10\1\0\1\10\5\0"+
    "\1\10\2\0\70\10\7\0\1\10\17\0\30\10\11\0\7\10\1\0"+
    "\7\10\1\0\7\10\1\0\7\10\1\0\7\10\1\0\7\10\1\0"+
    "\7\10\1\0\7\10\1\0\40\10\57\0\1\10\u01d0\0\1\6\4\0"+
    "\3\10\31\0\17\10\1\0\5\10\2\0\5\10\4\0\126\10\2\0"+
    "\2\10\2\0\3\10\1\0\132\10\1\0\4\10\5\0\51\10\3\0"+
    "\136\10\21\0\33\10\65\0\20\10\u0200\0\u19b6\10\112\0\u51cd\10\63\0"+
    "\u048d\10\103\0\56\10\2\0\u010d\10\3\0\34\10\24\0\63\10\1\0"+
    "\12\10\1\0\37\10\1\0\123\10\45\0\11\10\2\0\147\10\2\0"+
    "\4\10\1\0\36\10\2\0\2\10\105\0\61\10\30\0\64\10\14\0"+
    "\105\10\13\0\12\10\6\0\30\10\3\0\1\10\4\0\56\10\2\0"+
    "\44\10\14\0\35\10\3\0\101\10\16\0\13\10\6\0\37\10\1\0"+
    "\67\10\11\0\16\10\2\0\12\10\6\0\27\10\3\0\111\10\30\0"+
    "\3\10\2\0\20\10\2\0\5\10\12\0\6\10\2\0\6\10\2\0"+
    "\6\10\11\0\7\10\1\0\7\10\1\0\53\10\1\0\4\10\4\0"+
    "\2\10\132\0\53\10\1\0\2\10\2\0\12\10\6\0\u2ba4\10\14\0"+
    "\27\10\4\0\61\10\u2104\0\u016e\10\2\0\152\10\46\0\7\10\14\0"+
    "\5\10\5\0\14\10\1\0\15\10\1\0\5\10\1\0\1\10\1\0"+
    "\2\10\1\0\2\10\1\0\154\10\41\0\u016b\10\22\0\100\10\2\0"+
    "\66\10\50\0\14\10\4\0\20\10\20\0\16\10\5\0\2\10\30\0"+
    "\3\10\40\0\5\10\1\0\207\10\23\0\12\10\7\0\32\10\4\0"+
    "\1\10\1\0\32\10\13\0\131\10\3\0\6\10\2\0\6\10\2\0"+
    "\6\10\2\0\3\10\43\0\14\10\1\0\32\10\1\0\23\10\1\0"+
    "\2\10\1\0\17\10\2\0\16\10\42\0\173\10\105\0\65\10\210\0"+
    "\1\10\202\0\35\10\3\0\61\10\17\0\1\10\37\0\40\10\20\0"+
    "\33\10\5\0\53\10\5\0\36\10\2\0\44\10\4\0\10\10\1\0"+
    "\5\10\52\0\236\10\2\0\12\10\126\0\50\10\10\0\64\10\234\0"+
    "\u0137\10\11\0\26\10\12\0\10\10\230\0\6\10\2\0\1\10\1\0"+
    "\54\10\1\0\2\10\3\0\1\10\2\0\27\10\12\0\27\10\11\0"+
    "\37\10\141\0\26\10\12\0\32\10\106\0\70\10\6\0\2\10\100\0"+
    "\4\10\1\0\2\10\5\0\10\10\1\0\3\10\1\0\33\10\4\0"+
    "\3\10\4\0\1\10\40\0\35\10\3\0\35\10\43\0\10\10\1\0"+
    "\36\10\31\0\66\10\12\0\26\10\12\0\23\10\15\0\22\10\156\0"+
    "\111\10\u03b7\0\107\10\37\0\12\10\17\0\74\10\25\0\31\10\7\0"+
    "\12\10\6\0\65\10\1\0\12\10\20\0\44\10\2\0\1\10\11\0"+
    "\105\10\13\0\13\10\45\0\22\10\1\0\45\10\170\0\73\10\5\0"+
    "\12\10\7\0\3\10\1\0\10\10\2\0\2\10\2\0\26\10\1\0"+
    "\7\10\1\0\2\10\1\0\5\10\2\0\11\10\2\0\2\10\2\0"+
    "\3\10\11\0\1\10\5\0\7\10\2\0\7\10\3\0\5\10\u010b\0"+
    "\106\10\1\0\1\10\10\0\12\10\246\0\66\10\2\0\11\10\77\0"+
    "\101\10\3\0\1\10\13\0\12\10\46\0\70\10\10\0\12\10\u01d6\0"+
    "\112\10\25\0\1\10\u01c0\0\71\10\u0507\0\u0399\10\147\0\157\10\u0b91\0"+
    "\u042f\10\u33d1\0\u0239\10\7\0\37\10\1\0\12\10\146\0\36\10\2\0"+
    "\5\10\13\0\67\10\11\0\4\10\14\0\12\10\11\0\25\10\5\0"+
    "\23\10\u0370\0\105\10\13\0\57\10\20\0\21\10\u4060\0\2\10\u0bfe\0"+
    "\153\10\5\0\15\10\3\0\11\10\7\0\12\10\3\0\2\10\u14c6\0"+
    "\5\10\3\0\6\10\10\0\10\10\2\0\7\10\36\0\4\10\224\0"+
    "\3\10\u01bb\0\125\10\1\0\107\10\1\0\2\10\2\0\1\10\2\0"+
    "\2\10\2\0\4\10\1\0\14\10\1\0\1\10\1\0\7\10\1\0"+
    "\101\10\1\0\4\10\2\0\10\10\1\0\7\10\1\0\34\10\1\0"+
    "\4\10\1\0\5\10\1\0\1\10\3\0\7\10\1\0\u0154\10\2\0"+
    "\31\10\1\0\31\10\1\0\37\10\1\0\31\10\1\0\37\10\1\0"+
    "\31\10\1\0\37\10\1\0\31\10\1\0\37\10\1\0\31\10\1\0"+
    "\10\10\2\0\62\10\u1000\0\305\10\13\0\7\10\u0529\0\4\10\1\0"+
    "\33\10\1\0\2\10\1\0\1\10\2\0\1\10\1\0\12\10\1\0"+
    "\4\10\1\0\1\10\1\0\1\10\6\0\1\10\4\0\1\10\1\0"+
    "\1\10\1\0\1\10\1\0\3\10\1\0\2\10\1\0\1\10\2\0"+
    "\1\10\1\0\1\10\1\0\1\10\1\0\1\10\1\0\1\10\1\0"+
    "\2\10\1\0\1\10\2\0\4\10\1\0\7\10\1\0\4\10\1\0"+
    "\4\10\1\0\1\10\1\0\12\10\1\0\21\10\5\0\3\10\1\0"+
    "\5\10\1\0\21\10\u0274\0\32\10\6\0\32\10\6\0\32\10\u0e76\0"+
    "\ua6d7\10\51\0\u1035\10\13\0\336\10\u3fe2\0\u021e\10\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u06ed\0"+
    "\360\10\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\1\1\4\1\2\1\4\1\5"+
    "\1\6\5\4\1\7\4\4\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\4\0\15\4\1\20\1\4"+
    "\1\0\15\4\1\21\2\4\2\0\4\4\1\0\11\4"+
    "\2\0\1\22\2\4\2\0\11\4\2\0\1\23\1\4"+
    "\3\0\3\4\1\0\3\4\1\0\1\24\2\0\1\4"+
    "\5\0\1\4\2\0\1\25\1\26\3\0\1\27\1\0"+
    "\1\4\1\30\1\0\1\31\3\0\1\32\6\0\1\33"+
    "\1\4\4\0\1\34\3\0\1\35\2\0\1\4\2\0"+
    "\1\36\2\0\1\37\4\0\1\40\1\41\10\0\1\42"+
    "\1\0\1\43\1\33\2\0\1\44\1\45\1\46\3\0"+
    "\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[190];
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
    "\0\0\0\50\0\120\0\170\0\240\0\310\0\360\0\50"+
    "\0\50\0\u0118\0\u0140\0\u0168\0\u0190\0\u01b8\0\240\0\u01e0"+
    "\0\u0208\0\u0230\0\u0258\0\50\0\50\0\50\0\50\0\50"+
    "\0\50\0\50\0\50\0\u0280\0\u02a8\0\310\0\u02d0\0\u02f8"+
    "\0\u0320\0\u0348\0\u0370\0\u0398\0\u03c0\0\u03e8\0\u0410\0\u0438"+
    "\0\u0460\0\u0488\0\u04b0\0\u04d8\0\u0280\0\u02a8\0\u0500\0\u0528"+
    "\0\u0550\0\u0578\0\u05a0\0\u05c8\0\u05f0\0\u0618\0\u0640\0\u0668"+
    "\0\u0690\0\u06b8\0\u06e0\0\u0708\0\240\0\u0730\0\u0758\0\u0780"+
    "\0\u07a8\0\u07d0\0\u07f8\0\u0820\0\u0848\0\u0870\0\u0898\0\u08c0"+
    "\0\u08e8\0\u0910\0\u0938\0\u0960\0\u0988\0\u09b0\0\u09d8\0\u0a00"+
    "\0\u0a28\0\240\0\u0a50\0\u0a78\0\u0aa0\0\u0ac8\0\u0af0\0\u0b18"+
    "\0\u0b40\0\u0b68\0\u0b90\0\u0bb8\0\u0be0\0\u0c08\0\u0c30\0\u0c58"+
    "\0\u0c80\0\240\0\u0ca8\0\u0cd0\0\u0cf8\0\u0d20\0\u0d48\0\u0d70"+
    "\0\u0d98\0\u0dc0\0\u0de8\0\u0e10\0\u0e38\0\u0e60\0\240\0\u0e88"+
    "\0\u0eb0\0\u0ed8\0\u0f00\0\u0f28\0\u0f50\0\u0f78\0\u0fa0\0\u0fc8"+
    "\0\u0ff0\0\u1018\0\240\0\240\0\u1040\0\u1068\0\u1090\0\50"+
    "\0\u10b8\0\u10e0\0\50\0\u1108\0\50\0\u1130\0\u1158\0\u1180"+
    "\0\240\0\u11a8\0\u11d0\0\u11f8\0\u1220\0\u1248\0\u1270\0\u1298"+
    "\0\u12c0\0\u12e8\0\u1310\0\u1338\0\u1360\0\50\0\u1388\0\u13b0"+
    "\0\u13d8\0\50\0\u1400\0\u1428\0\u1450\0\u1478\0\u14a0\0\50"+
    "\0\u14c8\0\u14f0\0\50\0\u1518\0\u1540\0\u1568\0\u1590\0\50"+
    "\0\50\0\u15b8\0\u15e0\0\u1608\0\u1630\0\u1658\0\u1680\0\u16a8"+
    "\0\u16d0\0\50\0\u16f8\0\50\0\u1720\0\u1748\0\u1770\0\50"+
    "\0\50\0\50\0\u1798\0\u17c0\0\u17e8\0\50";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[190];
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
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\2\1\7"+
    "\1\2\1\10\1\11\1\12\3\5\1\13\1\14\1\15"+
    "\1\16\1\17\1\2\1\20\1\21\3\5\1\22\1\5"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\5\1\31"+
    "\1\32\1\33\1\5\52\0\1\3\50\0\1\4\1\0"+
    "\1\34\44\0\1\35\1\0\1\5\1\0\1\36\1\35"+
    "\1\5\3\0\11\5\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\35\3\0\1\36\1\37\2\0\1\36\3\0"+
    "\11\36\1\0\10\36\5\0\1\36\3\0\1\36\2\0"+
    "\1\35\1\0\1\5\1\0\1\36\1\35\1\40\3\0"+
    "\11\5\1\0\10\5\5\0\1\5\3\0\1\5\1\35"+
    "\1\0\1\35\1\0\1\5\1\0\1\36\1\35\1\5"+
    "\3\0\1\5\1\41\7\5\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\35\1\0\1\35\1\0\1\5\1\0"+
    "\1\36\1\35\1\5\3\0\11\5\1\0\1\42\7\5"+
    "\5\0\1\5\3\0\1\5\1\35\1\0\1\35\1\0"+
    "\1\5\1\0\1\36\1\35\1\5\3\0\6\5\1\43"+
    "\2\5\1\0\10\5\5\0\1\5\3\0\1\5\1\35"+
    "\1\0\1\35\1\0\1\5\1\0\1\36\1\35\1\5"+
    "\3\0\11\5\1\0\1\44\2\5\1\45\4\5\5\0"+
    "\1\5\3\0\1\5\1\35\1\0\1\35\1\0\1\5"+
    "\1\0\1\36\1\35\1\5\3\0\6\5\1\46\2\5"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\35\1\0"+
    "\1\35\1\0\1\5\1\0\1\36\1\35\1\5\3\0"+
    "\4\5\1\47\4\5\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\35\1\0\1\35\1\0\1\5\1\0\1\36"+
    "\1\35\1\5\3\0\1\5\1\50\7\5\1\0\2\5"+
    "\1\51\5\5\5\0\1\5\3\0\1\5\1\35\1\0"+
    "\1\35\1\0\1\5\1\0\1\36\1\35\1\5\3\0"+
    "\6\5\1\52\1\5\1\53\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\35\1\0\1\35\1\0\1\5\1\0"+
    "\1\36\1\35\1\5\3\0\2\5\1\54\6\5\1\0"+
    "\10\5\5\0\1\5\3\0\1\5\1\35\2\0\1\55"+
    "\50\0\1\56\3\0\1\56\3\0\11\56\1\0\10\56"+
    "\5\0\1\56\3\0\1\56\4\0\1\57\3\0\1\57"+
    "\3\0\11\57\1\0\10\57\5\0\1\57\3\0\1\57"+
    "\2\0\1\35\1\0\1\5\1\0\1\36\1\35\1\60"+
    "\3\0\11\5\1\0\10\5\5\0\1\5\3\0\1\5"+
    "\1\35\1\0\1\35\1\0\1\5\1\0\1\36\1\35"+
    "\1\5\3\0\2\5\1\61\6\5\1\0\10\5\5\0"+
    "\1\5\3\0\1\5\1\35\1\0\1\35\1\0\1\5"+
    "\1\0\1\36\1\35\1\5\3\0\7\5\1\62\1\5"+
    "\1\0\1\5\1\63\6\5\5\0\1\5\3\0\1\5"+
    "\1\35\1\0\1\35\1\0\1\5\1\0\1\36\1\35"+
    "\1\5\3\0\7\5\1\64\1\5\1\0\1\65\7\5"+
    "\5\0\1\5\3\0\1\5\1\35\1\0\1\35\1\0"+
    "\1\5\1\0\1\36\1\35\1\5\3\0\6\5\1\66"+
    "\2\5\1\0\10\5\5\0\1\5\3\0\1\5\1\35"+
    "\1\0\1\35\1\0\1\5\1\0\1\36\1\35\1\5"+
    "\3\0\10\5\1\67\1\0\7\5\1\70\5\0\1\5"+
    "\3\0\1\5\1\35\1\0\1\35\1\0\1\5\1\0"+
    "\1\36\1\35\1\5\3\0\11\5\1\0\10\5\5\0"+
    "\1\5\3\0\1\71\1\35\1\0\1\35\1\0\1\5"+
    "\1\0\1\36\1\35\1\5\3\0\11\5\1\0\10\5"+
    "\5\0\1\72\3\0\1\5\1\35\1\0\1\35\1\0"+
    "\1\5\1\0\1\36\1\35\1\5\3\0\7\5\1\73"+
    "\1\5\1\0\10\5\5\0\1\5\3\0\1\5\1\35"+
    "\1\0\1\35\1\0\1\5\1\0\1\36\1\35\1\5"+
    "\3\0\4\5\1\74\4\5\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\35\1\0\1\35\1\0\1\5\1\0"+
    "\1\36\1\35\1\5\3\0\11\5\1\0\5\5\1\75"+
    "\2\5\5\0\1\5\3\0\1\5\1\35\1\0\1\35"+
    "\1\0\1\5\1\0\1\36\1\35\1\5\3\0\1\76"+
    "\10\5\1\0\10\5\5\0\1\5\3\0\1\5\1\35"+
    "\1\0\1\35\1\0\1\5\1\0\1\36\1\35\1\5"+
    "\3\0\11\5\1\0\2\5\1\77\5\5\5\0\1\5"+
    "\3\0\1\5\1\35\3\0\1\100\3\0\1\100\3\0"+
    "\11\100\1\0\10\100\5\0\1\100\3\0\1\100\2\0"+
    "\1\35\1\0\1\5\1\101\1\36\1\35\1\5\3\0"+
    "\11\5\1\0\10\5\5\0\1\5\3\0\1\5\1\35"+
    "\1\0\1\35\1\0\1\5\1\0\1\36\1\35\1\5"+
    "\3\0\3\5\1\102\5\5\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\35\1\0\1\35\1\0\1\5\1\0"+
    "\1\36\1\35\1\5\3\0\10\5\1\103\1\0\10\5"+
    "\5\0\1\5\3\0\1\5\1\35\1\0\1\35\1\0"+
    "\1\5\1\0\1\36\1\35\1\5\3\0\10\5\1\104"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\35\1\0"+
    "\1\35\1\0\1\5\1\0\1\36\1\35\1\5\3\0"+
    "\10\5\1\105\1\0\10\5\5\0\1\5\3\0\1\5"+
    "\1\35\1\0\1\35\1\0\1\5\1\0\1\36\1\35"+
    "\1\5\3\0\11\5\1\106\10\5\5\0\1\5\3\0"+
    "\1\5\1\35\1\0\1\35\1\0\1\5\1\0\1\36"+
    "\1\35\1\5\3\0\11\5\1\0\1\5\1\107\6\5"+
    "\5\0\1\5\3\0\1\5\1\35\1\0\1\35\1\0"+
    "\1\5\1\0\1\36\1\35\1\5\3\0\11\5\1\0"+
    "\10\5\5\0\1\110\3\0\1\5\1\35\1\0\1\35"+
    "\1\0\1\5\1\0\1\36\1\35\1\5\3\0\2\5"+
    "\1\111\6\5\1\0\10\5\5\0\1\5\3\0\1\5"+
    "\1\35\1\0\1\35\1\0\1\5\1\0\1\36\1\35"+
    "\1\5\3\0\11\5\1\0\5\5\1\112\2\5\5\0"+
    "\1\5\3\0\1\5\1\35\1\0\1\35\1\0\1\5"+
    "\1\0\1\36\1\35\1\5\3\0\2\5\1\113\6\5"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\35\1\0"+
    "\1\35\1\0\1\5\1\0\1\36\1\35\1\5\3\0"+
    "\11\5\1\0\2\5\1\114\5\5\5\0\1\5\3\0"+
    "\1\5\1\35\1\0\1\35\1\0\1\5\1\0\1\36"+
    "\1\35\1\5\3\0\2\5\1\115\6\5\1\0\10\5"+
    "\5\0\1\5\3\0\1\5\1\35\1\0\1\35\1\0"+
    "\1\5\1\0\1\36\1\35\1\5\3\0\7\5\1\116"+
    "\1\5\1\0\10\5\5\0\1\5\3\0\1\5\1\35"+
    "\1\0\1\35\1\0\1\5\1\0\1\36\1\35\1\5"+
    "\3\0\4\5\1\117\4\5\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\35\3\0\1\120\3\0\1\120\3\0"+
    "\11\120\1\0\10\120\5\0\1\120\3\0\1\120\3\0"+
    "\2\121\3\0\2\121\2\0\22\121\5\0\1\121\3\0"+
    "\1\121\2\0\1\35\1\0\1\5\1\0\1\36\1\35"+
    "\1\5\3\0\4\5\1\122\4\5\1\0\10\5\5\0"+
    "\1\5\3\0\1\5\1\35\1\0\1\35\1\0\1\5"+
    "\1\0\1\36\1\35\1\5\3\0\11\5\1\0\1\5"+
    "\1\123\6\5\5\0\1\5\3\0\1\5\1\35\1\0"+
    "\1\35\1\0\1\5\1\0\1\36\1\35\1\5\3\0"+
    "\1\124\10\5\1\0\10\5\5\0\1\5\3\0\1\5"+
    "\1\35\1\0\1\35\1\0\1\5\1\0\1\36\1\35"+
    "\1\5\3\0\11\5\1\125\10\5\5\0\1\5\3\0"+
    "\1\5\1\35\31\0\1\126\17\0\1\35\1\0\1\5"+
    "\1\0\1\36\1\35\1\5\3\0\6\5\1\127\2\5"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\35\1\0"+
    "\1\35\1\0\1\5\1\0\1\36\1\35\1\5\3\0"+
    "\4\5\1\130\4\5\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\35\1\0\1\35\1\0\1\5\1\0\1\36"+
    "\1\35\1\5\3\0\6\5\1\131\2\5\1\0\10\5"+
    "\5\0\1\5\3\0\1\5\1\35\1\0\1\35\1\0"+
    "\1\5\1\0\1\36\1\35\1\5\3\0\10\5\1\132"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\35\1\0"+
    "\1\35\1\0\1\5\1\0\1\36\1\35\1\5\3\0"+
    "\6\5\1\133\2\5\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\35\1\0\1\35\1\0\1\5\1\0\1\36"+
    "\1\35\1\5\3\0\11\5\1\0\3\5\1\134\4\5"+
    "\5\0\1\5\3\0\1\5\1\35\1\0\1\35\1\0"+
    "\1\5\1\0\1\36\1\35\1\5\3\0\11\5\1\0"+
    "\7\5\1\135\5\0\1\5\3\0\1\5\1\35\1\0"+
    "\1\35\1\0\1\5\1\0\1\36\1\35\1\5\3\0"+
    "\10\5\1\136\1\0\10\5\5\0\1\5\3\0\1\5"+
    "\1\35\1\0\1\35\1\0\1\5\1\0\1\36\1\35"+
    "\1\5\3\0\1\137\10\5\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\35\4\0\1\140\45\0\2\121\1\141"+
    "\2\0\2\121\2\0\22\121\5\0\1\121\3\0\1\121"+
    "\2\0\1\35\1\0\1\5\1\0\1\36\1\35\1\5"+
    "\3\0\4\5\1\142\4\5\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\35\1\0\1\35\1\0\1\5\1\0"+
    "\1\36\1\35\1\5\3\0\4\5\1\143\4\5\1\0"+
    "\10\5\5\0\1\5\3\0\1\5\1\35\20\0\1\144"+
    "\1\145\60\0\1\146\16\0\1\35\1\0\1\5\1\0"+
    "\1\36\1\35\1\5\3\0\1\5\1\147\7\5\1\0"+
    "\10\5\5\0\1\5\3\0\1\5\1\35\1\0\1\35"+
    "\1\0\1\5\1\0\1\36\1\35\1\5\3\0\11\5"+
    "\1\0\1\150\7\5\5\0\1\5\3\0\1\5\1\35"+
    "\1\0\1\35\1\0\1\5\1\0\1\36\1\35\1\5"+
    "\3\0\11\5\1\0\3\5\1\151\4\5\5\0\1\5"+
    "\3\0\1\5\1\35\1\0\1\35\1\0\1\5\1\0"+
    "\1\36\1\35\1\5\3\0\11\5\1\152\10\5\5\0"+
    "\1\5\3\0\1\5\1\35\1\0\1\35\1\0\1\5"+
    "\1\0\1\36\1\35\1\5\3\0\11\5\1\0\5\5"+
    "\1\153\2\5\5\0\1\5\3\0\1\5\1\35\1\0"+
    "\1\35\1\0\1\5\1\0\1\36\1\35\1\5\3\0"+
    "\11\5\1\0\1\154\7\5\5\0\1\5\3\0\1\5"+
    "\1\35\1\0\1\35\1\0\1\5\1\0\1\36\1\35"+
    "\1\5\3\0\1\5\1\155\7\5\1\0\10\5\5\0"+
    "\1\5\3\0\1\5\1\35\1\0\1\35\1\0\1\5"+
    "\1\0\1\36\1\35\1\5\3\0\11\5\1\156\10\5"+
    "\5\0\1\5\3\0\1\5\1\35\1\0\1\35\1\0"+
    "\1\5\1\0\1\36\1\35\1\5\3\0\10\5\1\157"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\35\3\0"+
    "\1\160\3\0\1\160\3\0\11\160\1\0\10\160\5\0"+
    "\1\160\3\0\1\160\3\0\2\161\3\0\2\161\2\0"+
    "\22\161\5\0\1\161\3\0\1\161\2\0\1\35\1\0"+
    "\1\5\1\0\1\36\1\35\1\5\3\0\11\5\1\0"+
    "\6\5\1\162\1\5\5\0\1\5\3\0\1\5\1\35"+
    "\21\0\1\163\53\0\1\164\52\0\1\165\20\0\1\35"+
    "\1\0\1\5\1\0\1\36\1\35\1\5\3\0\11\5"+
    "\1\166\10\5\5\0\1\5\3\0\1\5\1\35\1\0"+
    "\1\35\1\0\1\5\1\0\1\36\1\35\1\5\3\0"+
    "\11\5\1\167\10\5\5\0\1\5\3\0\1\5\1\35"+
    "\1\0\1\35\1\0\1\5\1\0\1\36\1\35\1\5"+
    "\3\0\6\5\1\170\2\5\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\35\20\0\1\171\1\172\27\0\1\35"+
    "\1\0\1\5\1\0\1\36\1\35\1\5\3\0\10\5"+
    "\1\173\1\0\10\5\5\0\1\5\3\0\1\5\1\35"+
    "\1\0\1\35\1\0\1\5\1\0\1\36\1\35\1\5"+
    "\3\0\10\5\1\174\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\35\1\0\1\35\1\0\1\5\1\0\1\36"+
    "\1\35\1\5\3\0\11\5\1\175\10\5\5\0\1\5"+
    "\3\0\1\5\1\35\20\0\1\176\1\177\31\0\1\200"+
    "\3\0\1\200\3\0\11\200\1\0\10\200\5\0\1\200"+
    "\3\0\1\200\1\0\2\201\2\161\3\201\2\161\2\201"+
    "\22\161\5\201\1\161\3\201\1\161\1\201\1\0\1\35"+
    "\1\0\1\5\1\0\1\36\1\35\1\5\3\0\10\5"+
    "\1\202\1\0\10\5\5\0\1\5\3\0\1\5\1\35"+
    "\25\0\1\203\43\0\1\204\50\0\1\205\56\0\1\206"+
    "\36\0\1\207\1\210\27\0\1\35\1\0\1\5\1\0"+
    "\1\36\1\35\1\5\3\0\2\5\1\211\6\5\1\0"+
    "\10\5\5\0\1\5\3\0\1\5\1\35\21\0\1\212"+
    "\53\0\1\213\42\0\1\214\1\215\47\0\1\216\53\0"+
    "\1\217\22\0\2\201\2\220\3\201\2\220\2\201\22\220"+
    "\5\201\1\220\3\201\1\220\1\201\1\0\1\35\1\0"+
    "\1\5\1\0\1\36\1\35\1\5\3\0\3\5\1\221"+
    "\5\5\1\0\10\5\5\0\1\5\3\0\1\5\1\35"+
    "\26\0\1\222\53\0\1\223\36\0\1\224\53\0\1\225"+
    "\47\0\1\226\43\0\1\227\47\0\1\230\53\0\1\231"+
    "\47\0\1\232\43\0\1\233\30\0\2\220\1\234\2\0"+
    "\2\220\2\0\22\220\5\0\1\220\3\0\1\220\2\0"+
    "\1\35\1\0\1\5\1\0\1\36\1\35\1\5\3\0"+
    "\1\5\1\235\7\5\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\35\21\0\1\236\56\0\1\237\44\0\1\240"+
    "\43\0\1\241\54\0\1\242\46\0\1\243\43\0\1\244"+
    "\54\0\1\245\23\0\2\246\3\0\2\246\2\0\22\246"+
    "\5\0\1\246\3\0\1\246\2\0\1\35\1\0\1\5"+
    "\1\0\1\36\1\35\1\5\3\0\11\5\1\247\10\5"+
    "\5\0\1\5\3\0\1\5\1\35\14\0\1\250\55\0"+
    "\1\251\53\0\1\252\42\0\1\253\54\0\1\254\42\0"+
    "\1\255\26\0\2\256\2\246\3\256\2\246\2\256\22\246"+
    "\5\256\1\246\3\256\1\246\1\256\20\0\1\257\1\260"+
    "\47\0\1\261\42\0\1\262\54\0\1\263\42\0\1\264"+
    "\33\0\2\256\2\265\3\256\2\265\2\256\22\265\5\256"+
    "\1\265\3\256\1\265\1\256\21\0\1\266\53\0\1\267"+
    "\36\0\1\270\47\0\1\271\35\0\2\265\3\0\2\265"+
    "\2\0\22\265\5\0\1\265\3\0\1\265\26\0\1\272"+
    "\43\0\1\273\54\0\1\274\42\0\1\275\42\0\1\276"+
    "\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6160];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\5\1\2\11\12\1\10\11\4\0\17\1"+
    "\1\0\20\1\2\0\4\1\1\0\11\1\2\0\3\1"+
    "\2\0\11\1\2\0\2\1\3\0\3\1\1\0\3\1"+
    "\1\0\1\1\2\0\1\1\5\0\1\1\2\0\2\1"+
    "\3\0\1\11\1\0\1\1\1\11\1\0\1\11\3\0"+
    "\1\1\6\0\2\1\4\0\1\11\3\0\1\11\2\0"+
    "\1\1\2\0\1\11\2\0\1\11\4\0\2\11\10\0"+
    "\1\11\1\0\1\11\1\1\2\0\3\11\3\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[190];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
public String Lexema;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2666) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
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
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public Tokens yylex() throws java.io.IOException {
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
            { Lexema=yytext(); return Numero;
            }
          case 40: break;
          case 2: 
            { Lexema=yytext(); return error;
            }
          case 41: break;
          case 3: 
            { /*Ignore*/
            }
          case 42: break;
          case 4: 
            { Lexema=yytext(); return Identificador;
            }
          case 43: break;
          case 5: 
            { Lexema=yytext(); return ParentesisAper;
            }
          case 44: break;
          case 6: 
            { Lexema=yytext(); return ParentesisCierre;
            }
          case 45: break;
          case 7: 
            { Lexema=yytext(); return Variable;
            }
          case 46: break;
          case 8: 
            { Lexema=yytext(); return Igual;
            }
          case 47: break;
          case 9: 
            { Lexema=yytext(); return Comillas;
            }
          case 48: break;
          case 10: 
            { Lexema=yytext(); return OperadorMultiplicacion;
            }
          case 49: break;
          case 11: 
            { Lexema=yytext(); return OperadorSuma;
            }
          case 50: break;
          case 12: 
            { Lexema=yytext(); return OperadorResta;
            }
          case 51: break;
          case 13: 
            { Lexema=yytext(); return Separador;
            }
          case 52: break;
          case 14: 
            { Lexema=yytext(); return PuntoComa;
            }
          case 53: break;
          case 15: 
            { Lexema=yytext(); return DosPunto;
            }
          case 54: break;
          case 16: 
            { Lexema=yytext(); return NumeroDecimal;
            }
          case 55: break;
          case 17: 
            { Lexema=yytext(); return TituloEncabezado;
            }
          case 56: break;
          case 18: 
            { Lexema=yytext(); return BORDE;
            }
          case 57: break;
          case 19: 
            { Lexema=yytext(); return ENLACE;
            }
          case 58: break;
          case 20: 
            { Lexema=yytext(); return PRUEBA;
            }
          case 59: break;
          case 21: 
            { Lexema=yytext(); return NEGRITA;
            }
          case 60: break;
          case 22: 
            { Lexema=yytext(); return InicioColumna;
            }
          case 61: break;
          case 23: 
            { Lexema=yytext(); return Correo;
            }
          case 62: break;
          case 24: 
            { Lexema=yytext(); return FinFila;
            }
          case 63: break;
          case 25: 
            { Lexema=yytext(); return FinDocumento;
            }
          case 64: break;
          case 26: 
            { Lexema=yytext(); return IMPRIMIR;
            }
          case 65: break;
          case 27: 
            { Lexema=yytext(); return Link;
            }
          case 66: break;
          case 28: 
            { Lexema=yytext(); return FinLista;
            }
          case 67: break;
          case 29: 
            { Lexema=yytext(); return FinTabla;
            }
          case 68: break;
          case 30: 
            { Lexema=yytext(); return FinImagen;
            }
          case 69: break;
          case 31: 
            { Lexema=yytext(); return FinCuerpoDoc;
            }
          case 70: break;
          case 32: 
            { Lexema=yytext(); return InicioFila;
            }
          case 71: break;
          case 33: 
            { Lexema=yytext(); return InicioDocumento;
            }
          case 72: break;
          case 34: 
            { Lexema=yytext(); return InicioLista;
            }
          case 73: break;
          case 35: 
            { Lexema=yytext(); return InicioTabla;
            }
          case 74: break;
          case 36: 
            { Lexema=yytext(); return InicioImagen;
            }
          case 75: break;
          case 37: 
            { Lexema=yytext(); return InicioCuerpoDoc;
            }
          case 76: break;
          case 38: 
            { Lexema=yytext(); return FinEncabezado;
            }
          case 77: break;
          case 39: 
            { Lexema=yytext(); return InicioEncabezado;
            }
          case 78: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
