package com.itextpdf.io.font.woff2.w3c.format;

import com.itextpdf.io.font.woff2.w3c.W3CWoff2DecodeTest;

public class BlocksExtraneousData006Test extends W3CWoff2DecodeTest {
    @Override
    protected String getFontName() {
        return "blocks-extraneous-data-006";
    }
    @Override
    protected String getTestInfo() {
        return "There are four null bytes after the metadata and there is no private data.";
    }
    @Override
    protected boolean isFontValid() {
        return false;
    }
}