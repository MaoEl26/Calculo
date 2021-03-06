/* SyntaxChecker.java */
/* Generated By:JavaCC: Do not edit this line. SyntaxChecker.java */
package org.mariuszgromada.math.mxparser.syntaxchecker;

public final class SyntaxChecker implements SyntaxCheckerConstants {
        public final void checkSyntax() throws ParseException, TokenMgrError {
                start();
        }

/*
 * Lexer logic - grammar
 */
  final public void start() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LEFT_PAR:
    case PLUS:
    case MINUS:
    case UNIT:
    case NOT:
    case BITNOT:
    case NUMBER_CONSTANT:
    case IDENTIFIER:
    case FUNCTION:
    case 47:{
      expression();
      jj_consume_token(0);
      break;
      }
    case 0:{
      jj_consume_token(0);
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

/*
 * Grammar for expression
 */
  final public void expression() throws ParseException {
    binaryExpression();
  }

/*
 * Grammar for binary operators
 */
  final public void binaryExpression() throws ParseException {
    unaryRigthExpression();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:
      case MULTIPLY:
      case DIV:
      case POWER:
      case MODULO:
      case EQ:
      case NEQ:
      case LT:
      case LEQ:
      case GT:
      case GEQ:
      case OR:
      case AND:
      case IMP:
      case CIMP:
      case NIMP:
      case CNIMP:
      case NAND:
      case EQV:
      case NOR:
      case BITWISE:
      case XOR:{
        ;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:{
        jj_consume_token(PLUS);
        unaryRigthExpression();
        break;
        }
      case MINUS:{
        jj_consume_token(MINUS);
        unaryRigthExpression();
        break;
        }
      case MULTIPLY:{
        jj_consume_token(MULTIPLY);
        unaryRigthExpression();
        break;
        }
      case DIV:{
        jj_consume_token(DIV);
        unaryRigthExpression();
        break;
        }
      case MODULO:{
        jj_consume_token(MODULO);
        unaryRigthExpression();
        break;
        }
      case POWER:{
        jj_consume_token(POWER);
        unaryRigthExpression();
        break;
        }
      case EQ:{
        jj_consume_token(EQ);
        unaryRigthExpression();
        break;
        }
      case NEQ:{
        jj_consume_token(NEQ);
        unaryRigthExpression();
        break;
        }
      case GT:{
        jj_consume_token(GT);
        unaryRigthExpression();
        break;
        }
      case GEQ:{
        jj_consume_token(GEQ);
        unaryRigthExpression();
        break;
        }
      case LT:{
        jj_consume_token(LT);
        unaryRigthExpression();
        break;
        }
      case LEQ:{
        jj_consume_token(LEQ);
        unaryRigthExpression();
        break;
        }
      case OR:{
        jj_consume_token(OR);
        unaryRigthExpression();
        break;
        }
      case AND:{
        jj_consume_token(AND);
        unaryRigthExpression();
        break;
        }
      case NOR:{
        jj_consume_token(NOR);
        unaryRigthExpression();
        break;
        }
      case NAND:{
        jj_consume_token(NAND);
        unaryRigthExpression();
        break;
        }
      case XOR:{
        jj_consume_token(XOR);
        unaryRigthExpression();
        break;
        }
      case IMP:{
        jj_consume_token(IMP);
        unaryRigthExpression();
        break;
        }
      case CIMP:{
        jj_consume_token(CIMP);
        unaryRigthExpression();
        break;
        }
      case NIMP:{
        jj_consume_token(NIMP);
        unaryRigthExpression();
        break;
        }
      case CNIMP:{
        jj_consume_token(CNIMP);
        unaryRigthExpression();
        break;
        }
      case EQV:{
        jj_consume_token(EQV);
        unaryRigthExpression();
        break;
        }
      case BITWISE:{
        jj_consume_token(BITWISE);
        unaryRigthExpression();
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

/*
 * Grammar for unary rigth operators
 */
  final public void unaryRigthExpression() throws ParseException {
    unaryLeftExpression();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FACTORIAL:
    case PERCENTAGE:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case FACTORIAL:{
        jj_consume_token(FACTORIAL);
        break;
        }
      case PERCENTAGE:{
        jj_consume_token(PERCENTAGE);
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      ;
    }
  }

/*
 * Grammar for unary left operators
 */
  final public void unaryLeftExpression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NOT:
    case BITNOT:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NOT:{
        jj_consume_token(NOT);
        break;
        }
      case BITNOT:{
        jj_consume_token(BITNOT);
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      ;
    }
    itemExpression();
  }

/*
 * Grammar for items
 */
  final public void itemExpression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PLUS:
    case MINUS:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:{
        jj_consume_token(PLUS);
        break;
        }
      case MINUS:{
        jj_consume_token(MINUS);
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUMBER_CONSTANT:{
      jj_consume_token(NUMBER_CONSTANT);
      break;
      }
    case UNIT:
    case IDENTIFIER:
    case FUNCTION:
    case 47:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case UNIT:
      case IDENTIFIER:
      case 47:{
        identifier();
        break;
        }
      case FUNCTION:{
        jj_consume_token(FUNCTION);
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_PAR:{
        jj_consume_token(LEFT_PAR);
        argumentList();
        jj_consume_token(RIGHT_PAR);
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        ;
      }
      break;
      }
    case LEFT_PAR:{
      jj_consume_token(LEFT_PAR);
      expression();
      jj_consume_token(RIGHT_PAR);
      break;
      }
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

/*
 * Grammar for arguments list
 */
  final public void argumentList() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LEFT_PAR:
    case PLUS:
    case MINUS:
    case UNIT:
    case NOT:
    case BITNOT:
    case NUMBER_CONSTANT:
    case IDENTIFIER:
    case FUNCTION:
    case 47:{
      expression();
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:
        case SEMICOLON:{
          ;
          break;
          }
        default:
          jj_la1[12] = jj_gen;
          break label_2;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:{
          jj_consume_token(COMMA);
          break;
          }
        case SEMICOLON:{
          jj_consume_token(SEMICOLON);
          break;
          }
        default:
          jj_la1[13] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        expression();
      }
      break;
      }
    default:
      jj_la1[14] = jj_gen;
      ;
    }
  }

/*
 * Grammar for identifiers
 */
  final public void identifier() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      break;
      }
    case UNIT:{
      jj_consume_token(UNIT);
      break;
      }
    case 47:{
      jj_consume_token(47);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CHAR:{
          jj_consume_token(CHAR);
          break;
          }
        case IDENTIFIER:{
          jj_consume_token(IDENTIFIER);
          label_4:
          while (true) {
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case LEFT_PAR:
            case RIGHT_PAR:
            case PLUS:
            case MINUS:
            case MULTIPLY:
            case DIV:
            case POWER:
            case MODULO:
            case COMMA:
            case LT:
            case GT:
            case OR:
            case AND:
            case NOT:
            case NUMBER_CONSTANT:{
              ;
              break;
              }
            default:
              jj_la1[15] = jj_gen;
              break label_4;
            }
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case NOT:{
              jj_consume_token(NOT);
              break;
              }
            case MODULO:{
              jj_consume_token(MODULO);
              break;
              }
            case POWER:{
              jj_consume_token(POWER);
              break;
              }
            case AND:{
              jj_consume_token(AND);
              break;
              }
            case MULTIPLY:{
              jj_consume_token(MULTIPLY);
              break;
              }
            case DIV:{
              jj_consume_token(DIV);
              break;
              }
            case LEFT_PAR:{
              jj_consume_token(LEFT_PAR);
              break;
              }
            case RIGHT_PAR:{
              jj_consume_token(RIGHT_PAR);
              break;
              }
            case MINUS:{
              jj_consume_token(MINUS);
              break;
              }
            case PLUS:{
              jj_consume_token(PLUS);
              break;
              }
            case COMMA:{
              jj_consume_token(COMMA);
              break;
              }
            case OR:{
              jj_consume_token(OR);
              break;
              }
            case GT:{
              jj_consume_token(GT);
              break;
              }
            case LT:{
              jj_consume_token(LT);
              break;
              }
            case NUMBER_CONSTANT:{
              jj_consume_token(NUMBER_CONSTANT);
              break;
              }
            default:
              jj_la1[16] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
          }
          break;
          }
        default:
          jj_la1[17] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CHAR:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[18] = jj_gen;
          break label_3;
        }
      }
      jj_consume_token(48);
      break;
      }
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  /** Generated Token Manager. */
  public SyntaxCheckerTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[20];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xc0401a01,0x3fa1f800,0x3fa1f800,0x60000,0x60000,0xc0000000,0xc0000000,0x1800,0x1800,0x400000,0x200,0x400200,0x180000,0x180000,0xc0401a00,0x7509fe00,0x7509fe00,0x0,0x0,0x400000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0xf000,0x1ff,0x1ff,0x0,0x0,0x0,0x0,0x0,0x0,0xe000,0x0,0xf000,0x0,0x0,0xf000,0x1000,0x1000,0x2200,0x2200,0xa000,};
   }

  /** Constructor with InputStream. */
  public SyntaxChecker(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SyntaxChecker(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SyntaxCheckerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public SyntaxChecker(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SyntaxCheckerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public SyntaxChecker(SyntaxCheckerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(SyntaxCheckerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[51];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 20; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 51; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
