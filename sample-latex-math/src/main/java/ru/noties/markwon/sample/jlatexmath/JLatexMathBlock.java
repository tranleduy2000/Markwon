package ru.noties.markwon.sample.jlatexmath;

import org.commonmark.node.CustomBlock;

public class JLatexMathBlock extends CustomBlock {

    private String latex;

    public String latex() {
        return latex;
    }

    public void latex(String latex) {
        this.latex = latex;
    }
}
