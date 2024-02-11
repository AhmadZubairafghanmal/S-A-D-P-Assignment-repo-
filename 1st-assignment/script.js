"use strict";
// Text formatting interface
class TextFormat {
  format(text) {}
}

// Text formatting class - 1: Bold
class TextBold extends TextFormat {
  format(text) {
    return `<b>${text}</b>`;
  }
}

// Text formatting class - 2: Italic
class TextItalic extends TextFormat {
  format(text) {
    return `<i>${text}</i>`;
  }
}

// Text formatting class - 3: Underline
class TextUnderline extends TextFormat {
  format(text) {
    return `<u>${text}</b>`;
  }
}

// context class
class TextEditor {
  constructor() {
    this.formattingStrategy = null;
  }

  setFormattingStrategy(formattingStrategy) {
    this.formattingStrategy = formattingStrategy;
  }

  formatText(text) {
    if (this.formattingStrategy) {
      return this.formattingStrategy.format(text);
    } else {
      return text;
    }
  }
}

// applying different strategies
const editor = new TextEditor();

// Applying Bold
editor.setFormattingStrategy(new TextBold());
let boldText = editor.formatText("This is Bold text strategy!");
document.write(boldText + '<br>');

// Applying Italic
editor.setFormattingStrategy(new TextItalic());
let italicText = editor.formatText("This is Bold text strategy!");
document.write(italicText + '<br>');

// Applying Underline
editor.setFormattingStrategy(new TextUnderline());
let underlineText = editor.formatText("This is Bold text strategy!");
document.write(underlineText + '<br>');
