/* The following code was generated by JFlex 1.6.1 */

package Paquetes;
import java_cup.runtime.*;

/*-------CODIGO DE USUARIO-----*/

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>LexerCup.flex</tt>
 */
public class LexerCup implements java_cup.runtime.Scanner {

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
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1, 41, 41,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1,  0, 31,  0,  0,  0,  0,  0,  9, 10, 32, 33, 36, 34,  4,  0, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 38, 37,  0, 30,  0,  0, 
     5, 20, 11, 23, 14, 15, 16, 35, 26, 17,  3,  3, 19, 25, 22, 12, 
    29,  3, 13, 39, 27, 24,  3,  3,  3,  3, 28,  0,  0,  0,  0, 21, 
     0, 20, 11, 23, 14, 15, 16, 35, 26, 17,  3,  3, 19, 25, 22, 12, 
    29,  3, 13, 39, 27, 24,  3,  7,  3,  3, 28,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0, 41,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     6,  0,  0,  0,  0,  0,  0,  0,  0,  0,  8,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  8,  0,  0,  0,  0,  8,  0,  0,  0,  0,  0, 
     8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  8, 
     8,  8,  8,  8,  8,  8,  8,  0,  8,  8,  8,  8,  8,  8,  8,  8, 
     8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  8,  8, 
     8,  8,  8,  8,  8,  8,  8,  0,  8,  8,  8,  8,  8,  8,  8,  8
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\1\1\4\1\2\1\4\1\5"+
    "\1\6\4\4\1\2\1\4\1\7\4\4\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\4\0\4\4"+
    "\1\0\2\4\2\0\1\4\1\0\4\4\1\0\2\4"+
    "\1\20\1\4\1\0\6\4\2\0\1\4\1\0\2\4"+
    "\2\0\1\4\1\0\3\4\2\21\2\4\2\0\4\4"+
    "\2\0\1\4\1\0\2\4\2\0\1\4\1\0\5\4"+
    "\2\0\1\22\2\4\2\0\1\4\1\0\2\4\2\0"+
    "\1\4\1\0\1\4\1\0\4\4\2\0\1\23\1\4"+
    "\3\0\1\4\1\0\2\4\3\0\1\4\1\0\2\4"+
    "\1\0\1\24\2\0\1\4\5\0\1\4\3\0\2\25"+
    "\1\26\3\0\1\27\1\0\1\4\1\30\1\0\1\31"+
    "\3\0\2\32\6\0\1\33\1\4\4\0\1\34\3\0"+
    "\1\35\2\0\1\4\2\0\1\36\2\0\1\37\4\0"+
    "\1\40\1\41\10\0\1\42\1\0\1\43\1\33\2\0"+
    "\1\44\1\45\1\46\3\0\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[220];
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
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\374\0\52"+
    "\0\52\0\u0126\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\250"+
    "\0\u0222\0\u024c\0\u0276\0\u02a0\0\52\0\52\0\52\0\52"+
    "\0\52\0\52\0\52\0\52\0\u02ca\0\u02f4\0\322\0\u031e"+
    "\0\u0348\0\u0372\0\u039c\0\u03c6\0\u03f0\0\u041a\0\u0444\0\u046e"+
    "\0\u0498\0\u04c2\0\u04ec\0\u0516\0\u0540\0\u056a\0\u0594\0\u05be"+
    "\0\u05e8\0\u0612\0\u02ca\0\u02f4\0\u063c\0\u0666\0\u0690\0\u06ba"+
    "\0\u06e4\0\u070e\0\u0738\0\u0762\0\u078c\0\u07b6\0\u07e0\0\u080a"+
    "\0\u0834\0\u085e\0\u0888\0\u08b2\0\u08dc\0\u0906\0\u0930\0\u095a"+
    "\0\250\0\52\0\u0984\0\u09ae\0\u09d8\0\u0a02\0\u0a2c\0\u0a56"+
    "\0\u0a80\0\u0aaa\0\u0ad4\0\u0afe\0\u0b28\0\u0b52\0\u0b7c\0\u0ba6"+
    "\0\u0bd0\0\u0bfa\0\u0c24\0\u0c4e\0\u0c78\0\u0ca2\0\u0ccc\0\u0cf6"+
    "\0\u0d20\0\u0d4a\0\u0d74\0\250\0\u0d9e\0\u0dc8\0\u0df2\0\u0e1c"+
    "\0\u0e46\0\u0e70\0\u0e9a\0\u0ec4\0\u0eee\0\u0f18\0\u0f42\0\u0f6c"+
    "\0\u0f96\0\u0fc0\0\u0fea\0\u1014\0\u103e\0\u1068\0\u1092\0\u10bc"+
    "\0\250\0\u10e6\0\u1110\0\u113a\0\u1164\0\u118e\0\u11b8\0\u11e2"+
    "\0\u120c\0\u1236\0\u1260\0\u128a\0\u12b4\0\u12de\0\u1308\0\u1332"+
    "\0\u135c\0\250\0\u1386\0\u13b0\0\u13da\0\u1404\0\u142e\0\u1458"+
    "\0\u1482\0\u14ac\0\u14d6\0\u1500\0\u152a\0\u1554\0\250\0\52"+
    "\0\250\0\u157e\0\u15a8\0\u15d2\0\52\0\u15fc\0\u1626\0\52"+
    "\0\u1650\0\52\0\u167a\0\u16a4\0\u16ce\0\250\0\52\0\u16f8"+
    "\0\u1722\0\u174c\0\u1776\0\u17a0\0\u17ca\0\u17f4\0\u181e\0\u1848"+
    "\0\u1872\0\u189c\0\u18c6\0\52\0\u18f0\0\u191a\0\u1944\0\52"+
    "\0\u196e\0\u1998\0\u19c2\0\u19ec\0\u1a16\0\52\0\u1a40\0\u1a6a"+
    "\0\52\0\u1a94\0\u1abe\0\u1ae8\0\u1b12\0\52\0\52\0\u1b3c"+
    "\0\u1b66\0\u1b90\0\u1bba\0\u1be4\0\u1c0e\0\u1c38\0\u1c62\0\52"+
    "\0\u1c8c\0\52\0\u1cb6\0\u1ce0\0\u1d0a\0\52\0\52\0\52"+
    "\0\u1d34\0\u1d5e\0\u1d88\0\52";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[220];
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
    "\1\16\1\17\1\20\1\2\1\21\1\22\3\5\1\23"+
    "\1\5\1\24\1\25\1\26\1\27\1\30\1\31\1\5"+
    "\1\32\1\33\1\34\1\5\1\2\54\0\1\3\52\0"+
    "\1\4\1\0\1\35\46\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\7\5\1\0\2\5\1\0"+
    "\10\5\5\0\1\5\3\0\1\5\1\0\1\36\3\0"+
    "\1\37\1\40\2\0\1\37\3\0\7\37\1\0\2\37"+
    "\1\0\10\37\5\0\1\37\3\0\1\37\3\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\41\3\0\7\5"+
    "\1\0\2\5\1\0\10\5\5\0\1\5\3\0\1\5"+
    "\1\0\1\36\1\0\1\36\1\0\1\5\1\0\1\37"+
    "\1\36\1\5\3\0\1\5\1\42\5\5\1\0\2\5"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\0\1\36"+
    "\1\0\1\36\1\0\1\5\1\0\1\37\1\36\1\5"+
    "\3\0\7\5\1\0\2\5\1\0\1\43\7\5\5\0"+
    "\1\5\3\0\1\5\1\0\1\36\1\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\6\5\1\44"+
    "\1\45\2\5\1\0\10\5\5\0\1\5\3\0\1\5"+
    "\1\0\1\36\1\0\1\36\1\0\1\5\1\0\1\37"+
    "\1\36\1\5\3\0\7\5\1\0\2\5\1\0\1\46"+
    "\2\5\1\47\4\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\26\0\1\50\2\0\1\51\21\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\6\5\1\52"+
    "\1\53\2\5\1\0\10\5\5\0\1\5\3\0\1\5"+
    "\1\0\1\36\1\0\1\36\1\0\1\5\1\0\1\37"+
    "\1\36\1\5\3\0\4\5\1\54\2\5\1\0\2\5"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\0\1\36"+
    "\1\0\1\36\1\0\1\5\1\0\1\37\1\36\1\5"+
    "\3\0\1\5\1\55\5\5\1\0\2\5\1\0\2\5"+
    "\1\56\5\5\5\0\1\5\3\0\1\5\1\0\1\36"+
    "\1\0\1\36\1\0\1\5\1\0\1\37\1\36\1\5"+
    "\3\0\6\5\1\57\1\60\1\5\1\61\1\0\10\5"+
    "\5\0\1\5\3\0\1\5\1\0\1\36\1\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\2\5"+
    "\1\62\4\5\1\0\2\5\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\0\1\36\2\0\1\63\52\0\1\64"+
    "\3\0\1\64\3\0\7\64\1\0\2\64\1\0\10\64"+
    "\5\0\1\64\3\0\1\64\5\0\1\65\3\0\1\65"+
    "\3\0\7\65\1\0\2\65\1\0\10\65\5\0\1\65"+
    "\3\0\1\65\3\0\1\36\1\0\1\5\1\0\1\37"+
    "\1\36\1\66\3\0\7\5\1\0\2\5\1\0\10\5"+
    "\5\0\1\5\3\0\1\5\1\0\1\36\1\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\2\5"+
    "\1\67\4\5\1\0\2\5\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\0\1\36\1\0\1\36\1\0\1\5"+
    "\1\0\1\37\1\36\1\5\3\0\7\5\1\0\1\70"+
    "\1\5\1\0\1\5\1\71\6\5\5\0\1\5\3\0"+
    "\1\5\1\0\1\36\1\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\7\5\1\0\1\72\1\5"+
    "\1\0\1\73\7\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\23\0\1\74\2\0\1\75\24\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\6\5\1\76"+
    "\1\77\2\5\1\0\10\5\5\0\1\5\3\0\1\5"+
    "\1\0\1\36\1\0\1\36\1\0\1\5\1\0\1\37"+
    "\1\36\1\5\3\0\7\5\1\0\1\5\1\100\1\0"+
    "\7\5\1\101\5\0\1\5\3\0\1\5\1\0\1\36"+
    "\21\0\2\77\53\0\1\102\10\0\1\103\15\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\7\5"+
    "\1\0\2\5\1\0\10\5\5\0\1\5\3\0\1\104"+
    "\1\105\1\36\47\0\2\105\2\0\1\36\1\0\1\5"+
    "\1\0\1\37\1\36\1\5\3\0\7\5\1\0\2\5"+
    "\1\0\10\5\5\0\1\106\3\0\1\5\1\0\1\36"+
    "\1\0\1\36\1\0\1\5\1\0\1\37\1\36\1\5"+
    "\3\0\7\5\1\0\1\107\1\5\1\0\10\5\5\0"+
    "\1\5\3\0\1\5\1\0\1\36\1\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\4\5\1\110"+
    "\2\5\1\0\2\5\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\0\1\36\1\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\7\5\1\0\2\5\1\0"+
    "\5\5\1\111\2\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\33\0\1\112\17\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\1\113\6\5\1\0\2\5"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\0\1\36"+
    "\1\0\1\36\1\0\1\5\1\0\1\37\1\36\1\5"+
    "\3\0\7\5\1\0\2\5\1\0\2\5\1\114\5\5"+
    "\5\0\1\5\3\0\1\5\1\0\1\36\3\0\1\115"+
    "\3\0\1\115\3\0\7\115\1\0\2\115\1\0\10\115"+
    "\5\0\1\115\3\0\1\115\3\0\1\36\1\0\1\5"+
    "\1\116\1\37\1\36\1\5\3\0\7\5\1\0\2\5"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\0\1\36"+
    "\1\0\1\36\1\0\1\5\1\0\1\37\1\36\1\5"+
    "\3\0\3\5\1\117\3\5\1\0\2\5\1\0\10\5"+
    "\5\0\1\5\3\0\1\5\1\0\1\36\1\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\7\5"+
    "\1\0\1\5\1\120\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\0\1\36\1\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\7\5\1\0\1\5\1\121"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\0\1\36"+
    "\1\0\1\36\1\0\1\5\1\0\1\37\1\36\1\5"+
    "\3\0\7\5\1\0\1\5\1\122\1\0\10\5\5\0"+
    "\1\5\3\0\1\5\1\0\1\36\1\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\7\5\1\0"+
    "\2\5\1\123\10\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\24\0\1\124\52\0\1\123\25\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\7\5\1\0"+
    "\2\5\1\0\1\5\1\125\6\5\5\0\1\5\3\0"+
    "\1\5\1\0\1\36\27\0\1\126\23\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\7\5\1\0"+
    "\2\5\1\0\10\5\5\0\1\127\3\0\1\5\1\0"+
    "\1\36\1\0\1\36\1\0\1\5\1\0\1\37\1\36"+
    "\1\5\3\0\2\5\1\130\4\5\1\0\2\5\1\0"+
    "\10\5\5\0\1\5\3\0\1\5\1\0\1\36\43\0"+
    "\1\131\23\0\1\132\35\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\7\5\1\0\2\5\1\0"+
    "\5\5\1\133\2\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\33\0\1\134\17\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\2\5\1\135\4\5\1\0"+
    "\2\5\1\0\10\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\1\0\1\36\1\0\1\5\1\0\1\37\1\36"+
    "\1\5\3\0\7\5\1\0\2\5\1\0\2\5\1\136"+
    "\5\5\5\0\1\5\3\0\1\5\1\0\1\36\1\0"+
    "\1\36\1\0\1\5\1\0\1\37\1\36\1\5\3\0"+
    "\2\5\1\137\4\5\1\0\2\5\1\0\10\5\5\0"+
    "\1\5\3\0\1\5\1\0\1\36\1\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\7\5\1\0"+
    "\1\140\1\5\1\0\10\5\5\0\1\5\3\0\1\5"+
    "\1\0\1\36\1\0\1\36\1\0\1\5\1\0\1\37"+
    "\1\36\1\5\3\0\4\5\1\141\2\5\1\0\2\5"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\0\1\36"+
    "\3\0\1\142\3\0\1\142\3\0\7\142\1\0\2\142"+
    "\1\0\10\142\5\0\1\142\3\0\1\142\4\0\2\143"+
    "\3\0\2\143\2\0\23\143\5\0\1\143\3\0\2\143"+
    "\2\0\1\36\1\0\1\5\1\0\1\37\1\36\1\5"+
    "\3\0\4\5\1\144\2\5\1\0\2\5\1\0\10\5"+
    "\5\0\1\5\3\0\1\5\1\0\1\36\1\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\7\5"+
    "\1\0\2\5\1\0\1\5\1\145\6\5\5\0\1\5"+
    "\3\0\1\5\1\0\1\36\1\0\1\36\1\0\1\5"+
    "\1\0\1\37\1\36\1\5\3\0\1\146\6\5\1\0"+
    "\2\5\1\0\10\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\1\0\1\36\1\0\1\5\1\0\1\37\1\36"+
    "\1\5\3\0\7\5\1\0\2\5\1\147\10\5\5\0"+
    "\1\5\3\0\1\5\1\0\1\36\32\0\1\150\44\0"+
    "\1\147\25\0\1\36\1\0\1\5\1\0\1\37\1\36"+
    "\1\5\3\0\6\5\1\151\1\152\2\5\1\0\10\5"+
    "\5\0\1\5\3\0\1\5\1\0\1\36\21\0\2\152"+
    "\30\0\1\36\1\0\1\5\1\0\1\37\1\36\1\5"+
    "\3\0\4\5\1\153\2\5\1\0\2\5\1\0\10\5"+
    "\5\0\1\5\3\0\1\5\1\0\1\36\1\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\6\5"+
    "\1\154\1\155\2\5\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\0\1\36\17\0\1\156\53\0\2\155\30\0"+
    "\1\36\1\0\1\5\1\0\1\37\1\36\1\5\3\0"+
    "\7\5\1\0\1\5\1\157\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\0\1\36\24\0\1\160\26\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\6\5"+
    "\1\161\1\162\2\5\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\0\1\36\1\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\7\5\1\0\2\5\1\0"+
    "\3\5\1\163\4\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\1\0\1\36\1\0\1\5\1\0\1\37\1\36"+
    "\1\5\3\0\7\5\1\0\2\5\1\0\7\5\1\164"+
    "\5\0\1\5\3\0\1\5\1\0\1\36\1\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\7\5"+
    "\1\0\1\5\1\165\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\0\1\36\1\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\1\166\6\5\1\0\2\5"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\0\1\36"+
    "\4\0\1\167\47\0\2\143\1\170\2\0\2\143\2\0"+
    "\23\143\5\0\1\143\3\0\2\143\2\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\4\5\1\171"+
    "\2\5\1\0\2\5\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\0\1\36\1\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\4\5\1\172\2\5\1\0"+
    "\2\5\1\0\10\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\20\0\1\173\2\174\62\0\1\175\17\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\1\5"+
    "\1\176\5\5\1\0\2\5\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\0\1\36\14\0\1\177\36\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\7\5"+
    "\1\0\2\5\1\0\1\200\7\5\5\0\1\5\3\0"+
    "\1\5\1\0\1\36\1\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\7\5\1\0\2\5\1\0"+
    "\3\5\1\201\4\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\31\0\1\202\46\0\1\203\24\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\7\5\1\0"+
    "\2\5\1\204\10\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\25\0\1\204\25\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\7\5\1\0\2\5\1\0"+
    "\5\5\1\205\2\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\33\0\1\206\17\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\7\5\1\0\2\5\1\0"+
    "\1\207\7\5\5\0\1\5\3\0\1\5\1\0\1\36"+
    "\1\0\1\36\1\0\1\5\1\0\1\37\1\36\1\5"+
    "\3\0\1\5\1\210\5\5\1\0\2\5\1\0\10\5"+
    "\5\0\1\5\3\0\1\5\1\0\1\36\1\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\7\5"+
    "\1\0\2\5\1\211\10\5\5\0\1\5\3\0\1\5"+
    "\1\0\1\36\1\0\1\36\1\0\1\5\1\0\1\37"+
    "\1\36\1\5\3\0\7\5\1\0\1\5\1\212\1\0"+
    "\10\5\5\0\1\5\3\0\1\5\1\0\1\36\3\0"+
    "\1\213\3\0\1\213\3\0\7\213\1\0\2\213\1\0"+
    "\10\213\5\0\1\213\3\0\1\213\4\0\2\214\3\0"+
    "\2\214\2\0\23\214\5\0\1\214\3\0\2\214\2\0"+
    "\1\36\1\0\1\5\1\0\1\37\1\36\1\5\3\0"+
    "\7\5\1\0\2\5\1\0\6\5\1\215\1\5\5\0"+
    "\1\5\3\0\1\5\1\0\1\36\21\0\2\216\55\0"+
    "\1\217\54\0\1\220\21\0\1\36\1\0\1\5\1\0"+
    "\1\37\1\36\1\5\3\0\7\5\1\0\2\5\1\221"+
    "\10\5\5\0\1\5\3\0\1\5\1\0\1\36\25\0"+
    "\1\221\25\0\1\36\1\0\1\5\1\0\1\37\1\36"+
    "\1\5\3\0\7\5\1\0\2\5\1\222\10\5\5\0"+
    "\1\5\3\0\1\5\1\0\1\36\1\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\6\5\1\223"+
    "\1\224\2\5\1\0\10\5\5\0\1\5\3\0\1\5"+
    "\1\0\1\36\21\0\2\224\54\0\1\222\44\0\1\225"+
    "\2\226\30\0\1\36\1\0\1\5\1\0\1\37\1\36"+
    "\1\5\3\0\7\5\1\0\1\5\1\227\1\0\10\5"+
    "\5\0\1\5\3\0\1\5\1\0\1\36\24\0\1\230"+
    "\26\0\1\36\1\0\1\5\1\0\1\37\1\36\1\5"+
    "\3\0\7\5\1\0\1\5\1\231\1\0\10\5\5\0"+
    "\1\5\3\0\1\5\1\0\1\36\1\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\7\5\1\0"+
    "\2\5\1\232\10\5\5\0\1\5\3\0\1\5\1\0"+
    "\1\36\20\0\1\233\2\234\32\0\1\235\3\0\1\235"+
    "\3\0\7\235\1\0\2\235\1\0\10\235\5\0\1\235"+
    "\3\0\1\235\2\0\2\236\2\214\3\236\2\214\2\236"+
    "\23\214\5\236\1\214\3\236\2\214\1\236\1\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\7\5"+
    "\1\0\1\5\1\237\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\0\1\36\26\0\1\240\44\0\2\241\52\0"+
    "\1\242\60\0\1\243\37\0\1\244\2\245\30\0\1\36"+
    "\1\0\1\5\1\0\1\37\1\36\1\5\3\0\2\5"+
    "\1\246\4\5\1\0\2\5\1\0\10\5\5\0\1\5"+
    "\3\0\1\5\1\0\1\36\15\0\1\247\55\0\2\250"+
    "\55\0\1\251\43\0\1\252\2\253\50\0\2\254\55\0"+
    "\1\255\23\0\2\236\2\256\3\236\2\256\2\236\23\256"+
    "\5\236\1\256\3\236\2\256\1\236\1\0\1\36\1\0"+
    "\1\5\1\0\1\37\1\36\1\5\3\0\3\5\1\257"+
    "\3\5\1\0\2\5\1\0\10\5\5\0\1\5\3\0"+
    "\1\5\1\0\1\36\27\0\1\260\55\0\1\261\37\0"+
    "\2\262\55\0\1\263\51\0\1\264\44\0\2\265\50\0"+
    "\2\266\55\0\1\267\51\0\1\270\44\0\2\271\31\0"+
    "\2\256\1\272\2\0\2\256\2\0\23\256\5\0\1\256"+
    "\3\0\2\256\2\0\1\36\1\0\1\5\1\0\1\37"+
    "\1\36\1\5\3\0\1\5\1\273\5\5\1\0\2\5"+
    "\1\0\10\5\5\0\1\5\3\0\1\5\1\0\1\36"+
    "\21\0\2\274\60\0\1\275\46\0\1\276\44\0\2\277"+
    "\56\0\1\300\50\0\1\301\44\0\2\302\56\0\1\303"+
    "\24\0\2\304\3\0\2\304\2\0\23\304\5\0\1\304"+
    "\3\0\2\304\2\0\1\36\1\0\1\5\1\0\1\37"+
    "\1\36\1\5\3\0\7\5\1\0\2\5\1\305\10\5"+
    "\5\0\1\5\3\0\1\5\1\0\1\36\14\0\1\306"+
    "\60\0\1\307\55\0\1\310\43\0\2\311\56\0\1\312"+
    "\43\0\2\313\27\0\2\314\2\304\3\314\2\304\2\314"+
    "\23\304\5\314\1\304\3\314\2\304\1\314\20\0\1\315"+
    "\2\316\50\0\2\317\43\0\1\320\56\0\2\321\43\0"+
    "\1\322\35\0\2\314\2\323\3\314\2\323\2\314\23\323"+
    "\5\314\1\323\3\314\2\323\1\314\21\0\2\324\55\0"+
    "\1\325\37\0\1\326\51\0\1\327\37\0\2\323\3\0"+
    "\2\323\2\0\23\323\5\0\1\323\3\0\2\323\27\0"+
    "\1\330\44\0\2\331\56\0\1\332\43\0\2\333\43\0"+
    "\1\334\35\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7602];
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
    "\1\1\1\11\5\1\2\11\13\1\10\11\4\0\4\1"+
    "\1\0\2\1\2\0\1\1\1\0\4\1\1\0\4\1"+
    "\1\0\6\1\2\0\1\1\1\0\2\1\2\0\1\1"+
    "\1\0\4\1\1\11\2\1\2\0\4\1\2\0\1\1"+
    "\1\0\2\1\2\0\1\1\1\0\5\1\2\0\3\1"+
    "\2\0\1\1\1\0\2\1\2\0\1\1\1\0\1\1"+
    "\1\0\4\1\2\0\2\1\3\0\1\1\1\0\2\1"+
    "\3\0\1\1\1\0\2\1\1\0\1\1\2\0\1\1"+
    "\5\0\1\1\3\0\1\1\1\11\1\1\3\0\1\11"+
    "\1\0\1\1\1\11\1\0\1\11\3\0\1\1\1\11"+
    "\6\0\2\1\4\0\1\11\3\0\1\11\2\0\1\1"+
    "\2\0\1\11\2\0\1\11\4\0\2\11\10\0\1\11"+
    "\1\0\1\11\1\1\2\0\3\11\3\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[220];
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
    public String lexema;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexerCup(java.io.Reader in) {
    this.zzReader = in;
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
            zzDoEOF();
          { return new java_cup.runtime.Symbol(Simbolos.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { lexema=yytext(); return new Symbol(Simbolos.Numero,yycolumn,yyline,yytext());
            }
          case 40: break;
          case 2: 
            { lexema=yytext(); return new Symbol(Simbolos.error,yycolumn,yyline,yytext());
            }
          case 41: break;
          case 3: 
            { /*Ignore*/
            }
          case 42: break;
          case 4: 
            { lexema=yytext(); return new Symbol(Simbolos.Identificador,yycolumn,yyline,yytext());
            }
          case 43: break;
          case 5: 
            { lexema=yytext(); return new Symbol(Simbolos.ParentesisAper,yycolumn,yyline,yytext());
            }
          case 44: break;
          case 6: 
            { lexema=yytext(); return new Symbol(Simbolos.ParentesisCierre,yycolumn,yyline,yytext());
            }
          case 45: break;
          case 7: 
            { lexema=yytext(); return new Symbol(Simbolos.Variable,yycolumn,yyline,yytext());
            }
          case 46: break;
          case 8: 
            { lexema=yytext(); return new Symbol(Simbolos.Igual,yycolumn,yyline,yytext());
            }
          case 47: break;
          case 9: 
            { lexema=yytext(); return new Symbol(Simbolos.Comillas,yycolumn,yyline,yytext());
            }
          case 48: break;
          case 10: 
            { lexema=yytext(); return new Symbol(Simbolos.OperadorMultiplicacion,yycolumn,yyline,yytext());
            }
          case 49: break;
          case 11: 
            { lexema=yytext(); return new Symbol(Simbolos.OperadorSuma,yycolumn,yyline,yytext());
            }
          case 50: break;
          case 12: 
            { lexema=yytext(); return new Symbol(Simbolos.OperadorResta,yycolumn,yyline,yytext());
            }
          case 51: break;
          case 13: 
            { lexema=yytext(); return new Symbol(Simbolos.Separador,yycolumn,yyline,yytext());
            }
          case 52: break;
          case 14: 
            { lexema=yytext(); return new Symbol(Simbolos.PuntoComa,yycolumn,yyline,yytext());
            }
          case 53: break;
          case 15: 
            { lexema=yytext(); return new Symbol(Simbolos.DosPunto,yycolumn,yyline,yytext());
            }
          case 54: break;
          case 16: 
            { lexema=yytext(); return new Symbol(Simbolos.NumeroDecimal,yycolumn,yyline,yytext());
            }
          case 55: break;
          case 17: 
            { lexema=yytext(); return new Symbol(Simbolos.TituloEncabezado,yycolumn,yyline,yytext());
            }
          case 56: break;
          case 18: 
            { lexema=yytext(); return new Symbol(Simbolos.BORDE,yycolumn,yyline,yytext());
            }
          case 57: break;
          case 19: 
            { lexema=yytext(); return new Symbol(Simbolos.ENLACE,yycolumn,yyline,yytext());
            }
          case 58: break;
          case 20: 
            { lexema=yytext(); return new Symbol(Simbolos.PRUEBA,yycolumn,yyline,yytext());
            }
          case 59: break;
          case 21: 
            { lexema=yytext(); return new Symbol(Simbolos.NEGRITA,yycolumn,yyline,yytext());
            }
          case 60: break;
          case 22: 
            { lexema=yytext(); return new Symbol(Simbolos.InicioColumna,yycolumn,yyline,yytext());
            }
          case 61: break;
          case 23: 
            { lexema=yytext(); return new Symbol(Simbolos.Correo,yycolumn,yyline,yytext());
            }
          case 62: break;
          case 24: 
            { lexema=yytext(); return new Symbol(Simbolos.FinFila,yycolumn,yyline,yytext());
            }
          case 63: break;
          case 25: 
            { lexema=yytext(); return new Symbol(Simbolos.FinDocumento,yycolumn,yyline,yytext());
            }
          case 64: break;
          case 26: 
            { lexema=yytext(); return new Symbol(Simbolos.IMPRIMIR,yycolumn,yyline,yytext());
            }
          case 65: break;
          case 27: 
            { lexema=yytext(); return new Symbol(Simbolos.Link,yycolumn,yyline,yytext());
            }
          case 66: break;
          case 28: 
            { lexema=yytext(); return new Symbol(Simbolos.FinLista,yycolumn,yyline,yytext());
            }
          case 67: break;
          case 29: 
            { lexema=yytext(); return new Symbol(Simbolos.FinTabla,yycolumn,yyline,yytext());
            }
          case 68: break;
          case 30: 
            { lexema=yytext(); return new Symbol(Simbolos.FinImagen,yycolumn,yyline,yytext());
            }
          case 69: break;
          case 31: 
            { lexema=yytext(); return new Symbol(Simbolos.FinCuerpoDoc,yycolumn,yyline,yytext());
            }
          case 70: break;
          case 32: 
            { lexema=yytext(); return new Symbol(Simbolos.InicioFila,yycolumn,yyline,yytext());
            }
          case 71: break;
          case 33: 
            { lexema=yytext(); return new Symbol(Simbolos.InicioDocumento,yycolumn,yyline,yytext());
            }
          case 72: break;
          case 34: 
            { lexema=yytext(); return new Symbol(Simbolos.InicioLista,yycolumn,yyline,yytext());
            }
          case 73: break;
          case 35: 
            { lexema=yytext(); return new Symbol(Simbolos.InicioTabla,yycolumn,yyline,yytext());
            }
          case 74: break;
          case 36: 
            { lexema=yytext(); return new Symbol(Simbolos.InicioImagen,yycolumn,yyline,yytext());
            }
          case 75: break;
          case 37: 
            { lexema=yytext(); return new Symbol(Simbolos.InicioCuerpoDoc,yycolumn,yyline,yytext());
            }
          case 76: break;
          case 38: 
            { lexema=yytext(); return new Symbol(Simbolos.FinEncabezado,yycolumn,yyline,yytext());
            }
          case 77: break;
          case 39: 
            { lexema=yytext(); return new Symbol(Simbolos.InicioEncabezado,yycolumn,yyline,yytext());
            }
          case 78: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}