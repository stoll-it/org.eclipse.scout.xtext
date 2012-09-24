package org.eclipse.scout.saml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSamlLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators

    public InternalSamlLexer() {;} 
    public InternalSamlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSamlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:11:7: ( '.' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:12:7: ( 'text=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:12:9: 'text='
            {
            match("text="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:13:7: ( 'enabled=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:13:9: 'enabled='
            {
            match("enabled="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:14:7: ( 'visible=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:14:9: 'visible='
            {
            match("visible="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:15:7: ( 'master=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:15:9: 'master='
            {
            match("master="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:16:7: ( 'mandatory=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:16:9: 'mandatory='
            {
            match("mandatory="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:17:7: ( 'module ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:17:9: 'module '
            {
            match("module "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:18:7: ( 'translation ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:18:9: 'translation '
            {
            match("translation "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:19:7: ( '=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:19:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:20:7: ( 'java ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:20:9: 'java '
            {
            match("java "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:21:7: ( '{' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:21:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:22:7: ( '}' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:23:7: ( 'runat=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:23:9: 'runat='
            {
            match("runat="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:24:7: ( 'code ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:24:9: 'code '
            {
            match("code "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:25:7: ( 'id=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:25:9: 'id='
            {
            match("id="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:26:7: ( 'logic ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:26:9: 'logic '
            {
            match("logic "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:27:7: ( 'type=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:27:9: 'type='
            {
            match("type="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:28:7: ( 'exec=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:28:9: 'exec='
            {
            match("exec="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:29:7: ( 'lookup ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:29:9: 'lookup '
            {
            match("lookup "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:30:7: ( 'template ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:30:9: 'template '
            {
            match("template "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:31:7: ( 'class=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:31:9: 'class='
            {
            match("class="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:32:7: ( 'replaces=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:32:9: 'replaces='
            {
            match("replaces="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:33:7: ( 'form ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:33:9: 'form '
            {
            match("form "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:34:7: ( 'modal=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:34:9: 'modal='
            {
            match("modal="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:35:7: ( 'columns=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:35:9: 'columns='
            {
            match("columns="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:36:7: ( 'sequence_box ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:36:9: 'sequence_box '
            {
            match("sequence_box "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:37:7: ( 'string ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:37:9: 'string '
            {
            match("string "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:38:7: ( 'maxlen=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:38:9: 'maxlen='
            {
            match("maxlen="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:39:7: ( 'double ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:39:9: 'double '
            {
            match("double "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:40:7: ( 'long ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:40:9: 'long '
            {
            match("long "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:41:7: ( 'date ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:41:9: 'date '
            {
            match("date "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:42:7: ( 'smartfield ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:42:9: 'smartfield '
            {
            match("smartfield "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:43:7: ( 'code=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:43:9: 'code='
            {
            match("code="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:44:7: ( 'value_type=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:44:9: 'value_type='
            {
            match("value_type="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:45:7: ( 'lookup=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:45:9: 'lookup='
            {
            match("lookup="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:46:7: ( 'zreg_sequence_box ' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:46:9: 'zreg_sequence_box '
            {
            match("zreg_sequence_box "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:47:7: ( 'true' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:47:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:48:7: ( 'false' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:48:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:49:7: ( 'client' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:49:9: 'client'
            {
            match("client"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:50:7: ( 'server' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:50:9: 'server'
            {
            match("server"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:51:7: ( 'global' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:51:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:52:7: ( 'all' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:52:9: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:53:7: ( 'modify_load' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:53:9: 'modify_load'
            {
            match("modify_load"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:54:7: ( 'modify_store' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:54:9: 'modify_store'
            {
            match("modify_store"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:55:7: ( 'new_load' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:55:9: 'new_load'
            {
            match("new_load"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:56:7: ( 'new_store' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:56:9: 'new_store'
            {
            match("new_store"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:57:7: ( 'changed' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:57:9: 'changed'
            {
            match("changed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:58:7: ( 'click' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:58:9: 'click'
            {
            match("click"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:59:7: ( 'master_changed' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:59:9: 'master_changed'
            {
            match("master_changed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:60:7: ( 'init' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:60:9: 'init'
            {
            match("init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2870:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2870:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2870:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2870:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2870:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2872:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2872:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2872:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2872:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2874:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2874:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2874:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2874:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2874:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2874:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2874:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2874:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2874:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2874:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2874:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2876:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2876:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2876:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2876:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2878:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2878:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2878:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2878:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2878:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2878:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2878:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2878:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2880:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2880:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2880:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2882:16: ( . )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2882:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=57;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:310: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 52 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:318: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 53 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:327: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 54 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:339: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 55 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:355: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 56 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:371: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 57 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1:379: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\4\41\1\uffff\1\41\2\uffff\13\41\1\34\2\uffff\3\34\3\uffff"+
        "\3\41\1\uffff\6\41\1\uffff\1\41\2\uffff\23\41\5\uffff\25\41\1\uffff"+
        "\16\41\1\u0090\4\41\1\u0095\24\41\1\u00ab\15\41\1\uffff\1\41\1\uffff"+
        "\2\41\2\uffff\1\41\1\uffff\10\41\1\uffff\2\41\2\uffff\3\41\1\u00cb"+
        "\1\41\1\uffff\2\41\2\uffff\1\u00cf\5\41\1\uffff\15\41\1\uffff\1"+
        "\41\1\uffff\2\41\1\uffff\1\u00e6\1\uffff\1\41\1\uffff\1\41\1\uffff"+
        "\1\41\1\u00eb\4\41\1\u00f0\7\41\1\uffff\2\41\2\uffff\3\41\1\uffff"+
        "\1\u00fe\2\uffff\1\41\2\uffff\1\41\1\uffff\1\41\1\uffff\4\41\2\uffff"+
        "\6\41\2\uffff\3\41\1\u010f\1\41\1\uffff\6\41\1\uffff\3\41\1\uffff"+
        "\1\u011a\3\41\1\uffff\5\41\1\uffff\1\41\1\uffff\1\41\1\u0125\2\41"+
        "\1\uffff\1\41\1\uffff\1\41\1\uffff\1\u012a\3\41\2\uffff\1\41\1\u012f"+
        "\1\41\1\uffff\3\41\1\uffff";
    static final String DFA12_eofS =
        "\u0134\uffff";
    static final String DFA12_minS =
        "\1\0\1\uffff\1\145\1\156\2\141\1\uffff\1\141\2\uffff\1\145\1\150"+
        "\1\144\1\157\1\141\1\145\1\141\1\162\2\154\1\145\1\101\2\uffff\2"+
        "\0\1\52\3\uffff\1\155\1\141\1\160\1\uffff\1\141\1\145\1\163\1\154"+
        "\1\156\1\144\1\uffff\1\166\2\uffff\1\156\1\160\1\144\2\141\1\75"+
        "\1\151\1\147\1\162\1\154\1\161\1\162\1\141\1\165\1\164\1\145\1\157"+
        "\1\154\1\167\5\uffff\1\164\1\160\1\156\2\145\1\142\1\143\1\151\1"+
        "\165\1\164\1\144\1\154\3\141\1\154\1\145\1\165\1\163\1\143\1\156"+
        "\1\uffff\1\164\1\151\1\153\1\147\1\155\1\163\1\165\1\166\1\151\1"+
        "\162\1\142\1\145\1\147\1\142\1\60\1\137\1\75\1\154\1\163\1\60\1"+
        "\75\1\154\1\75\1\142\2\145\1\141\1\145\2\154\1\146\1\40\1\164\1"+
        "\141\1\40\1\155\1\163\1\156\1\153\1\147\1\60\1\143\1\165\2\40\3"+
        "\145\1\156\1\164\1\154\1\40\1\137\1\141\1\uffff\1\154\1\uffff\1"+
        "\141\1\154\2\uffff\1\145\1\uffff\1\154\1\137\1\162\1\164\1\156\1"+
        "\145\1\75\1\171\1\uffff\1\75\1\143\2\uffff\1\156\1\75\1\164\1\60"+
        "\1\145\1\uffff\1\40\1\160\2\uffff\1\60\1\156\1\162\1\147\1\146\1"+
        "\145\1\uffff\1\163\1\154\1\157\2\164\1\141\1\144\1\145\1\164\1\75"+
        "\1\157\1\75\1\40\1\uffff\1\137\1\uffff\1\145\1\163\1\uffff\1\60"+
        "\1\uffff\1\144\1\uffff\1\40\1\uffff\1\143\1\60\1\40\1\151\1\40\1"+
        "\145\1\60\1\141\1\157\1\145\1\164\2\75\1\171\1\uffff\1\143\1\162"+
        "\2\uffff\1\154\1\163\1\75\1\uffff\1\60\2\uffff\1\145\2\uffff\1\145"+
        "\1\uffff\1\161\1\uffff\1\144\1\162\1\40\1\151\2\uffff\1\160\1\150"+
        "\1\171\1\157\1\164\1\75\2\uffff\1\137\1\154\1\165\1\60\1\145\1\uffff"+
        "\1\157\1\145\1\141\1\75\1\141\1\157\1\uffff\1\142\1\144\1\145\1"+
        "\uffff\1\60\1\156\1\75\1\156\1\uffff\1\144\1\162\1\157\1\40\1\156"+
        "\1\uffff\1\40\1\uffff\1\147\1\60\1\145\1\170\1\uffff\1\143\1\uffff"+
        "\1\145\1\uffff\1\60\1\40\1\145\1\144\2\uffff\1\137\1\60\1\142\1"+
        "\uffff\1\157\1\170\1\40\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\uffff\1\171\1\170\1\151\1\157\1\uffff\1\141\2\uffff"+
        "\1\165\1\157\1\156\2\157\1\164\1\157\1\162\2\154\1\145\1\172\2\uffff"+
        "\2\uffff\1\57\3\uffff\1\170\1\165\1\160\1\uffff\1\141\1\145\1\163"+
        "\1\154\1\170\1\144\1\uffff\1\166\2\uffff\1\156\1\160\1\154\1\151"+
        "\1\141\1\75\1\151\1\157\1\162\1\154\2\162\1\141\1\165\1\164\1\145"+
        "\1\157\1\154\1\167\5\uffff\1\164\1\160\1\156\2\145\1\142\1\143\1"+
        "\151\1\165\1\164\1\144\1\154\1\165\2\141\1\154\1\145\1\165\1\163"+
        "\1\145\1\156\1\uffff\1\164\1\151\1\153\1\147\1\155\1\163\1\165\1"+
        "\166\1\151\1\162\1\142\1\145\1\147\1\142\1\172\1\137\1\75\1\154"+
        "\1\163\1\172\1\75\1\154\1\75\1\142\2\145\1\141\1\145\2\154\1\146"+
        "\1\40\1\164\1\141\1\75\1\155\1\163\1\156\1\153\1\147\1\172\1\143"+
        "\1\165\2\40\3\145\1\156\1\164\1\154\1\40\1\137\1\141\1\uffff\1\163"+
        "\1\uffff\1\141\1\154\2\uffff\1\145\1\uffff\1\154\1\137\1\162\1\164"+
        "\1\156\1\145\1\75\1\171\1\uffff\1\75\1\143\2\uffff\1\156\1\75\1"+
        "\164\1\172\1\145\1\uffff\1\40\1\160\2\uffff\1\172\1\156\1\162\1"+
        "\147\1\146\1\145\1\uffff\1\163\1\154\1\157\2\164\1\141\1\144\1\145"+
        "\1\164\1\137\1\157\1\75\1\40\1\uffff\1\137\1\uffff\1\145\1\163\1"+
        "\uffff\1\172\1\uffff\1\144\1\uffff\1\75\1\uffff\1\143\1\172\1\40"+
        "\1\151\1\40\1\145\1\172\1\141\1\157\1\145\1\164\2\75\1\171\1\uffff"+
        "\1\143\1\162\2\uffff\2\163\1\75\1\uffff\1\172\2\uffff\1\145\2\uffff"+
        "\1\145\1\uffff\1\161\1\uffff\1\144\1\162\1\40\1\151\2\uffff\1\160"+
        "\1\150\1\171\1\157\1\164\1\75\2\uffff\1\137\1\154\1\165\1\172\1"+
        "\145\1\uffff\1\157\1\145\1\141\1\75\1\141\1\157\1\uffff\1\142\1"+
        "\144\1\145\1\uffff\1\172\1\156\1\75\1\156\1\uffff\1\144\1\162\1"+
        "\157\1\40\1\156\1\uffff\1\40\1\uffff\1\147\1\172\1\145\1\170\1\uffff"+
        "\1\143\1\uffff\1\145\1\uffff\1\172\1\40\1\145\1\144\2\uffff\1\137"+
        "\1\172\1\142\1\uffff\1\157\1\170\1\40\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\4\uffff\1\11\1\uffff\1\13\1\14\14\uffff\1\63\1\64"+
        "\3\uffff\1\70\1\71\1\1\3\uffff\1\63\6\uffff\1\11\1\uffff\1\13\1"+
        "\14\23\uffff\1\64\1\65\1\66\1\67\1\70\25\uffff\1\17\66\uffff\1\52"+
        "\1\uffff\1\2\2\uffff\1\45\1\21\1\uffff\1\22\10\uffff\1\12\2\uffff"+
        "\1\16\1\41\5\uffff\1\62\2\uffff\1\36\1\27\6\uffff\1\37\15\uffff"+
        "\1\30\1\uffff\1\15\2\uffff\1\25\1\uffff\1\60\1\uffff\1\20\1\uffff"+
        "\1\46\16\uffff\1\5\2\uffff\1\34\1\7\3\uffff\1\47\1\uffff\1\23\1"+
        "\43\1\uffff\1\50\1\33\1\uffff\1\35\1\uffff\1\51\4\uffff\1\3\1\4"+
        "\6\uffff\1\31\1\57\5\uffff\1\24\6\uffff\1\26\3\uffff\1\55\4\uffff"+
        "\1\6\5\uffff\1\56\1\uffff\1\42\4\uffff\1\40\1\uffff\1\10\1\uffff"+
        "\1\53\4\uffff\1\54\1\32\3\uffff\1\61\3\uffff\1\44";
    static final String DFA12_specialS =
        "\1\0\27\uffff\1\2\1\1\u011a\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\6\34\1"+
            "\1\1\32\12\27\3\34\1\6\3\34\32\26\3\34\1\25\1\26\1\34\1\23\1"+
            "\26\1\13\1\20\1\3\1\16\1\22\1\26\1\14\1\7\1\26\1\15\1\5\1\24"+
            "\3\26\1\12\1\17\1\2\1\26\1\4\3\26\1\21\1\10\1\34\1\11\uff82"+
            "\34",
            "",
            "\1\36\14\uffff\1\37\6\uffff\1\40",
            "\1\42\11\uffff\1\43",
            "\1\45\7\uffff\1\44",
            "\1\46\15\uffff\1\47",
            "",
            "\1\51",
            "",
            "",
            "\1\55\17\uffff\1\54",
            "\1\60\3\uffff\1\57\2\uffff\1\56",
            "\1\61\11\uffff\1\62",
            "\1\63",
            "\1\65\15\uffff\1\64",
            "\1\66\7\uffff\1\70\6\uffff\1\67",
            "\1\72\15\uffff\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\100",
            "\0\100",
            "\1\101\4\uffff\1\102",
            "",
            "",
            "",
            "\1\105\12\uffff\1\104",
            "\1\106\23\uffff\1\107",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\116\4\uffff\1\115\4\uffff\1\117",
            "\1\120",
            "",
            "\1\121",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124\7\uffff\1\125",
            "\1\126\7\uffff\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133\6\uffff\1\135\1\134",
            "\1\136",
            "\1\137",
            "\1\140\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "",
            "",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\167\7\uffff\1\170\13\uffff\1\166",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\u0080\1\uffff\1\177",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\34\uffff\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00b9\6\uffff\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de\41\uffff\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00e7",
            "",
            "\1\u00e8\34\uffff\1\u00e9",
            "",
            "\1\u00ea",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "",
            "\1\u00fa\6\uffff\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00ff",
            "",
            "",
            "\1\u0100",
            "",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "",
            "",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "",
            "",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0110",
            "",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "",
            "\1\u0123",
            "",
            "\1\u0124",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0126",
            "\1\u0127",
            "",
            "\1\u0128",
            "",
            "\1\u0129",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "",
            "",
            "\1\u012e",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0130",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='.') ) {s = 1;}

                        else if ( (LA12_0=='t') ) {s = 2;}

                        else if ( (LA12_0=='e') ) {s = 3;}

                        else if ( (LA12_0=='v') ) {s = 4;}

                        else if ( (LA12_0=='m') ) {s = 5;}

                        else if ( (LA12_0=='=') ) {s = 6;}

                        else if ( (LA12_0=='j') ) {s = 7;}

                        else if ( (LA12_0=='{') ) {s = 8;}

                        else if ( (LA12_0=='}') ) {s = 9;}

                        else if ( (LA12_0=='r') ) {s = 10;}

                        else if ( (LA12_0=='c') ) {s = 11;}

                        else if ( (LA12_0=='i') ) {s = 12;}

                        else if ( (LA12_0=='l') ) {s = 13;}

                        else if ( (LA12_0=='f') ) {s = 14;}

                        else if ( (LA12_0=='s') ) {s = 15;}

                        else if ( (LA12_0=='d') ) {s = 16;}

                        else if ( (LA12_0=='z') ) {s = 17;}

                        else if ( (LA12_0=='g') ) {s = 18;}

                        else if ( (LA12_0=='a') ) {s = 19;}

                        else if ( (LA12_0=='n') ) {s = 20;}

                        else if ( (LA12_0=='^') ) {s = 21;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='h'||LA12_0=='k'||(LA12_0>='o' && LA12_0<='q')||LA12_0=='u'||(LA12_0>='w' && LA12_0<='y')) ) {s = 22;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 23;}

                        else if ( (LA12_0=='\"') ) {s = 24;}

                        else if ( (LA12_0=='\'') ) {s = 25;}

                        else if ( (LA12_0=='/') ) {s = 26;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 27;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||(LA12_0>=':' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFF')) ) {s = 64;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFF')) ) {s = 64;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}