package codedraw.events;

import static java.awt.event.KeyEvent.*;

public enum Key {
	ENTER(VK_ENTER),
	BACK_SPACE(VK_BACK_SPACE),
	TAB(VK_TAB),
	CANCEL(VK_CANCEL),
	CLEAR(VK_CLEAR),
	SHIFT(VK_SHIFT),
	CONTROL(VK_CONTROL),
	ALT(VK_ALT),
	PAUSE(VK_PAUSE),
	CAPS_LOCK(VK_CAPS_LOCK),
	ESCAPE(VK_ESCAPE),
	SPACE(VK_SPACE),
	PAGE_UP(VK_PAGE_UP),
	PAGE_DOWN(VK_PAGE_DOWN),
	END(VK_END),
	HOME(VK_HOME),
	LEFT(VK_LEFT),
	UP(VK_UP),
	RIGHT(VK_RIGHT),
	DOWN(VK_DOWN),
	COMMA(VK_COMMA),
	MINUS(VK_MINUS),
	PERIOD(VK_PERIOD),
	SLASH(VK_SLASH),
	N0(VK_0),
	N1(VK_1),
	N2(VK_2),
	N3(VK_3),
	N4(VK_4),
	N5(VK_5),
	N6(VK_6),
	N7(VK_7),
	N8(VK_8),
	N9(VK_9),
	SEMICOLON(VK_SEMICOLON),
	EQUALS(VK_EQUALS),
	A(VK_A),
	B(VK_B),
	C(VK_C),
	D(VK_D),
	E(VK_E),
	F(VK_F),
	G(VK_G),
	H(VK_H),
	I(VK_I),
	J(VK_J),
	K(VK_K),
	L(VK_L),
	M(VK_M),
	N(VK_N),
	O(VK_O),
	P(VK_P),
	Q(VK_Q),
	R(VK_R),
	S(VK_S),
	T(VK_T),
	U(VK_U),
	V(VK_V),
	W(VK_W),
	X(VK_X),
	Y(VK_Y),
	Z(VK_Z),
	OPEN_BRACKET(VK_OPEN_BRACKET),
	BACK_SLASH(VK_BACK_SLASH),
	CLOSE_BRACKET(VK_CLOSE_BRACKET),
	NUMPAD0(VK_NUMPAD0),
	NUMPAD1(VK_NUMPAD1),
	NUMPAD2(VK_NUMPAD2),
	NUMPAD3(VK_NUMPAD3),
	NUMPAD4(VK_NUMPAD4),
	NUMPAD5(VK_NUMPAD5),
	NUMPAD6(VK_NUMPAD6),
	NUMPAD7(VK_NUMPAD7),
	NUMPAD8(VK_NUMPAD8),
	NUMPAD9(VK_NUMPAD9),
	MULTIPLY(VK_MULTIPLY),
	ADD(VK_ADD),
	SEPARATOR(VK_SEPARATOR),
	SUBTRACT(VK_SUBTRACT),
	DECIMAL(VK_DECIMAL),
	DIVIDE(VK_DIVIDE),
	DELETE (VK_DELETE ),
	NUM_LOCK(VK_NUM_LOCK),
	SCROLL_LOCK(VK_SCROLL_LOCK),
	F1(VK_F1),
	F2(VK_F2),
	F3(VK_F3),
	F4(VK_F4),
	F5(VK_F5),
	F6(VK_F6),
	F7(VK_F7),
	F8(VK_F8),
	F9(VK_F9),
	F10(VK_F10),
	F11(VK_F11),
	F12(VK_F12),
	F13(VK_F13),
	F14(VK_F14),
	F15(VK_F15),
	F16(VK_F16),
	F17(VK_F17),
	F18(VK_F18),
	F19(VK_F19),
	F20(VK_F20),
	F21(VK_F21),
	F22(VK_F22),
	F23(VK_F23),
	F24(VK_F24),
	PRINTSCREEN(VK_PRINTSCREEN),
	INSERT(VK_INSERT),
	HELP(VK_HELP),
	META(VK_META),
	BACK_QUOTE(VK_BACK_QUOTE),
	QUOTE(VK_QUOTE),
	KP_UP(VK_KP_UP),
	KP_DOWN(VK_KP_DOWN),
	KP_LEFT(VK_KP_LEFT),
	KP_RIGHT(VK_KP_RIGHT),
	DEAD_GRAVE(VK_DEAD_GRAVE),
	DEAD_ACUTE(VK_DEAD_ACUTE),
	DEAD_CIRCUMFLEX(VK_DEAD_CIRCUMFLEX),
	DEAD_TILDE(VK_DEAD_TILDE),
	DEAD_MACRON(VK_DEAD_MACRON),
	DEAD_BREVE(VK_DEAD_BREVE),
	DEAD_ABOVEDOT(VK_DEAD_ABOVEDOT),
	DEAD_DIAERESIS(VK_DEAD_DIAERESIS),
	DEAD_ABOVERING(VK_DEAD_ABOVERING),
	DEAD_DOUBLEACUTE(VK_DEAD_DOUBLEACUTE),
	DEAD_CARON(VK_DEAD_CARON),
	DEAD_CEDILLA(VK_DEAD_CEDILLA),
	DEAD_OGONEK(VK_DEAD_OGONEK),
	DEAD_IOTA(VK_DEAD_IOTA),
	DEAD_VOICED_SOUND(VK_DEAD_VOICED_SOUND),
	DEAD_SEMIVOICED_SOUND(VK_DEAD_SEMIVOICED_SOUND),
	AMPERSAND(VK_AMPERSAND),
	ASTERISK(VK_ASTERISK),
	QUOTEDBL(VK_QUOTEDBL),
	LESS(VK_LESS),
	GREATER(VK_GREATER),
	BRACELEFT(VK_BRACELEFT),
	BRACERIGHT(VK_BRACERIGHT),
	AT(VK_AT),
	COLON(VK_COLON),
	CIRCUMFLEX(VK_CIRCUMFLEX),
	DOLLAR(VK_DOLLAR),
	EURO_SIGN(VK_EURO_SIGN),
	EXCLAMATION_MARK(VK_EXCLAMATION_MARK),
	INVERTED_EXCLAMATION_MARK(VK_INVERTED_EXCLAMATION_MARK),
	LEFT_PARENTHESIS(VK_LEFT_PARENTHESIS),
	NUMBER_SIGN(VK_NUMBER_SIGN),
	PLUS(VK_PLUS),
	RIGHT_PARENTHESIS(VK_RIGHT_PARENTHESIS),
	UNDERSCORE(VK_UNDERSCORE),
	WINDOWS(VK_WINDOWS),
	CONTEXT_MENU(VK_CONTEXT_MENU),
	FINAL(VK_FINAL),
	CONVERT(VK_CONVERT),
	NONCONVERT(VK_NONCONVERT),
	ACCEPT(VK_ACCEPT),
	MODECHANGE(VK_MODECHANGE),
	KANA(VK_KANA),
	KANJI(VK_KANJI),
	ALPHANUMERIC(VK_ALPHANUMERIC),
	KATAKANA(VK_KATAKANA),
	HIRAGANA(VK_HIRAGANA),
	FULL_WIDTH(VK_FULL_WIDTH),
	HALF_WIDTH(VK_HALF_WIDTH),
	ROMAN_CHARACTERS(VK_ROMAN_CHARACTERS),
	ALL_CANDIDATES(VK_ALL_CANDIDATES),
	PREVIOUS_CANDIDATE(VK_PREVIOUS_CANDIDATE),
	CODE_INPUT(VK_CODE_INPUT),
	JAPANESE_KATAKANA(VK_JAPANESE_KATAKANA),
	JAPANESE_HIRAGANA(VK_JAPANESE_HIRAGANA),
	JAPANESE_ROMAN(VK_JAPANESE_ROMAN),
	KANA_LOCK(VK_KANA_LOCK),
	INPUT_METHOD_ON_OFF(VK_INPUT_METHOD_ON_OFF),
	CUT(VK_CUT),
	COPY(VK_COPY),
	PASTE(VK_PASTE),
	UNDO(VK_UNDO),
	AGAIN(VK_AGAIN),
	FIND(VK_FIND),
	PROPS(VK_PROPS),
	STOP(VK_STOP),
	COMPOSE(VK_COMPOSE),
	ALT_GRAPH(VK_ALT_GRAPH),
	BEGIN(VK_BEGIN),
	UNDEFINED(VK_UNDEFINED);

	private int keyCode;

	Key(int keyCode) {
		this.keyCode = keyCode;
	}

	int getKeyCode() {
		return keyCode;
	}
}
